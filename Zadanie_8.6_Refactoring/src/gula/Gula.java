package gula;

/**
 * This class calculates surface and volume of the sphere
 */
public class Gula
{
    private double r; // holds radian

    /**
     * Creates a new object with using parameter
     *
     * @param r radius
     */
    public Gula(double r)
    {
        this.r = r;
    }

    /**
     * Creates a new object without using any parameter
     */
    public Gula()
    {

    }

    /**
     * Sets radius with parameter
     *
     * @param r radius
     */
    public void setR(double r)
    {
        this.r = r;
    }

    /**
     * @return radius
     */
    public double getR()
    {
        return r;
    }

    /**
     * Calculates volume of the sphere with using parameter
     *
     * @param r radius
     * @return volume of the sphere
     */
    public double vypociajObjemGule(double r)
    {
        return ((4.0 / 3.0) * Math.PI) * Math.pow(r, 3);
    }

    /**
     * Calculates surface of the sphere with using parameter
     *
     * @param r radius
     * @return surface
     */
    public double vypocitajPovrchGule(double r)
    {
        return (4.0 * Math.PI) * Math.pow(r, 2);
    }

    /**
     * Calculates volume of the sphere without using any parameter
     *
     * @return volume
     */
    public double vypociajObjemGule()
    {
        return ((4.0 / 3.0) * Math.PI) * Math.pow(r, 3);
    }

    /**
     * Calculates surface of the sphere without using any parameter
     *
     * @return surface
     */
    public double vypocitajPovrchGule()
    {
        return (4.0 * Math.PI) * Math.pow(r, 2);
    }

    /**
     * @return formatted output with all information about sphere
     */
    public String toString()
    {
        return "Polomer gule: " + r + "\nObjem gule je: " + vypociajObjemGule() + "m^2" + "\nPovrch gule je: " + vypocitajPovrchGule() + "m^3";
    }
}
