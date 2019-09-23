package sk.itvkurze.webinar04.pokladnaKonstanty;

public class Pokladna
{
  public static final double HODNOTA_EUROVEJ_MINCE=1.0;
  public static final double HODNOTA_50_CENTOVEJ_MINCE=0.50;
  public static final double HODNOTA_20_CENTOVEJ_MINCE=0.20;
  public static final double HODNOTA_10_CENTOVEJ_MINCE=0.10;
  public static final double HODNOTA_05_CENTOVEJ_MINCE=0.05;
  public static final double HODNOTA_02_CENTOVEJ_MINCE=0.02;
  public static final double HODNOTA_01_CENTOVEJ_MINCE=0.01;
  
   
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
