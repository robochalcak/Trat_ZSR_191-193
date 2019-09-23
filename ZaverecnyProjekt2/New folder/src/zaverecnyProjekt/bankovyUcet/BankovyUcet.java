package zaverecnyProjekt.bankovyUcet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Trieda obsahuje vsektý metody a premenne potrebne pre prácu s bankovým účtom
 * 
 * @author Robert Chalcak Tomaš Pajonk Zuzana Bajaková
 */
public class BankovyUcet implements Serializable
{
   private static final long serialVersionUID = 8065699792336916675L;
   private String id; // uchovava jedinečné id uctu
   private int rovnakeId; // uchovava jedinecne cislo, ktoré má aj klient
   private double aktualnyZostatok; // uchovava zostatok na ucte
   private String typUctu; // uchovava typ uctu
   private double urok; // uchovava pouztu urokovu sadzbu
   static final double PREVYSUJUCI_VKLAD = 10000; // hranicny vklad pre VIP urok
   static final double BEZNY_UROK = 0.02; // bezný urok pre bezných klientov
   static final double VIP_UROK = 0.05; // VIP urok pre VIP klientov
   static final double POPLATOK_ZA_VYBER = 3.5; // uchovava poplatok za vyber
   static final double POPLATOK_ZA_VKLAD = 1.0; // uchovava poplatok za vklad

   /**
    * Vytvára objekt bankového učtu s počiatočným zostatkom
    */

   public BankovyUcet(double pociatocnyZostatok)
   {
      aktualnyZostatok = pociatocnyZostatok;
      this.typUctu = null;
   }

   /**
    * Vytvara prazdný účet
    */
   public BankovyUcet()
   {
      this.aktualnyZostatok = 0;
      this.typUctu = null;
   }

   /**
    * Nastavuje pužitý urok
    * 
    * @param urok
    */
   public void setUrok(double urok)
   {
      this.urok = urok;
   }

   /**
    * Nastavuje rovnakeId to ide ma aj klient
    * 
    * @param rovnakeId
    */
   public void setRovnakeId(int rovnakeId)
   {
      this.rovnakeId = rovnakeId;
   }

   /**
    * Vracia rovnake id
    * 
    * @return rovnake id
    */
   public int getRovnakeId()
   {
      return rovnakeId;
   }

   /**
    * Vklada ciastku na ucet a zaučtuje aj poplatok za vklad
    * 
    * @param ciastka
    *           vkladana na ucet
    */
   public void vloz(double ciastka)
   {
      aktualnyZostatok = aktualnyZostatok + ciastka - POPLATOK_ZA_VKLAD;
   }

   /**
    * Vybera zvolenu ciastku z uctu a uctuje poplatok za vyber
    * 
    * @param ciastka
    *           vyberana z uctu
    */
   public void vyber(double ciastka)
   {
      aktualnyZostatok = aktualnyZostatok - (ciastka + POPLATOK_ZA_VYBER);
   }

   /**
    * Vracia aktualny zostatok
    * 
    * @return
    */
   public double getAktualnyZostatok()
   {
      return zaokruhli(aktualnyZostatok);
   }

   /**
    * Pripisuje urok na ucet
    */
   public void pripisUrok()
   {
      if (aktualnyZostatok >= PREVYSUJUCI_VKLAD)
      {
         aktualnyZostatok = aktualnyZostatok + (aktualnyZostatok * VIP_UROK);
         setUrok(VIP_UROK);

      }
      else
      {
         aktualnyZostatok = aktualnyZostatok + (aktualnyZostatok * BEZNY_UROK);
         setUrok(BEZNY_UROK);
      }
   }

   /**
    * Nastavuje indentifikator uctu
    * 
    * @param id
    */
   public void setId(String id)
   {
      this.id = id;
   }

   /**
    * Vracia indentifikator uctu
    * 
    * @return
    */
   public String getId()
   {
      return id;
   }

   /**
    * Nastavuje typ uctu
    * 
    * @param typUctu
    */
   public void setTypUctu(String typUctu)
   {
      this.typUctu = typUctu;
   }

   /**
    * Vracia typ uctu
    * 
    * @return
    */
   public String getTypUctu()
   {
      return typUctu;
   }

   /**
    * Vracia urok v percentach pouzitých na zurocení
    * 
    * @return
    */
   public double getUrok()
   {
      return urok * 100;
   }

   /**
    * Vracia formatovany vystup
    */
   public String toString()
   {
      return aktualnyZostatok + "Aktualny zostatok";
   }

   /**
    * Pomocna metoda zaokruhli na dve desatinne miesta
    * 
    * @param ciastka
    *           ktorá ma byt zaokruhlena
    * @return zaokruhlena ciastka
    */
   private double zaokruhli(Double ciastka)
   {
      return new BigDecimal(ciastka.toString()).setScale(2,
            RoundingMode.HALF_UP).doubleValue();
   }
}
