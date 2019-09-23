package sk.itvkurze.webinar06.investovanie2;

public class InvestovanieTester
{

   public static void main(String[] args)
   {
      //vytvorenie 3 konstanty pomocou klucoveho slova final
      final double ZOSTATOK=10000;
      final double UROKOVA_SADZBA = 1;
      final int POCET_ROKOV_INVESTOVANIA=30;
      
      Investovanie investovanie = new Investovanie(ZOSTATOK, UROKOVA_SADZBA);
      investovanie.cakajRokov(POCET_ROKOV_INVESTOVANIA);
   }

}
