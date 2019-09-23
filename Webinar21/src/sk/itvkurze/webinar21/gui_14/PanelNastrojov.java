package sk.itvkurze.webinar21.gui_14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelNastrojov extends JPanel implements ActionListener
{
   private JButton btnPotvrd;
   private JButton btnZrus;
   private RetazecListener listener;

   public PanelNastrojov()
   {
      setBorder(BorderFactory.createEtchedBorder());
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
   
   public void setRetazecListener(RetazecListener listener)
   {
      this.listener=listener;
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      //System.out.println("Klikol si na jedno z tlacitok na panely nastrojov");
      
      if(event.getSource()==btnPotvrd) // testujeme ci zdroj udalosti ActionEvent bol vygenerovany tlacitkom btnPotvrd 
      {
         //System.out.println("Klikol si na tlacitko Potvrd");
         listener.vlozText("Klikol si na tlacitko Potvrd\n");
      }
      else if(event.getSource()==btnZrus){
        // System.out.println("Klikol si na tlacitko Zrus");
         listener.vlozText("Klikol si na tlacitko Zrus\n");
      }
   }
}
