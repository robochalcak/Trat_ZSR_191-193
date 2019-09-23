package sk.itvkurze.webinar15.triedenie_zlucenim;

import java.util.Random;

/**
 * Trieda obsahuje pomocne metody namanipulaciu s polom.
 * @author Robert Chalcak
 *
 */
public class PoleUtil
{
   
   private static Random generator = new Random();
   
   /**
    * Vytvara pole s nahodne vybgenerovanymi cislamiv rozsahu < 1, az rozsahHodnot>.
    * @param velkost generovaneho pola cisiel
    * @param rozsahHodnot  cisla budu generovane z intervalu <1, rozsahHodnot>
    * @return pole s nahodne vygenerovanymi cislami
    */
   public static int[] vygenerujPoleCisiel(int velkost, int rozsahHodnot)
   {
      int[]pole = new int[velkost];
      for(int i = 0; i < velkost;i++)
      {
         pole[i]=generator.nextInt(rozsahHodnot)+1;
      }
      return pole;
   }

}
