package zaverecnyProjekt.bankovyUcet;

/**
 * Vytvara objekt sporiaceho uctu s rozsirenim triedy BankovehoUctu
 * 
 * @author Robert Chalcak Tomas Pajonk Zuzana Bajakova
 */
public class SporiaciUcet extends BankovyUcet
{
   private static final long serialVersionUID = 333055509571271883L;

   /**
    * Vytvára objekt Sporiaceho uctu s parametrom
    * 
    * @param pociatocnyZostatok
    */
   public SporiaciUcet(double pociatocnyZostatok)
   {
      super(pociatocnyZostatok);
   }

   /**
    * Vytvára prazdný objekt Sporiaceho Uctu
    */
   public SporiaciUcet()
   {
      super(0);
   }
}
