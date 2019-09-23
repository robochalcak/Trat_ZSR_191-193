package sk.itvkurze.webinar08.imutable_trieda;

public class StudentTester
{

   public static void main(String[] args)
   {
      ImutableStudent igor = new ImutableStudent(24, "Igor Kovac ", 1.12);
      ImutableStudent peter = new ImutableStudent(17, "Peter Kovac",2.45);
      
      //vypis informacie o danych objektov (zavolaj)nad danym objektom metodu toString()
      
      System.out.println(igor); // automaticky doslo  volaniu metody toString()
      System.out.println(peter.toString());
      
      //zmen igorovi vek na 25
     // igor.setVek(25);
      
      //navys igorovi vek o jednicku
      
      System.out.println("-----------------------------------");
      
      System.out.println(igor);
      System.out.println(peter.toString());
      

   }

}
