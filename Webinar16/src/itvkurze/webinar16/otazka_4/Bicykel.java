package itvkurze.webinar16.otazka_4;

public class Bicykel
{
   private int pocetPrevodov;
   private int aktualnaRychlost;
   
   public Bicykel(int pocetPrevodov, int aktualnaRychlost)
   {
      this.pocetPrevodov=pocetPrevodov;
      this.aktualnaRychlost=aktualnaRychlost;
   }
   
   public void pridaj(int oKolko)
   {
      aktualnaRychlost+=oKolko;
   }
   
   public void spomal(int oKolko)
   {
      aktualnaRychlost-=oKolko;
   }

   public int getPocetPrevodov()
   {
      return pocetPrevodov;
   }

   public void setPocetPrevodov(int pocetPrevodov)
   {
      this.pocetPrevodov = pocetPrevodov;
   }

   public int getAktualnaRychlost()
   {
      return aktualnaRychlost;
   }

   public void setAktualnaRychlost(int aktualnaRychlost)
   {
      this.aktualnaRychlost = aktualnaRychlost;
   }
   
   
   
   
}
