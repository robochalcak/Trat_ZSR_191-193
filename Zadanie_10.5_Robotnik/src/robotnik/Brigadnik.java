package robotnik;

/**
 * This class extends super class "Robotnik"-Worker and inherits  all common methods and variables
 * calculates and returns salary for part time worker
 */
public class Brigadnik extends Robotnik
{
    private int pocetHodin; // holds number of hours
    private static final double NAD_CAS = 0.50; // holds over time pay coefficient
    private static final int ZAKLAD = 20; //holds ordinary time spent in work

    /**
     * Creates a new object of part time worker with parameters
     *
     * @param meno    name
     * @param hodMzda pay rate
     */
    public Brigadnik(String meno, double hodMzda)
    {
        super(meno, hodMzda);
        setMzda(0);
    }

    /**
     * Sets number of hours in work with parameter
     *
     * @param pocetHodin number of hours
     */
    public void setPocetHodin(int pocetHodin)
    {
        this.pocetHodin = pocetHodin;
    }

    /**
     * Returns number hours spent in work
     *
     * @return number of hours
     */
    public int getPocetHodin()
    {
        return pocetHodin;
    }

    /**
     * Overrided method calculates and returns salary
     *
     * @param pocetHodin number of hours spent in work
     * @return salary
     */
    @Override
    public double vypocitajMzdu(int pocetHodin)
    {

        if (pocetHodin <= 20)
        {
            setMzda(pocetHodin * getHodMzda());
        }
        else
        {
            setMzda((pocetHodin * getHodMzda()) + ((pocetHodin - ZAKLAD) * getHodMzda()) * NAD_CAS);
        }
        return getMzda();
    }

    /**
     * Returns  formatted output, with all information about full time worker
     *
     * @return
     */
    public String toString()
    {
        return "Brigadnik: \n" + "Meno:" + getMeno() + "\nHodinova Sadzba v Eur: " + getHodMzda() + "\nPocet odpracovanych " + "hodin: " + getPocetHodin() + "\nSuma k vyplate: %.2f" + getMzda() + " Eur.";
    }
}
