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

public class BankoveUctyAdapter implements Serializable
{

   private static final long serialVersionUID = -9082661654821277679L;
   private String subor;
   

   public BankoveUctyAdapter()
   {
      this.subor = "ucty.dat";      
   }

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
