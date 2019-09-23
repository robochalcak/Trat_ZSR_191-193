package sk.itvkurze.webinar18.neohraniceny_typ;

import java.util.ArrayList;
import java.util.List;

public class ZolikTest
{
   private static void vypisZoznam(List<Object>zoznam)
   {
      for(Object prvok: zoznam)
      {
         System.out.println(prvok);
      }
   }
   
   private static void vypisZoznam2(List<?> zoznam)
   {
      for(Object prvok: zoznam)
      {
         System.out.println(prvok);
      }
   }
   
   private static <T>void vypisZoznam3(List<T> zoznam)
   {
      for(T prvok: zoznam)
      {
         System.out.println(prvok);
      }
   }
  
   public static void main(String[] args)
   {
      List<Object>studenti = new ArrayList<Object>();
      studenti.add("Peter");
      studenti.add("Karol");
      studenti.add("Monika");
      
      List<String>absolventi = new ArrayList<String>();
      
      absolventi.add("Janka");
      absolventi.add("Katka");
      absolventi.add("Zdenka");
      
      //zoznam typu Object -> studenti
      //1)vypis pomocou metody vypisStudenti();
      
      vypisZoznam(studenti);
      System.out.println("----------------------------------------");
      // 2) Vypis pomocou metody vypisZoznam2();
      vypisZoznam2(studenti);
      
      
      vypisZoznam2(absolventi);
   }

}
