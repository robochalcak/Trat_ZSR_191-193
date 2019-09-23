package webinar09.skitvkurze.webinar099.mnozina_dat_minca;

public class Minca
{
   private String nazov;
   private double hodnota;
   
   public Minca(String nazov, double hodnota)
   {
      this.nazov=nazov;
      this.hodnota=hodnota;
   }
   public double getHodnota()
   { 
      return hodnota;
   }
   public String getNazov()
   {
      return nazov;
   }

}
