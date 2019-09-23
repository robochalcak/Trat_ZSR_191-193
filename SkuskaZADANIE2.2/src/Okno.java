import javax.swing.*;

public class Okno
{
    public static void main(String[] args)
    {
        KomponentObdl komp = new KomponentObdl();

        JFrame okno = new JFrame();

        okno.setSize(600, 400);

        okno.setTitle("Štyri obdĺžniky  ");

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setLocationRelativeTo(null);

        okno.add(komp);

        okno.setVisible(true);
    }

}
