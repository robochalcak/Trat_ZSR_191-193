package webinar09.skitvkurze.webinar099.mnozina_dat_bankovyUcet;

import webinar09.skitvkurze.webinar099.mnozina_dat_meratelny.BankovyUcet;

/**
 * Trieda nam dokaze jednoduche statistiky o vlozenych prvkoch minimalny prvok maximalny prvok
 * @author Robert Chalcak
 *
 
public class MnozinaDat
{
  
   private int pocetPrvkov;
   private BankovyUcet maximum;
   private BankovyUcet minimum;
   private double sucet;
   
   public void pridaj(BankovyUcet ucet)
   {
      if(pocetPrvkov== 0|| ucet.getHodnota()>maximum.getHodnota())
      {
         maximum = ucet;
      }
      if(pocetPrvkov==0|| ucet.getHodnota() < minimum.getHodnota())
      {
         minimum = ucet;
      }
      pocetPrvkov++;
      sucet+=ucet.getHodnota();
   }
   
   public BankovyUcet getMinimum()
   {
      return minimum;
   }
   
   public BankovyUcet getMaximum(){
     return maximum; 
   }
   
   public double getPriemer()
   {
      return sucet / pocetPrvkov;
   }
   
}
*/