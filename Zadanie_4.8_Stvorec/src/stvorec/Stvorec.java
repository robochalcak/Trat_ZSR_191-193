package stvorec;

/**
 * This class calculates an area and diagonal of the square
 */
public class Stvorec
{

    private int strana;  // holds dimension of the square

    /**
     * Constructor sets up the dimension with selected parameter
     *
     * @param strana
     */
    public Stvorec(int strana)
    {
        this.strana = strana;
    }

    /**
     * Returns the area of the square
     *
     * @return
     */

    public double getPlocha()
    {
        return Math.pow(strana, 2);
    }

    /**
     * Returns the diagonal of the square
     *
     * @return
     */
    public double getUhlopriecka()
    {
        double uhlopriecka;
        uhlopriecka = Math.pow(strana, 2) + Math.pow(strana, 2);
        return Math.sqrt(uhlopriecka);
    }
}
