package sk.itvkurze.webinar13.bankomat;

public class Klient
{
   private int klientskeCislo;
   private int pin;
   private BankovyUcet beznyUcet;
   private BankovyUcet sporiaciUcet;
   
   public Klient(int klientskeCislo, int pin)
   {
      this.klientskeCislo=klientskeCislo;
      this.pin=pin;
      this.beznyUcet= new BankovyUcet();
      this.sporiaciUcet=new BankovyUcet();
      
   }
   
   public BankovyUcet getBeznyUcet()
   {
      return beznyUcet;
   }
   
   public BankovyUcet getSporiaciUcet()
   {
      return sporiaciUcet;
   }
   
   public boolean jeTotoznyS(int klientskeCislo, int pin)
   {
      return (this.klientskeCislo==klientskeCislo && this.pin==pin);
   }
   
}
