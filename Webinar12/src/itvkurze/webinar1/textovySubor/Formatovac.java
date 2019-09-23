package itvkurze.webinar1.textovySubor;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Formatovac
{

   public static void main(String[] args) throws IOException
   {
      Scanner vstup = new Scanner(System.in);
      
      System.out.println("Zadaj nazov vstupneho suboru: ");
      
      String nazovVstupnehoSuboru = vstup.next();
      
      System.out.println("Zadaj nazov vystupneho suboru: ");
      String nazovVystupnehoSuboru = vstup.next();
      
      FileReader citac = new FileReader(nazovVstupnehoSuboru);
      
      Scanner citacSuboru = new Scanner(citac);
      
      PrintWriter zapisovac = new PrintWriter(nazovVystupnehoSuboru);
      
      int cisloRiadka = 1;
      
      while(citacSuboru.hasNextLine())
      {
         String riadokZoSuboru = citacSuboru.nextLine();
         String ocislovanyRiadok = "/* "+cisloRiadka+" */"+riadokZoSuboru;
         
         zapisovac.println(ocislovanyRiadok);
         
         cisloRiadka++;
      }
      
      zapisovac.close();
      citac.close();
      vstup.close();
      citacSuboru.close();

   }

}
