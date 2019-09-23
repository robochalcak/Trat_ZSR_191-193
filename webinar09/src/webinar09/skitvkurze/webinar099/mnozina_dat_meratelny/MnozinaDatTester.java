package webinar09.skitvkurze.webinar099.mnozina_dat_meratelny;

public class MnozinaDatTester
{

   public static void main(String[] args)
   {
      // 1)chceme zbierat statistiky o bankovych uctoch
      
      MnozinaDat bankoveUcty = new MnozinaDat();
      
      bankoveUcty.pridaj(new BankovyUcet( 0));
      bankoveUcty.pridaj(new BankovyUcet(10000));
      bankoveUcty.pridaj(new BankovyUcet(2000));
      
      System.out.println(
            "Priemerny zostatok na uctoch: " + bankoveUcty.getPriemer());
      System.out.println("Ocakavana hodnota: 4000.0");
      
      Meratelny maximum = bankoveUcty.getMaximum();
      BankovyUcet maxUcet = (BankovyUcet)maximum;
      System.out.println("Bankovy ucet s max zostatkom ");
      
      Meratelny minimum = bankoveUcty.getMinimum();
      BankovyUcet minUcet = (BankovyUcet)minimum;
      System.out.println("Bankovy ucet s min zostatkom ");
      
     //2)chceme zbierat statistiky o minciach 
      MnozinaDat mince = new MnozinaDat();
      
      //

   }

}
