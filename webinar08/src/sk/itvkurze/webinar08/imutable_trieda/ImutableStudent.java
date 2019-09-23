package sk.itvkurze.webinar08.imutable_trieda;

//Immutable class = nemenna trieda = t.j. nie sme schopni 
public class ImutableStudent
{
   private int vek;
   private String meno;
   private double priemerZnamok;

   // zoznam konstruktorov

   public ImutableStudent(int vek, String meno, double priemerZnamok)
   {
      this.vek = vek;
      this.meno = meno;
      this.priemerZnamok = priemerZnamok;
   }

   // Alt - shift + s


   public double getPriemerZnamok()
   {
      return priemerZnamok;
   }

   public int getVek()
   {
      return vek;
   }

   //

   public String getMeno()
   {
      return meno;
   }
   
   public String toString()
   {
      return "Student [vek=" + vek + " , meno="+meno + ",priemerZnamok="+priemerZnamok + "]"; 
   }

}
