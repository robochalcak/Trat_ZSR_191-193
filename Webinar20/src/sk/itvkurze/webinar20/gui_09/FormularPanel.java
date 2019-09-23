package sk.itvkurze.webinar20.gui_09;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class FormularPanel extends JPanel
{
   public FormularPanel()
   {
      Dimension velkost =getPreferredSize();
      
      System.out.println(velkost);
      
      velkost.width=200;
      
      setPreferredSize(velkost);
      
      //pridame jednoduche ohranicenie, tmavosivou farbou
      
      setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
   }
}
