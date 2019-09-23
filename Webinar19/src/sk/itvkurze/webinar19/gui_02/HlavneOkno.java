package sk.itvkurze.webinar19.gui_02;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class HlavneOkno extends JFrame
{
   private JButton btnKlikni;
   private JTextArea txaText;
   
   public HlavneOkno()
   {
      super("GUI_02");
      //setTitle("GUI_02");
      
      setLayout(new BorderLayout());
      
      btnKlikni = new JButton("Klikni");
      txaText = new JTextArea();
      txaText.setBackground(Color.LIGHT_GRAY);
      
      add(txaText, BorderLayout.CENTER);
      add(btnKlikni,BorderLayout.SOUTH);
      
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
