package sk.itvkurze.webinar19.gui_05;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelNastrojov extends JPanel
{
   private JButton btnPotvrd;
   private JButton btnZrus;

   
   public PanelNastrojov()
   {
      btnPotvrd = new JButton("Potvrd");
      btnZrus = new JButton("Zrus");
      
      //defaultny layout manager pre JPanel je prave FlowLayout
      
      setLayout(new FlowLayout(FlowLayout.LEFT));
      
      add(btnPotvrd);
      add(btnZrus);
   }
}
