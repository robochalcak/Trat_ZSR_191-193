package sk.itvkurze.webinar03.bankovy_ucet;

public class BankovyUcetTester
{

   public static void main(String[] args)
   {
      BankovyUcet bankovyUcet = new BankovyUcet(500.0);
      
      bankovyUcet.vloz(300.0);
      
      bankovyUcet.vyber(100.0);
      
      System.out.println("Aktualny zostatok na ucete: "+bankovyUcet.getAktualnyZostatok());
      System.out.println("Ocakavana hodnota: 700.0");
   }

}
