package plechovka;

/**
 * This class calculates volume and surface of drink can. It takes from user radius and height
 */
public class Plechovka
{
    private double vyska; // holds height
    private double polomer; // holds radius

    /**
     * Default constructor set up basic variables with 0
     */
    public Plechovka()
    {
        vyska = 0.0;
        polomer = 0.0;
    }

    /**
     * This constructor sets up basic variables with arguments
     *
     * @param vyska
     * @param polomer
     */
    public Plechovka(double vyska, double polomer)
    {
        this.vyska = vyska;
        this.polomer = polomer;
    }

    /**
     * Sets the height
     *
     * @param vyska
     */
    public void setVyska(double vyska)
    {
        this.vyska = vyska;
    }

    /**
     * Set the radius
     *
     * @param polomer
     */
    public void setPolomer(double polomer)
    {
        this.polomer = polomer;
    }

    /**
     * Return height
     *
     * @return
     */
    public double getVyska()
    {
        return vyska;
    }

    /**
     * Return radius
     *
     * @return
     */
    public double getPolomer()
    {
        return polomer;
    }

    /**
     * Return volume
     *
     * @return
     */
    public double getObjem()
    {
        return (Math.PI * Math.pow(polomer, 2)) * vyska;
    }

    /**
     * Return surface
     *
     * @return
     */
    public double getPovrch()
    {
        double podstava = Math.PI * Math.pow(polomer, 2);
        podstava *= 2;

        double plast = 2 * (Math.PI * polomer * vyska);

        return plast + podstava;
    }
}
