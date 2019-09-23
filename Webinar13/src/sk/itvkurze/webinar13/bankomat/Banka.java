package sk.itvkurze.webinar13.bankomat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka
{
   private ArrayList<Klient>klienti;
   
   public Banka()
   {
      this.klienti = new ArrayList<Klient>();
   }
   
   public void nacitajKlientov(String suborSKlientami)throws FileNotFoundException
   {
      Scanner vstupZoSuboru = new Scanner(new FileReader(suborSKlientami));
      
      while(vstupZoSuboru.hasNext())
      {
         int klientskeCislo = vstupZoSuboru.nextInt();
         int pin = vstupZoSuboru.nextInt();
         
         Klient klient = new Klient(klientskeCislo, pin);
         pridajKlienta(klient);
      }
      vstupZoSuboru.close();
   }
   
   private void pridajKlienta(Klient klient)
   {
      klienti.add(klient);
   }

   public Klient vyhladajKlienta(int klientskeCislo, int pin)
   {
      for(Klient klient : klienti)
      {
         if(klient.jeTotoznyS(klientskeCislo, pin))
         {
            return klient;
         }
      }
      return null;
   }
}
