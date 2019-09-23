package prevysenie;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class calculates slop in mille
 */
public class Prevysenie
{
    private double x; // holds starting position in meters
    private double y; // holds actual position in meters
    private double vyskPrevysenie; // holds camber in meters

    /**
     * Creates a new object without any argument
     */
    public Prevysenie()
    {
    }

    /**
     * Creates a new object with using parameters
     *
     * @param x              starting position
     * @param y              actual position
     * @param vyskPrevysenie camber
     */
    public Prevysenie(double x, double y, double vyskPrevysenie)
    {
        this.x = x;
        this.y = y;
        this.vyskPrevysenie = vyskPrevysenie;
    }

    /**
     * Sets a starting position with using parameter
     *
     * @param x
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Sets an actual position with using parameter
     *
     * @param y
     */
    public void setY(double y)
    {
        this.y = y;
    }

    /**
     * sets a camber with using parameter
     *
     * @param vyskPrevysenie
     */
    public void setVyskPrevysenie(double vyskPrevysenie)
    {
        this.vyskPrevysenie = vyskPrevysenie;
    }

    /**
     * Returns a starting position
     *
     * @return x like starting position
     */
    public double getX()
    {
        return x;
    }

    /**
     * Returns an actual position
     *
     * @return
     */
    public double getY()
    {
        return y;
    }

    /**
     * Returns a camber
     *
     * @return
     */
    public double getVyskPrevysenie()
    {
        return vyskPrevysenie;
    }

    /**
     * Calculates and returns camber with using parameter
     *
     * @param vyskPrevysenie
     * @return camber
     */
    public double getPrevysenie(double vyskPrevysenie)
    {
        double k = y - x;
        this.vyskPrevysenie = vyskPrevysenie;
        double v = vyskPrevysenie;

        return (v * 1000.0) / k;
    }

    /**
     * Calculates and returns camber without any parameter
     *
     * @return
     */
    public double getPrevysenie()
    {
        double k = y - x;  //calculates and holds distance between starting positions and actual position
        double v = vyskPrevysenie; // holds a camber value

        return zaokruhli(((v * 1000.0) / k), 4);
    }

    /**
     * Returns all information in formated output and determines, when is slope or camber neither camber nor slope
     *
     * @return
     */
    public String toString()
    {
        String all = "";
        all += "Pociatok cesty: " + x + ", Aktualna poloha: " + y + "\nVyskove prevysenie: " + vyskPrevysenie;
        if (getPrevysenie() < 0)
        {
            all += "\nAktualne klesanie je: " + (getPrevysenie() * -1) + " promile. ";
        }
        else if (getPrevysenie() > 0)
        {
            all += "\nAktualne stupanie je: " + getPrevysenie() + " promile.";
        }
        else
        {
            all += "\nAktualne nie je ziadny sklon.";
        }
        return all;
    }

    /**
     * This private and helpful method provides rounding an real number with using parameters
     *
     * @param hodnota number, with should be rounded
     * @param miesta  number of decimal places
     * @return rounded number
     */
    private double zaokruhli(double hodnota, int miesta)
    {
        if (miesta < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(hodnota));
        bd = bd.setScale(miesta, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
