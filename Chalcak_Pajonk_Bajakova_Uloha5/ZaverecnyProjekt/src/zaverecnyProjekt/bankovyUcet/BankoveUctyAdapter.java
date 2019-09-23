package zaverecnyProjekt.bankovyUcet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * Trieda sluzi na manipulaciu so subormi zapis nacitanie zo suboru 
 * @author Robert Chalcak
 *
 */
public class BankoveUctyAdapter implements Serializable
{

   private static final long serialVersionUID = -9082661654821277679L;
   private String subor;
   private Connection spojenie;
   private List<BankovyUcet>ucty;
   
   /**
    * Vytvara prazdny objekt a zaroven definuje nazov a cestu suboru, s ktorym
    * bude pracovat 
    */
   public BankoveUctyAdapter()
   {
      this.subor = "ucty.dat"; 
      this.ucty = new LinkedList<BankovyUcet>();
   }
   /**
    * Zapisuje ucty do suboru 
    * @param ucty
    * @throws FileNotFoundException
    * @throws IOException
    */
   public void zapis(ArrayList<BankovyUcet> ucty) throws FileNotFoundException,
         IOException
   {
      try
      {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
               subor));
         for (int i = 0; i < ucty.size(); i++)
         {
            oos.writeObject(ucty.get(i));
         }
         oos.close();
         ucty.clear();
      }
      catch (Exception ex)
      {
         JOptionPane.showMessageDialog(null,
               "Ulozenie do suboru sa nepodarilo!");
         return;
      }

   }
   /**
    * Nacitava ucty zo subory aby system mohol pracovat 
    * @param ucty
    * @throws IOException
    * @throws ClassNotFoundException
    */
   public void nacitaj(ArrayList<BankovyUcet> ucty) throws IOException,
         ClassNotFoundException
   {
      if(ucty.size()!=0)
      {
         ucty.clear();
      }
      
      try
      {
         FileInputStream fis = new FileInputStream(subor);
         ObjectInputStream ois = new ObjectInputStream(fis);
         while(ois!=null)
         {
            ucty.add((BankovyUcet) ois.readObject());
         }
         
      }
      catch(Exception ex)
      {
         
        // zapis(objs);
         //System.out.println("Neda sa nacitat subor "+subor+".");
         return;
      }
      
   }
   
   public void vytvorSpojenieSDB(String user,String pass)throws Exception
   {
      if(spojenie!=null)
      {
         return;
      }
      try
      {
         Class.forName("com.mysql.cj.jdbc.Driver");
      }
      catch(ClassNotFoundException e)
      {
         throw new Exception ("Nenasiel sa ovladac.");
      }
      
      String URL ="jdbc:mysql://localhost:3306/banka_db?useLegacyDatetimeCode=false&serverTimezone=UTC";
      spojenie = DriverManager.getConnection(URL,user,pass);
      
      PreparedStatement vytvorDB = spojenie.prepareStatement("CREATE DATABASE IF NOT EXISTS banka_db");
      vytvorDB.executeUpdate();
      System.out.println("Pripojenie: "+spojenie);
   }
   /**
    * Uklada celý zoznam bankovych uctov do databazy 
    */
   public void ulozDB()throws SQLException, ClassNotFoundException, IOException
   {
      createTable();
      BankoveUcty bankoveUcty = new BankoveUcty();
      ArrayList<BankovyUcet>uctyNaUlozenie= new ArrayList<BankovyUcet>();
      uctyNaUlozenie = bankoveUcty.vratListUctov();
      
      //String sqlTest = "SELECT count(*)AS pocet FROM banka_db.ucty WHERE cisloUctu=?";
      String sqlTest = "SELECT count(*)AS pocet FROM banka_db.ucty WHERE aktualnyZostatok=?";
      String sqlInsert = "INSERT INTO banka_db.ucty("+
      "menoKlienta, cisloUctu, aktualnyZostatok, typUctu, id_uctu, urok)"+
            "VALUES(?,?,?,?,?,?)";
    
      String sqlUpdate = "UPDATE banka_db.ucty "+
      "SET menoKlienta=?,cisloUctu=?, typUctu=?, id_uctu=?, urok=? WHERE aktualnyZostatok=?";
      
      PreparedStatement overovaciPrikaz = spojenie.prepareStatement(sqlTest);
      String sqlDropTable = "DROP TABLE banka_db.ucty";
      for(BankovyUcet ucet:uctyNaUlozenie)
      {
         String menoKlienta = ucet.getMenoKlienta();
         int cisloUctu =ucet.getRovnakeId();
         double aktualnyZostatok=ucet.getAktualnyZostatok();
         String typUctu = ucet.getTypUctu();
         String id_uctu = ucet.getId();
         double urok = ucet.getUrok();
         
         overovaciPrikaz.setDouble(1, aktualnyZostatok);
         
         ResultSet vysledok = overovaciPrikaz.executeQuery();
         
         
         while(vysledok.next())
         {
            int pocet = vysledok.getInt(1);
            int index =1;
            
            if(pocet==0){
               
               System.out.println("Vkladam do databazy ucet s ID: "+cisloUctu);
               PreparedStatement insertPrikaz = spojenie.prepareStatement(sqlInsert);
               
               insertPrikaz.setString(index++,menoKlienta);
               insertPrikaz.setInt(index++, cisloUctu);
               insertPrikaz.setDouble(index++,aktualnyZostatok);
               insertPrikaz.setString(index++,typUctu);
               insertPrikaz.setString(index++,id_uctu);
               insertPrikaz.setDouble(index++, urok);
               
               insertPrikaz.execute();
               insertPrikaz.close();
               
            }
            else
            {
               System.out.println("Update uctov s ID: "+cisloUctu);
               index=1;
               
               PreparedStatement updatePrikaz = spojenie.prepareStatement(sqlUpdate);
               updatePrikaz.setString(index++, menoKlienta);
               updatePrikaz.setInt(index++, cisloUctu);
               updatePrikaz.setDouble(index++, aktualnyZostatok);
               updatePrikaz.setString(index++,typUctu);
               updatePrikaz.setString(index++,id_uctu);
               updatePrikaz.setDouble(index++, urok);
               
               updatePrikaz.executeUpdate();
               updatePrikaz.close();
              
            }
         }
      }
      overovaciPrikaz.close();
   }
   /**
    * Ukoncuje spojenie s databazovym serverom 
    */
   public void zrusSpojenie()
   {
      if(spojenie!=null)
      {
         try{
         spojenie.close();
         }
         catch(SQLException e)
         {
            System.out.println("Nie je mozne ukoncit spojenie s databazou");
         }
      }
      
   }
   /**
    * Nacitava obsah databazy uctov 
    */
   public void nacitajCeluDB()throws SQLException
   {
      System.out.println("Nacitavam obsah celej databazy: ");
      String sql = "SELECT * FROM banka_db.ucty";
      
      Statement selectPrikaz = spojenie.createStatement();
      
      ResultSet vysledky = selectPrikaz.executeQuery(sql);
      
      while(vysledky.next())
      {
         String menoMajitela= vysledky.getString("menoKlienta");
         int cisloUctu = vysledky.getInt("cisloUctu");
         double aktualnyZostatok=vysledky.getDouble("aktualnyZostatok");
         String typUctu = vysledky.getString("typUctu");
         String idUctu = vysledky.getString("id_uctu");
         double urok = vysledky.getDouble("urok");
         
         
         BankovyUcet ucet = new BankovyUcet();
         
         ucet.setMenoKlienta(menoMajitela);
         ucet.setRovnakeId(cisloUctu);
         ucet.vloz(aktualnyZostatok);
         ucet.setTypUctu(typUctu);
         ucet.setId(idUctu);
         ucet.setUrok(urok);
         
         ucty.add(ucet);
         
         System.out.println(ucet);
      }
      
      vysledky.close();
      selectPrikaz.close();
   }
   
   /**
    * Nacitava do tabulky obsah databazy bankovych uctov 
    * @param table vytvara a definuje model JTable a nasledne ho vracia 
    * @param sel predstavuje SQL prikaz  SELECT, ktory sa moze od volby uzivatela
    * menit 
    * @retun vracia kompletne vymodelovanu tabulku s obsahom databazy 
    */
   public JTable nacitajDoTabulky(JTable table, String sel) throws SQLException
   {
      DefaultTableModel model = new DefaultTableModel();
      
      table.setModel(model);
      
      model.addColumn("Por. číslo");
      model.addColumn("Priezvisko majitela účtu ");
      model.addColumn("Čislo účtu ");
      model.addColumn("Aktuálny zostatok ");
      model.addColumn("Typ účtu");
      model.addColumn("ID účtu");
      model.addColumn("Úrok");
           
      Statement select = spojenie.createStatement();
      
      ResultSet rs = select.executeQuery(sel);
      
      double zostatokTotal=0;
      int index =1;
      double priemZostatok=0;
      while(rs.next())
      {          
         model.addRow(new Object[]{index,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});                 
         index++;
         zostatokTotal+=Double.parseDouble(rs.getString(3));
         
      }
      priemZostatok = zostatokTotal / (index-1);
      model.addRow(new Object[]{"Pocet zaznamov: "+( index-1),"Celkový zostatok: "+zostatokTotal+" Eur.", "Priemerný zostatok: "+priemZostatok+" Eur."});
      
      rs.close();
      select.close();
      return table;
   }
   /**
    *Pomocna metoda vytvara a definuje v databaze v pripade potreby tabulku
    *bankovych uctov.  
    */
   private void createTable()throws SQLException
   {
      String sqlCreate = "CREATE TABLE IF NOT EXISTS banka_db.ucty"+
                        "(menoKlienta         VARCHAR(20),"+
                        "cisloUctu            INTEGER,"+
                        "aktualnyZostatok     REAL,"+
                        "typUctu              VARCHAR(10),"+
                        "id_uctu              VARCHAR(7),"+
                        "urok                 REAL)";
      
      Statement stm = spojenie.createStatement();
      stm.executeUpdate(sqlCreate);
   }
   
   
}
