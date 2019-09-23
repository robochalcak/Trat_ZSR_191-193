package sk.itvkurze.webinar08.getre_a_setre;

public class StudentTester
{

   public static void main(String[] args)
   {
      Student igor = new Student(24, "Igor Kovac ", 1.12);
      Student peter = new Student(17, "Peter Kovac",2.45);
      
      //vypis informacie o danych objektov (zavolaj)nad danym objektom metodu toString()
      
      System.out.println(igor); // automaticky doslo  volaniu metody toString()
      System.out.println(peter.toString());
      
      //zmen igorovi vek na 25
     // igor.setVek(25);
      
      //navys igorovi vek o jednicku
      igor.setVek(igor.getVek()+1);
      
      //petrovi zmen priemer znamok na 2.27
      peter.setPriemerZnamok(2.27);
      
      System.out.println("-----------------------------------");
      
      System.out.println(igor);
      System.out.println(peter.toString());
      

   }

}
