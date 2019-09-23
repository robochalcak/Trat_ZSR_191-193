package komponentElipsa; // package location

import javax.swing.*;  // important for inheritance of JComponent
import java.awt.*;      // important for graphic 2D

public class KomponentaElipsa extends JComponent  // class
{
    public void paintComponent(Graphics g)  // method
    {
        Graphics2D g2 = (Graphics2D) g;     // new Graphics2D object
        g.setColor(Color.pink);                 // setting shape`s color
        g.fillOval(0, 0, getWidth(), getHeight()); // filling the shape with defined color above
        g.drawOval(0, 0, getWidth(), getHeight()); // drawing the shape
    }
}
