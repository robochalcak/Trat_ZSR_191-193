package pokladna;

/**
 * This class provides behaviour of coins
 */
public class Minca
{
    private String nazovMince; // holds a name of type of coins
    private double hodnota; // holds a value of coin

    /**
     * Creates a new coin object without any parameter
     */
    public Minca()
    {
        nazovMince = null;
        hodnota = 0;
    }

    /**
     * Creates a new object with two parameters
     *
     * @param nazovMince name of coin
     * @param hodnota    value of coin
     */
    public Minca(String nazovMince, double hodnota)
    {
        this.nazovMince = nazovMince;
        this.hodnota = hodnota;
    }

    public Minca(double hodnota, String nazovMince)
    {
        this.hodnota = hodnota;
        this.nazovMince = nazovMince;
    }

    /**
     * Sets the name of coin
     *
     * @param nazovMince
     */
    public void setNazovMince(String nazovMince)
    {
        this.nazovMince = nazovMince;
    }

    /**
     * Sets the value of coin
     *
     * @param hodnota
     */
    public void setHodnota(double hodnota)
    {
        this.hodnota = hodnota;
    }

    /**
     * Returns name of coin
     *
     * @return
     */
    public String getNazovMince()
    {
        return nazovMince;
    }

    /**
     * Returns the value of coin
     *
     * @return
     */
    public double getHodnota()
    {
        return hodnota;
    }

    /**
     * Returns a formatted output with all information about object
     *
     * @return
     */
    public String toString()
    {
        return "Nazov mince: " + nazovMince + "\nHodnota: " + hodnota;
    }
}
