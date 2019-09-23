package webinar09.skitvkurze.webinar099.mnozina_dat_meratelny;

public class BankovyUcet implements Meratelny
{
  private double aktualnyZostatok;
   
   public BankovyUcet(double pociatocnyZostatok)
   {
      this.aktualnyZostatok=pociatocnyZostatok;
   }
   public double getAktualnyZostatok()
   {
      return aktualnyZostatok;
   }
   
   public double getMiera()
   {
      return aktualnyZostatok;
   }
   

}
