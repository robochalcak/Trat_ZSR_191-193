package sk.itvkurze.webinar14.TriedenieVyberom;
/**
 * Stopky dokazu spocitat cas uplynuty medyi ich zapnutim a vypnutim. A pomocou tohto programu sme schopni 
 * odmerat cas vykonavania lubovolnych algoritmov 
 * @author Robert Chalcak
 *
 */
public class Stopky
{
   private  boolean suSpustene;
   private long casSpusteniaMS;
   private long casSpusteniaNS;
   private long uplynulyCasNS;
   private long uplynulyCasMS;
   private long castZastaveniaMS;
   
   /**
    * Vytvara nove stopky
    */
   public Stopky()
   {
      vynuluj();
   }
   private void vynuluj()
   {
      suSpustene=false;
      casSpusteniaMS=0;
      casSpusteniaNS=0;
      uplynulyCasMS = 0;
      uplynulyCasNS=0;
      
   }
   /**
    * Spusta stopky . Spustame virtualnu casomieru 
    */
   public void start()
   {
     
      if(suSpustene)
      {
         return;
      }
      else
      {
         suSpustene= true;
         casSpusteniaMS = System.currentTimeMillis();
         casSpusteniaNS = System.nanoTime();
      }
   }
   /**
    * Zastavuje stopky. Zastavujeme virtualnu casomieru 
    */
   public void stop()
   {
      if(!suSpustene)
      {
         return;
      }
      else
      {
         suSpustene = false;
         long casZastaveniaMS = System.currentTimeMillis();
         uplynulyCasMS = uplynulyCasMS + (casZastaveniaMS - casSpusteniaMS);
         
         long casZastaveniaNS = System.nanoTime();
         uplynulyCasNS = uplynulyCasNS + (casZastaveniaNS - casSpusteniaNS);
      }
   }
   public long getUplynulyCasMS()
   {
      if(suSpustene)
      {
         long casZastaveniaMS = System.currentTimeMillis();
         return uplynulyCasMS + casZastaveniaMS - casSpusteniaMS;
      }
      else
      {
         return uplynulyCasMS;
      }
   }
   public long getUplynulyCasNS()
   {
      if(suSpustene)
      {
         long casZastaveniaNS = System.nanoTime();
         return uplynulyCasNS + casZastaveniaNS - casSpusteniaNS;
      }
      else
      {
         return uplynulyCasNS;
      }
   }
   
   
}
