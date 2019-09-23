package osoba;

/**
 * This class creates a Person, with providing basic information like name and year of birth
 */
public class Osoba
{
    private String meno; // Holds person`s name
    private int rokNarodenia; // Holds person`s year of birth

    /**
     * Creates an empty object of Person
     */
    public Osoba()
    {

    }

    /**
     * Creates an object with using parameters:
     *
     * @param meno         name of Person
     * @param rokNarodenia year of birth
     */
    public Osoba(String meno, int rokNarodenia)
    {
        this.meno = meno;
        this.rokNarodenia = rokNarodenia;
    }

    /**
     * Sets name of the person with parameter:
     *
     * @param meno name of person
     */
    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    /**
     * Sets year of birth with using parameter
     *
     * @param rokNarodenia year of birth
     */
    public void setRokNarodenia(int rokNarodenia)
    {
        this.rokNarodenia = rokNarodenia;
    }

    /**
     * Returns name of the person
     *
     * @return name
     */
    public String getMeno()
    {
        return meno;
    }

    /**
     * Returns year of birth
     *
     * @return year of birth
     */
    public int getRokNarodenia()
    {
        return rokNarodenia;
    }

    /**
     * Returns formatted output
     *
     * @return formatted output
     */
    public String toString()
    {
        return "Osoba: \nMeno: " + meno + "\nRokNarodenia: " + rokNarodenia;
    }
}

