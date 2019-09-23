package sk.itvkurze.webinar22.tlacitka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Trieda vytvara dve tlacitka s pocitadlom kliknutia, ktore pocita kliknutie kazdeho tlacitka 
 * @author Robert Chalcak a Erik Vorel 
 *
 */
@SuppressWarnings("serial")
public class Tlacitka extends JPanel implements ActionListener
{

   private JButton tlacitko1;
   private JButton tlacitko2;
   private int pocitadlo1;
   private int pocitadlo2;

   public Tlacitka()
   {
      
      tlacitko1 = new JButton("Pocet stlaceni: " + pocitadlo1);
      tlacitko2 = new JButton("Pocet stlaceni: " + pocitadlo2);

      tlacitko1.addActionListener(this);
      tlacitko2.addActionListener(this);

       add(tlacitko1);
       add(tlacitko2);
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      if (event.getSource() == tlacitko1)
      {
         pocitadlo1++;
         tlacitko1.setText("Pocet stlaceni: " + pocitadlo1);
      }
      else if (event.getSource() == tlacitko2)
      {
         pocitadlo2++;
         tlacitko2.setText("Pocet stlaceni: " + pocitadlo2);
      }

   }

}
