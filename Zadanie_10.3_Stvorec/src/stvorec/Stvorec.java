package stvorec;

import java.awt.*;

/**
 * This class extends Rectangle super class and add an extra method for rectangle - square
 * for example how to determine a location from middle of the side, of the shape
 */
public class Stvorec extends Rectangle
{
    /**
     * Creates a new object of square with using parameters
     *
     * @param stredX middle of the coordinate X
     * @param stredY middle of the coordinate Y
     * @param strana dimension of the square
     */
    public Stvorec(int stredX, int stredY, int strana)
    {
        setSize(new Dimension(strana, strana));
        setLocation(new Point(bod(stredX, strana), bod(stredY, strana)));
    }

    /**
     * Helper method for calculating the coordinate of the square with
     * parameters:
     *
     * @param stred  middle of the side X or Y
     * @param strana dimension of the side, of the square
     * @return
     */
    private int bod(int stred, int strana)
    {
        return stred - (strana / 2);
    }

    /**
     * Calculates and returns an area of the square
     *
     * @return
     */
    public double getPlocha()
    {
        double plocha = super.getHeight() * super.getWidth();
        return plocha;
    }

    /**
     * Returns a formated output of the square
     *
     * @return
     */
    public String toString()
    {
        return "Stvorec [x=" + super.x + ",y=" + super.y + ",width=" + getHeight() + ",height=" + getWidth() + "]";
    }
}
