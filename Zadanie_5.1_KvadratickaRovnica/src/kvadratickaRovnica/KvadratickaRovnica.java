package kvadratickaRovnica;

/**
 * This class calculates and after finds solutions of quadratic equation
 */
public class KvadratickaRovnica // class declaration
{
    private int a;    // holds 'A' constant entered by user
    private int b;    // holds 'B' constant entered by user
    private int c;    // holds 'C' constant entered by user
    private double diskriminant; // holds discriminant value
    private double riesenie1;    // holds first root, determined according its size
    private double riesenie2;   // holds second root, determined according its size

    /**
     * This constructor initializes all values, first three with arguments and rest tree with 0
     *
     * @param a
     * @param b
     * @param c
     */
    public KvadratickaRovnica(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        riesenie1 = 0;
        riesenie2 = 0;
        diskriminant = 0;
    }

    /**
     * Return true if the discriminant is equal or higher than 0, otherwise returns false
     *
     * @return
     */
    public boolean jeRiesitelna()
    {
        if (diskriminant < 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    /**
     * Returns a message, that the equation does not have any solution, or one, or more solutions
     *
     * @return
     */
    public String kolkoRieseni()
    {
        String riesenia = "";

        if (!jeRiesitelna())
        {
            riesenia = "Rovnica nema riesenie.";
        }
        else
        {
            if (diskriminant == 0)
            {
                riesenia = "Rovnica ma jedno riesenie.";
            }
            else if (diskriminant > 0)
            {
                riesenia = "Rovnica ma viac rieseni. ";
            }
        }
        return riesenia;
    }

    /**
     * Returns the first solution, which is smaller than second one, ant provides calculation
     *
     * @return
     */
    public double getRiesenie1()
    {
        diskriminant = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

        double root1 = (-b + diskriminant) / (2 * a);
        double root2 = (-b - diskriminant) / (2 * a);
        riesenie1 = Math.min(root1, root2);
        riesenie2 = Math.max(root1, root2);
        return riesenie1;
    }

    /**
     * Returns solution 2, which one is higher
     *
     * @return
     */
    public double getRiesenie2()
    {
        return riesenie2;
    }
}
