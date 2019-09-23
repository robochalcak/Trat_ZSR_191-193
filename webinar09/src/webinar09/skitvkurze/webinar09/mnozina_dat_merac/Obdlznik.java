package webinar09.skitvkurze.webinar09.mnozina_dat_merac;

public class Obdlznik
{
   private double sirka, vyska;
   
   public Obdlznik(double sirka, double vyska)
   {
      this.sirka=sirka;
      this.vyska=vyska;
   }
   
   public double getPlocha()
   {
      return sirka * vyska;
   }
   
   public String toString()
   {
      return "Obdlznik [sirka=" + sirka + ", vyska=" + vyska+"]";
   }
   
}
