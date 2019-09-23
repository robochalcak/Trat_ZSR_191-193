package sk.itvkurze.webinar19.gui_01;

import javax.swing.JFrame;
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
            JFrame okno = new JFrame();
            okno.setTitle("Grafika_01");
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okno.setSize(1200, 800);
            okno.setVisible(true);
               
         }  
      });     
   }
}
