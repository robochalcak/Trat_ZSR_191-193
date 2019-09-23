package sk.itvkurze.webinar22.tlacitka;

import javax.swing.JFrame;
/**
 * 
 * @author Robert Chalcak a Erik Vorel 
 *
 */
public class GuiApka
{

   public static void main(String[] args)
   {
      Tlacitka tlacitka = new Tlacitka();
      JFrame okno = new JFrame();
      okno.setTitle("Zobrazovac tlacitka Demo");
      okno.setSize(400,400);
      okno.setVisible(true);
      okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      

      okno.add(tlacitka);
      
   }

}
