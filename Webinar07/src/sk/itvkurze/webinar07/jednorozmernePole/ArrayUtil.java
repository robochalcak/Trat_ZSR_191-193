package sk.itvkurze.webinar07.jednorozmernePole;

public class ArrayUtil
{
   //vytvor metodu, ktora vypise prvky pola a metoda prijma parameter cisiel 
   
   public void vypisCisla(int[]cisla)
   {
      for(int cislo:cisla)
      {
         System.out.println(cislo);
      }
   }
   
   //vytvor metodu s prmemenlivym poctom parametrov, ktora vypise prvky pola na standarny vystup
   
   public void vypisCisla2(int...cisla)
   {
      for(int cislo:cisla)
      {
         System.out.println(cislo);
      }
   }
}
