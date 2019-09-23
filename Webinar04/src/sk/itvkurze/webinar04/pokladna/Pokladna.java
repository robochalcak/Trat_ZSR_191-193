package sk.itvkurze.webinar04.pokladna;

public class Pokladna
{
   private double celkovaSumaNaskenovanychTovarov;
   private double sumaPeniaziPrijatychOdZakaznika;
  
   
   public double getCelkovaSumaNaskenovanychTovarov()
   {
      
      return celkovaSumaNaskenovanychTovarov;
   }

   public double getCelkovaSumaPeniaziPrijatychPeniaziOdZakaznika()
   {
      
      return sumaPeniaziPrijatychOdZakaznika;
   }

   public void naskenujTovar(double cenaTovaru)
   {
      celkovaSumaNaskenovanychTovarov = celkovaSumaNaskenovanychTovarov+cenaTovaru;
      
   }

   public void prijmyHotovost(double hodnotaPeniazi)
   {
      sumaPeniaziPrijatychOdZakaznika = sumaPeniaziPrijatychOdZakaznika+hodnotaPeniazi;
   }

   public double vydajVydavok()
   {
      double vydavok = sumaPeniaziPrijatychOdZakaznika - celkovaSumaNaskenovanychTovarov;
      return vydavok;
   }
   public double zaokruhli(double cislo, int pocetDesatinnychMiest)
   {
      //cislo 1.2354567
      
      double zaokruhliCislo= Math.round((cislo * Math.pow(10, pocetDesatinnychMiest)) / Math.pow(10, pocetDesatinnychMiest));
      
      return zaokruhliCislo;
   }
}
