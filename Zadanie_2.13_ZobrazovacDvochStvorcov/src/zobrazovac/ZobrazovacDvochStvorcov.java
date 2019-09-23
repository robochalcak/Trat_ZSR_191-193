package zobrazovac;

import komponenta.KomponentaDvaStvorce;

import javax.swing.*;

public class ZobrazovacDvochStvorcov
{
    public static void main(String[] args)
    {
        JFrame okno = new JFrame();
        okno.setTitle("Zobrazovac dvoch obdlznikov");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(400, 300);

        KomponentaDvaStvorce komp = new KomponentaDvaStvorce();
        okno.add(komp);
        okno.setVisible(true);
    }
}
