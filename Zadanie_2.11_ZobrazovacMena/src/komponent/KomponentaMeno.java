package komponent;  // location

import javax.swing.*; // for inherited JComponent
import java.awt.*;

public class KomponentaMeno extends JComponent  // class declaration
{

    public void paintComponent(Graphics g) // class declaration
    {
        Graphics2D g2 =(Graphics2D)g;    // creating a 2D graphics object
        g.setColor(new java.awt.Color(255,0,0));  // setting text color

        g2.setColor(new java.awt.Color(0,0,255)); // setting background color
        g2.drawRect(10,10,400,205);  //drawing a object rectangle with dimension
        g2.fillRect(10,10,400,205); // filling the object with set color
    }
}

