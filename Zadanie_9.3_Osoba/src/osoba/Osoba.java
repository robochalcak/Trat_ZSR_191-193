package osoba;

/**
 * This class define a person
 */
public class Osoba implements InfoOsoba
{
    private String meno; // holds name
    private double vyska; // holds high

    /**
     * Create a empty object
     */
    public Osoba()
    {
    }

    /**
     * Creates a new object with using parameters
     *
     * @param meno  name
     * @param vyska high
     */
    public Osoba(String meno, double vyska)
    {
        this.meno = meno;
        this.vyska = vyska;
    }

    /**
     * Sets the name of the person
     *
     * @param meno
     */
    @Override
    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    /**
     * Sets a high of the person
     *
     * @param vyska
     */
    @Override
    public void setVyska(double vyska)
    {
        this.vyska = vyska;
    }

    /**
     * Returns a name of the person
     *
     * @return
     */
    @Override
    public String getMeno()
    {
        return this.meno;
    }

    /**
     * Returns a high of the person
     *
     * @return
     */
    @Override
    public double getVyska()
    {
        return this.vyska;
    }

    /**
     * Returns a formatted output of the person
     *
     * @return
     */
    public String toString()
    {
        return "Meno: " + meno + "\nVyska: " + vyska;
    }
}
