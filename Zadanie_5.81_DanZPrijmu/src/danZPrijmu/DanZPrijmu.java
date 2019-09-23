package danZPrijmu;

/**
 * This class provides calculation of tax of the income
 * It works like a progressive tax rate
 * The rates are imaginary and the purpose of the program is how it can be used for taxation office or
 * for any person, who would like to find how much he or she will pay tax from his income,salary and etc.
 */
public class DanZPrijmu
{
    private static final double NIZKA_HRANICA = 4500; // holds the lowest limit of income
    private static final double STREDNA_HRANICA = 8000; // holds middle limit of income
    private static final double NIZKA_SADZBA = 0.20; // holds the lowest rate
    private static final double STREDNA_SADZBA = 0.30; // holds middle rate
    private static final double VYSOKA_SADZBA = 0.45; // holds the highest tax rate

    private double mzda; // holds income

    /**
     * This default parametric constructor creates a new object of income tax
     */
    public DanZPrijmu()
    {
        mzda = 0;
    }

    /**
     * This parametric constructor creates a new object of income tax with income argument
     *
     * @param mzda
     */
    public DanZPrijmu(double mzda)
    {
        this.mzda = mzda;
    }

    /**
     * This setter method sets the income for calculation of the tax
     *
     * @param mzda
     */
    public void setMzda(double mzda)
    {
        this.mzda = mzda;
    }

    /**
     * This method calculates and returns the rate in percentage
     *
     * @return
     */
    public double getSadba()
    {
        return (getDan() / getMzda()) * 100;
    }

    /**
     * This getter method returns income
     *
     * @return
     */
    public double getMzda()
    {
        return mzda;
    }

    /**
     * This method calculates and returns the amount of tax.
     *
     * @return
     */
    public double getDan()
    {
        if (mzda <= NIZKA_HRANICA)
        {
            return mzda * NIZKA_SADZBA;
        }
        else if (mzda > NIZKA_HRANICA && mzda <= STREDNA_HRANICA)
        {
            return ((mzda - NIZKA_HRANICA) * STREDNA_SADZBA) + (NIZKA_SADZBA * NIZKA_HRANICA);
        }
        else
        {
            return ((mzda - STREDNA_HRANICA) * VYSOKA_SADZBA) + ((STREDNA_HRANICA - NIZKA_HRANICA) * STREDNA_SADZBA) + ((NIZKA_HRANICA * NIZKA_SADZBA));
        }
    }


}
