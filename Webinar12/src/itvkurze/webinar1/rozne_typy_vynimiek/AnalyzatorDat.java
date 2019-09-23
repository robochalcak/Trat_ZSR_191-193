package itvkurze.webinar1.rozne_typy_vynimiek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AnalyzatorDat
{
   public static void main(String[]args)
   {
      Scanner vstup = new Scanner(System.in);
      CitacMnozinyDat citac = new CitacMnozinyDat();
      
      //platformovo nezavisly oddelovac adresarov
      
      String oddelovac = File.separator;
      //absolutna cesta k suboru data.txt H:\JAVA\ITvKurze\Webinar12
    //  String nazovSuboru = "H:"+ oddelovac + "ITvKurze "+oddelovac + "Webinar12"+oddelovac + "data.txt";
      String nazovSuboru = "C:"+oddelovac + "data.txt";
      boolean precitaneVsetkyData = false;
      
      
      
      while(!precitaneVsetkyData)
      {
          
        try{ 
         double[] data=citac.citajSubor(nazovSuboru);
          
          double sucet = 0;
          
          for(double cislo:data){
            sucet+=cislo; 
          }
        }
        catch(FileNotFoundException vynimka )
        {
           System.out.println("Subor s nazvom "+ nazovSuboru+ " sa nenasiel!");
        }
        catch(IOException vynimka)
        {
           System.out.println("Nastala nejaka IO chyba!");
        }
        catch(NespravnyFormatDat vynimka )
        {
           System.out.println("Nespravny format dat");
        }
         // System.out.println("Sucet vsetkych cisiel v subore "+ nazovSuboru+" je " + sucet);
          precitaneVsetkyData = true;
          
      }
            
           
      
      
      
   }
}
