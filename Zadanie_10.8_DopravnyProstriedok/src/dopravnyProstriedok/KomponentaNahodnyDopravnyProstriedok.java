package dopravnyProstriedok;

import javax.swing.*;
import java.awt.*;

/**
 * Generates and draws vehicles on the screen, it extends JComponent class
 */
public class KomponentaNahodnyDopravnyProstriedok extends JComponent
{
    private DopravnyProstriedok dopravnyProstriedok; //holds vehicle object for drawing on the screen

    /**
     * Creates an empty object of the component
     */

    public KomponentaNahodnyDopravnyProstriedok()
    {
        this.dopravnyProstriedok = null;
    }

    /**
     * Sets vehicle in the argument and creates an object
     *
     * @param dopravnyProstriedok vehicles, which will be drawn
     */
    public KomponentaNahodnyDopravnyProstriedok(DopravnyProstriedok dopravnyProstriedok)
    {
        this.dopravnyProstriedok = dopravnyProstriedok;
    }

    /**
     * Generates position and type of vehicle and draws it
     *
     * @param g graphics component
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int min = 0;
        int max = 1;
        int minX = 20;
        int minY = 10;
        int maxX = getWidth() - 150;
        int maxY = getHeight() - 100;

        int range = max - min + 1;
        int rangeX = maxX - minX + 1;
        int rangeY = maxY - minY + 1;

        for (int i = 1; i <= 10; i++)
        {
            int nahoda = (int) (Math.random() * range) + min;

            if (nahoda == 0)
            {
                int x = (int) (Math.random() * rangeX) + minX;
                int y = (int) (Math.random() * rangeY + minY);
                dopravnyProstriedok = new OsobneAuto(x, y);
                dopravnyProstriedok.zobraz(g2);
            }
            else
            {
                int x = (int) (Math.random() * rangeX) + minX;
                int y = (int) (Math.random() * rangeY + minY);
                dopravnyProstriedok = new NakladneAuto(x, y);
                dopravnyProstriedok.zobraz(g2);
            }

        }
    }
}
