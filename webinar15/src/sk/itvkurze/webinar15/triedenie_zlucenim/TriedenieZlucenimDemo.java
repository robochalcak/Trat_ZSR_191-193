package sk.itvkurze.webinar15.triedenie_zlucenim;

import java.util.Arrays;

public class TriedenieZlucenimDemo
{
   public static void main(String[]args)
   {
      int[]data= PoleUtil.vygenerujPoleCisiel(10,100);
      
      System.out.println("Nezotriedene cisla: "+ Arrays.toString(data));
      
      TriedenieZlucenim triedic = new TriedenieZlucenim(data);
      
      triedic.zotried();
      
      System.out.println("Zotriedenie data: "+Arrays.toString(data));
   }
}
