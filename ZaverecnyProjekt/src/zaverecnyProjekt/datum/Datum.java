package zaverecnyProjekt.datum;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Tato trieda vytvara datum, vracia den, mesiac, rok, hodinu a minutu
 * Je mozne vratit aj aktualny cas a zistit prestupnot roka, nazov alebo cislo mesiaca
 * Porovnava a testuje ci je dany datum pred alebo medzi 
 * @author Robert Chalcak, Tomas Pajonk a Zuzana Bajakova 
 *
 */
public class Datum
{
   private int den;  // uchovava den 
   private int mesiac; // uchovava mesiac 
   private int rok;    // uchovava rok 
   private int hodina;  // uchovava hodinu
   private int minuta;  // uchovava minutu 
   
   /**
    * Vytvara objekt datum s pouzitim parametrov:
    * @param den
    * @param mesiac
    * @param rok
    * @param hodina
    * @param minuta
    */
   public Datum(int den, int mesiac, int rok, int hodina, int minuta)
   {
      this.den = den;
      this.mesiac = mesiac;
      this.rok = rok;
      this.hodina = hodina;
      this.minuta = minuta;
   }
   /**
    * Vytvara objekt datum s pouzitim parametrov:
    * @param den
    * @param mesiac
    * @param rok
    */
   public Datum(int den, int mesiac, int rok)
   {
      this.den = den;
      this.mesiac = mesiac;
      this.rok = rok;
      this.hodina = 0;
      this.minuta = 0;
   }
   /**
    * Vytvara objekt bez pouzitia parametrov a nastavuje aktualny datum a cas
    */
   public Datum()
   {
      Calendar teraz = GregorianCalendar.getInstance();
      this.den = teraz.get(Calendar.DAY_OF_MONTH);
      this.mesiac = teraz.get(Calendar.MONTH) + 1;
      this.rok = teraz.get(Calendar.YEAR);
      this.hodina = teraz.get(Calendar.HOUR_OF_DAY);
      this.minuta = teraz.get(Calendar.MINUTE);
   }
   /**
    * Nastavuje den s pouzitim parametra:
    * @param den 
    */
   public void setDen(int den)
   {
      this.den = den;
   }
   /**
    * Nastavuje mesiac s pouzitim parametra:
    * @param mesiac
    */
   public void setMesiac(int mesiac)
   {
      this.mesiac = mesiac;
   }
   /**
    * Nastavuje rok s pouzitim parametra:
    * @param rok
    */
   public void setRok(int rok)
   {
      this.rok = rok;
   }
   /**
    * Nastavuje hodinu s pouzitim parametra:
    * @param hodina
    */
   public void setHodina(int hodina)
   {
      this.hodina = hodina;
   }
   /**
    * Nastavuje minutu s pouzitim parametra:
    * @param minuta
    */
   public void setMinuta(int minuta)
   {
      this.minuta = minuta;
   }
   /**
    * Vracia den 
    * @return den 
    */
   public int getDen()
   {
      return den;
   }
   /**
    * Vracia 
    * @return den 
    */
   public int getMesiac()
   {
      return mesiac;
   }
   /**
    * Vracia 
    * @return rok 
    */
   public int getRok()
   {
      return rok;
   }
   /**
    * Vracia 
    * @return hodinu 
    */
   public int getHodina()
   {
      return hodina;
   }
   /**
    * Vracia 
    * @return minutu 
    */
   public int getMinuta()
   {
      return minuta;
   }
   /**
    * Vracia nazov mesiaca podla cisla mesiaca 
    * @return nazov mesiaca 
    */
   public String getNazovMesiaca()
   {
      switch (mesiac)
      {
         case 1:
            return "Január";
         case 2:
            return "Február";
         case 3:
            return "Marec";
         case 4:
            return "Apríl";
         case 5:
            return "Máj";
         case 6:
            return "Jún";
         case 7:
            return "Júl";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "Október";
         case 11:
            return "November";
         case 12:
            return "December";
         default:
            return "Nespravné číslo mesiaca!";

      }
   }
   /**
    * Vracia cislo mesiaca s podla nazvu mesiaca, ktory sluzi ako parameter
    * @param nazov
    * @return
    */
   public int getCisloMesiaca(String nazov)
   {
      String nazovMesiaca=nazov;
      
      switch(nazovMesiaca)
      {
         case "Január":
            return 1;
         case "Február":
            return 2;
         case "Marec":
            return 3;
         case "Apríl":
            return 4;
         case "Máj":
            return 5;
         case "Jún":
            return 6;
         case "Júl":
            return 7;
         case "August":
            return 8;
         case "September":
            return 9;
         case "Október:":
            return 10;
         case "November":
            return 11;
         case "December":
            return 12;
            default:
               return -1;
      }
   }
   /**
    * Vracia true ked je rok prestupny, v opacnom pripade false 
    * @return true alebo false 
    */
   public boolean jePrestupny()
   {
      return (rok % 4 == 0 && ((rok % 100 != 0 || (rok % 400 == 0))));
   }
   /**
    * Vracia pocet dni v konkretnom mesiaci 
    * @return pocet dni v konkretnom mesiaci 
    */
   public int dniVMesiaci()
   {
      int dniVMesiaci = -1;

      if (mesiac == 1 || mesiac == 3 || mesiac == 5 || mesiac == 7
            || mesiac == 8 || mesiac == 10 || mesiac == 12)
      {
         dniVMesiaci = 31;
      }
      else if (mesiac == 4 || mesiac == 6 || mesiac == 9 || mesiac == 11)
      {
         dniVMesiaci = 30;
      }
      else
      {
         if (jePrestupny())
         {
            dniVMesiaci = 29;
         }
         else
         {
            dniVMesiaci = 28;
         }
      }
      return dniVMesiaci;

   }
   /**
    * Urcuje ci je tento(this)datum pred inym datumom true alebo false ked nie je 
    * @param iny  iny datum 
    * @return true ked je pred, opacne false 
    */
   public boolean jePred(Datum iny)
   {
      if (rok < iny.getRok())
      {
         return true;
      }
      else if (rok > iny.getRok())
      {
         return false;
      }
      else
      {
         if (mesiac < iny.getMesiac())
         {
            return true;
         }
         else if (mesiac > iny.getMesiac())
         {
            return false;
         }
         else
         {
            if (den < iny.getDen())
            {
               return true;
            }
            else if (den > iny.getDen())
            {
               return false;
            }
            else
            {
               if (hodina < iny.getHodina())
               {
                  return true;
               }
               else if (hodina > iny.getHodina())
               {
                  return false;
               }
               else
               {
                  if (minuta < iny.getMinuta())
                  {
                     return true;
                  }
                  else
                  {
                     return false;
                  }
               }
            }
         }
      }
   }
   /**
    * Vyhodnocuje ci je aktualny datum(this) medzi dvoma specifikovanymi datunmi
    * @param datum1 prvy datum
    * @param datum2 druhy datum 
    * @return  true ked je this medzi datum1 a datum2, opacne vracia false 
    */
   
