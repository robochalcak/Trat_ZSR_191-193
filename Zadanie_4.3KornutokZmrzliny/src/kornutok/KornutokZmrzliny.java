package kornutok;

/**
 * This class calculates a volume and area of ice cream cone
 */
public class KornutokZmrzliny // class declaration
{
    private double polomer;  // radius
    private double vyska;    // height

    /**
     * A Default constructor initializes all variables with value 0;
     */
    public KornutokZmrzliny()
    {
        polomer = 0;  // radius
        vyska = 0;    // height
    }

    /**
     * This constructor sets varibles with arguments
     *
     * @param polomer
     * @param vyska
     */
    public KornutokZmrzliny(double polomer, double vyska)
    {
        this.polomer = polomer;
        this.vyska = vyska;
    }

    /**
     * This method returns a volume of the cone
     *
     * @return
     */
    public double getObjem()
    {
        double objem = (1.0 / 3.0) * (Math.PI * (Math.pow(polomer, 2)) * vyska);
        return objem;
    }

    /**
     * This method returns an area of the cone without foundation
     *
     * @return
     */
    public double getPovrch()
    {
        double strana = Math.sqrt((Math.pow(polomer, 2)) + (Math.pow(vyska, 2)));
        double povrch = Math.PI * polomer * strana;
        return povrch;
    }
}
