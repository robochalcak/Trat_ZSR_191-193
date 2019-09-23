package priestupnyRok;

/**
 * This class tests if entered year is leap or not
 */
public class Rok
{
    private int rok; // holds year entered by user

    /**
     * Constructor initializes a variable year
     *
     * @param rok
     */
    public Rok(int rok)
    {
        this.rok = rok;
    }

    /**
     * This method returns true if entered year is leap, otherwise returns false
     *
     * @return
     */
    public boolean jePriestupny()
    {
        if ((rok % 4 == 0) && (rok % 100 != 0) || (rok % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
