package sk.itvkurze.webinar13.faktura;

public class Polozka
{

   private Produkt produkt;
   private int mnozstvo;

   public Polozka(Produkt produkt, int mnozstvo)
   {
      this.produkt = produkt;
      this.mnozstvo = mnozstvo;
   }

   public double getCelkovaSuma()
   {  
      return produkt.getCena()*mnozstvo;
   }
   /**
    * Naformatuje a vrati riadok jednu polozku 
    * @return naformatovany riadok faktury 
    */
   public String naformatuj()
   {
      
      return String.format("%-30s %8.2f%10d%8.2f ", produkt.getNazov(),produkt.getCena(),mnozstvo, getCelkovaSuma() );
   }

}
