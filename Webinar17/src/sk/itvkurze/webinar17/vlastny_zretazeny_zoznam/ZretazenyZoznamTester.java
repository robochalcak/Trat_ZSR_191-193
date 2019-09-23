package sk.itvkurze.webinar17.vlastny_zretazeny_zoznam;

public class ZretazenyZoznamTester
{

   public static void main(String[] args)
   {
      ZretazenyZoznam studenti = new ZretazenyZoznam();
      
      System.out.println("Pridanie prvkov do zretazeneho zoznamu pmocou metody pridajNaZaciatku()");
      
      studenti.pridajNaZaciatok("Peter");   // Peter
      studenti.pridajNaZaciatok("Igor");    // Igor Peter
      studenti.pridajNaZaciatok("Marek");   // Marek Igor Peter
      studenti.pridajNaZaciatok("Vojto");   // Vojto Marek Igor Peter 
      
      vypisPrvkyZoznamu(studenti);
      System.out.println("Ocakavana hodnota: Vojto Marek Igor Peter");
      
      //ziskaj data prveho uzla - Vojto
      
      String menoStudenta = (String)studenti.getPrvy();
      
      System.out.println("\nPrvy student: "+ menoStudenta);
      System.out.println("Ocakavana hodnota: Vojto");
      
      //odstranenie prvkov zo zoznamu pomocou metody zretazeneho zoznamu
      
      System.out.println("\nZmazanie celeho zoznamu pomocou zmazZoZaciatku()");
      System.out.println("Zmazali sme studenta: "+ studenti.zmazZoZaciatku());
      System.out.println("Zmazali sme studenta: "+ studenti.zmazZoZaciatku());
      System.out.println("Zmazali sme studenta: "+ studenti.zmazZoZaciatku());
      System.out.println("Zmazali sme studenta: "+ studenti.zmazZoZaciatku());
      
      vypisPrvkyZoznamu(studenti);
      System.out.println("Ocakavana hodnota: ");
      
      // pridanie do zoznamu pomocou metody iteratora pridaj()
      ZoznamIterator iterator = studenti.iteratorZoznamu();
      
      iterator.pridaj("Monika");  // Monika
      iterator.pridaj("Zuzka");   // Zuzka Monika
      iterator.pridaj("Katka");    // Katka Zuzka Monika
      iterator.pridaj("Janka");    // Katka Zuzka Monika Janka
      
      vypisPrvkyZoznamu(studenti);
      System.out.println("\nOcakavana hodnota: Janka Katka Zuzka Monika ");
      
      System.out.println("Zmazanie celeho zretazeneho zoznamu pomocou iteratora");
      iterator = studenti.iteratorZoznamu();
      
      while(iterator.existujeDalsiPrvok())
      {
         System.out.println("Aktualne zmazany prvok: "+ iterator.dalsi());
         iterator.zmaz();
      }
      
      vypisPrvkyZoznamu(studenti);
      System.out.println("\nOcakavana hodnota: ");
 
   }
   
   private static void vypisPrvkyZoznamu(ZretazenyZoznam zoznam)
   {
      ZoznamIterator iterator = zoznam.iteratorZoznamu();
      while(iterator.existujeDalsiPrvok())
      {
         String menoStudenta = (String)iterator.dalsi();
         System.out.println(menoStudenta + " ");
      }
      System.out.println();
   }

}
