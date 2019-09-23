package kruznice;

import javax.swing.*;
import java.awt.*;

/**
 * This class provides drawing circles, with randomly dimension of radius and location, and number of circles depends
 * from user`s input
 */
public class KomponentaNahodnaKruznica extends JComponent
{

    private int n; //holds user`s input for number of circles
    private int x; // holds coordinate of x
    private int y; // holds coordinate of y
    private int polomer; // holds radius value

    /**
     * This parametric constructor set up user input and set minimal value of x and y and radius
     * @param n
     */
    public KomponentaNahodnaKruznica(int n)
    {
        this.n = n;
        x = 10;
        y = 10;
        polomer = 0;
    }

    /**
     * This inherited method provides drawing circles
     * @param g
     */
    public void paintComponent(Graphics g)
    {

        Graphics2D g2 = (Graphics2D) g;

        for (int i = 1; i <= n; i++)
        {

            int polRozsah = (getHeight() / 3) - 10;
            polomer = (int) (Math.random() * polRozsah) + 10;
            int min = 10+polomer;
            int max = getWidth() - (10+polomer);
            int rozsah = max - min + 1;


            x = (int) ((Math.random() * rozsah) + min-polomer);
            y = (int) ((Math.random() * rozsah) + min-polomer);

            g.drawOval(x, y, polomer, polomer);
        }

    }
}
