package minca;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class simulates cash register
 */
public class Pokladna
{


    private double aktualnaHotovost; // holds how much gives customer
    private double platba;    // holds how much must the customer pay
    private int pocet;

    /**
     * Creates a new object of cash register without any parameter
     */
    public Pokladna()
    {
        aktualnaHotovost = 0;
        platba = 0;
        pocet = 0;
    }

    /**
     * Loads and accumulates all prices of all goods
     *
     * @param hodnotaTovaru
     */
    public void nacitajTovar(double hodnotaTovaru)
    {
        platba += hodnotaTovaru;
    }

    /**
     * Accepts money from customer
     *
     * @param kusy  it takes how many of pieces of each type of coin
     * @param minca this objcet holds a value and name of coin
     */
    public void prijmiHotovost(int kusy, Minca minca)
    {
        aktualnaHotovost += (kusy * minca.getHodnota());
    }

    /**
     * Pay back if, the customer pay more than necessary
     *
     * @return
     */
    public double datVydavok()
    {
        return zaokruhli(aktualnaHotovost - platba, 2);
    }

    /**
     * Calculates and returns how many types of each coin it is necessary to return back
     *
     * @param typMince
     * @return number of each coin to return back
     */
    public int dajVydavok(Minca typMince)
    {
        if (typMince.getHodnota() <= datVydavok())
        {

            aktualnaHotovost -= typMince.getHodnota();
            pocet++;
        }
        else
        {
            pocet = 0;
        }

        return pocet;
    }

    /**
     * This private method rounds the value of pay back
     *
     * @param hodnota   how much is necessary to return back
     * @param desMiesta on how many decimal places it will be rounded
     * @return
     */
    private double zaokruhli(double hodnota, int desMiesta)
    {
        BigDecimal bd = new BigDecimal((Double.toString(hodnota)));
        bd = bd.setScale(desMiesta, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
