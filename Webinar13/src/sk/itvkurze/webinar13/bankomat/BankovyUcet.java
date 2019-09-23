package sk.itvkurze.webinar13.bankomat;

public class BankovyUcet
{
   private double aktualnyZostatok;
   
   public BankovyUcet()
   {
      this(0);
   }
   
   public BankovyUcet(double pociatocnyZostatok)
   {
      this.aktualnyZostatok=pociatocnyZostatok;
   }
   
   public double getAktualnyZostatok()
   {
      return aktualnyZostatok;
   }
   
   public void vloz(double ciastka)
   {
      this.aktualnyZostatok+=ciastka;
   }
   
   public void vyber(double ciastka)
   {
      this.aktualnyZostatok-=ciastka;
   }
}
