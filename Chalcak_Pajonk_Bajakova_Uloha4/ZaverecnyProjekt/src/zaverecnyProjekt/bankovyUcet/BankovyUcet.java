package zaverecnyProjekt.bankovyUcet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Trieda obsahuje vsetky metody a premenne potrebne pre pracu s bankovym uctom
 * 
 * @author Robert Chalcak Tomas Pajonk Zuzana Bajakova
 */
public class BankovyUcet implements Serializable
{

   private static final long serialVersionUID = -587732315600515786L;

   private String menoKlienta;
   private String id; // uchovava jedinecne id uctu
   private int rovnakeId; // uchovava jedinecne cislo, ktore ma aj klient
   private double aktualnyZostatok; // uchovava zostatok na ucte
   private String typUctu; // uchovava typ uctu
   private double urok; // uchovava pouztu urokovu sadzbu
   static final double PREVYSUJUCI_VKLAD = 10000; // hranicny vklad pre VIP urok
   static final double BEZNY_UROK = 0.02; // bezný urok pre bezných klientov
   static final double VIP_UROK = 0.05; // VIP urok pre VIP klientov
   static final double POPLATOK_ZA_VYBER = 3.5; // uchovava poplatok za vyber
   static final double POPLATOK_ZA_VKLAD = 1.0; // uchovava poplatok za vklad

   public BankovyUcet(double pociatocnyZostatok, String menoKlienta,String id, String typUctu)
   {
      this.aktualnyZostatok = pociatocnyZostatok;
      this.menoKlienta=menoKlienta;
      this.typUctu=typUctu;
      this.id=id;
   }
   public BankovyUcet(String menoKlienta, String typUctu)
   {
      this.aktualnyZostatok=0;
      this.menoKlienta=menoKlienta;
      this.typUctu=typUctu;
   }
   
   /**
    * Vytvara objekt bankoveho uctu s pociatocnym zostatkom
    */

   public BankovyUcet(double pociatocnyZostatok)
   {
      aktualnyZostatok = pociatocnyZostatok;
      this.typUctu = null;
      this.menoKlienta=null;
   }

   /**
    * Vytvara prazdny ucet
    */
   public BankovyUcet()
   {
      this.aktualnyZostatok = 0;
      this.typUctu = null;
      this.menoKlienta=null;
   }
   /**
    * Nastavuje meno majitela uctu 
    * @param menoKlienta
    */
   public void setMenoKlienta(String menoKlienta)
   {
      this.menoKlienta=menoKlienta;
   }

   /**
    * Nastavuje puzity urok
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
    * Vracia meno majitela uctu 
    * @return
    */
   public String getMenoKlienta()
   {
      return menoKlienta;
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
    * Vklada ciastku na ucet a zauctuje aj poplatok za vklad
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
      return aktualnyZostatok + "Aktualny zostatok"+",\nTypUctu: "+getTypUctu()+"\nID: "+getId()+"\nCislo: "+getRovnakeId()+"\n"
             +"Priezvisko vlastnika uctu: "+getMenoKlienta();
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
