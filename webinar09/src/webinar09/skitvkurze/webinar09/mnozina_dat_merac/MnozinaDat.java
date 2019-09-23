package webinar09.skitvkurze.webinar09.mnozina_dat_merac;
/**
 * Trieda nam dokaze jednoduche statistiky o vlozenych prvkoch minimalny prvok maximalny prvok
 * @author Robert Chalcak
 *
 */
public class MnozinaDat
{
   private Merac aktualnyMerac;
   private int pocetPrvkov;
   private Object maximum;
   private Object minimum;
   private double sucet;
   public MnozinaDat(Merac novyMerac)
   {
      aktualnyMerac = novyMerac;
      maximum=null;
      minimum=null;
      sucet = 0;
      pocetPrvkov=0;
   }
   public void pridaj(Object prvok)
   {
      sucet+=aktualnyMerac.zmeraj(prvok);
      
      if(pocetPrvkov== 0|| aktualnyMerac.zmeraj(prvok)>aktualnyMerac.zmeraj(maximum))
      {
         maximum = prvok;
      }
      if(pocetPrvkov==0|| aktualnyMerac.zmeraj(prvok) < aktualnyMerac.zmeraj(minimum))
      {
         minimum = prvok;
      }
      pocetPrvkov++;
      
   }
   
   public Object getMinimum()
   {
      return minimum;
   }
   
   public Object getMaximum(){
     return maximum; 
   }
   
   public double getPriemer()
   {
      return sucet / pocetPrvkov;
   }
   
}
