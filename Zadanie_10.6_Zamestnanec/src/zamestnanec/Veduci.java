package zamestnanec;

/**
 * This class is about TeamLeader and extends Manager -"Manazer" class
 */
public class Veduci extends Manazer
{
    /**
     * Creates an empty object without any parameter
     */
    public Veduci()
    {
        super();
    }

    /**
     * Creates a new Object with parameters:
     *
     * @param meno name
     * @param usek department
     * @param plat salary
     */
    public Veduci(String meno, String usek, double plat)
    {
        super(meno, usek, plat);
    }

    /**
     * Returns a formatted output with all information about Team leader
     *
     * @return formatted output
     */
    public String toString()
    {
        return "Veduci: \nMeno: " + getMeno() + "\nPlat: " + getPlat() + "Eur.\nOddelenie: " + getOddelenie();
    }


}
