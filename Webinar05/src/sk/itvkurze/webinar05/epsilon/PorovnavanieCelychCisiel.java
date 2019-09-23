package sk.itvkurze.webinar05.epsilon;

public class PorovnavanieCelychCisiel
{

   public static void main(String[] args)
   {
      double cislo1 = 5.5;
      double cislo2 = 5.6;
      final double EPSILON = 1e-14;
      
      if(Math.abs(cislo1-cislo2)<=EPSILON)
      {
         System.out.println(cislo1 +" == "+ cislo2 + "s presnostou na 1e-14.");
         System.out.println(cislo1 + " je rovnake ako "+ cislo2 +"vzhladom na epsilon");
      }
      else
      {
         System.out.println(cislo1 + "!= "+ cislo2 + "s presnostou na 1e-14");
         System.out.println("cislo1 je rozne od cislo 2 vzhladom na epsilon.");
         
      }
      
      double a = Math.sqrt(2);
      double b = a * a;
      
      if(b==2)
      {
         System.out.println("b == 2");
        
      }
      else
      {
         System.out.println("b = " + b);
         double e = b-2;
         System.out.println("Chyba presnosti vypoctu je "+e);
      }

   }

}
