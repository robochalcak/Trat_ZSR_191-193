package zaverecnyProjekt.klienti;

import java.io.Serializable;

import zaverecnyProjekt.bankovyUcet.BankovyUcet;

/**
 * Trieda vytvára klienta pre banku, so všetkými potrebnými informáciami a
 * metódami na prácu s ním
 * 
 * @author Robert Chalcak Tomas Pajonk Zuzana Bajakova
 */
public class Klient implements Serializable
{
 
   private static final long serialVersionUID = -2259645017409133785L;
   private String meno;
   private String priezvisko;
   private long rodneCislo;
   private String id;
   private int rovnakeId;

   private BankovyUcet beznyUcet;
   private BankovyUcet sporiaciUcet;

   /**
    * Vytvára objekt klienta s parametrami
    * 
    * @param meno
    * @param priezvisko
    * @param rodneCislo
    */
   public Klient(String meno, String priezvisko, long rodneCislo)
   {
      this.meno = meno;
      this.priezvisko = priezvisko;
      this.rodneCislo = rodneCislo;

      this.beznyUcet = new BankovyUcet();
      this.sporiaciUcet = new BankovyUcet();

   }

   /**
    * Vytvára prazdný objekt klienta
    */
   public Klient()
   {
      this.meno = null;
      this.priezvisko = null;
      this.rodneCislo = 0;

      this.beznyUcet = null;
      this.sporiaciUcet = null;

   }

   /**
    * Vracia meno klienta
    * 
    * @return meno klienta
    */
   public String getMeno()
   {
      return meno;
   }

   /**
    * Nastavuje klientovi meno s pouzitim parametra
    * 
    * @param meno
    *           klienta
    */
   public void setMeno(String meno)
   {
      this.meno = meno;
   }

   /**
    * Vracia priezvisko klienta
    * 
    * @return priezvisko klienta
    */
   public String getPriezvisko()
   {
      return priezvisko;
   }

   /**
    * Nastavuje priezvisko klienta
    * 
    * @param priezvisko
    *           klienta
    */
   public void setPriezvisko(String priezvisko)
   {
      this.priezvisko = priezvisko;
   }

   /**
    * Vracia rodné číslo klienta
    * 
    * @return rodné číslo
    */
   public long getRodneCislo()
   {
      return rodneCislo;
   }

   /**
    * Nastavuje rodné čislo klienta s parametrom
    * 
    * @param rodneCislo
    *           klienta
    */
   public void setRodneCislo(long rodneCislo)
   {
      this.rodneCislo = rodneCislo;
   }

   /**
    * Vracia indentifikator klienta
    * 
    * @return
    */
   public String getId()
   {
      return id;
   }

   /**
    * Nastavuje indentifikator klienta
    * 
    * @param id
    */
   public void setId(String id)
   {
      this.id = id;
   }

   /**
    * Vracia klientov bankový ucet
    * 
    * @return
    */
   public BankovyUcet getBeznyUcet()
   {

      return beznyUcet;
   }

   /**
    * Nastavuje id ktore je rovnake aj pre ucet s
    * 
    * @param rovnakeId
    *           také isté má aj bankový účet
    */

   public void setRovnakeId(int rovnakeId)
   {
      this.rovnakeId = rovnakeId;
   }

   /**
    * Vracia id ktoré je rovnaké aj pre úcet
    * 
    * @return id ktoré ma aj bankový ucet
    */
   public int getRovnakeId()
   {
      return rovnakeId;
   }

   /**
    * Vracia informácie o klientovi vo formatovanom vystupe
    */
   public String toString()
   {
      return "Krstné meno: " + meno + "\nPriezvisko: " + priezvisko
            + "\nRodné číslo: " + rodneCislo;
   }
}
