package sk.itvkurze.webinar14.TriedenieVyberom;

import java.util.Arrays;
import java.util.Scanner;

public class TriedenieVyberomCasovac
{

   public static void main(String[] args)
   {
      Scanner vstup= new Scanner(System.in);
      System.out.println("Zadaj velkost pola: ");
      int velkost = vstup.nextInt();
      
   
      
      int[] data = PoleUtil.vygenerujPoleCisiel(velkost,1000);
      TriedicVyberom triedic = new TriedicVyberom(data);
      
      Stopky stopky = new Stopky();
      stopky.start();
      triedic.zotried();
      stopky.stop();
      
      System.out.println("Uplinuly cas: "+ stopky.getUplynulyCasMS()+" milisekund");
      System.out.println("Uplynuly cas: "+ stopky.getUplynulyCasNS()+" nanosekund");
      
   }

}
