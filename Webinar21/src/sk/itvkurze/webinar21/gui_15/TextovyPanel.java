package sk.itvkurze.webinar21.gui_15;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TextovyPanel extends JPanel
{
   private JTextArea txaText;
   
   public TextovyPanel()
   {
      txaText = new JTextArea();
      txaText.setBackground(Color.LIGHT_GRAY);
      txaText.setEditable(false);
      
      setLayout(new BorderLayout());
      //chceme aby plocha textu pokryvala celu plochu panelu
      //a sucastne pozadujem automaticke pridavanie posuvnikov v pripade potreby
      
      //JScrollPane posuvniky = new JScrollPane(txaText);
      //add(posuvniky, BorderLayout.CENTER);
      
      add(new JScrollPane(txaText), BorderLayout.CENTER); // s automatickymi posuvnikmi
      //add(txaText,BorderLayout.CENTER); // bez automatickych posuvnikov 
   }
   public void vlozText(String text) 
   {
      txaText.append(text);  
   }
   
}
