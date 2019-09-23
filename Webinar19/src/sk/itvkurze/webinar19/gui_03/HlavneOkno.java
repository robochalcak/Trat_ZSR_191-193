package sk.itvkurze.webinar19.gui_03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
      super("GUI_03");
      //setTitle("GUI_03");
      
      setLayout(new BorderLayout());
      
      btnKlikni = new JButton("Klikni");
      btnKlikni.addActionListener(new ActionListener()
      {    
         @Override
         public void actionPerformed(ActionEvent e)
         {
             txaText.append("Klikol si na tlacitko - Klikni\n");
            
         }
      });
      txaText = new JTextArea();
      txaText.setBackground(Color.LIGHT_GRAY);
      txaText.setEditable(false);
      
      add(txaText, BorderLayout.CENTER);
      add(btnKlikni,BorderLayout.SOUTH);
      
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
