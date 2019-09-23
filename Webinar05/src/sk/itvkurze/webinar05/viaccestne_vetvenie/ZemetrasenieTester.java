package sk.itvkurze.webinar05.viaccestne_vetvenie;

import java.util.Scanner;

public class ZemetrasenieTester
{
   public static void main(String[] args)
   {
      Scanner vstup = new Scanner(System.in);

      System.out.println("Zadaj silu zemetrasenia na Richterovej stupnici: ");
      double magnituda = vstup.nextDouble();

      Zemetrasenie zemetrasenie = new Zemetrasenie(magnituda);
      
      System.out.println(zemetrasenie.getPopis());
      
      vstup.close();
      
   }
}
