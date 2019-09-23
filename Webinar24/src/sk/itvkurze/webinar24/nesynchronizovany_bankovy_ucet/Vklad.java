package sk.itvkurze.webinar24.nesynchronizovany_bankovy_ucet;
/**
 * Trieda predstavuje spustitelnu ulohu, v tomto pripade sa jedna o vklad peniazi na bankovy ucet
 * @author Robert Chalcak
 *
 */
public class Vklad implements Runnable
{

   private static final long ONESKORENIE=1; //1 ms = 0.001 sekundy
   private BankovyUcet ucet;
   private double ciastka;
   private int pocetOpakovani;
   /**
    * Vytvara novu spustitelnu ulohu
    * @param ucet bankovy ucet, na ktoru pripiseme financne prostriedky 
    * @param ciastka
    * @param POCET_OPAKOVANI
    */
   public Vklad(BankovyUcet ucet, double ciastka, int pocetOpakovani)
   {
      this.ucet = ucet;
      this.ciastka = ciastka;
      this.pocetOpakovani=pocetOpakovani;
   }

   @Override
   public void run()
   {
      for(int i = 1; i <= pocetOpakovani;i++)
      {
         ucet.vloz2(ciastka);
         try
         {
            Thread.sleep(ONESKORENIE);
         }
         catch (InterruptedException e)
         {
            
            e.printStackTrace();
         }
      }
      
   }

}
