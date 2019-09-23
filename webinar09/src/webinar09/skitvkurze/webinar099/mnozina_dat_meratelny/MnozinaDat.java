package webinar09.skitvkurze.webinar099.mnozina_dat_meratelny;
/**
 * Trieda nam dokaze jednoduche statistiky o vlozenych prvkoch minimalny prvok maximalny prvok
 * @author Robert Chalcak
 *
 */
public class MnozinaDat
{
  
   private int pocetPrvkov;
   private Meratelny maximum;
   private Meratelny minimum;
   private double sucet;
   
   public void pridaj(Meratelny meratelny)
   {
      if(pocetPrvkov== 0|| meratelny.getMiera()>maximum.getMiera())
      {
         maximum = meratelny;
      }
      if(pocetPrvkov==0|| meratelny.getMiera() < minimum.getMiera())
      {
         minimum = meratelny;
      }
      pocetPrvkov++;
      sucet+=meratelny.getMiera();
   }
   
   public Meratelny getMinimum()
   {
      return minimum;
   }
   
   public Meratelny getMaximum(){
     return maximum; 
   }
   
   public double getPriemer()
   {
      return sucet / pocetPrvkov;
   }
   
}
