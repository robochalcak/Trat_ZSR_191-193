package mnozinaDat;

/**
 * This class provides basic mathematical operation with numbers in set
 */
public class MnozinaDat // class declaration
{

    private int sucet; // hold addition of all entered numbers
    private int pocet;  // holds number of entered numbers

    /**
     * Default constructor initializes all variables on 0
     */
    public MnozinaDat()
    {
        sucet=0;
        pocet = 0;
    }

    /**
     * Parametric constructor
     * @param cislo
     */
    public MnozinaDat(int cislo)
    {
        sucet +=cislo;
        pocet++;
    }

    /**
     * Add number in to set and increments number of entered numbers by 1
     * @param cislo
     */
    public void pridajCislo(int cislo)
    {
        sucet +=cislo;
        pocet++;
    }
    /**
     * Returns an average of all entered numbers
     */
    public double getPriemer()
    {
        return (double) sucet / (double) pocet;
    }

    /**
     * Return total of all entered numbers
     * @return
     */
    public int getSucet()
    {
        return sucet;
    }
}
