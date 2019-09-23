package itvkurze.webinar1.rozne_typy_vynimiek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CitacMnozinyDat
{

   public double[] citajSubor(String nazovSuboru)throws NespravnyFormatDat, IOException
   {
      FileReader citac = new FileReader(nazovSuboru);
      
      Scanner citacSuboru = null;
      
      double[]precitaneCisla = null;
      
      try
      {
         citacSuboru = new Scanner(citac);
         precitaneCisla = nacitajCisla(citacSuboru);
      }
      finally
      {
         if(citac != null)
         {
            citac.close();
         }
         if(citacSuboru !=null)
         {
            citacSuboru.close();
         }
      }
      
      citacSuboru = new Scanner(citac);
      precitaneCisla = nacitajCisla(citacSuboru);
      
      return null;
   }

   private double[] nacitajCisla(Scanner citacSuboru) throws NespravnyFormatDat
   {
      if(citacSuboru.hasNextInt())
      {
         throw new NespravnyFormatDat("Ocakavany parameter = velkost mnoziny dat");
      }
      
      int velkostMnozinyDat = citacSuboru.nextInt();
      
      double[]data = new double[velkostMnozinyDat];
      
      for(int i = 0; i < velkostMnozinyDat;i++)
      {
         nacitajCislo(data, i, citacSuboru);
      }
      if(citacSuboru.hasNext())
      {
         throw new NespravnyFormatDat("Ocakavame koniec suboru");
      }
      return data;
   }

   private void nacitajCislo(double[] data, int pozicia, Scanner citacSuboru)throws NespravnyFormatDat
   {
      if(!citacSuboru.hasNextDouble())
      {
         throw new NespravnyFormatDat("Ocakavane realne cislo");
      }
      
      double precitaneCislo = citacSuboru.nextDouble();
      data[pozicia]=precitaneCislo;
      
   }

}
