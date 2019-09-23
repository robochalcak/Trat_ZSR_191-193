package sk.itvkurze.webinar23.sifrovaniva;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CeasarovaSifraTester
{

   public static void main(String[] args)
   {
      Scanner vstup = new Scanner(System.in);
      
      try{
      
      System.out.print("Vstupny subor: ");
      String nazovVstupnehoSuboru = vstup.next();
      
      System.out.print("Vystupny subor: ");
      
      String nazovVystupnehoSubor = vstup.next();
      
      System.out.println("Sifrovaci kluc: ");
      int kluc = vstup.nextInt();
      
      InputStream vstupStream = new FileInputStream(nazovVstupnehoSuboru);
      OutputStream vystupnyStream = new FileOutputStream(nazovVystupnehoSubor);
      
      CeasarovaSifra sifra = new CeasarovaSifra(kluc);
      sifra.zasifrujStream(vstupStream, vystupnyStream);
      
      vstupStream.close();
      vystupnyStream.close();
      vstup.close();
      
      }
      catch(IOException e)
      {
         System.out.println("Chyba pri procesovani suboru: "+e);
      }
   }

}
