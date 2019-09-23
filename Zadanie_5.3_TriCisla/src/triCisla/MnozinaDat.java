package triCisla;

/**
 * This class can determine the smallest, medium and the largest number from three doubles
 */
public class MnozinaDat
{
    private double cislo1; // holds first number
    private double cislo2;  // holds second number
    private double cislo3;  // holds third number
    private double najmensie; // holds the smallest number
    private double stredne;   // holds a medium number
    private double najvacsie;  // holds the largest number

    /**
     * Default constructor initializes all variables with 0.0
     */
    public MnozinaDat()
    {
        cislo1 = 0.0;
        cislo2 = 0.0;
        cislo3 = 0.0;
        najmensie = 0.0;
        stredne = 0.0;
        najvacsie = 0.0;
    }

    /**
     * This Constructor initializes variables with parameter list
     *
     * @param cislo1
     * @param cislo2
     * @param cislo3
     */
    public MnozinaDat(double cislo1, double cislo2, double cislo3)
    {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
        this.cislo3 = cislo3;
        najmensie = 0.0;
        stredne = 0.0;
        najvacsie = 0.0;
    }

    /**
     * Sets number 1
     *
     * @param cislo1
     */
    public void setCislo1(double cislo1)
    {
        this.cislo1 = cislo1;
    }

    /**
     * Sets number 2
     *
     * @param cislo2
     */
    public void setCislo2(double cislo2)
    {
        this.cislo2 = cislo2;
    }

    /**
     * Sets number three
     *
     * @param cislo3
     */
    public void setCislo3(double cislo3)
    {
        this.cislo3 = cislo3;
    }

    /**
     * Returns number 1
     *
     * @return
     */
    public double getCislo1()
    {
        return cislo1;
    }

    /**
     * Returns number 2
     *
     * @return
     */
    public double getCislo2()
    {
        return cislo2;
    }

    /**
     * Returns number three
     *
     * @return
     */
    public double getCislo3()
    {
        return cislo3;
    }

    /**
     * This method sorst all numbers from lowest to highest
     */
    private void zotried()
    {
        if (cislo1 < cislo2 && cislo2 < cislo3)
        {
            najmensie = cislo1;
            stredne = cislo2;
            najvacsie = cislo3;
        }
        else if (cislo2 < cislo1 && cislo1 < cislo3)
        {
            najmensie = cislo2;
            stredne = cislo1;
            najvacsie = cislo3;
        }
        else if (cislo3 < cislo2 && cislo2 < cislo1)
        {
            najmensie = cislo3;
            stredne = cislo2;
            najvacsie = cislo1;
        }

        else if (cislo1 < cislo3 && cislo3 < cislo2)
        {
            najmensie = cislo1;
            stredne = cislo3;
            najvacsie = cislo2;
        }

        else if (cislo2 < cislo1 && cislo1 < cislo3)
        {
            najmensie = cislo2;
            stredne = cislo1;
            najvacsie = cislo3;
        }
        else if (cislo3 < cislo2 && cislo2 < cislo1)
        {
            najmensie = cislo3;
            stredne = cislo2;
            najvacsie = cislo1;
        }

        else if (cislo1 < cislo3 && cislo3 < cislo2)
        {
            najmensie = cislo1;
            stredne = cislo3;
            najvacsie = cislo2;
        }

        else if (cislo3 < cislo1 && cislo1 < cislo2)
        {
            najmensie = cislo3;
            stredne = cislo1;
            najvacsie = cislo2;
        }
        else if (cislo2 < cislo3 && cislo3 < cislo1)
        {
            najmensie = cislo2;
            stredne = cislo3;
            najvacsie = cislo1;
        }
    }

    /**
     * Returns the smallest number
     *
     * @return
     */
    public double getNajmensie()
    {
        zotried();
        return najmensie;
    }

    /**
     * Returns the medium number
     *
     * @return
     */
    public double getProstredne()
    {
        zotried();
        return stredne;
    }

    /**
     * Returns the highest number
     *
     * @return
     */
    public double getNajvacsie()
    {
        zotried();
        return najvacsie;
    }
}
