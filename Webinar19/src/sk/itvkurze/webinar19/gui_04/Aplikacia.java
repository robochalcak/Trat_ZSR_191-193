package sk.itvkurze.webinar19.gui_04;

import javax.swing.SwingUtilities;

public class Aplikacia
{

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(new Runnable()
      {
         @Override
         public void run()
         {
            new HlavneOkno();
         }  
      });     
   }
}
