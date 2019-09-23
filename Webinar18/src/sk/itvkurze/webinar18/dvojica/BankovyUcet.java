package sk.itvkurze.webinar18.dvojica;

public class BankovyUcet
{
   private double aktualnyZostatok;
   
   public BankovyUcet(double aktualnyZostatok)
   {
      this.aktualnyZostatok=aktualnyZostatok;
   }
   
   //vytvorit stringovu reprezentaciu stavu objektu - toString
   
   public String toString()
   {
      return "BankovyUcet [aktualnyZostatok=" + aktualnyZostatok+"]";
   }
}
