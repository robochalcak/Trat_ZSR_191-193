package webinar09.skitvkurze.webinar09.mnozina_dat_merac;

public class MnozinaDatTester
{

   public static void main(String[] args)
   {
      Merac meracObdlznikov = new MeracObdlznikov();
      
      MnozinaDat mnozinaDat = new MnozinaDat(meracObdlznikov);
      
      mnozinaDat.pridaj(new Obdlznik(10,10));
      
      mnozinaDat.pridaj(new Obdlznik(20, 20));
      
      mnozinaDat.pridaj(new Obdlznik(30,30));
      
      System.out.println("Priemerna plocha obdlznikov: "+ mnozinaDat.getPriemer());
      System.out.println("Ocakavana hodnota: 466");
      
      Object maxObject = mnozinaDat.getMaximum();
      
      Obdlznik maxObdlznik = (Obdlznik )maxObject;
      System.out.println("Obdlznik s najvacsiou plochou: "+maxObdlznik.getPlocha());
      System.out.println("Ocakavana hodnota: 100.0");
   }

}
