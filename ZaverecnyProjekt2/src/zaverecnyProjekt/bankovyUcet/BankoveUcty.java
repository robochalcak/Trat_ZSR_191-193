package zaverecnyProjekt.bankovyUcet;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Trieda služí na uchovavanie sporiacích a bežných účtov. Výkonáva základne
 * operácie s nimi a vrácia rôzne štatistické hodnoty a informácie o účtoch
 * 
 * @author Robert Chalcak Tomáš Pajonk, Zuzana Bajakova
 */

public class BankoveUcty implements Serializable
{
   
   /**
    * 
    */
   private static final long serialVersionUID = 3311561868624786388L;
   private ArrayList<BankovyUcet> ucty; // uchovava bežné a sporiace účty
   private BankoveUctyAdapter zapisovac;
   /**
    * Vytvára objekt Bankové účty bez použitia parametrov
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public BankoveUcty() throws ClassNotFoundException, IOException
   {
      ucty = new ArrayList<BankovyUcet>();
      zapisovac = new BankoveUctyAdapter();
      if(ucty.isEmpty())
      {
         zapisovac.nacitaj(ucty);
      }
      
   }

   /**
    * Vygeneruje unikatné ide pozostavajúce z Stringov, ktoré označujú či ide o
    * bežný alebo sporiaci účet
    * 
    * @param ucet
    *           učet, pre ktorý je vygenerovaný Identifikator
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public void vygenerujId(BankovyUcet ucet) throws ClassNotFoundException, IOException
   {
      //BankovyUcet ucet = (BankovyUcet)obj;

      if (((BankovyUcet) ucet).getTypUctu().equalsIgnoreCase("sporiaci"))
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

   /**
    * Pridavá učet do zoznamu, ktorý tvorí ArrayList a pred tým prideli id účtu
    * 
    * @param ucet
    *           , ktorý sa má prídat do zoznamu
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public void pridajUcet(BankovyUcet ucet) throws ClassNotFoundException, IOException
   {    
      zapisovac.nacitaj(ucty);   
     // BankovyUcet ucet = (BankovyUcet)obj;
      vygenerujId(ucet);
      
      ucty.add(ucet);
      zapisovac.zapis(ucty);
   }

   /**
    * Vykonáva prepis zmeneho učtu na konkretnom indexe v ArrayListe
    * 
    * @param index
    *           špecifikuje konkretnú poziciu v ArryListe
    * @param novyUcet
    *           prepíše účet na konkretnej pozicii
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public void urobZmenuNaUcte(int index, BankovyUcet novyUcet) throws ClassNotFoundException, IOException
   {
      //BankovyUcet novyUcet = (BankovyUcet)obj;     
         zapisovac.nacitaj(ucty);     
      if (index < 0 || index > ucty.size() - 1)
      {
         System.out.println("Ziaden ucet neexistuje!!!");
         return;
      }
      ucty.set(index, novyUcet);
      zapisovac.zapis(ucty);
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
      //Object najdeny =new BankovyUcet();
      BankovyUcet najdeny = null;
      zapisovac.nacitaj(ucty);
      if (jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for (int i = 0; i < ucty.size(); i++)
      {
         if (ajKlientId == (((BankovyUcet) ucty.get(i)).getRovnakeId()))
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
         
         if(ajKlientId==((BankovyUcet) ucty.get(i)).getRovnakeId())
         {
            return i;
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
      all += "|     Bankove Ucty     |\n";
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
         zapisovac.nacitaj(ucty);
      }
      catch (ClassNotFoundException | IOException e)
      {
         e.printStackTrace();
      }
      return all;
   }

   /**
    * Skontroluje čí v ArrazListe je nejaký účet
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
   
   public BankovyUcet vyhladajUcet(String priezvisko) throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(ucty);
      BankovyUcet najdeny=new BankovyUcet();
      for(int i =0; i < ucty.size();i++)
      {
         if(priezvisko.equalsIgnoreCase(ucty.get(i).getMenoKlienta()))
         {
            najdeny =ucty.get(i);
         }
      }
      return najdeny;
   }
   public int getIndexBU(String priezvisko) throws ClassNotFoundException, IOException
   {
      int index=-1;
      zapisovac.nacitaj(ucty);
      for(int i =0; i < ucty.size();i++)
      {
         if(priezvisko.equalsIgnoreCase(ucty.get(i).getMenoKlienta()))
         {
            index=i;
         }
      }
      return index;
   }
}
