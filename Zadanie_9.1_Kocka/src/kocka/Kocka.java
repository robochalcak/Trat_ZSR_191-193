package kocka;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class simulates a die throw
 */
public class Kocka implements Meratelny
{
    private int maxCislo;
    private ArrayList<Integer> cisla;
    private int cislo;

    /**
     * Creates a new object without parameter
     */
    public Kocka()
    {
        cisla = new ArrayList<Integer>();
        this.cislo = 0;
    }

    /**
     * Creates a new object with parameter max
     *
     * @param maxCislo
     */
    public Kocka(int maxCislo)
    {
        this.maxCislo = maxCislo;
        cisla = new ArrayList<Integer>();
        this.cislo = 0;
    }

    /**
     * Returns an average of all throws with die
     *
     * @return
     */
    @Override
    public double getPriemernaHodnaHodnota()
    {
        double total = 0;
        for (int i = 0; i < cisla.size(); i++)
        {
            total += cisla.get(i);
        }

        return total / (double) cisla.size();
    }

    /**
     * Throw a die and return a number
     *
     * @return number
     */
    @Override
    public int hod()
    {
        Random kocka = new Random();
        cislo = kocka.nextInt(6) + 1;
        cisla.add(cislo);
        return cislo;
    }

}
