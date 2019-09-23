package sachovnica;

import javax.swing.*;

/**
 * This class creates a window and after test chess board
 */
public class ZobrazovacSachovnice
{
    public static void main(String[] args)
    {
        JFrame okno = new JFrame();
        okno.setSize(450,450);
        okno.setTitle("Sachovnica");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sachovnica sachovnica = new Sachovnica();

        okno.add(sachovnica);
        okno.setVisible(true);
    }
}
