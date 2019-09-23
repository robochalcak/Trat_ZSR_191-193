package dveCisla; // package location

import static java.lang.Math.abs; // necessary for math operation

/**
 * Class provides required math operations with two real numbers
 */
public class Dvojica  // class declaration
{
    private double prveCislo; // holds first number
    private double druheCislo; // holds second number

    /**
     * Constructor initializes two variables with two arguments
     *
     * @param prveCislo
     * @param druheCiso
     */
    public Dvojica(double prveCislo, double druheCiso)
    {
        this.prveCislo = prveCislo;
        this.druheCislo = druheCiso;
    }

    /**
     * Returns a result of addition
     *
     * @return
     */
    public double getSucet()
    {
        return prveCislo + druheCislo;
    }

    /**
     * Returns subtract two numbers
     *
     * @return
     */
    public double getRozdiel()
    {
        double rozdiel = prveCislo - druheCislo;
        double zaokruhlene = Math.round((rozdiel * Math.pow(10, 2))) / Math.pow(10, 2);
        return zaokruhlene;
    }

    /**
     * Returns result of multiplying two numbers
     *
     * @return
     */
    public double getSucin()
    {
        double sucin;
        sucin = prveCislo * druheCislo;
        double zaokruhlene;
        zaokruhlene = Math.round((sucin * Math.pow(10, 2))) / Math.pow(10, 2);
        return zaokruhlene;
    }

    /**
     * Returns an average of two numbers
     *
     * @return
     */
    public double getPriemer()
    {
        return (prveCislo + druheCislo) / 2.0;
    }

    /**
     * Return absolute value of distance from subtracting  of two numbers
     *
     * @return
     */
    public double getVzdialenost()
    {
        double vzdialenost = prveCislo - druheCislo;
        double zaokruhlene = Math.round((vzdialenost * Math.pow(10, 2))) / Math.pow(10, 2);
        return abs(zaokruhlene);
    }

    /**
     * Returns the highest number from two values
     *
     * @return
     */
    public double getNajvacsieCislo()
    {
        return Math.max(prveCislo, druheCislo);
    }

    /**
     * Returns the lowest number from two values
     *
     * @return
     */
    public double getNajmensieCislo()
    {
        return Math.min(prveCislo, druheCislo);
    }
}
