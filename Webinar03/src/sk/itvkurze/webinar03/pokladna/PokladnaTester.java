package sk.itvkurze.webinar03.pokladna;

public class PokladnaTester
{
   public static void main(String[]args)
   {
      Pokladna pokladna = new Pokladna();
      
      pokladna.naskenujTovar(0.08);
      pokladna.naskenujTovar(0.08);
      pokladna.naskenujTovar(0.08);
      pokladna.naskenujTovar(0.08);
      pokladna.naskenujTovar(0.08);
      pokladna.naskenujTovar(20);
      
      pokladna.prijmiHotovost(10);
      pokladna.prijmiHotovost(5);
      pokladna.prijmiHotovost(2);
      pokladna.prijmiHotovost(2);
      pokladna.prijmiHotovost(2);
      
      System.out.printf("Vydavok: %.2f%n",pokladna.vydajVydavok());
      System.out.println("Ocakavana hodnota: 0.60");
   }
}
