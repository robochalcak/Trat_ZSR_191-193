package sk.itvkurze.webinar02.posun_obdlznika;

import javax.swing.JFrame;

public class ZobrazovacObdlznikov
{

   public static void main(String[] args)
   {
      JFrame okno = new JFrame();

      okno.setSize(400, 500);
      okno.setTitle("Dva obdlzniky");
      okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      okno.setLocationRelativeTo(null);
      
      
      KomponentaObdlznik komponentaObdlznik = new KomponentaObdlznik();
      okno.add(komponentaObdlznik);
      
      okno.setVisible(true);
   }

}
