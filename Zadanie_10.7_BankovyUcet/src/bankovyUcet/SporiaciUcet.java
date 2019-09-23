package bankovyUcet;

/**
 * The savingAccount class extends BankAccount class- BankovyUcet and
 * provides basic operation with them
 */
public class SporiaciUcet extends BankovyUcet
{
    private double urok; //holds interest rate

    /**
     * Creates a Saving account with starting balance and interest rate
     * @param pociatocnyZostatok starting balance
     * @param urok interest rate
     */
    public SporiaciUcet(double pociatocnyZostatok, double urok)
    {
        super(pociatocnyZostatok);
        this.urok=urok;
    }

    /**
     * Creates a Saving account object with interest rate
     * @param urok interest rate
     */
    public SporiaciUcet(double urok)
    {
        super(0);
        this.urok=urok;
    }

    /**
     * Creates an empty object of Saving account
     */
    public SporiaciUcet()
    {
        super(0);
        this.urok=0;
    }

    /**
     * Sets interest rate for the saving account
     * @param urok
     */
    public void setUrok(double urok)
    {
        this.urok=urok/100;
    }

    /**
     * Returns the interest rate from savingAccount
     * @return interest rate
     */
    public double getUrok()
    {
        return this.urok;
    }

    /**
     * Add saving to the current balance
     * This method is inherited from abstract class BankAccount - BankovyUcet
     */
    @Override
    public void koniecMesiaca()
    {
        vloz(getAktualnyZostatok()*(urok/100));
    }


}
