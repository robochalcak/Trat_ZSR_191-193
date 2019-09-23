package komponent; // package location

import javax.swing.*; //necessary imports
import java.awt.*;

public class KomponentSmajlik extends JComponent  // class declaration
{
    public void paintComponent(Graphics g)   // JComponent super class`s method implementation
    {

        Graphics2D g2 = (Graphics2D) g;  // object of 2D graphics, necessary for painting and drawing shapes
        int x = (getWidth() / 4) + 10;  // definition of coordinate x for first eye and mouth
        int x2 = (getWidth() / 6) * 3;   // definition of coordinate x for second eye
        int lineY = (getHeight() / 5) * 4; // definition of coordinate y for mouth

        g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);  // drawing an oval "head"
        g.setColor(Color.BLUE);  // setting color for nice eyes :)
        g.drawOval(x, 65, getWidth() / 5, getHeight() / 5); //first eye
        g.drawOval(x2 + 10, 65, getWidth() / 5, getHeight() / 5); // second eye
        g.setColor(Color.RED);  // mouth should be red
        g.fillRect(x + 30, lineY, getWidth() / 5, 5); //filling mouth with red color

    }
}
