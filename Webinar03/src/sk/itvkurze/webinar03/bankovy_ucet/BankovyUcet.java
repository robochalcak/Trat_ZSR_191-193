package sk.itvkurze.webinar03.bankovy_ucet;

/**
 * Trieda bankovy ucet predstavuje abstrakciu realneho uctu (vklady, vybery, a
 * zostatky)/
 * 
 * @author Robert Chalcak
 */
public class BankovyUcet
{

   private double aktualnyZostatok;

   /**
    * Vytvori novy bankovy ucet s danym pociatocnym zostatkom na ucte.
    * 
    * @param pociatocnyZostatok
    */
   public BankovyUcet(double pociatocnyZostatok)
   {
      aktualnyZostatok = pociatocnyZostatok;
   }
   /**
    * Vklada ciastku na bankovy ucet 
    * @param ciastka
    */
   public void vloz(double ciastka)
   {
      double novyZostatok = aktualnyZostatok + ciastka;
      aktualnyZostatok = novyZostatok;
   }
   /**
    * Vybera ciastku z bankoveho uctu 
    * @param ciastka
    */
   public void vyber(double ciastka)
   {
      double novyZostatok = aktualnyZostatok - ciastka;
      aktualnyZostatok = novyZostatok;

   }
   /**
    * Vracia aktualny zostatok na ucte 
    * @return
    */
   public double getAktualnyZostatok()
   {
      return aktualnyZostatok;
   }

}
