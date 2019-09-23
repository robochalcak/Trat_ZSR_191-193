package dopravnyProstriedok;

import javax.swing.*;

/**
 * Displays and creates window of the application
 */
public class ZobrazovacNahodnyDopravnyProstriedok
{
    public static void main(String[] args)
    {

        JFrame okno = new JFrame();
        final int SIRKA_OKNA = 600;
        final int VYSKA_OKNA = 600;
        okno.setSize(SIRKA_OKNA, VYSKA_OKNA);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JComponent komponenta = new KomponentaNahodnyDopravnyProstriedok();
        okno.add(komponenta);
        okno.setVisible(true);
    }


}
