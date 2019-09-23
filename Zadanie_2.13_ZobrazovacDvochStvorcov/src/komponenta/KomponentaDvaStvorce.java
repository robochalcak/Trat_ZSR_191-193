package komponenta;

import javax.swing.*;
import java.awt.*;

public class KomponentaDvaStvorce extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(new java.awt.Color(0xffb3ff));
        g2.fillRect(0, 0, 150, 150);
        g2.drawRect(0, 0, 150, 150);

        g2.setColor(new java.awt.Color(0xff1aff));
        g2.fillRect(0, 150, 150, 150);
        g2.drawRect(0, 150, 150, 150);

    }
}
