package sk.itvkurze.webinar04.pokladna;

public class PokladnaTester
{

   public static void main(String[] args)
   {
      Pokladna pokladna = new Pokladna();
      
      System.out.println("Celkova suma naskenovanych tovarov: "+pokladna.getCelkovaSumaNaskenovanychTovarov());
      System.out.println("Celkova suma naskenovanych tovarov: "+pokladna.getCelkovaSumaPeniaziPrijatychPeniaziOdZakaznika());
      
      //naskenujeme 4 rozky, kazdy stoji 0.04Eur, chlieb 1.65Eur, mlieko 1.50Eur, tesco taska 0.08Eur
      // 4 x rozok po 0.04
      pokladna.naskenujTovar(0.04);
      pokladna.naskenujTovar(0.04);
      pokladna.naskenujTovar(0.04);
      pokladna.naskenujTovar(0.04);
      
      // 1x chlieb po 1.65 
      pokladna.naskenujTovar(1.65);
      
      // 1x mlieko po 1.50
      pokladna.naskenujTovar(1.50);
      
      // 1x tesco taska 0.08
      pokladna.naskenujTovar(0.08);
      double zaokruhlenie = pokladna.zaokruhli(pokladna.getCelkovaSumaNaskenovanychTovarov(),2);
      System.out.println("Celkova suma naskenovanych tovarov: "+pokladna.getCelkovaSumaNaskenovanychTovarov());
      
      //prijmy od zakaznika hotovost 10,5,20
      
      pokladna.prijmyHotovost(10);
      pokladna.prijmyHotovost(5);
      pokladna.prijmyHotovost(20);
      
     
      System.out.println("Celkova suma prijatych peniazi od zakaznika: "+pokladna.getCelkovaSumaPeniaziPrijatychPeniaziOdZakaznika());
      
      double vydavok = pokladna.vydajVydavok();
      System.out.println("Vydavok: "+vydavok);
      
   }

}
