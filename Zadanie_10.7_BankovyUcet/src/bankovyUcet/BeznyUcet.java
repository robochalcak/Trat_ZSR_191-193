package bankovyUcet;

/**
 * Ordinary bankAccount class - BeznyUcet provides basic operation with them
 * extends super class BankAccount - BankovyUcet
 */
public class BeznyUcet extends BankovyUcet
{
    private double poplatky; //holds cost per month

    /**
     * Creates a new object with parameters:
     *
     * @param pociatocnyZostatok starting balance
     * @param poplatky           cost per month
     */
    public BeznyUcet(double pociatocnyZostatok, double poplatky)
    {
        super(pociatocnyZostatok);
        this.poplatky = poplatky;
    }

    /**
     * Creates an object with zero starting ballance and with parameter:
     *
     * @param poplatky monthly costs
     */
    public BeznyUcet(double poplatky)
    {
        super(0);
        this.poplatky = poplatky;
    }

    /**
     * Creates an empty object of OrdinaryBankAccount-BeznyUcet
     */
    public BeznyUcet()
    {
        super(0);
        this.poplatky = 0;
    }

    /**
     * Sets cost with parameter:
     *
     * @param poplatky cost per month
     */
    public void setPoplatky(double poplatky)
    {
        this.poplatky = poplatky;
    }

    /**
     * Returns costs
     *
     * @return costs per month
     */
    public double getPoplatky()
    {
        return this.poplatky;
    }

    /**
     * Override method from super class subtract the monthly cost from
     * current balance. This method is inherited from super class BankAccount-BankovyUcet
     */
    @Override
    public void koniecMesiaca()
    {
        vyber(poplatky);
    }


}
