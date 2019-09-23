package zaverecnyProjekt.klienti;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import zaverecnyProjekt.zapisovacDat.IPracaSubory;

public class KlientiAdapter implements IPracaSubory
{

   private String subor;
   
   public KlientiAdapter()
   {
      this.subor="klienti.dat";
   }
     
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

}
