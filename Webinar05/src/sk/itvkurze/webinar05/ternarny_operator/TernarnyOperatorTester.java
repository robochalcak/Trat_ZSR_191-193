package sk.itvkurze.webinar05.ternarny_operator;

public class TernarnyOperatorTester
{

   public static void main(String[] args)
   {
      int vek = 25;
      String sprava ="";
      
      if(vek>=18)
      {
         sprava="Osoba je starsia ako 18 rokov. ";
      }
      else
      {
         sprava ="Mladisva osoba";
      }
      
      System.out.println(vek + " -> " + sprava);
      
      
      // riesenie pomocou ternarneho operatora 
      
      sprava = vek >=18 ? "Osoba je starsia ako 18 rokov":"Mladistva osoba";
      
      System.out.println(vek +" -> "+ sprava);

   }

}
