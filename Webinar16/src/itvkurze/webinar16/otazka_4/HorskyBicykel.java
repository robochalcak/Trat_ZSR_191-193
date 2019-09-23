package itvkurze.webinar16.otazka_4;

public class HorskyBicykel extends Bicykel
{

   private int vyskaSedaka;

   public HorskyBicykel(int pocetPrevodov, int aktualnaRychlost,int vyskaSedaka)
   {
      super(pocetPrevodov, aktualnaRychlost);
      this.vyskaSedaka=vyskaSedaka;
   }
   
   public void setVyskaSedaka(int vyskaSedaka)
   {
      this.vyskaSedaka=vyskaSedaka;
   }
   public int getVyskaSedaka()
   {
      return vyskaSedaka;
   }
   @Override
   public String toString()
   {
      String retazcovaReprezentacia = "HorskyBicykel[vyskaSedaka = " + vyskaSedaka +", aktualnaRychlost = " + 
              getAktualnaRychlost()+ ", pocetPrevodov "+getPocetPrevodov()+"]";
      
      return retazcovaReprezentacia;
   }
}
