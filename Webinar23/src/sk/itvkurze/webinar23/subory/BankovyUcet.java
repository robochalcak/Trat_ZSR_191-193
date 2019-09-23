package sk.itvkurze.webinar23.subory;

public class BankovyUcet
{
   private double aktualnyZostatok;
   private int cisloUctu;
   
   public BankovyUcet(int cisloUctudouble,double zostatok)
   {
      this.aktualnyZostatok=zostatok;
      this.cisloUctu=cisloUctu;
   }

   public double getAktualnyZostatok()
   {
      return aktualnyZostatok;
   }

   public void vloz(double ciastka)
   {
      this.aktualnyZostatok+=ciastka;
      
   }

   public int getCisloUctu()
   {
      return cisloUctu;
   }

   public void setCisloUctu(int cisloUctu)
   {
      this.cisloUctu = cisloUctu;
   }

   public void setAktualnyZostatok(double aktualnyZostatok)
   {
      this.aktualnyZostatok = aktualnyZostatok;
   }

}
