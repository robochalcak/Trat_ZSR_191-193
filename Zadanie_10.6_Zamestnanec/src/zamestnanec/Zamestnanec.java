package zamestnanec;

/**
 * This class creates an employee class with its all attributes
 */
public class Zamestnanec
{
    private String meno; // holds name
    private double plat; // holds salary

    /**
     * Creates an empty object
     */
    public Zamestnanec()
    {
    }

    /**
     * Creates an object with parameters:
     *
     * @param meno name
     * @param plat salary
     */
    public Zamestnanec(String meno, double plat)
    {
        this.plat = plat;
        this.meno = meno;
    }

    /**
     * Sets name with parameter:
     *
     * @param meno name
     */
    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    /**
     * Sets salary with parameter:
     *
     * @param plat salary
     */
    public void setPlat(double plat)
    {
        this.plat = plat;
    }

    /**
     * Returns name
     *
     * @return name
     */
    public String getMeno()
    {
        return meno;
    }

    /**
     * Returns salary
     *
     * @return salary
     */
    public double getPlat()
    {
        return plat;
    }

    /**
     * Returns formatted output with all information about employee
     *
     * @return
     */
    public String toString()
    {
        return "Zamestnanec: \nMeno: " + meno + "\nPlat: " + plat + " eur.";
    }
}
