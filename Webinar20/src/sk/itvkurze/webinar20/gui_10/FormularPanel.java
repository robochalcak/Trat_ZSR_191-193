package sk.itvkurze.webinar20.gui_10;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularPanel extends JPanel
{
   private JLabel lblMeno;
   private JLabel lblZamestnanie;
   private JTextField txtMeno;
   private JTextField txtZamestnanie;
   private JButton btnOK;
   
   public FormularPanel()
   {
      Dimension velkost =getPreferredSize();
      
      System.out.println(velkost);
      
      velkost.width=200;
      
      setPreferredSize(velkost);
      
      //pridame jednoduche ohranicenie, tmavosivou farbou
      
      setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
      
      lblMeno = new JLabel("Meno: ");
      lblZamestnanie = new JLabel("Zamestnanie: ");
      txtMeno = new JTextField(10);
      txtZamestnanie = new JTextField(10);
      
      btnOK = new JButton("OK");
   }
}
