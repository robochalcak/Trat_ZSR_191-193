package dopravnyProstriedok;

import java.awt.*;

/**
 * This class defines and draws a lorry extended from Vehicle-DopravnyProstriedok class
 */
public class NakladneAuto extends DopravnyProstriedok
{

    int privesVyska;
    int privesDlzka;
    int kabinaVyska;
    int kabinaDlzka;
    int privesX;
    int privesY;
    int kabinaX;
    int kabinaY;
    int koleso1X;
    int koleso1Y;
    int koleso2X;
    int koleso2Y;
    int koleso3X;
    int koleso3Y;
    int koleso4X;
    int koleso4Y;
    int koleso5X;
    int koleso5Y;

    /**
     * Creates a lory object with parameters:
     *
     * @param x coordinate X
     * @param y coordinate Y
     */
    public NakladneAuto(int x, int y)
    {
        super(x, y);
        kabinaX = x;
        kabinaY = y;

        kabinaVyska = 45;
        kabinaDlzka = 33;

        privesVyska = 60;
        privesDlzka = 100;

        privesX = kabinaX + kabinaDlzka + 2;
        privesY = kabinaY - (privesVyska - kabinaVyska);

        koleso1X = kabinaX + 3;
        koleso1Y = kabinaY + kabinaVyska;

        koleso2X = privesX + 15;
        koleso2Y = kabinaY + kabinaVyska;

        koleso3X = privesX;
        koleso3Y = koleso2Y;

        koleso4X = (privesX + privesDlzka) - 15;
        koleso4Y = koleso2Y;

        koleso5X = koleso4X - POL_KOLESA - 3;
        koleso5Y = koleso2Y;

    }

    /**
     * Creates and empty lory object with default coordinate position
     */
    public NakladneAuto()
    {
        x = 250;
        y = 250;


        kabinaX = x;
        kabinaY = y;

        kabinaVyska = 45;
        kabinaDlzka = 33;

        privesVyska = 60;
        privesDlzka = 100;

        privesX = kabinaX + kabinaDlzka + 2;
        privesY = kabinaY - (privesVyska - kabinaVyska);

        koleso1X = kabinaX + 3;
        koleso1Y = kabinaY + kabinaVyska;

        koleso2X = privesX + 15;
        koleso2Y = kabinaY + kabinaVyska;

        koleso3X = privesX;
        koleso3Y = koleso2Y;

        koleso4X = (privesX + privesDlzka) - 15;
        koleso4Y = koleso2Y;

        koleso5X = koleso4X - POL_KOLESA - 3;
        koleso5Y = koleso2Y;

    }

    /**
     * Display lory and uses parameter
     *
     * @param g2 Graphics2D object
     */
    @Override
    public void zobraz(Graphics2D g2)
    {
        Graphics g = (Graphics) g2;

        g.drawRect(x, y, kabinaDlzka, kabinaVyska);
        g.drawRect(privesX, privesY, privesDlzka, privesVyska);
        g.drawOval(koleso1X, koleso1Y, POL_KOLESA, POL_KOLESA);
        g.drawOval(koleso2X, koleso2Y, POL_KOLESA, POL_KOLESA);
        g.drawOval(koleso3X, koleso3Y, POL_KOLESA, POL_KOLESA);
        g.drawOval(koleso4X, koleso4Y, POL_KOLESA, POL_KOLESA);
        g.drawOval(koleso5X, koleso5Y, POL_KOLESA, POL_KOLESA);


    }

    /**
     * Returns width
     *
     * @return width
     */
    @Override
    public int getSirka()
    {
        return kabinaDlzka + privesDlzka + 5;
    }

    /**
     * Returns height
     *
     * @return
     */
    @Override
    public int getVyska()
    {
        return POL_KOLESA + privesVyska;
    }

}
