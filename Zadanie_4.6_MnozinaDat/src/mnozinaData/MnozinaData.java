package mnozinaData; // package location

import java.util.ArrayList;  // necessary for storing the numbers in an ArrayList
import java.util.Collections; // necessary for determining the highest or the lowest number in the ArrayList

/**
 * This class adds numbers and determines with one is the lowest, or the highest and returns that numbers
 */
public class MnozinaData
{
    private ArrayList<Integer>cislo; // An ArrayList declaration

    /**
     * This constructor only initializes an ArrayList
     */
    public MnozinaData()
    {
        cislo = new ArrayList<>();
    }

    /**
     * This method adds the number in to ArrayList
     * @param c
     */
    public void pridajCislo(int c)
    {
       cislo.add(c);
    }

    /**
     * This method returns the smallest number from the ArrayList
     * @return
     */
    public int getNajmensieCislo()
    {
        Collections.sort(cislo);
        return cislo.get(0);
    }

    /**
     * This method returns the highest number from the ArrayList
     * @return
     */
    public int getNajvacsieCislo()
    {
        Collections.sort(cislo);
        return cislo.get(cislo.size()-1);
    }
}
