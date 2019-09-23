package sk.itvkurze.webinar13.faktura;

public class Produkt
{

   private String nazov;
   private double cena;

   public Produkt(String nazov, double cena)
   {
      this.nazov=nazov;
      this.cena=cena;
   }
   public String getNazov()
   {
      return nazov;
   }
   public double getCena()
   {
      return cena;
   }
}
