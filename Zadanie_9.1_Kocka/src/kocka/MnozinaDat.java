package kocka;

import java.util.ArrayList;

/**
 * This class stores all throws of the die and returns an average
 */
public class MnozinaDat
{
    private Kocka kocka;
    private ArrayList<Integer> cisla;

    /**
     * Creates a new object without any parameter
     */
    public MnozinaDat()
    {
        kocka = new Kocka();
        cisla = new ArrayList<Integer>();
    }

    /**
     * Creates a new object with parameter DIE
     *
     * @param kocka
     */
    public MnozinaDat(Kocka kocka)
    {
        this.kocka = kocka;
        cisla = new ArrayList<Integer>();
    }

    /**
     * Adds number from throw of the die
     *
     * @param cislo
     */
    public void pridaj(int cislo)
    {
        cisla.add(cislo);
    }

    /**
     * Returns an average of all throws of the die.
     *
     * @return
     */
    public double getPriemer()
    {
        double priemer = 0.0;
        for (int i = 0; i < cisla.size(); i++)
        {
            priemer += cisla.get(i);
        }

        return priemer / (double) cisla.size();
    }
}
