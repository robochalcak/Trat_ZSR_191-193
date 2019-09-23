package dopravnyProstriedok;

import java.awt.*;

/**
 * Personal Car class creates and defines parameters of the personal cars
 * with extending the super class Vehicle-DopravnyProstriedok
 */
public class OsobneAuto extends DopravnyProstriedok
{
    private int kapotaDlzka;
    private int kapotaVyska;
    private int strechaDlzka;
    private int strechaVyska;

    private int kapotaX;
    private int kapotaY;
    private int strechaX;
    private int strechaY;

    private int koleso1X;
    private int koleso1Y;
    private int koleso2X;
    private int koleso2Y;

    /**
     * Creates a personal car with using parameters:
     *
     * @param x set coordinate X
     * @param y set coordinate Y
     */
    public OsobneAuto(int x, int y)
    {
        super(x, y);
        kapotaDlzka = 75;
        kapotaVyska = 16;
        strechaDlzka = 33;
        strechaVyska = kapotaVyska;

        kapotaX = x;
        kapotaY = y;
        strechaX = x + 20;
        strechaY = y - strechaVyska;

        koleso1X = kapotaX + 10;
        koleso1Y = kapotaY + kapotaVyska;
        koleso2X = kapotaX + kapotaDlzka - 20;
        koleso2Y = kapotaY + kapotaVyska;

    }

    /**
     * Creates an default object with default coordinates
     */
    public OsobneAuto()
    {
        x = 75;
        y = 75;

        kapotaDlzka = 75;
        kapotaVyska = 16;

        strechaDlzka = 33;
        strechaVyska = kapotaVyska;

        kapotaX = x;
        kapotaY = y;

        strechaX = x + 20;
        strechaY = y - strechaVyska;

        koleso1X = kapotaX + 10;
        koleso1Y = kapotaY + kapotaVyska;

        koleso2X = kapotaX + kapotaDlzka - 20;
        koleso2Y = koleso1Y;

    }

    /**
     * Display personal car at the screen, defines dimension of the car
     *
     * @param g2 g2 2D graphics component
     */
    @Override
    public void zobraz(Graphics2D g2)
    {
        Graphics g = (Graphics) g2;

        g.drawRect(kapotaX, kapotaY, kapotaDlzka, kapotaVyska);
        g.drawRect(strechaX, strechaY, strechaDlzka, strechaVyska);
        g.drawOval(koleso1X, koleso1Y, POL_KOLESA, POL_KOLESA);
        g.drawOval(koleso2X, koleso2Y, POL_KOLESA, POL_KOLESA);

    }

    /**
     * Returns
     *
     * @return width of the car
     */
    @Override
    public int getSirka()
    {
        return kapotaDlzka;
    }

    /**
     * Returns height of the car
     *
     * @return
     */
    @Override
    public int getVyska()
    {
        return POL_KOLESA + kapotaVyska + strechaVyska;
    }
}
