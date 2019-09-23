package sk.itvkurze.webinar10.casovac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class ZobrazovacPohybujucehoObdlznika
{
   private static final int SIRKA_OKNA=800;
   private static final int VYSKA_OKNA=600;
   
   public static void main(String[] args)
   {
      JFrame okno = new JFrame();
      
      okno.setSize(SIRKA_OKNA,VYSKA_OKNA);
      okno.setTitle("Pohyb obdlznika" );
      okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // vytvorime objekt triedy komponenta obdlznik a pridame ho do okna
      
      KomponentaObdlznik komponenta = new KomponentaObdlznik();
      
      okno.add(komponenta);
      
      okno.setVisible(true);
      
      
      class CasovacPosluchac implements ActionListener
      {

         @Override
         public void actionPerformed(ActionEvent e)
         {
            komponenta.posun(1, 1);
            
         }
         
      }
      
      CasovacPosluchac posluchac = new CasovacPosluchac();
      
      Timer casovac = new Timer(100, posluchac);
      casovac.start();
      
   }

}
