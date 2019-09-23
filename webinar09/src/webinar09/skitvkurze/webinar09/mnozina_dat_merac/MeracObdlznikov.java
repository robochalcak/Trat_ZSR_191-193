package webinar09.skitvkurze.webinar09.mnozina_dat_merac;

public class MeracObdlznikov implements Merac
{

   public double zmeraj(Object objekt)
   {
      Obdlznik obdlznik = (Obdlznik)objekt;
      return obdlznik.getPlocha();
   }

}
