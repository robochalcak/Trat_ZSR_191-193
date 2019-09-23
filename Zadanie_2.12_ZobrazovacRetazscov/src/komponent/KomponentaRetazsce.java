package komponent;   // package location

import javax.swing.*;  // for JComponent
import java.awt.*;     // for setting attributes of string

public class KomponentaRetazsce extends JComponent  // class declaration
{
    public void paintComponent(Graphics g)     // method declaration
    {
        Graphics2D g2 = (Graphics2D) g;        // new Object of Graphics2D

        g.setColor(Color.BLACK);                                       //setting the font color
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));   // setting the font attributes
        g.drawString("Programovanie nás baví", 40, 50);       // setting the text attributes
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 80);
        g.setColor(Color.CYAN);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 110);
        g.setColor(Color.GRAY);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 140);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 170);
        g.setColor(Color.lightGray);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 200);
        g.setColor(Color.GREEN);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 230);
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 260);
        g.setColor(Color.orange);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 290);
        g.setColor(Color.pink);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 320);
        g.setColor(Color.RED);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 350);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("Programovanie nás baví", 40, 380);

    }
}
