package sk.itvkurze.webinar17.vlastny_zretazeny_zoznam;

import java.lang.ProcessBuilder.Redirect;
import java.util.NoSuchElementException;

/**
 * Trieda reprezentuje zretazeny zoznam pozostavajuci z uzlov (nodov) za ucelom efektivneho vkladania a 
 * mazania prvkov zo stredu a zaciatku zoznamu. Trieda obsahuje len podmnozinu vsetkych operacii
 * obsiahnutych v triede java.util.LinkedList.
 * @author Robert Chalcak
 *
 */
public class ZretazenyZoznam
{
   private Uzol prvy;
   //generovanie getters a setters 
   //Alt - Shift + s 
   
   /**
    * Vytvara prazdny zretazeny zoznam 
    */
   public ZretazenyZoznam()
   {
      this.prvy = null;
   }
   
   //vsetky metody zretazeneho zoznamu 
   /**
    * Vraca data prveho uzla v zretazenom zozname
    * 
    * @return data prveho uzla v zretazenom zozname
    */
   public Object getPrvy()
   {
      if(prvy == null)
      {
         throw new NoSuchElementException();
      }
      return this.prvy.getData();
   }
   
   public void pridajNaZaciatok(Object prvok)
   {
      Uzol novyUzol = new Uzol();
      novyUzol.setData(prvok);
      novyUzol.setDalsi(prvy);
      prvy=novyUzol;
   }
   
   public Object zmazZoZaciatku()
   {
      if(prvy==null)
      {
         throw new NoSuchElementException();
      }
      
      Object data = prvy.getData();
      prvy = prvy.getDalsi();
      return data;
   }
   
   public ZoznamIterator iteratorZoznamu()
   {
      return new ZretazenyZoznamIterator();
   }
   
   
   private class ZretazenyZoznamIterator implements ZoznamIterator
   {
      
      private Uzol aktualny;
      
      private Uzol predchadzajuci;
      
      /**
       * Vytvvara novy iterator, ktorym budeme prechadzat zretazeny zoznam.
       * Momentalne neukazuje nikam. 
       */
      public ZretazenyZoznamIterator()
      {
         this.aktualny = null;
         this.predchadzajuci=null;
      }
      
      @Override
      public Object dalsi()
      {
         if(!existujeDalsiPrvok())
         {
            throw new NoSuchElementException();
         }
         
         this.predchadzajuci = this.aktualny;
         
         if(this.aktualny==null)
         {
            this.aktualny=prvy;
         }
         else
         {
            this.aktualny=this.aktualny.getDalsi();
         }
         return this.aktualny.getData();
      }

      @Override
      public boolean existujeDalsiPrvok()
      {
         if(this.aktualny==null)
         {
            return prvy!=null;
         }
         else
         {
            return this.aktualny.getDalsi()!=null;
         }
         
      }

      @Override
      public void pridaj(Object prvok)
      {
         if(this.aktualny==null)
         {
            pridajNaZaciatok(prvok);
            this.aktualny=prvy;
         }
         else
         {
            Uzol novyUzol = new Uzol();
            novyUzol.setData(prvok);
            novyUzol.setDalsi(this.aktualny.getDalsi());
            this.aktualny.setDalsi(novyUzol);
            this.aktualny=novyUzol;
         }
         this.predchadzajuci=this.aktualny;
         
      }

      @Override
      public void zmaz()
      {
         if(this.predchadzajuci==this.aktualny)
         {
            throw new IllegalStateException();
         }         
         if(this.aktualny==prvy)
         {
            zmazZoZaciatku();
         }
         else
         {
            this.predchadzajuci.setDalsi(this.aktualny.getDalsi());
         }
         this.aktualny = this.predchadzajuci;
      }

      @Override
      public void nastav(Object prvok)
      {
         if(this.aktualny==null)
         {
            throw new NoSuchElementException();
         }
         this.aktualny.setData(prvok);
         
      }
      
   }
  
  
   

   
   
   private class Uzol
   {
      private Object data;
      private Uzol dalsi;
        
      public Object getData()
      {
         return data;
      }
      public void setData(Object data)
      {
         this.data = data;
      }
      public Uzol getDalsi()
      {
         return dalsi;
      }
      public void setDalsi(Uzol dalsi)
      {
         this.dalsi = dalsi;
      }
      
   }
}
