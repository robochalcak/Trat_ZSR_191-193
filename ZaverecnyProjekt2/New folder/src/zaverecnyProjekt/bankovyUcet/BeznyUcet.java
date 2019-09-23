package zaverecnyProjekt.bankovyUcet;

/**
 * Vytvara objekt Bezneho uctu s rozsirenim triedy BankovyUcet
 * 
 * @author Robert Chalcak Tomas Pajonk Zuzana Bajakova
 */
public class BeznyUcet extends BankovyUcet
{

   private static final long serialVersionUID = -4469391066689374803L;

   /**
    * Vytvara objekt bezneho uctu s pouzitim parametra
    * 
    * @param pociatocnyZostatok
    */
   public BeznyUcet(double pociatocnyZostatok)
   {
      super(pociatocnyZostatok);
   }

   /**
    * Vytvara prazny bezny ucet
    */
   public BeznyUcet()
   {
      super(0);
   }
}
