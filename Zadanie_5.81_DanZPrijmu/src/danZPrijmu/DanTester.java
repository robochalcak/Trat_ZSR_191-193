package danZPrijmu;

import javax.swing.*;

/**
 * This class tests the "DanZPrijmu" class and ask user for enter his or her income and after displays expected
 * values if is income 10000 eur, of course if user enters another value, the tax and rate will be different
 */
public class DanTester
{
    public static void main(String[] args)
    {
        DanZPrijmu dan = new DanZPrijmu();

        double prijem = Double.valueOf(JOptionPane.showInputDialog(null, "Zadaj svoj prijem v Eur: "));

        dan.setMzda(prijem);

        System.out.println("Predpokladany prijem je 10000 Eur.");
        System.out.println("Ocakavana dan z prijmu bude: 2850 eur");
        System.out.println("Ocakavana celkova sadzba je: 28.5 %");

        JOptionPane.showMessageDialog(null, "Was prijem je: " + dan.getMzda() + " Eur.");
        JOptionPane.showMessageDialog(null, "Sadzba je: " + dan.getSadba() + "%.");
        JOptionPane.showMessageDialog(null, "Dan predstavuje: " + dan.getDan() + " Eur.");
    }
}
