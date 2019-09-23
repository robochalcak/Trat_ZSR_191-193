package zaverecnyProjekt.klienti;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

import zaverecnyProjekt.zapisovacDat.IPracaSubory;
/**
 * Trieda sluzi na nacitavanie a ukladanie klientov do suboru 
 * pouziva technologiu binarneho zapisu 
 * @author Robert Chalcak
 *
 */
public class KlientiAdapter implements IPracaSubory
{

   private String subor;
   private Connection spojenie;
   private List<Klient>klienti;
   /**
    * Vytvara prazdny objekt s nastavenim cesty a nazvu suboru, s ktorym
    * bude system pracovat 
    */
   public KlientiAdapter()
   {
      this.subor="klienti.dat";
      this.klienti = new LinkedList<Klient>();
   }
     /**
      * Zapise vsetkych klientov do suboru 
      */
   @Override
   public void zapis(ArrayList<Object> klienti) throws FileNotFoundException,
         IOException
   {
      try
      {
         FileOutputStream fos=new FileOutputStream(subor);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         for(int i = 0; i < klienti.size();i++)
         {
            oos.writeObject(klienti.get(i));
         }
         oos.close();
         klienti.clear();
      }
      catch(Exception ex)
      {
         JOptionPane.showMessageDialog(null,"Ulozenie do suboru sa nepodarilo!");
         return;
      }     
   }
   /**
    * Nacita klientov zo suboru aby system mohol s nimi pracovat
    */
   @Override
   public void nacitaj(ArrayList<Object> klienti) throws IOException,
         ClassNotFoundException
   {
      if(klienti.size()>0)
      {
         klienti.clear();
      }
      
      try
      {
         FileInputStream fis = new FileInputStream(subor);
         ObjectInputStream ois = new ObjectInputStream(fis);
         while(ois!=null)
         {
            klienti.add(ois.readObject());
         }
         fis.close();
      }
      catch(FileNotFoundException fnf)
      {
         zapis(klienti);
         return;
      }
      catch(EOFException eof)
      {
         return;
      }
      
      
   }
   /**
    * Vytvara spojenie s databazovym serverom 
    * @param username  uzivatel na prihlasenie sa do databazoveho systemu
    * @param password  heslo na prihlasenie sa do databazoveho systemu
    */
   public void vytvorSpojenieSDB(String username, String password)throws Exception
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
      spojenie = DriverManager.getConnection(URL,username,password);
      
      PreparedStatement vytvorDB = spojenie.prepareStatement("CREATE DATABASE IF NOT EXISTS banka_db");
      
