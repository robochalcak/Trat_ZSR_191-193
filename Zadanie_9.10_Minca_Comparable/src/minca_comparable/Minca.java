package minca_comparable;

/**
 * This class provides simulation of coins
 */
public class Minca implements Comparable<Minca>
{
    private String typMince; // holds type of coin
    private double hodnota; // holds a value of coin

    /**
     * Crreates a new object with using parameters typ and value of coin
     */
    public Minca(String typMince, double hodnota)
    {
        this.typMince = typMince;
        this.hodnota = hodnota;
    }

    /**
     * Returns type of coin
     *
     * @return type of coin
     */
    public String getTypMince()
    {
        return typMince;
    }

    /**
     * Sets type of coin with using parameter
     *
     * @param typMince type of coin
     */
    public void setTypMince(String typMince)
    {
        this.typMince = typMince;
    }

    /**
     * Returns value of coin
     *
     * @return value of coin
     */
    public double getHodnota()
    {
        return hodnota;
    }

    /**
     * Sets value of coin with using parameter
     *
     * @param hodnota value of coin
     */
    public void setHodnota(double hodnota)
    {
        this.hodnota = hodnota;
    }

    /**
     * Returns formatted output of coin
     *
     * @return
     */
    public String toString()
    {
        return "Typ mince: " + typMince + " Hodnota: " + hodnota;
    }

    /**
     * Overrided method compares whole object of coin
     *
     * @param o takes another object of coin as a parameter
     * @return 1 if this coin is greather than another, 0 if is equal or -1 if is smaller
     */
    @Override
    public int compareTo(Minca o)
    {
        if (this.typMince.equals(o.typMince) && this.hodnota > o.hodnota)
        {
            return 0;
        }
        else if (this.typMince.length() < o.typMince.length() && this.hodnota < o.hodnota)
        {
            return -1;
        }
        else
        {
            return 1;
        }

    }
}
