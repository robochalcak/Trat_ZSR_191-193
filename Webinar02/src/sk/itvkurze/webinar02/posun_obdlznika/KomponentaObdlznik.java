package sk.itvkurze.webinar02.posun_obdlznika;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class KomponentaObdlznik extends JComponent
{
   public void paintComponent(Graphics grafickyKontext)
   {
      //potrebujem graficky kontext. do ktoreho budem vykreslovat
      Graphics2D g2 = (Graphics2D)grafickyKontext;
      
      //zostrojte obdlznik  objekt typu rectangle  nasledne ho zobrazimev ramci grafickeho kontextu
      Rectangle rect = new Rectangle(5,10,20,30);
      
      g2.draw(rect);//vykreslime obdlznik do grafickeho kontextu na platno
   
      //posun obdlznik rect o 50 pizelov do prava a 40 px na dol
      rect.translate(50, 40);
      
      //posunuty obdlznik
      g2.draw(rect);      
   }
}
