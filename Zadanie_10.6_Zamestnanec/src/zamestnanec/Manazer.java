package zamestnanec;

/**
 * This class creates manager and inherits from Employee-Zamestnanec
 */
public class Manazer extends Zamestnanec
{
    private String oddelenie; // holds info about department

    /**
     * Creates a new object without any parameter
     */
    public Manazer()
    {
        super();
    }

    /**
     * Creates a new object with using parameters:
     *
     * @param meno      name
     * @param oddelenie department
     * @param plat      salary
     */
    public Manazer(String meno, String oddelenie, double plat)
    {
        super(meno, plat);
        this.oddelenie = oddelenie;
    }

    /**
     * Sets department with parameter:
     *
     * @param oddelenie department
     */
    public void setOddelenie(String oddelenie)
    {
        this.oddelenie = oddelenie;
    }

    /**
     * Returns department
     *
     * @return department
     */
    public String getOddelenie()
    {
        return oddelenie;
    }

    /**
     * Creates and returns formatted output with all information about Manager
     *
     * @return formatted output
     */
    public String toString()
    {
        return "Manazer:\nMeno: " + getMeno() + "\nOddelenie: " + oddelenie + "\nPlat: " + getPlat() + "Eur.";
    }
}
