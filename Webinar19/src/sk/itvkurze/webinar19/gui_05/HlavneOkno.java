package sk.itvkurze.webinar19.gui_05;

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
   private TextovyPanel pnlText;
   private PanelNastrojov pnlPanelNastrojov;
   
   public HlavneOkno()
   {
      super("GUI_05");
      //setTitle("GUI_05");
      
      setLayout(new BorderLayout());
      
      pnlPanelNastrojov = new PanelNastrojov();
      
      btnKlikni = new JButton("Klikni");
      btnKlikni.addActionListener(new ActionListener()
      {    
         @Override
         public void actionPerformed(ActionEvent e)
         {
            pnlText.vlozText("Klikol si na tlacitko - Klikni\n");
            
         }
      });
      
      pnlText = new TextovyPanel();
      
      add(pnlPanelNastrojov, BorderLayout.NORTH);
      add(pnlText, BorderLayout.CENTER);
      add(btnKlikni,BorderLayout.SOUTH);
      
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
