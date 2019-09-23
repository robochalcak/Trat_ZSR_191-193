package komponent;  // location in package

import java.awt.Graphics;  // necessary for graphics output
import java.awt.Graphics2D; // necessary for using 2D graphic
import java.awt.Rectangle; // necessary for using class Rectangle
import javax.swing.JComponent; // necessary for using GUI


public class KomponentObdl extends JComponent //class declaration
{

    public void paintComponent(Graphics komponent) // method declaration
    {
        Graphics2D gr2 = (Graphics2D) komponent;  // 2D graphic object

        Rectangle rec = new Rectangle(5, 5, 100, 100); // create a initialize the object rectangle

        gr2.draw(rec);  // drawing rectangle on the window

        rec.translate(105, 0);  // moving rectangle on x 105 px
        gr2.draw(rec);  // again drawing rectangle on the window

        rec.translate(0, 105); // moving rectangle on y 105 px
        gr2.draw(rec);  // again display rectangle on the window

        rec.translate(-105, 0);  // moving rectangle on x back 105 px
        gr2.draw(rec);  // again drawing rectangle on the window
    }


}
