package sk.itvkurze.webinar03.grafika;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Auto extends JComponent
{
   private int x;
   private int y;
   
   public Auto(int xOvaSuradnica, int yOvaSuradnica)
   {
      x=xOvaSuradnica;
      y = yOvaSuradnica;
   }
   public void vykresli(Graphics2D vykreslovaciePlatno)
   {
      // line 
      //obldznik rectangle
      //vytvorenie kruhu 
      
      Rectangle konstrukciaAuta = new Rectangle(x,y,60,10);
      vykreslovaciePlatno.setColor(new Color(200,200,150));
      vykreslovaciePlatno.draw(konstrukciaAuta);
      
   }
   @Override
   protected void paintComponent(Graphics g)
   {
      Graphics2D vykreslovaciePlatno = (Graphics2D)g;
      
      Auto bmw = new Auto(200, 200);
      
      bmw.vykresli(vykreslovaciePlatno);
   }
}
