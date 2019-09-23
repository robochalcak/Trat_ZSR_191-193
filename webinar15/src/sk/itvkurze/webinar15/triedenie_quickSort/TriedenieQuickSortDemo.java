package sk.itvkurze.webinar15.triedenie_quickSort;

import java.util.Arrays;

public class TriedenieQuickSortDemo
{
   public static void main(String[]args)
   {
      int[]data= PoleUtil.vygenerujPoleCisiel(10,100);
      
      System.out.println("Nezotriedene cisla: "+ Arrays.toString(data));
      
      TriedenieQuickSort triedic = new TriedenieQuickSort(data);
      
      triedic.zotried(0,data.length-1);
      
      System.out.println("Zotriedenie data algoritmom Quicksort: "+Arrays.toString(data));
   }
}
