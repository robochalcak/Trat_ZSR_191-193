package sk.itvkurze.webinar23.sifrovaniva;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Vytvorte program, ktory dokaze zasifrovat data pomocou
 * Ceasarovej sifry, pricom kluc n =3
 * Pre desifrovanie dat pouzijeme kluc n=-3
 * @author Robert Chalcak
 *
 */
public class CeasarovaSifra
{
   private int kluc;
   
   /**
    * Vytvara novy objekt sifry s danym klucom.
    * @param kluc kluc, ktory sa pouzije pri sifrovani dat
    */
   public CeasarovaSifra(int kluc)
   {
      this.kluc=kluc;
   }
   /**
    * Sifruje /desifruje obsah streamu.
    * @param vstup vstupny stream dat
    * @param vystup vystupny stream dat
    * @throws IOException 
    */
   public void zasifrujStream(InputStream vstup, OutputStream vystup) throws IOException
   {
      boolean koniec = false;
      
      while(!koniec)
      {
         int dalsi = vstup.read();
         
         if(dalsi ==-1)
         {
            koniec = true;
         }
         else
         {
            byte zasifrovany =(byte)dalsi;
            byte desifrovany =desifruj(zasifrovany);
            vystup.write(desifrovany);
         }
      }
   }
   /**
    * Sifruje /desifruje jeden bajt.
    * @param zasifrovany zasifrovany bajt
    * @return desifrovany bajt
    */
   private byte desifruj(byte zasifrovany)
   {
     //1 ) prva moznost
      // byte desifrovany = (byte)(zasifrovany+kluc);
      //return desifrovany;
      
      // 2)druha moznost
      
      return (byte)(zasifrovany+kluc);
   }
}
