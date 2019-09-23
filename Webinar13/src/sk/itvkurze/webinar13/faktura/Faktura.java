package sk.itvkurze.webinar13.faktura;

import java.util.ArrayList;

/**
 * Obsahuje adresu zakaznika, jednotlive polozky a celkovu cenu na uhradu.
 * @author Robert Chalcak
 *
 */
public class Faktura
{

   private Adresa adresaZakaznika;
   private ArrayList<Polozka>polozky;

   public Faktura(Adresa adresaZakaznika)
   {
      this.adresaZakaznika = adresaZakaznika;
      this.polozky=new ArrayList<Polozka>();
   }

   public void pridaj(Produkt produkt, int mnozstvo)
   {  
      Polozka polozka = new Polozka(produkt, mnozstvo);
      polozky.add(polozka);
   }

   public String naformatuj()
   {
      String vystup = "       FAKTURA\n"
            +adresaZakaznika.naformatuj()
            +String.format("\n%-30s%10s%10s%10s", "Popis","Cena","Mnozstvo","Celkova cena\n");
      
      for(Polozka polozka:polozky)
      {
         vystup+=polozka.naformatuj() + "\n";
      }
      
      vystup+=String.format("\nCelkova suma na uhradu: %8.2f%n" , getCelkovaSumaNaUhradu());
      return vystup;
   }
   public double getCelkovaSumaNaUhradu()
   {
      double celkovaSuma = 0;
      
      for(Polozka polozka:polozky)
      {
         celkovaSuma+=polozka.getCelkovaSuma();
      }
      return celkovaSuma;
   }
}
