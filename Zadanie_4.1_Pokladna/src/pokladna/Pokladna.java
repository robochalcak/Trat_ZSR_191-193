package pokladna;

/**
 * This class demonstrates a cash register task
 */
public class Pokladna // class declaration
{
    private double prijataHotovost; // holds payment in cash
    private double cenaNaskenovanychTovarov; // holds a sum of all scanned goods
    private final double EURO = 1.0;  // holds a constant value of 1 euro
    private final double CENT50 = 0.50; // holds a constant value of 50 cents
    private final double CENT20 = 0.20; // holds a constant value of 20 cents
    private final double CENT10 = 0.10; // holds a constant value of 10 cents
    private final double CENT5 = 0.05; // holds a constant value of 5 cent
    private final double CENT2 = 0.02; // holds a constant value of 2 cent
    private final double CENT1 = 0.01; // holds a constant value of 1 cent

    /**
     * Default constructor initializes a variables on 0
     */
    public Pokladna()
    {
        prijataHotovost = 0;
        cenaNaskenovanychTovarov = 0;
    }

    /**
     * This method provides scanning of goods and its price stores int cenaNaskenovanychTovarov
     *
     * @param cena
     */
    public void naskenujTovar(double cena)
    {
        cenaNaskenovanychTovarov += cena;
    }

    /**
     * This method pay back an extra cash
     *
     * @return
     */
    public double vratVydavok()
    {
        return prijataHotovost - cenaNaskenovanychTovarov;
    }

    /**
     * This method accepts number of pieces 1 euro and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmyEura(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * EURO);
    }

    /**
     * This method accepts number of pieces 50 cents and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy50Centovky(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT50);
    }

    /**
     * This method accepts number of pieces 20 cents and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy20Centov(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT20);
    }

    /**
     * This method accepts number of pieces 10 cents and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy10Centov(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT10);
    }

    /**
     * This method accepts number of pieces 5 cents and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy5Centov(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT5);
    }

    /**
     * This method accepts number of pieces 2 cents and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy2Centy(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT2);
    }

    /**
     * This method accepts number of pieces 1 cent and
     * stores in cash
     *
     * @param pocetKusov
     */
    public void prijmy1Cent(int pocetKusov)
    {
        prijataHotovost += (pocetKusov * CENT1);
    }
}
