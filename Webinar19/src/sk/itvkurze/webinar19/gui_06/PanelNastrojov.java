package sk.itvkurze.webinar19.gui_06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelNastrojov extends JPanel implements ActionListener
{
   private JButton btnPotvrd;
   private JButton btnZrus;
   private TextovyPanel pnlText;

   public PanelNastrojov()
   {
      btnPotvrd = new JButton("Potvrd");
      btnZrus = new JButton("Zrus");
      
      //nastavime posluchaca udalosti 
      
      btnPotvrd.addActionListener(this);
      btnZrus.addActionListener(this);
            
      //defaultny layout manager pre JPanel je prave FlowLayout
      
      setLayout(new FlowLayout(FlowLayout.LEFT));
      
      add(btnPotvrd);
      add(btnZrus);
   }
   
   public void setTextovyPanel(TextovyPanel panel)
   {
      pnlText = panel;
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      //System.out.println("Klikol si na jedno z tlacitok na panely nastrojov");
      
      if(event.getSource()==btnPotvrd) // testujeme ci zdroj udalosti ActionEvent bol vygenerovany tlacitkom btnPotvrd 
      {
         //System.out.println("Klikol si na tlacitko Potvrd");
         pnlText.vlozText("Klikol si na tlacitko Potvrd\n");
      }
      else if(event.getSource()==btnZrus){
        // System.out.println("Klikol si na tlacitko Zrus");
         pnlText.vlozText("Klikol si na tlacitko Zrus\n");
      }
   }
}
