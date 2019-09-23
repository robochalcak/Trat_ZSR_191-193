package balon;

/**
 * This class provides calculation of radius and an area of sphere, when we know only volume
 */
public class Balon
{
    private double objem; // holds volume of sphere

    /**
     * This constructor does not have any parameters the volume sets up on 0.0
     */
    public Balon()
    {
        objem = 0.0;
    }

    /**
     * Here the constructor set up the volume with parameter
     *
     * @param objem
     */
    public Balon(double objem)
    {
        this.objem = objem;
    }

    /**
     * This method add the air in the balloon
     *
     * @param objem
     */
    public void pridajVzduch(double objem)
    {
        this.objem += objem;
    }

    /**
     * This method returns volume of balloon
     *
     * @return
     */
    public double getObjem()
    {
        return objem;
    }

    /**
     * This method returns radius of the balloon
     *
     * @return
     */
    double getPolomer()
    {
        double polomer = Math.pow((((objem * 3.0) / 4.0) / Math.PI), (1.0 / 3.0));
        return polomer;
    }

    /**
     * This method returns an area of the balloon
     *
     * @return
     */
    double getPlocha()
    {
        double priemer = 2 * getPolomer();
        double plocha = Math.PI * Math.pow(priemer, 2);
        return plocha;
    }
}
