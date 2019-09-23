package mnozinaDat;

import java.util.ArrayList;

/**
 * This class stores all data from Die class
 */
public class MnozinaDat
{
    private ArrayList<Integer> cisla; // holds numbers from throwing the die
    private Kocka kocka; // new instance of the Die class

    /**
     * Creates a new object without any argument
     */
    public MnozinaDat()
    {
        cisla = new ArrayList<Integer>();
    }

    /**
     * Provides one throw with die
     *
     * @param kocka object of the die
     */
    public void hodKockou(Kocka kocka)
    {
        kocka.hod();
        cisla.add(kocka.getCislo());
    }

    /**
     * Provides number of throwing with die, specified by user
     *
     * @param pocetHodov number of throwing with die
     * @param kocka      object od die
     */
    public void hodKockou(int pocetHodov, Kocka kocka)
    {
        for (int i = 1; i <= pocetHodov; i++)
        {
            kocka.hod();
            cisla.add(kocka.getCislo());
        }
    }

    /**
     * Returns the lowest value from number of throwing
     *
     * @return the lowest value
     */
    public int getMinimum()
    {
        int minimum = cisla.get(0);

        for (int i = 1; i < cisla.size(); i++)
        {
            if (cisla.get(i) < minimum)
            {
                minimum = cisla.get(i);
            }
        }
        return minimum;
    }

    /**
     * Returns the highest value from number of throwing with die
     *
     * @return the highest value
     */
    public int getMaximum()
    {
        int maximum = cisla.get(0);

        for (int i = 1; i < cisla.size(); i++)
        {
            if (cisla.get(i) > maximum)
            {
                maximum = cisla.get(i);
            }

        }
        return maximum;
    }

    /**
     * Returns a formatted output of all numbers
     *
     * @return
     */
    public String toString()
    {
        String all = "[";
        for (int i = 0; i < cisla.size() - 1; i++)
        {
            all += cisla.get(i) + ",";
        }
        all += cisla.get(cisla.size() - 1) + "]";
        return all;
    }
}
