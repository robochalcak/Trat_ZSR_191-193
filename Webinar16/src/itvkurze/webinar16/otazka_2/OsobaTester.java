package itvkurze.webinar16.otazka_2;

public class OsobaTester
{
   public static void main(String[] args)
   {
      Osoba osoba1 = new Osoba();
      Osoba osoba2 = new Osoba();
      
      osoba1.setMeno("Igor");
      osoba1.setVek(25);
      
      //vypis na standardny vystup meno a vek osoby
      
      System.out.println("Meno: "+ osoba1.getMeno());
      System.out.println("Vek : "+osoba1.getVek());
      
   }
}
