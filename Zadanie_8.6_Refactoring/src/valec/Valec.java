package valec;

/**
 * This class calculates volume and surface of the cylinder
 */
public class Valec
{
    private double r; // holds radius
    private double v;  // holds high

    /**
     * Creates a new object without any parameters
     */
    public Valec()
    {
    }

    /**
     * Creates a new object with using parameters
     *
     * @param r radius
     * @param v high
     */
    public Valec(double r, double v)
    {
        this.r = r;
        this.v = v;
    }

    /**
     * Sets radius with using parameter
     *
     * @param r radius
     */
    public void setR(double r)
    {
        this.r = r;
    }

    /**
     * Sets high with using parameter
     *
     * @param v high
     */
    public void setV(double v)
    {
        this.v = v;
    }

    /**
     * Returns radius
     *
     * @return r as radius
     */
    public double getR()
    {
        return r;
    }

    /**
     * @return v as high
     */
    public double getV()
    {
        return v;
    }

    /**
     * Calculate surface of the cylinder with using parameters
     *
     * @param r radius
     * @param v high
     * @return surface
     */
    public double vypocitajPovrchValca(double r, double v)
    {
        double p = Math.pow((Math.PI * r), 2);
        double q = 2 * (Math.PI * r * v);

        return 2.0 * p + q;
    }

    /**
     * Calculates volume of the cylinder using parameters
     *
     * @param r radius
     * @param v high
     * @return volume
     */
    public double vypocitajObjemValca(double r, double v)
    {
        return Math.PI * (Math.pow(r, 2) * v);
    }

    /**
     * Calculates surface of the cylinder without using any parameter
     *
     * @return surface
     */
    public double vypocitajPovrchValca()
    {
        double p = Math.pow((Math.PI * r), 2);
        double q = 2 * (Math.PI * r * v);

        return 2.0 * p + q;
    }

    /**
     * Calculates volume of the cylinder without using any parameter
     *
     * @return volume
     */
    public double vypocitajObjemValca()
    {
        return Math.PI * (Math.pow(r, 2) * v);
    }

    /**
     * Returns formatted output with all information about cylinder
     *
     * @return formatted output
     */
    public String toString()
    {
        return "Valec s polomerom " + r + " a s vyskou " + r + " m" + "\nma objem " + vypocitajObjemValca() + " m^3 " + "\na povrch " + vypocitajPovrchValca() + " m^2";
    }

}
