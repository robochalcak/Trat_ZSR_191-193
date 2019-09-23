package webinar09.skitvkurze.webinar099.mnozina_dat_minca;
/**
 * Trieda nam dokaze jednoduche statistiky o vlozenych prvkoch minimalny prvok maximalny prvok
 * @author Robert Chalcak
 *
 */
public class MnozinaDat
{
  
   private int pocetPrvkov;
   private Minca maximum;
   private Minca minimum;
   private double sucet;
   
   public void pridaj(Minca minca)
   {
      if(pocetPrvkov== 0|| minca.getHodnota()>maximum.getHodnota())
      {
         maximum = minca;
      }
      if(pocetPrvkov==0|| minca.getHodnota() < minimum.getHodnota())
      {
         minimum = minca;
      }
      pocetPrvkov++;
      sucet+=minca.getHodnota();
   }
   
   public Minca getMinimum()
   {
      return minimum;
   }
   
   public Minca getMaximum(){
     return maximum; 
   }
   
   public double getPriemer()
   {
      return sucet / pocetPrvkov;
   }
   
}
