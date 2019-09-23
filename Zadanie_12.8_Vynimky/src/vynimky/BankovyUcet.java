package vynimky;

/**
 * This class simulates basic operations with bank account and uses it`s own exceptions classes
 */
public class BankovyUcet
{
    private double aktualnyZostatok; //holds balance

    /**
     * Creates a new object with using parameters
     *
     * @param aktualnyZostatok current balance, with will be added to bank account balance
     * @throws NegativnyUcetException if the balance is less than 0
     */
    public BankovyUcet(double aktualnyZostatok) throws NegativnyUcetException
    {
        if (aktualnyZostatok < 0)
        {
            throw new NegativnyUcetException();
        }

        this.aktualnyZostatok = aktualnyZostatok;
    }

    /**
     * Creates an empty bank account object
     */
    public BankovyUcet()
    {
        this.aktualnyZostatok = 0;
    }

    /**
     * Pay in a money
     *
     * @param ciastka amount of money to save in to bank account
     * @throws NegativnaCiastkaException if the amount of money is less than 0
     */
    public void vloz(double ciastka) throws NegativnaCiastkaException
    {
        if (ciastka < 0)
        {
            throw new NegativnaCiastkaException();
        }
        this.aktualnyZostatok += ciastka;
    }

    /**
     * Withdraws amount of money from bank account and subtract it from current balance
     *
     * @param ciastka amount of money to withdraw
     * @throws NegativnaCiastkaException if the amount is negative
     * @throws PrevysujuciException      if the amount is more than current balance
     */
    public void vyber(double ciastka) throws NegativnaCiastkaException, PrevysujuciException
    {
        if (ciastka < 0 || ciastka > aktualnyZostatok)
        {
            throw new PrevysujuciException();
        }
        this.aktualnyZostatok -= ciastka;
    }

    /**
     * Returns current balance
     *
     * @return
     */
    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
