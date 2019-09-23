package zaverecnyProjekt.bankovyUcet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import zaverecnyProjekt.zapisovacDat.IPracaSubory;

public class BankoveUctyAdapter implements IPracaSubory
{
   private String suborBU;
   private String suborSU;

   public BankoveUctyAdapter()
   {
      this.suborBU = "bezneUcty.dat";
      this.suborSU = "sporiaceUcty.dat";
   }

   @Override
   public void zapis(ArrayList<Object> ucty) throws FileNotFoundException,
         IOException
   {
      try
      {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
               subor));
         for (int i = 0; i < ucty.size(); i++)
         {
            oos.writeObject(ucty);
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

   @Override
   public void nacitaj(ArrayList<Object> objs) throws IOException,
         ClassNotFoundException
   {
      if(objs.size()>0)
      {
         objs.clear();
      }
      
      try
      {
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(subor));
         while(ois!=null)
         {
            objs.add(ois.readObject());
         }
         
      }
      catch(Exception ex)
      {
         return;
      }
   }
}
