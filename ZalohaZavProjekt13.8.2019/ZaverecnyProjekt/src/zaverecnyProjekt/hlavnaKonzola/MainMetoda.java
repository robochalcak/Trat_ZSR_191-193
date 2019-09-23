package zaverecnyProjekt.hlavnaKonzola;

import java.util.Scanner;

import zaverecnyProjekt.bankovyUcet.BankoveUcty;
import zaverecnyProjekt.bankovyUcet.BankovyUcet;
import zaverecnyProjekt.bankovyUcet.BeznyUcet;
import zaverecnyProjekt.bankovyUcet.SporiaciUcet;
import zaverecnyProjekt.datum.Datum;
import zaverecnyProjekt.klienti.Klient;
import zaverecnyProjekt.klienti.Klienti;

/**
 * Táto trieda služi na komunikáciu medzi uživateľom a aplikáciou
 * 
 * @author Robert Chalcak Tomáš Pajonk a Zuzana Bajaková
 */
public class MainMetoda
{
   /**
    * Hlavna metoda, ktorá služi na spustenie celej aplikácie
    * 
    * @param args
    */
   public static void main(String[] args)
   {
      Scanner kb =new Scanner(System.in);
      Klienti klienti = new Klienti();
      BankoveUcty bankoveUcty = new BankoveUcty();
      zobrazAktualnyDatum();
      zobrazHlavneMenu(klienti,bankoveUcty,kb);
      kb.close();
   }

   /**
    * Zobrazujé hlavné menu a ponuká základné operácie s učtom
    */
   public static void zobrazHlavneMenu(Klienti klienti, BankoveUcty ucty,Scanner kb)
   {
      
      int volba = 0;

      System.out
            .println("+--------------------------------------------------+");
      System.out
            .println("|               Vitajte v BO Aplikacii             |");
      System.out
            .println("|                                                  |");
      System.out
            .println("|                   ZUNO Bank AG                   |");
      System.out
            .println("|                                                  |");
      System.out
            .println("+--------------------------------------------------+");

      do
      {
         System.out
               .println("Prosím vyberte jednu z nižšie uvedených množností:");
         System.out.println("1) Založenie nového účtu");
         System.out.println("2) Vytvor vklad");
         System.out.println("3) Vytvor výber");
         System.out.println("4) Vypíš info o účte");
         System.out.println("0) Koniec");

         volba = kb.nextInt();
         while (volba < 0 || volba > 4)
         {
            System.out.println("Nespravná voľba!");
            System.out
                  .println("Zopakujte voľbu znova a zadajte číslo od 0 do 4");
            volba = kb.nextInt();
         }
         System.out.println("Vaša voľba: " + volba);
         switch (volba)
         {

            case 1:
               zalozenieUctu(klienti,ucty,kb);
               break;
            case 2:
               vytvorVklad(klienti, ucty,kb);
               break;
            case 3:
               vytvorVyber(klienti, ucty,kb);
               break;
            case 4:
               VypisInfoOUcte(klienti, ucty,kb);
               break;
            default:
               if (volba == 0)
               {
                  break;
               }
               else
               {
                  System.out.println("Nespravný výber!!!");
               }
         }
      }
      while (volba != 0);
      System.out.println("Aplikácia sa ukončuje!");

   }

