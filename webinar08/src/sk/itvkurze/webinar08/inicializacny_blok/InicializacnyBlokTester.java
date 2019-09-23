package sk.itvkurze.webinar08.inicializacny_blok;

public class InicializacnyBlokTester
{

   public static void main(String[] args)
   {
      InicializacnyBlok initBlok = new InicializacnyBlok();
      
      System.out.println("Pocet vytvorenych objektov: " + InicializacnyBlok.getPocetVytvorenychObjektov());
      
      System.out.println("----------------------------------------------");
      
      InicializacnyBlok initBlok2 = new InicializacnyBlok();
      System.out.println("Pocet vytvorenych objektov: "+initBlok.getPocetVytvorenychObjektov());
      System.out.println("Pocet vytvorenych objektov: "+initBlok2.getPocetVytvorenychObjektov());
      System.out.println("Pocet vytvorenych objektov: "+InicializacnyBlok.getPocetVytvorenychObjektov());
      

   }

}
