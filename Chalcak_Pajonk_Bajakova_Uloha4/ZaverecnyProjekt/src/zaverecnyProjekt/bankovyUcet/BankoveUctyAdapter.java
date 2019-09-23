package zaverecnyProjekt.bankovyUcet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
/**
 * Trieda sluzi na manipulaciu so subormi zapis nacitanie zo suboru 
 * @author Robert Chalcak
 *
 */
public class BankoveUctyAdapter implements Serializable
{

   private static final long serialVersionUID = -9082661654821277679L;
   private String subor;
   
   /**
    * Vytvara prazdny objekt a zaroven definuje nazov a cestu suboru, s ktorym
    * bude pracovat 
    */
   public BankoveUctyAdapter()
   {
      this.subor = "ucty.dat";      
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
}
