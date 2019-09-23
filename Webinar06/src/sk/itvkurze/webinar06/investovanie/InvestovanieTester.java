package sk.itvkurze.webinar06.investovanie;

public class InvestovanieTester
{

   public static void main(String[] args)
   {
      //vytvorenie 3 konstanty pomocou klucoveho slova final
      final double ZOSTATOK=10000;
      final double UROKOVA_SADZBA = 5;
      final double ZELANY_ZOSTATOK=20000;
      
      Investovanie investovanie = new Investovanie(ZOSTATOK, UROKOVA_SADZBA);
      
      investovanie.cakajNaZostatok(ZELANY_ZOSTATOK);
      
      int pocetRokovInvestovania = investovanie.getPocetRokovInvestovania();
      System.out.println("Zostatok sa nam zdvojnasobi po "+pocetRokovInvestovania+" rokoch investovania.");

   }

}
