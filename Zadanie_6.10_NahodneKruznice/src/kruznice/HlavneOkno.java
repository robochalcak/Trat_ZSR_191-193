package kruznice;

import javax.swing.*;

/**
 * This program ask user of input how many circles her or he wants to draw, and after draw all circles in the window
 * of application
 */
public class HlavneOkno
{
    public static void main(String[] args)
    {
        JFrame okno = new JFrame();
        int pocetKruhov = Integer.parseInt(JOptionPane.showInputDialog("Zadaj pocet kruhov k zobrazeniu: "));
        KomponentaNahodnaKruznica kruhy = new KomponentaNahodnaKruznica(pocetKruhov);

        okno.setSize(350,350);
        okno.setTitle("Kruhy");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.add(kruhy);
        okno.setVisible(true);
    }
}
