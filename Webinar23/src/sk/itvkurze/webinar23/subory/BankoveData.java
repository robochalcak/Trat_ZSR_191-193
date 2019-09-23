package sk.itvkurze.webinar23.subory;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Trieda poskytuje nahodny pristup k suboru s bankovimi uctami,
 * @author Robert Chalcak
 *
 */
public class BankoveData
{
   private RandomAccessFile subor;
   public static final int VELKOST_INT=4;  //4bajty = 32 bitov
   public static final int VELKOST_DOUBLE=8; //8 bajtov = 64 bitov
   public static final int VELKOST_ZAZNAMU=VELKOST_INT+VELKOST_DOUBLE;
   
   /**
    * Vytvara novy objekt bankove data, ktory nie je spojeny so ziadnym suborom.
    */
   public BankoveData()
   {
      subor=null;
   }
   /**
    * Otvara subor s datami.
    * 
    * @param nazovSuboru nazov suboru obsahuje informacie o bankovych uctoch
    * @throws IOException
    */
   public void otvor(String nazovSuboru) throws IOException
   {
      if(subor!=null)
      {
         subor.close();
      }
      subor=new RandomAccessFile(nazovSuboru, "rw");
      
   }

   public int vyhladaj(int cisloUctu) throws IOException
   {
      for(int i = 0; i<velkost();i++)
      {
         subor.seek(i*VELKOST_ZAZNAMU);
         int cislo=subor.readInt();
         
         if(cislo==cisloUctu) //nenasiel som hladany ucet
         {
            return i;
         }
      }
      return -1; //ucet s danym cislom uctu sa v subore nenasiel
   }
   
   /**
    * Cista zaznam o bankovom ucte zo suboru
    * @param pozicia index uctu v datovom subore 
    * @return ojekt bankoveho uctu instanciovany pomocou dat zo suboru
    * @throws IOException
    */
   public BankovyUcet precitaj(int pozicia)throws IOException
   {
      subor.seek(pozicia*VELKOST_ZAZNAMU);
      int cisloUctu=subor.readInt();
      double zostatok = subor.readDouble();
      return new BankovyUcet(cisloUctu, zostatok);
   }
   /**
    * Vracia pocet bankovych uctov v subore.
    * @return
    * @throws IOException
    */
   public int velkost() throws IOException
   {
      return (int)(subor.length()/VELKOST_ZAZNAMU);
   }
   
   public void zapis(int pozicia, BankovyUcet ucet) throws IOException
   {
      subor.seek(pozicia * VELKOST_ZAZNAMU);
      subor.writeInt(ucet.getCisloUctu());
      subor.writeDouble(ucet.getAktualnyZostatok());
      
      
   }
   /**
    * Zatvara subor s datami.
    * @throws IOException
    */
   public void zatvor() throws IOException
   {
      if(subor!=null)
      {
         subor.close();
      }
      
   }

}
