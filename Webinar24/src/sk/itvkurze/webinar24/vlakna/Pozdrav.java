package sk.itvkurze.webinar24.vlakna;

import java.util.Date;

/**
 * Trieda reprezentuje tzv. spustitelnu ulohu/aktivitu/cinnost,
 * ktora moze byt vlaknom vykonavana, pretoze
 * trieda implementuje rozhrani Runnable.
 * @author Robert Chalcak
 *
 */
public class Pozdrav implements Runnable
{
     private static final int POCET_OPAKOVANI = 10;
     private static final int ONESKORENIE=1000;  // 1s
     
     private String sprava;
     
     /**
      * Vykonava spustitelny objekt s danou spravou
      * 
      * @param sprava bude sucastou pozdravu
      */
     public Pozdrav (String sprava)
     {
        this.sprava=sprava;
     }
   @Override
   public void run()
   {
      for(int i = 1; i <=POCET_OPAKOVANI;i++)
      {
         Date teraz = new Date();
         System.out.println(teraz + " - "+ sprava);
         try
         {
            Thread.sleep(ONESKORENIE);
          //Thread.currentThread().sleep(ONESKORENIE); -> ak sa nachadzame v statickom kontexte
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
         
      }
      
   }
   

}
