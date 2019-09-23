package motyl;

/**
 * This class simulates fly of butterfly
 */
public class Motyl
{

    private double pociatocnaCesta; // holds beginning position

    /**
     * Default constructor
     */
    public Motyl()
    {
        pociatocnaCesta = 0.0;
    }

    /**
     * Constructor initializes a variable pociatocna cesta
     *
     * @param pociatocnaCesta
     */
    public Motyl(double pociatocnaCesta)
    {
        this.pociatocnaCesta = pociatocnaCesta;
    }

    /**
     * This method simulates a movement to the light
     *
     * @param poziciaSvetla
     */
    public void pohybKSvetlu(double poziciaSvetla)
    {
        pociatocnaCesta = (poziciaSvetla + pociatocnaCesta) / 2.0;
    }

    /**
     * This method returns current position of the butterfly
     *
     * @return
     */
    public double getAktualnaPozicia()
    {
        return pociatocnaCesta;
    }
}
