package sk.itvkurze.webinar05.danZPrijmu;

public class DanZPrijmuTester
{

   public static void main(String[] args)
   {
      double prijem = 10500;
      RodinnyStatus status = RodinnyStatus.SLOBODNY_SLOBODNA;
      
      DanZPrijnu igorKovac = new DanZPrijnu(prijem, status);
      double danZPrijmu = igorKovac.vypocitajDanZPrijmu();
      System.out.println("Dan z prijmu pre Igora Kovaca : "+ danZPrijmu);
      DanZPrijnu petraMala = new DanZPrijnu(55000, RodinnyStatus.ZENATY_VYDATA);
      danZPrijmu = petraMala.vypocitajDanZPrijmu();
      System.out.println("Dan z prijmu pre Petra Mala : "+danZPrijmu);
   }
}
