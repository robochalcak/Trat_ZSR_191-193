package sk.itvkurze.webinar17.pouzitie_zretazeneho_zoznamu;

import java.util.LinkedList;
import java.util.ListIterator;

public class ZretazenyZoznamTester
{

   public static void main(String[] args)
   {
      LinkedList<String>studenti = new LinkedList<String>(); // prazdny zoznam
      
      //pridavavanie prvkov do zretazeneho zoznamu
      
      studenti.add("Dalibor");                // Dalibor
      studenti.add("Heno");                     // Dalibor Heno
      studenti.add("Radka");                    // Dalibor Heno Radka
      studenti.add("Tomas");                    // Dalibor Heno Radka Tomas
      
      // | specifikovat aktualnu poziciu iteratora (komponenta na prechadzanie/iterovanie zoznamom)
      
      ListIterator<String> iterator = studenti.listIterator(); // |DHRT
      iterator.next();                                         // D|HRT
      iterator.next();                                         // DH|RT
      
      //chceme pridat novy prvok medzi Hena a Radku, t.j. za 2 clen v zretazenom zozname
      iterator.add("Julka");                                  // DHJ|RT
      iterator.add("Norbert");                                 // DHJN|RT
      
      iterator.next();                                        // DHJNR|T
      
      //odstranenie posledne navstiveneho uzla (prvku)
      iterator.remove();                                       //DHJN|T
      
      //zobrazime vsetky prvky 
      System.out.println("Vypis mena studentov (pomocou cyklu foreach): ");
      
      for(String menoStudenta: studenti)
      {
         System.out.println("Meno studenta: "+ menoStudenta);
      }
      
      // zobraz vsetky prvky pomocou iteratora 
      System.out.println("Vypis mena studentov (pomocou iteratora): ");
      iterator = studenti.listIterator(); 
      
      while(iterator.hasNext())
      {
         String menoStudenta = iterator.next();
         System.out.println("Meno studenta: "+menoStudenta);
      }
      
      // zobraz vsetky prvky (od konca k zaciatku )-> domaca uloha
      
     
      
   }

}
