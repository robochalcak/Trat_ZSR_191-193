package sk.itvkurze.webinar08.getre_a_setre;

public class Student
{
   private int vek;
   private String meno;
   private double priemerZnamok;

   // zoznam konstruktorov

   public Student(int vek, String meno, double priemerZnamok)
   {
      this.vek = vek;
      this.meno = meno;
      this.priemerZnamok = priemerZnamok;
   }

   // Alt - shift + s

   public void setVek(int vek)
   {
      this.vek = vek;
   }

   public void setMeno(String meno)
   {
      this.meno = meno;
   }

   public double getPriemerZnamok()
   {
      return priemerZnamok;
   }

   public void setPriemerZnamok(double priemerZnamok)
   {
      this.priemerZnamok = priemerZnamok;
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