   public boolean jeMedzi(Datum datum1, Datum datum2)
   {
      if (datum1.jePred(this) && this.jePred(datum2))
      {
         return true;
      }
      return false;
   }
   /**
    * Vytvori kopiu datumu s aktualnymi hodnotami 
    * @return presna kopia s aktualnymi hodnotami
    */
   public Datum copy()
   {
      Datum copy = new Datum(den, mesiac, rok, hodina, minuta);
      return copy;
   }
   /**
    * Vracia zformatovany vystup datumu a casu 
    */
   public String toString()
   {
      String s = "";
      if (den < 10)
      {
         s += "0";
      }
      s += den + "/";
      if (mesiac < 10)
      {
         s += "0";
      }
      s += mesiac + "/" + rok + " ";
      if (hodina < 10)
      {
         s += "0";
      }
      s += hodina + ":";
      if (minuta < 10)
      {
         s += "0";
      }
      s += minuta;

      return s;
   }
   /**
    * Vracia zformatovany vystup casu s aktualnymi hodnotami
    * @return
    */
   public String toStringCas()
   {
      String s = "";
      if (hodina < 10)
      {
         s += "0";
      }
      s += hodina + ":";
      if (minuta < 10)
      {
         s += "0";
      }
      s += minuta;

      return s;
   }

}
