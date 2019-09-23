package mnohouholnik;

import java.util.ArrayList;

/**
 * This class calculates many shape`s circumference and area
 */
public class MnohoUholnik
{
    private double x; // holds coordinate X
    private double y;   // holds coordinate Y
    private ArrayList<Double> xS; // holds all coordinates X
    private ArrayList<Double> yS; // holds all coordinates Y
    private ArrayList<Double> vzdialenost; // holds all distances between each peak

    /**
     * Creates many shapes object without any parameters
     */
    public MnohoUholnik()
    {
        x = 0;
        y = 0;
        xS = new ArrayList<Double>();
        yS = new ArrayList<Double>();
        vzdialenost = new ArrayList<Double>();

    }

    /**
     * Helping method for setting and counting all distances between two points and stores them in
     * Array list
     */
    private void nastavVzdialenost()
    {
        for (int i = xS.size() - 1; i > 0; i--)
        {
            double ab = 0;
            ab = Math.pow((xS.get(i) - xS.get(i - 1)), 2) + Math.pow((yS.get(i) - yS.get(i - 1)), 2);
            Math.sqrt(ab);
            vzdialenost.add(ab);
        }
    }

    /**
     * Adds peak
     * @param x coordinate
     * @param y coordinate
     */
    public void pridajVrchol(double x, double y)
    {
        xS.add(x);
        yS.add(y);
    }

    /**
     * Calculates and returns circumference of many shape
     * @return
     */
    public double obvod()
    {
        double o = 0;
        nastavVzdialenost();
        for (int i = 0; i < vzdialenost.size(); i++)
        {
            o += vzdialenost.get(i);
        }
        return o;
    }

    /**
     * Calculates and returns many shape`s area
     * @return
     */
    public double obsah()
    {
        double obs = 0;
        for (int i = 0; i < xS.size() - 1; i++)
        {
            obs += ((xS.get(i) * yS.get(i + 1))) - ((yS.get(i) * xS.get(i + 1)));
        }
        obs += (xS.get(xS.size() - 1) * yS.get(0)) - ((yS.get(yS.size() - 1)) * (xS.get(0)));

        if (obs / 2 < 0)
        {
            return (obs / 2) * -1;
        }
        else
        {
            return obs / 2;
        }
    }

}
