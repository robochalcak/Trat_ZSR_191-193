package itvkurze.webinar16.otazka_3;

public class Main
{
   public static void main(String[]args)
   {
      //mame pole cisiel 
      
      int [] cisla = {5,11,16,64,87,74,9,44};
      
      //napiste algoritmus, ktory vrati priemer cisiel z pola cisla 
      
      double priemer=0;
      
      for(int i = 0; i < cisla.length;i++)
      {
         priemer +=cisla[i];
      }
      
      System.out.println(priemer/cisla.length); 
   }
}
