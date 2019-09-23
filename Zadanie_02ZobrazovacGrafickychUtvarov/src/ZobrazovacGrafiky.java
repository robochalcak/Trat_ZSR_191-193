import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class ZobrazovacGrafiky extends JComponent
{
   public void paintComponent(Graphics component)
   {

      int rozmer = 60;
      int x = 10;
      int y = 10;

      Graphics2D g2 = (Graphics2D) component;

      while (x < 20 && y < 20)
      {
         Rectangle rec = new Rectangle(x, y, rozmer, rozmer);
         g2.draw(rec);
         g2.translate(x, y);

         x++;
         y++;
         rozmer += 20;
      }

   }

}
