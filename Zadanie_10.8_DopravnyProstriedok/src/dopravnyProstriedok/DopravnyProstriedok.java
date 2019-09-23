package dopravnyProstriedok;

import javax.swing.*;
import java.awt.*;

public abstract class DopravnyProstriedok extends JComponent
{
    protected final int POL_KOLESA = 12;
    protected int x;
    protected int y;

    public DopravnyProstriedok()
    {
        x = 0;
        y = 0;
    }

    public DopravnyProstriedok(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     Zobrazuje konkretny dopravny prostriedok.
     @g2 graficky kontext
     */
    public abstract void zobraz(Graphics2D g2);

    /**
     Nastavuje poziciu dopravneho prostriedku.
     @param x x-ova surdnica laveho horneho rohu
     @param y y-ova suradnica laveho horneho rohu
     */
    public void setPozicia(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     Vracia x-ovu sradnicu laveho horneho rohu.
     @return x-ovu suradnicu laveho horneho rohu
     */
    public int getX()
    {
        return this.x;
    }

    /**
     Vracia y-ovu suradnicu laveho horneho rohu.
     @return y-ovu suradnicu laveho horneho rohu
     */
    public int getY()
    {
        return this.y;
    }

    public abstract int getSirka();
    public abstract int getVyska();

}
