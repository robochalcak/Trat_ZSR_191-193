package tovar;

/**
 * Tovar obsahuje nazov a cenu.
 */
public class Tovar   // class declaration
{
    private String nazov; // holds name of goods
    private double cena;  // holds price of goods

    /**
     * Constructor initializes variables with parameters
     *
     * @param nazov
     * @param cena
     */
    public Tovar(String nazov, double cena)
    {
        this.nazov = nazov;
        this.cena = cena;
    }

    /**
     * This method returns good`s name
     *
     * @return
     */
    public String getNazov()
    {
        return nazov;
    }

    /**
     * This method returns a price
     *
     * @return
     */
    public double getCena()
    {
        return cena;
    }

    /**
     * This method provides decrease price with user selected amount
     *
     * @param ciastka
     */
    public void znizCenu(double ciastka)
    {
        cena = cena - ciastka;
    }
}
