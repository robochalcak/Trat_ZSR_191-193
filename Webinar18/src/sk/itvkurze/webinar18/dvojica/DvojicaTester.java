package sk.itvkurze.webinar18.dvojica;

public class DvojicaTester
{

   public static void main(String[] args)
   {
      // Integer - BankovyUcet
      Dvojica<Integer, BankovyUcet>bankovyUcet = new Dvojica<Integer, BankovyUcet>(1,new BankovyUcet(1000));
      int idUctu = bankovyUcet.getPrvy();
      
      BankovyUcet ucet = bankovyUcet.getDruhy();
      
      System.out.println("ID: "+ idUctu);
      System.out.println("Bankovy ucet: " + ucet.toString());
      
      
      // Double  - String
      
      Dvojica<Double, String> igorNovak = new Dvojica<Double, String>(1.88,"Igor Novak");
      
      System.out.println("Vyska studenta: "+ igorNovak.getPrvy());
      System.out.println("Meno studenta: "+ igorNovak.getDruhy());

   }

}
