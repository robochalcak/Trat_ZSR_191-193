package osoba;

/**
 * This class creates an Instructor object with extending super class "Osoba" - Person
 * with adding information about salary
 */
public class Instruktor extends Osoba
{
    private double plat; // holds salary info

    /**
     * Creates an empty object of Instructor
     */
    public Instruktor()
    {
    }

    /**
     * Creates an object of Instructor, with parameters
     *
     * @param meno         name it is set to Super class
     * @param rokNarodenia year of birth is set to super class
     * @param plat         salary
     */
    public Instruktor(String meno, int rokNarodenia, double plat)
    {
        super(meno, rokNarodenia);
        this.plat = plat;
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
     * Returns salary
     *
     * @return salary
     */
    public double getPlat()
    {
        return plat;
    }

    /**
     * Returns formatted output with all information about Instructor
     *
     * @return all information about instructor in formatted output
     */
    public String toString()
    {
        return "Instruktor: \n" + "Meno: " + getMeno() + "\nRok narodenia: " + getRokNarodenia() + "\nPlat: " + plat + " Eur mesacne.";
    }
}