      vytvorDB.executeUpdate();
      System.out.println("Pripojenie: "+spojenie);
      
      
   }
   /**
    * Uklada databazovu tabulku 
    */
   public void ulozDB()throws SQLException, ClassNotFoundException, IOException
   {
      createTable();
      Klienti klienti = new Klienti();
      ArrayList<Object>klientiNaUlozenie=new ArrayList<Object>();
      klientiNaUlozenie=klienti.vratListKlientov();
           
      String sqlTest = "SELECT count(*)AS ID FROM banka_db.klienti WHERE idUctu=?";
      
      String sqlInsert = "INSERT INTO banka_db.klienti("+
      "meno, priezvisko, rodneCislo, idKlienta, idUctu)VALUES(?,?,?,?,?)";
      
      String sqlUpdate = "UPDATE banka_db.klienti "+
      "SET meno=?, priezvisko=?, rodneCislo=?, idKlienta=? WHERE idUctu=?";
      
      //String sqlDropTable = "DROP TABLE banka_db.klienti";
      
      PreparedStatement overovaciPrikaz = spojenie.prepareStatement(sqlTest);
      for(int i= 0; i < klientiNaUlozenie.size();i++)
      {
           String meno =((Klient) klientiNaUlozenie.get(i)).getMeno();
           String priezvisko = ((Klient)klientiNaUlozenie.get(i)).getPriezvisko();
           long rodneCislo = ((Klient)klientiNaUlozenie.get(i)).getRodneCislo();
           String idKlienta=((Klient)klientiNaUlozenie.get(i)).getId();
           int idUctu = ((Klient)klientiNaUlozenie.get(i)).getRovnakeId();
           overovaciPrikaz.setInt(1, idUctu);
           
           ResultSet vysledok = overovaciPrikaz.executeQuery();
           
           while(vysledok.next())
           {
             int pocet = vysledok.getInt(1);
              int index = 1;
              
              if(pocet==0)
              {
                 System.out.println("Vkladam do databazy klienta s ID: "+ idUctu);
                 PreparedStatement insertPrikaz = spojenie.prepareStatement(sqlInsert);
                                
                 insertPrikaz.setString(index++, meno);
                 insertPrikaz.setString(index++, priezvisko);
                 insertPrikaz.setLong(index++, rodneCislo);
                 insertPrikaz.setString(index++, idKlienta);
                 insertPrikaz.setInt(index++, idUctu);
                 insertPrikaz.execute();
                 insertPrikaz.close();
              }
              else
              {
                 System.out.println("Update klienti s ID: "+idUctu);
               //  PreparedStatement dropTablePrikaz = spojenie.prepareStatement(sqlDropTable);
                // dropTablePrikaz.execute();
                 //createTable();
                 index=1;
                 PreparedStatement updatePrikaz = spojenie.prepareStatement(sqlUpdate);
                 updatePrikaz.setString(index++,meno);
                 updatePrikaz.setString(index++, priezvisko);
                 updatePrikaz.setLong(index++, rodneCislo);
                 updatePrikaz.setString(index++,idKlienta);
                 updatePrikaz.setInt(index, idUctu);
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
      if(spojenie!=null){
         try
         {
            spojenie.close();
         }
         catch(SQLException e)
         {
            System.out.println("Nie je mozne ukoncit spojenie s databazou");
         }
      }
   }
   /**
    * Nacitava databazu 
    */
   public void nacitajCeluDB()throws SQLException
   {
      System.out.println("Nacitavam obsah celej databazy: ");
      String sql = "SELECT * FROM banka_db.klienti";
      
      Statement selectPrikaz = spojenie.createStatement();
      
      ResultSet vysledky = selectPrikaz.executeQuery(sql);
      
      while(vysledky.next())
      {
         String meno = vysledky.getString("meno");
         String priezvisko = vysledky.getString("priezvisko");
         long rodneCislo = vysledky.getLong("rodneCislo");
         String idKlienta = vysledky.getString("idKlienta");
         int idUctu = vysledky.getInt("idUctu");
         
         Klient klient = new Klient();
         klient.setMeno(meno);
         klient.setPriezvisko(priezvisko);
         klient.setRodneCislo(rodneCislo);
         klient.setId(idKlienta);
         klient.setRovnakeId(idUctu);
         
         klienti.add(klient);
         
         System.out.println(klient);
      }
      System.out.println(klienti.size());
      
      vysledky.close();
      selectPrikaz.close();
   }
   /**
    * Nacitava do JTabulky obsah databazy a nasledne danu tabulku vracia 
    * @param table  JTabulka, do ktorej ma byt obsah nacitany 
    * @param sel SQL prikaz ktory nacitava data 
    * @return JTabulka s kompletnym obsahom databazy podla potrieb uzivatela 
    */
   public JTable nacitajDoTabulky(JTable table, String sel) throws SQLException
   {
      DefaultTableModel model = new DefaultTableModel();
      table.setModel(model);
      int index=1;
      
      model.addColumn("Por. číslo");
      model.addColumn("Meno");
      model.addColumn("Priezvisko");
      model.addColumn("Rodné číslo");
      model.addColumn("ID");
      model.addColumn("Číslo účtu");
      
      String sql = sel;
      
      Statement select = spojenie.createStatement();
      
      ResultSet rs = select.executeQuery(sql);
      
      while(rs.next())
      {          
         model.addRow(new Object[]{index,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});                 
         index++;
      }
      model.addRow(new Object[]{"Počet zaznamov: "+ (index-1)});
      
      rs.close();
      select.close();
      
      return table;
   }
   /**
    * Vytvara tabulku v databaze a nasledne ju definuje v pripade potreby ak nie je vytvorena
    */
   private void createTable()throws SQLException
   {
      String sqlCreate = "CREATE TABLE IF NOT EXISTS banka_db.klienti"+
            "(meno      VARCHAR(20),"+
            "priezvisko       VARCHAR(20),"+
            "rodneCislo       INTEGER,"+
            "idKlienta        VARCHAR(10),"+
            "idUctu           INTEGER)";

      
      Statement stm = spojenie.createStatement();
      stm.executeUpdate(sqlCreate);
      
   }
}
