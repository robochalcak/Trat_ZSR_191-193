package itvkurze.webinar16.otazka_4;

public class Tester{
   
   public static void main(String[] args)
   {
      Bicykel obycajnyBicykel = new Bicykel(6,0);
      obycajnyBicykel.pridaj(5);
      System.out.println("Aktualna rychlost: "+obycajnyBicykel.getAktualnaRychlost());
      
      HorskyBicykel horskyBicykel = new HorskyBicykel(7, 10, 15);
      System.out.println("Aktualna rychlost: "+horskyBicykel.getAktualnaRychlost());
      System.out.println("Vyska sedaka: "+horskyBicykel.getVyskaSedaka());
      System.out.println("Pocet prevodov: "+horskyBicykel.getPocetPrevodov());
   }

}
