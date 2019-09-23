package sk.itvkurze.webinar20.gui_08;

import java.awt.Dimension;

import javax.swing.JPanel;

public class FormularPanel extends JPanel
{
   public FormularPanel()
   {
      Dimension velkost =getPreferredSize();
      
      System.out.println(velkost);
      
      velkost.width=200;
      
      setPreferredSize(velkost);
   }
}
