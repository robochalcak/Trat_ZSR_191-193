




import javax.swing.*;
import java.awt.*;


public class KomponentObdl extends JComponent
{

    public void nakrKomponent(Graphics komponent)
    {
        Graphics2D gr2 = (Graphics2D) komponent;

       Rectangle rec = new Rectangle(5,5,200,200);

       gr2.draw(rec);
        rec.translate(105,0);
        gr2.draw(rec);
        rec.translate(0,105);
        gr2.draw(rec);
        rec.translate(5,5);
        gr2.draw(rec);
    }




}
