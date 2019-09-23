package pokladna;

/**
 * This class provides behavior of bank note
 */
public class Bankovka
{
    private String typBankovky; // holds type of bank note
    private double hodnotaBankovky; // holds a value of the bank note

    /**
     * Creates a new object without any parameter
     */
    public Bankovka()
    {
        typBankovky = null;
        hodnotaBankovky = 0;
    }

    /**
     * Creates a new object with parameters
     *
     * @param typBankovky     type of bank note
     * @param hodnotaBankovky value of bank note
     */
    public Bankovka(String typBankovky, double hodnotaBankovky)
    {
        this.hodnotaBankovky = hodnotaBankovky;
        this.typBankovky = typBankovky;
    }

    /**
     * Creates a new object with parameters
     *
     * @param hodnotaBankovky value of bank note
     * @param typBankovky     type of bank note
     */
    public Bankovka(double hodnotaBankovky, String typBankovky)
    {
        this.hodnotaBankovky = hodnotaBankovky;
        this.typBankovky = typBankovky;
    }

    /**
     * Sets the type of bank note
     *
     * @param typBankovky
     */
    public void setTypBankovky(String typBankovky)
    {
        this.typBankovky = typBankovky;
    }

    /**
     * Sets the value of bank note
     *
     * @param hodnotaBankovky
     */
    public void setHodnotaBankovky(double hodnotaBankovky)
    {
        this.hodnotaBankovky = hodnotaBankovky;
    }

    /**
     * Returns the type of bank note
     *
     * @return
     */
    public String getTypBankovky()
    {
        return typBankovky;
    }

    /**
     * Returns the value of bank note
     *
     * @return
     */
    public double getHodnotaBankovky()
    {
        return hodnotaBankovky;
    }

    /**
     * Returns value and type of bank note in proper format
     *
     * @return
     */
    public String toString()
    {
        return "Typ bankovky: " + typBankovky + "\nHodnota: " + hodnotaBankovky;
    }
}
