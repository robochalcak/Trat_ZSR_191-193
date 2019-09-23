package itvkurze.webinar1.argumentyPrikazovehoRiadka;

public class ArgumentyPrikazovehoRiadka
{
   public static void main(String[]args)
   {
      //prvy retazec z pola retazcov - args
      
      if(args.length > 0){
      String prvyArgument = args[0];
      System.out.println("Prvy argument: "+ prvyArgument);
      
      System.out.println("Prvy argument: "+ args[0]);
      System.out.println("Druhy argument: "+ args[1]);
      System.out.println("Treti argument: "+ args[2]);
      System.out.println("Stvrty argument: "+ args[3]);
      }
      else
      {
         System.out.println("Nezadal si ziadne argumenty prikazoveho riadka!");
      }
   }
}
