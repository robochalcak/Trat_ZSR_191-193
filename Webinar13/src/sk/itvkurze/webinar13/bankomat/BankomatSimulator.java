package sk.itvkurze.webinar13.bankomat;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankomatSimulator
{
   private static final int SPORIACI = 0;

   public static void main(String[]args)
   {
      Bankomat bankomat;
      final String SUBOR_S_KLIENTAMI="klienti.txt";
      
      try
      {
         Banka banka = new Banka();
         banka.nacitajKlientov(SUBOR_S_KLIENTAMI);
         bankomat = new Bankomat(banka);
      }
      catch(FileNotFoundException vynimka){
         System.out.println("Chyba pri otvarani suboru: "+SUBOR_S_KLIENTAMI+"'");
         return;
      }
      
      Scanner vstup = new Scanner(System.in);
      
      while(true)
      {
         int stav = bankomat.getStav();
         
         if(stav == Bankomat.START)
         {
            System.out.println("Klientske cislo: ");
            int klientskeCislo = vstup.nextInt();
            bankomat.setKlientskeCislo(klientskeCislo);
         }
         else if(stav== Bankomat.PIN)
         {
            System.out.println("Zadaj PIN: ");
            int pin = vstup.nextInt();
            bankomat.nastavKlienta(pin);
         }
         else if(stav==Bankomat.UCET)
         {
            System.out.println("A=Bezny ucet, B= sporiaci ucet, C=Koniec:");
            String volba = vstup.next();
            if(volba.equalsIgnoreCase("A"))
            {
               bankomat.nastavTypUctu(Bankomat.UCET);
            }
            else if(volba.equalsIgnoreCase("B"))
            {
               bankomat.nastavTypUctu(SPORIACI);
            }
            else if(volba.equalsIgnoreCase("C"))
            {
               bankomat.reset();
            }
            
         }
         else if(stav==Bankomat.TRANSAKCIA)
         {
            System.out.println("Aktualny zostatok: "+bankomat.getAktualnyZostatok()+" Eur");
            
            System.out.println("A=vklad, B=Vyber, C=Krok spat: ");
            String volba=vstup.next();
            
            if(volba.equalsIgnoreCase("A"))
            {
               System.out.println("Ciastka: ");
               double ciastka = vstup.nextDouble();
               
               bankomat.vloz(ciastka);
               bankomat.nastavPredchadzajuciStav();
            }
            else if(volba.equalsIgnoreCase("B"))
            {
               System.out.println("Ciastka: ");
               double ciastka = vstup.nextDouble();
               
               bankomat.vyber(ciastka);
               bankomat.nastavPredchadzajuciStav();
            }
            else
            {
               System.out.println("Nespravna volba!");
            }
         }
      }
      
   }
}
