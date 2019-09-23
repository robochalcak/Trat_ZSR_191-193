package sk.itvkurze.webinar06.investovanie2;
/**
 * Vytvorte program, ktory zisti po kolkych rokoch investovania zdvojnasobi vklad 10000Eur
 * pri 5% urokovej sadzbe
 * 
 * a)
 * @author Robert Chalcak
 *
 */
public class Investovanie
{
   // Instacne premenne 
   private double aktualnyZostatok;
   private double urokovaSadzba;
   private int pocetRokovInvestovania;
   
   public Investovanie(double pociatocnyZostatok, double urokovaSadzba)
   {
      this.aktualnyZostatok = pociatocnyZostatok;
      this.urokovaSadzba=urokovaSadzba;
      this.pocetRokovInvestovania=0;
   }
   
   public void cakajNaZostatok(double zelanyZostatok)
   {
      System.out.printf("Zostatok po %d. rokoch je %.2f Eur%n",pocetRokovInvestovania,aktualnyZostatok);
      
      while(aktualnyZostatok < zelanyZostatok)
      {
         pocetRokovInvestovania++;
         double urok=aktualnyZostatok * urokovaSadzba /100;
         aktualnyZostatok+=urok;
         System.out.printf("Zostatok po %d. rokoch je %.2f Eur %n",pocetRokovInvestovania,aktualnyZostatok);
      }
   }
   
   public void cakajRokov(int pocetRokov)
   {
      
      for(int i = 1; i<=pocetRokov;i++)
      {
         double urok=aktualnyZostatok * urokovaSadzba /100;
         aktualnyZostatok+=urok;
         System.out.printf("Zostatok po %d. rokoch je %.2f Eur %n",i,aktualnyZostatok);
      }
   }
   public int getPocetRokovInvestovania()
   {
      return pocetRokovInvestovania;
   }
   
   
}
