package sk.itvkurze.webinar20.gui_11;

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
