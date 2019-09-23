package zaverecnyProjekt.gui;

import java.io.IOException;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Aplikacia
{

   public static void main(String[] args)
   {
      try
      {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }catch(Exception ex)
      {
         ex.printStackTrace();
      }
      
      SwingUtilities.invokeLater(new Runnable()
      {
         
         @Override
         public void run()
         {
            try
            {
               new PrihlasovacieOkno().setVisible(true);
            }
            catch (ClassNotFoundException | IOException e)
            {
               
               e.printStackTrace();
            }
            
         }
      });

   }

}
