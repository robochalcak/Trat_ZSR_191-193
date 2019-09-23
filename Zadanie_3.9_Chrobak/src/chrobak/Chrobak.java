package chrobak;

/**
 * This class simulates a bug moving
 */
public class Chrobak  // class declaration
{
    private int pociatok; // holds a bug`s position

    /**
     * The constructor initializes a bug`s position
     *
     * @param pociatocnaPozicia
     */
    public Chrobak(int pociatocnaPozicia)
    {
        pociatok = pociatocnaPozicia;
    }

    /**
     * This method simulates a movment right, with incrementing the position
     */
    public void simulujPohyb()
    {
        pociatok++;
    }

    /**
     * This method change the direction and simulates movement left,  with setting the position on 0
     */
    public void zmenSmer()
    {
        pociatok --;
    }

    /**
     * This method returns a current position of the bug
     *
     * @return
     */
    public int getAktualnaPozicia()
    {
        return pociatok;
    }
}