   /**
    * Táto metóda služí na vytvorenie učtu
    */
   public static void zalozenieUctu(Klienti klienti, BankoveUcty ucty,Scanner kb)
   {

      SporiaciUcet sporiaciUcet = new SporiaciUcet();
      BeznyUcet beznyUcet = new BeznyUcet();
      
      System.out.println("======================================================================\n");
      System.out.println("Menu - Založenie nového účtu\n");
      System.out.println("======================================================================\n");
    
      System.out.println("Zadajte meno: ");
      String meno = kb.next();
      System.out.println("Zadajte priezvisko: ");
      String priezvisko = kb.next();
      System.out.println("Zadajte rodné číslo:");
      long rc = kb.nextLong();
      System.out.println("O aký účet máte záujem (bežný alebo sporiaci)? ");
      String typUctu = kb.next();
      Klient klient = new Klient(meno,priezvisko, rc); 
      while (!(typUctu.equalsIgnoreCase("bežný") || typUctu
            .equalsIgnoreCase("sporiaci")))
      {
         System.out.println("Nespravný výber!");
         System.out.println("V ponuke máme bežný alebo sporiaci účet ");
         typUctu = kb.next();
      }
      if(typUctu.equalsIgnoreCase("bežný"))
      {      
         beznyUcet.setTypUctu(typUctu);
         vygenerujIdAjPreKlientaBU(klient, beznyUcet);
         ucty.pridajBeznyUcet(beznyUcet);
      }
      else
      {
         sporiaciUcet.setTypUctu(typUctu);
         vygenerujIdAjPreKlientaSU(klient, sporiaciUcet);
         ucty.pridajSporiaciUcet(sporiaciUcet);
      }
      klienti.pridajKlienta(klient);
      
      System.out.println(klient);
      System.out.print("Typ účtu: ");
      if(typUctu.equalsIgnoreCase(sporiaciUcet.getTypUctu()))
      {
         System.out.println(sporiaciUcet.getTypUctu());
         vytvorPociatocnyVklad(sporiaciUcet,null,kb);
      }
      else
      {
         System.out.println(beznyUcet.getTypUctu());
         vytvorPociatocnyVklad(null,beznyUcet,kb);
      }
      
   }
   
   public static void vytvorPociatocnyVklad(SporiaciUcet ucet1, BeznyUcet ucet2,Scanner kb)
   {
        final double POC_VKLAD_BU=100;
        final double POC_VKLAD_SU=50;
        

        System.out.println("Aký počiatočný vklád chcete v eur: ");

        double pociatocnyVklad = kb.nextDouble();
        
        
        if(ucet1!=null&&ucet2==null)
        {
           while (pociatocnyVklad < POC_VKLAD_SU)
           {
              System.out
                    .println("Nedostatočný počiatočný vklad. Počiatočný vklad musí byť minimalne "
                          + POC_VKLAD_SU + " Eur.");
              pociatocnyVklad = kb.nextDouble();
           }
           
           ucet1.vloz(pociatocnyVklad);
           ucet1.pripisUrok();
           
           System.out
           .println("======================================================================");
           System.out
           .print("Vklad na účet bol úspešne zrealizovaný. Aktuálny zostatok na účte:");
           System.out.println(ucet1.getAktualnyZostatok());
        }
        else if(ucet2!=null && ucet1==null)
        {
           
           while (pociatocnyVklad < POC_VKLAD_BU)
           {
              System.out
                    .println("Nedostatočný počiatočný vklad. Počiatočný vklad musí byť minimalne "
                          + POC_VKLAD_BU + " Eur.");
              pociatocnyVklad = kb.nextDouble();
           }
           
           ucet2.vloz(pociatocnyVklad);
           ucet2.pripisUrok();
           System.out
           .print("Vklad na účet bol úspešne zrealizovaný. Aktuálny zostatok na účte:");
           System.out.println(ucet2.getAktualnyZostatok());
        }
        System.out
              .println("======================================================================");           
   }

   /**
    * Táto metóda slúži na vytvorenie vkladu a vloženie prostriedkov na účet
    */
   public static void vytvorVklad(Klienti klienti, BankoveUcty ucty,Scanner kb)
   {
      
      
      System.out.println("======================================================================\n");
      System.out.println("Menu - Vytvorenie vkladu\n");
      System.out.println("======================================================================\n");
      
      if(ucty.jePrazdnyBU())
      {
         System.out.println("======================================================================");
         System.out.println("Nie su dostupne ziadne ucty\n");
         System.out.println("======================================================================");
         return;
      }
      
      BeznyUcet zmena= new BeznyUcet();
      
      int index;
      
      
      System.out.println("Zadaj priezvisko klienta: ");
      String priezvisko = kb.next();
      
      System.out.println("Zadaj rodné číslo klienta: ");
      long rc = kb.nextLong();
      
      System.out.println("Aký  vklád chcete vložiť na úceť v eur: ");
      double vklad = kb.nextDouble();
      
      while (vklad < 0.0)
      {
         System.out
               .println("Nedostatočný  vklad. Vklad musí byť minimalne "
                     + 0 + " Eur.");
         vklad = kb.nextDouble();
      }
      index = ucty.getIndexBu(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId());
      zmena=ucty.vyhladajBeznyUcet(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId());
      zmena.vloz(vklad);
      zmena.pripisUrok();
      ucty.urobZmenuNaUcte(zmena, index);
      
      System.out
            .println("======================================================================");
      System.out
            .println("Vklad na účet bol úspešne zrealizovaný. Aktuálny zostatok na účte:");
      System.out.println(zmena.getAktualnyZostatok());
      System.out
            .println("======================================================================");

   }

