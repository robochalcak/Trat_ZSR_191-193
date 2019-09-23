package robotnik;

/**
 * Creates a full time worker class with extending super class "Robotnik"-Worker
 */
public class TPPZamestnanec extends Robotnik
{
    private static final double POCET_HODIN = 40; // holds fixed number of payed hours

    /**
     * Creates a new Object of full time worker with parameters:
     *
     * @param meno    name
     * @param hodMzda hourly pay rate
     */
    public TPPZamestnanec(String meno, double hodMzda)
    {
        super(meno, hodMzda);
        setMzda(0);
    }

    /**
     * Overrided method from super class calculates a full time worker salary
     *
     * @param pocetHodin number of hours spent in work
     * @return salary
     */
    @Override
    public double vypocitajMzdu(int pocetHodin)
    {
        setMzda(POCET_HODIN * getHodMzda());
        return getMzda();
    }

    /**
     * Returns formatted output with information about full time worker
     *
     * @return
     */
    public String toString()
    {
        return "TPP Zamestnanec: \n" + "Meno: " + getMeno() + "\n Hodinova Mzda v Eur: " + getHodMzda() + "\nSuma k vyplate: " + "%.2f" + getMzda() + " Eur.";
    }
}
