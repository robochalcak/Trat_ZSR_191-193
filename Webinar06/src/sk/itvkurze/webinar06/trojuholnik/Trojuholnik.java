package sk.itvkurze.webinar06.trojuholnik;

public class Trojuholnik
{
   private int velkost;
   private String vykreslovaciZnak;

   public Trojuholnik(int velkost, String vykreslovaciZnak)
   {
      this.velkost = velkost;
      this.vykreslovaciZnak = vykreslovaciZnak;
   }
   
   @Override
   public String toString()
   {
      String riadky="";
      
      for(int i= 1; i <=velkost;i++)
      {
         for(int j = 1; j<=i;j++)
         {
            riadky = riadky + vykreslovaciZnak;
         }
         riadky = riadky+"\n";
      }
      return riadky;
      
   }
}
