package sk.itvkurze.webinar18.dvojica;

public class Dvojica<T,S>
{
   private T prvy;
   private S druhy;
   
   public Dvojica(T prvyPrvok, S druhyPrvok)
   {
      this.prvy = prvyPrvok;
      this.druhy = druhyPrvok;
   }
   
   public T getPrvy()
   {
      return this.prvy;
   }
   
   public S getDruhy()
   {
      return this.druhy;
   }
}