   /**
    * Táto metóda slúži na vytvornie a umožnuje vybrať peniaze z účtu
    */
   public static void vytvorVyber(Klienti klienti, BankoveUcty ucty,Scanner kb)
   {
      if(ucty.jePrazdnyBU())
      {
         System.out.println("======================================================================");
         System.out.println("Nie su dostupne ziadne ucty\n");
         System.out.println("======================================================================");
         return;
      }
      
      BeznyUcet zmena = new BeznyUcet();
      int index;

      double zostatok;
      
      System.out.println("Zadaj priezvisko klienta: ");
      String priezvisko = kb.next();
      
      System.out.println("Zadaj rodné číslo klienta: ");
      long rc = kb.nextLong();
      
      System.out.println("Koľko Eur. požadujete si vybrať z účtu?");
      double vyber=kb.nextDouble();
      
      zostatok=ucty.vyhladajBeznyUcet(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId()).getAktualnyZostatok();
      while(vyber> zostatok)
      {
         System.out.println("Na účte nie je dostatok finančných prostriedkov!");
         System.out.println("Koľko Eur. požadujete si vybrať z účtu? ");
         vyber=kb.nextDouble();
      }
      
      index = ucty.getIndexBu(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId());    
      zmena=ucty.vyhladajBeznyUcet(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId());
      zmena.vyber(vyber);
      ucty.urobZmenuNaUcte(zmena,index);
      
      System.out
      .println("======================================================================");
      System.out
      .println("Vyber z účtu bol úspešne zrealizovaný. Aktuálny zostatok na účte:");
      System.out.println(zmena.getAktualnyZostatok());
      System.out
      .println("======================================================================");
      
   }
   
   public static void VypisInfoOUcte(Klienti klienti, BankoveUcty ucty,Scanner kb)
   {
      if(ucty.jePrazdnyBU())
      {
         System.out.println("======================================================================");
         System.out.println("Nie su dostupne ziadne ucty\n");
         System.out.println("======================================================================");
         return;
      }
      
      BeznyUcet bu = new BeznyUcet();
      Klient kl = new Klient();

      
      System.out.println("Zadaj priezvisko klienta: ");
      String priezvisko = kb.next();
      System.out.println("Zadaj rodné číslo klienta: ");
      long rc = kb.nextLong();
      
      bu = ucty.vyhladajBeznyUcet(klienti.vyhladajKlienta(priezvisko, rc).getRovnakeId());
      kl = klienti.vyhladajKlienta(priezvisko, rc);
      System.out.println("======================================================================================================");
      System.out.println("Meno: "+kl.getMeno()+" "+kl.getPriezvisko()+"  Rodné Číslo: "+kl.getRodneCislo()+ " Číslo účtu #: "+kl.getRovnakeId());
      System.out.println(bu.getTypUctu()+": "+bu.getRovnakeId());
      System.out.println("Aktualny zostatok: "+bu.getAktualnyZostatok()+" Eur.");
      System.out.println("======================================================================================================");
      
   }

   /**
    * Tato metoda zobrazuje aktualny datum s nazvom mesiaca a aktualny cas spustenia aplikacie 
    */
   public static void zobrazAktualnyDatum()
   {
      Datum datum = new Datum();
      System.out.println(datum.getDen()+"/"+datum.getNazovMesiaca()+"/"+datum.getRok());
      System.out.println(datum.toStringCas());
   }
   
  public static void vygenerujIdAjPreKlientaBU(Klient klient,BeznyUcet bu)
  {
      int range = 5000-1000+1;
      int rand = (int)(Math.random()*range)+1000;
      int cislo = rand;
      klient.setRovnakeId(cislo);
      bu.setRovnakeId(cislo);
            
  }
  
  public static void vygenerujIdAjPreKlientaSU(Klient klient, SporiaciUcet su)
  {
     int range = 9000-5000+1;
     int rand = (int)(Math.random()*range)+1000;
     int cislo = rand;
     klient.setRovnakeId(cislo);
     su.setRovnakeId(cislo);    
  }
}
