package bankovyUcetTester; // package location

/**
 * This class stores performs pay in, withdraw and display current bank account balance
 */
public class BankovyUcet   // class declaration
{

    private double zostatok;  // stores actual balance

    /**
     * Default constructor without any parameters.
     */
    public BankovyUcet()
    {
        // balance is set on 0.0
    }

    /**
     * This constructor takes one parameter pay in
     *
     * @param vklad
     */
    public BankovyUcet(double vklad)
    {
        zostatok += vklad;  // add pay in to balance
    }

    /**
     * This method provides pay in service and add to current balance
     *
     * @param vklad
     */

    public void vloz(double vklad)
    {
        zostatok += vklad;
    }

    /**
     * This method provides withdraw from bank account and subtracts from current balance
     *
     * @param vyber
     */
    public void vyber(double vyber)
    {
        zostatok -= vyber;
    }

    /**
     * This method returns an actual balance
     *
     * @return
     */
    public double getAktualnyZostatok()
    {
        return zostatok;
    }
}
