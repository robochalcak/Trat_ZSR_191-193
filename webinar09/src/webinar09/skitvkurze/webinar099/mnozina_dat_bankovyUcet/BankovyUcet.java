package webinar09.skitvkurze.webinar099.mnozina_dat_bankovyUcet;

public class BankovyUcet
{
   private String nazov;
   private double hodnota;
   
   public BankovyUcet(String nazov, double hodnota)
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
