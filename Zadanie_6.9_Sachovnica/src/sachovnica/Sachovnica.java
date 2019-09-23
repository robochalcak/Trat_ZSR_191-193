package sachovnica;

import javax.swing.*;
import java.awt.*;

/**
 * This class draws and paints chess board.
 */
public class Sachovnica extends JComponent
{
    private int x, y; // holds coordinates

    /**
     * This method provides drawing a grid and after fill proper squares, so it creates chess board
     * @param g
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        x = 0;  //sets coordinate x to 0
        y = 0;  // sets coordinate y to 0

        int width = getWidth() / 8;  // holds a dimension of one square
        int height = getHeight() / 8; // holds a dimension of one square
        g.setColor(new Color(0, 0, 0)); // creates and sets color for grid

        for (int i = 0; i < 8; i++)   // paints grid
        {

            for (int j = 0; j < 8; j++)
            {
                g.drawRect(x, y, width, height);
                x += width;
            }
            x = 0;
            y += height;
        }

        g.setColor(new Color(0, 0, 100));
        x = 0;
        y = 0;

        for (int i = 1; i <= 8; i++)   // paints proper squares for chess board
        {
            for (int j = 1; j <= 8; j++)
            {
                if (i % 2 != 0 && j % 2 != 0)
                {
                    g.fillRect(x, y, width, height);
                    x += width * 2;

                }
                else if (i % 2 == 0 && j % 2 == 0)
                {

                    x += width;
                    g.fillRect(x, y, width, height);
                    x += width;
                }
            }

            x = 0;
            y += height;

        }

    }
}

