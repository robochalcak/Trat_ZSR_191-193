package fibonacci;

import java.math.BigInteger;

/**
 * This class provides a Fibonacci series of numbers according user`s input
 */
public class GeneratorFibonaccihoPostupnosti
{
    private int cislo; // holds number entered by user

    /**
     * Default constructor initializes number with 0
     */
    public GeneratorFibonaccihoPostupnosti()
    {
        cislo = 0;
    }

    /**
     * Parametric constructor initializes number with user`s input
     *
     * @param cislo
     */
    public GeneratorFibonaccihoPostupnosti(int cislo)
    {
        this.cislo = cislo;
    }

    /**
     * Sets number
     *
     * @param cislo
     */
    public void setCislo(int cislo)
    {
        this.cislo = cislo;
    }

    /**
     * Returns number
     *
     * @return
     */
    public int getCislo()
    {
        return cislo;
    }

    /**
     * Calculates and print fibonacci series of numbers
     */
    public void dalsieCislo()
    {

        BigInteger f1 = new BigInteger("0");
        BigInteger f2 = new BigInteger("1");

        for (int i = 2; i <= cislo; i++)
        {
            System.out.println(f1 + "");
            f1 = f1.add(f2);
            f2 = f1.subtract(f2);
        }
    }
}
