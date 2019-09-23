package sporiaciUcet;

/**
 * This class creates a bank saving account and add an interest rate counted  from the
 * smallest balance
 */
public class SporiaciUcet
{
    private double aktualnyZostatok; // holds a current ballance
    private double najnizsiZostatok;  // holds the smallest current ballance
    private double urokovaSadzba;  // holds an interest rate

    /**
     * Creates a new object with parameter
     *
     * @param urokovaSadzba interest rate
     */
    public SporiaciUcet(double urokovaSadzba)
    {
        this.urokovaSadzba = urokovaSadzba;
        najnizsiZostatok = 0;
        aktualnyZostatok = 0;
    }

    /**
     * This method pay in an amount of money specified by parameter:
     *
     * @param ciastka amount of money
     */
    public void vloz(double ciastka)
    {
        najnizsiZostatok = aktualnyZostatok;
        aktualnyZostatok += ciastka;
    }

    /**
     * Add an interest rate to current bank account the rate is calculated
     * from the lowest balance
     */
    public void zapisUrok()
    {
        if (najnizsiZostatok == 0)
        {
            aktualnyZostatok += (aktualnyZostatok * (urokovaSadzba / 100));
        }
        else
        {
            aktualnyZostatok += (najnizsiZostatok * (urokovaSadzba / 100));
        }

    }

    /**
     * This method provides withdraw from bank account and stores the smallest balance
     *
     * @param ciastka
     */
    public void vyber(int ciastka)
    {
        aktualnyZostatok -= ciastka;
        najnizsiZostatok = aktualnyZostatok;
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
