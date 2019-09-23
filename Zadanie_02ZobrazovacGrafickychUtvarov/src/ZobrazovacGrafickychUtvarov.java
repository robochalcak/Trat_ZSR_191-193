import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ZobrazovacGrafickychUtvarov
{

   public static void main(String[] args)
   {

      JFrame okno = new JFrame();
      ZobrazovacGrafiky stvorce = new ZobrazovacGrafiky();
      KomponentaKruh kruh = new KomponentaKruh();
      String volba = JOptionPane
            .showInputDialog("Zadaj 1 pre vykreslenie obdlznikov\nZadaj 2 pre vykreslenie kurznic");

      okno.setSize(450, 450);

      okno.setTitle("Zobrazovac Grafickych utvarov");

      okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      if (volba.equals("1"))
      {
         okno.add(stvorce);
      }
      else if (volba.equals("2"))
      {
         okno.add(kruh);

      }
      else
      {
         JOptionPane.showMessageDialog(null, "Neexistujuca volba!!!");
         ;
      }

      okno.setVisible(true);

   }

}