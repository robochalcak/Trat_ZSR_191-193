package sk.itvkurze.webinar14.bublinkoveTriedenie;

import java.util.Scanner;

public class BublinkoveTriedenieCasovac
{

   public static void main(String[] args)
   {
      Scanner vstup= new Scanner(System.in);
      System.out.println("Zadaj velkost pola: ");
      int velkost = vstup.nextInt();
      
      int[] data = PoleUtil.vygenerujPoleCisiel(velkost,1000);
      BublinkoveTriedenie triedic = new BublinkoveTriedenie(data);
      
      Stopky stopky = new Stopky();
      stopky.start();
      triedic.zotried();
      stopky.stop();
      
      System.out.println("Uplinuly cas: "+ stopky.getUplynulyCasMS()+" milisekund");
      System.out.println("Uplynuly cas: "+ stopky.getUplynulyCasNS()+" nanosekund");
      
   }

}