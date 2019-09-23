package sk.itvkurze.webinar06.trojuholnik;

public class TrojuholnikTester
{
   public static void main(String[]args)
   {
      final String VYKRESLOVACI_ZNAK="[]";
      final String VYKRESLOVACI_ZNAK2="*";
      
      Trojuholnik trojuholnik1 = new Trojuholnik(3,VYKRESLOVACI_ZNAK);
      
      System.out.println(trojuholnik1.toString());
      
      Trojuholnik trojuholnik2 = new Trojuholnik(13,VYKRESLOVACI_ZNAK2);
      System.out.println(trojuholnik2.toString());
      
   }
}
