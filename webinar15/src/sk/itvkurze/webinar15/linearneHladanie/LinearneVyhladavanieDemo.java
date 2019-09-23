package sk.itvkurze.webinar15.linearneHladanie;

import java.util.Arrays;
import java.util.Scanner;

import sk.itvkurze.webinar15.triedenie_zlucenim.PoleUtil;

public class LinearneVyhladavanieDemo
{

   public static void main(String[] args)
   {
      int[]data = PoleUtil.vygenerujPoleCisiel(20, 100);
      System.out.println(Arrays.toString(data));
      
      LinearnyVyhladavac vyhladavac = new LinearnyVyhladavac(data);
      
      Scanner vstup= new Scanner(System.in);
      
      boolean hotovo = false;
      
      while(!hotovo)
      {
         System.out.println("Zadaj cislo (-1 na ukoncenie programu): ");
         int hladaneCislo = vstup.nextInt();
         
         if(hladaneCislo == -1){
            
            hotovo = true;
         }
         else
         {
            int index = vyhladavac.vyhladaj(hladaneCislo);
            System.out.println("Pozicia hladaneho cisla: "+index);
         }
      }
      vstup.close();
   }

}
