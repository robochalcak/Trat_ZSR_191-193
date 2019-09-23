package rotacnyKuzel;

/**
 * This class calculates volume and surface of the cone
 */
public class RotacnyKuzel
{
    private double v; //holds high
    private double r; // holds radius

    /**
     * Creates a new object without using any parameter
     */
    public RotacnyKuzel()
    {
    }

    /**
     * Creates a new object with using parameters
     *
     * @param v high
     * @param r radius
     */
    public RotacnyKuzel(double v, double r)
    {
        this.v = v;
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
     * Sets radius with using parameter
     *
     * @param r radius
     */
    public void setR(double r)
    {
        this.r = r;
    }

    /**
     * Returns high
     *
     * @return v as high
     */
    public double getV()
    {
        return v;
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
     * Calculates  volume with using parameters
     *
     * @param r radius
     * @param v high
     * @return volume
     */
    public double vypocitajObjem(double r, double v)
    {
        return (1.0 / 3.0) * Math.pow((Math.PI * r), 2) * v;
    }

    /**
     * Calculates surface with using parameters
     *
     * @param r radius
     * @param v high
     * @return surface
     */
    public double vypocitajPovrch(double r, double v)
    {
        double sp = Math.pow((Math.PI * r), 2);  //foundation
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(v, 2));  //side
        double spl = Math.PI * r * s; // casing
        return sp + spl; // surface
    }

    /**
     * Calculates volume without using any parameter
     *
     * @return volume
     */
    public double vypocitajObjem()
    {
        return (1.0 / 3.0) * Math.pow((Math.PI * r), 2) * v;
    }

    /**
     * Calculates surface without using any parameter
     *
     * @return surface
     */
    public double vypocitajPovrch()
    {
        double sp = Math.pow((Math.PI * r), 2); //foundation
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(v, 2)); //side
        double spl = Math.PI * r * s;  // casing
        return sp + spl; // surface
    }

    /**
     * Print out formatted output
     *
     * @return formatted output
     */
    public String toString()
    {
        return "Rotacny kuzel ma polomer " + r + "\na vysku " + v + " metrov" + "\nObjem je: " + vypocitajObjem() + " m^3" + "\nPovrch je: " + vypocitajPovrch() + "m^2.";
    }
}
