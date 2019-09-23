package sk.itvkurze.webinar03.pokladna;

public class Pokladna
{
   private double celkovaSumaNaskenovanychTovarov;
   private double celkovaPrijataHotovost;
   public Pokladna()
   {
      celkovaSumaNaskenovanychTovarov =0;
      celkovaPrijataHotovost = 0;
   }
   
   public void naskenujTovar(double cenaTovaru)
   {
      celkovaSumaNaskenovanychTovarov = celkovaSumaNaskenovanychTovarov+ cenaTovaru;
   }
   
   public void prijmiHotovost(double prijataHotovost)
   {
      celkovaPrijataHotovost = celkovaPrijataHotovost + prijataHotovost;
      
   }
   
   public double vydajVydavok()
   {
      double vydavok = celkovaPrijataHotovost - celkovaSumaNaskenovanychTovarov;
      
      return vydavok;
   }
}
