package rectangles; //location

import javax.swing.*; // necessary for JComponent
import java.awt.*; // necessary for Rectangle class

public class Rectangles extends JComponent // class definition
{
    public void paintComponent(Graphics component) // method definition
    {

        Rectangle rec1 = new Rectangle(10, 10, 200, 200); //definition of first rectangle
        Rectangle rec2 = new Rectangle(150, 150, 200, 200);//definition of second rectangle

        Rectangle intersection = rec1.intersection(rec2);   // temporary rectangle, used to find an intersection

        if ((intersection.getWidth() * intersection.getHeight()) != 0.0) // if is intersection, the appropriate message
            // is displayed with area to.
        {
            System.out.println("Rectangles have an intersection!");
            System.out.println("The area is: "+intersection.getHeight()*intersection.getWidth());
        }
        else   // if not also a message is displayed with information
        {
            System.out.println("Rectangles do not have an intersection!");

        }

        Graphics2D g2 = (Graphics2D) component; // Graphics object necessary for drawing two rectangles

        g2.draw(rec1);   // draw first rectangle
        g2.draw(rec2);    // draw second rectangle
    }


}
