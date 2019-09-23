import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaKruh extends JComponent
{

   public void paintComponent(Graphics g)
   {

      int x = 10;

      int y = 10;

      int width = 50;

      int height = 50;

      Graphics2D g2 = (Graphics2D) g;

      g.drawOval(x, y, width, height);

      while (x < 20 && y < 20)
      {

         g.drawOval(x, y, width, height);

         g.translate(x, y);

         x++;

         y++;

         width += 20;

         height += 20;

      }

   }

}
