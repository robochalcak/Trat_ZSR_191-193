package zaverecnyProjekt.bankovyUcet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Trieda služí na uchovavanie sporiacích a bežných účtov. Výkonáva základne
 * operácie s nimi a vrácia rôzne štatistické hodnoty a informácie o účtoch
 * 
 * @author Robert Chalcak Tomáš Pajonk, Zuzana Bajakova
 */

public class BankoveUcty
{

   private ArrayList<Object> bezneUcty; // uchovava bežné a sporiace účty
   private ArrayList<Object>sporiaceUcty;
   private BankoveUctyAdapter zapisovac;
   /**
    * Vytvára objekt Bankové účty bez použitia parametrov
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public BankoveUcty() throws ClassNotFoundException, IOException
   {
      bezneUcty = new ArrayList<Object>();
      sporiaceUcty = new ArrayList<Object>();
      zapisovac = new BankoveUctyAdapter();
      zapisovac.nacitaj(bezneUcty);
      zapisovac.nacitaj(sporiaceUcty);
   }

   /**
    * Vygeneruje unikatné ide pozostavajúce z Stringov, ktoré označujú či ide o
    * bežný alebo sporiaci účet
    * 
    * @param ucet
    *           učet, pre ktorý je vygenerovaný Identifikator
    */
   public void vygenerujId(Object obj)
   {
      BankovyUcet ucet = (BankovyUcet)obj;
      if(ucet.getTypUctu().equalsIgnoreCase("bežný"))
      {
         ucet= (BeznyUcet)obj;
         String id="bezUc";
         id+=bezneUcty.size()+1;
         ucet.setId(id);
         id = "bezUc";
      }
      else
      {
         ucet = (SporiaciUcet)obj;
         String id ="spUc";
         id+=sporiaceUcty.size()+1;
         ucet.setId(id);
         id="spUc";
      }
   }
   
   /*
   public void vygenerujId(BankovyUcet ucet)
   {
      if (ucet.getTypUctu().equalsIgnoreCase("sporiaci"))
      {
         String id = "spUc";
         id += ucty.size() + 1;
         ucet.setId(id);
         id = "spUc";
      }
      else
      {
         String id = "bezUc";
         id += ucty.size() + 1;
         ucet.setId(id);
         id = "bezUc";
      }
   }
*/
   /**
    * Pridavá učet do zoznamu, ktorý tvorí ArrayList a pred tým prideli id účtu
    * 
    * @param ucet
    *           , ktorý sa má prídat do zoznamu
    * @throws IOException 
    * @throws FileNotFoundException 
    * @throws ClassNotFoundException 
    */
   
   public void pridajUcet(Object obj) throws FileNotFoundException, IOException, ClassNotFoundException
   {
      BankovyUcet ucet=(BankovyUcet)obj;
      
      if(ucet.getTypUctu().equalsIgnoreCase("bežný"))
      {
         ucet = (BeznyUcet)obj;
         zapisovac.nacitaj(bezneUcty);
         vygenerujId(ucet);
         bezneUcty.add(ucet);
         zapisovac.zapis(bezneUcty);
      }
      else
      {
         ucet =(SporiaciUcet)obj;
         zapisovac.nacitaj(sporiaceUcty);
         vygenerujId(ucet);
         sporiaceUcty.add(ucet);
         zapisovac.zapis(sporiaceUcty);
      }
      vygenerujId(ucet);
   }
   /*
   public void pridajUcet(BankovyUcet ucet)
   {
      vygenerujId(ucet);
      ucty.add(ucet);
   }
*/
   /**
    * Vykonáva prepis zmeneho učtu na konkretnom indexe v ArrayListe
    * 
    * @param novyUcet
    *           prepíše účet na konkretnej pozicii
    * @param index
    *           špecifikuje konkretnú poziciu v ArryListe
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public void urobZmenuNaBeznomUcte(Object novyUcet, int index) throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(bezneUcty);
   
         if (index < 0 || index > bezneUcty.size() - 1)
         {
            System.out.println("Ziaden ucet neexistuje!!!");
            return;
         }
         bezneUcty.set(index, novyUcet);
         zapisovac.zapis(bezneUcty);
   }
   
   
   public void urobZmenuNaSporiacomUcte(Object novyUcet, int index) throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(sporiaceUcty);
   
         if (index < 0 || index > sporiaceUcty.size() - 1)
         {
            System.out.println("Ziaden ucet neexistuje!!!");
            return;
         }
         sporiaceUcty.set(index, novyUcet);
         zapisovac.zapis(sporiaceUcty);
   }

   /**
    * Vyhlada ucet v zozname s pouzitim integeru, ktorý je rovnaký aj pre
    * klienta
    * 
    * @param ajKlientId
    *           integer, ktory je rovnaky aj pre klienta takze vie sparovat
    *           klienta s jeho uctom
    * @return najdený účet
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public BankovyUcet vyhladajUcet(int ajKlientId) throws ClassNotFoundException, IOException
   {
      BankovyUcet najdeny = null;
      zapisovac.nacitaj(ucty);
      if (jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for (int i = 0; i < ucty.size(); i++)
      {
         if (ajKlientId == ((BankovyUcet) ucty.get(i)).getRovnakeId())
         {
            najdeny = (BankovyUcet) ucty.get(i);
         }
      }
      return najdeny;
   }

   /**
    * Vrácia poziciu účtu na základe indentifikatora, ktorý je rovnaký aj pre
    * klienta
    * 
    * @param ajKlientId
    *           jedinenčné číslo, ktoré je zhodné aj u klienta
    * @return pozicia účtu v ArrayListe
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public int getIndexBu(int ajKlientId) throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(ucty);
      if (jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
         return -1;
      }
      for (int i = 0; i < ucty.size(); i++)
      {
        
        {
           if (ajKlientId == ((BankovyUcet) ucty.get(i)).getRovnakeId())
           {
              return i;
           }
        } 
         
      }
      return -1;
   }

   /**
    * Vrácia celkových doposiaľ registrovaných účtov
    * 
    * @return počet účtov
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public int getPocetBU() throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(ucty);
      return ucty.size();
   }

   /**
    * Vypíše kompletný zoznám účtov
    * 
    * @return
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public String vratZoznamUctov() throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(ucty);
      
      String all = "------------------\n";
      all += "|  BEZNE ÚČTY    |\n";
      all += "------------------\n";

      for (int i = 0; i < ucty.size(); i++)
      {
         all += ucty.get(i) + "\n";
         all += "___________________\n";
      }
      all += "<><><><><>><><><><>\n";
      return all;
   }

   /**
    * Tak ako predchádzajúca metóda vracia formatovaný vystup všetkých účtov
    */
   public String toString()
   {
      String all = "";
      try
      {
         all += vratZoznamUctov();
      }
      catch (ClassNotFoundException | IOException e)
      {
         
         e.printStackTrace();
      }
      return all;

   }

   /**
    * Skontroluje čí v ArrayListe je nejaký účet
    * 
    * @return true ak nie je žiadný účet,opačne vracia false
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public boolean jePrazdnyBU() throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(ucty);
      return ucty.size() == 0;
   }

}
