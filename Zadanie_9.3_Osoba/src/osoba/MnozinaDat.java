package osoba;

import java.util.ArrayList;

/**
 * This class collects a data about person object and determine the highest person or
 * an average of high of all persons stored in this class
 */
public class MnozinaDat
{
    private ArrayList<Osoba> osoby; // holds all person

    /**
     * Creates a empty new object of data set
     */
    public MnozinaDat()
    {
        osoby = new ArrayList<Osoba>();
    }

    /**
     * Creates a new object with adding a new person into ArrayList
     *
     * @param osoba
     */
    public MnozinaDat(Osoba osoba)
    {
        osoby = new ArrayList<Osoba>();
        osoby.add(osoba);
    }

    /**
     * Adds a new person object into ArrayList
     *
     * @param osoba
     */
    public void pridaj(Osoba osoba)
    {
        osoby.add(osoba);
    }

    /**
     * Returns an average of all persons, stored in the ArrayList
     *
     * @return average
     */
    public double getPriemernaVyska()
    {
        double priemer = 0;
        for (Osoba osoba : osoby)
        {
            priemer += osoba.getVyska();
        }

        return priemer / (double) osoby.size();
    }

    /**
     * Returns an object of the person with the highest high
     *
     * @return
     */
    public Osoba getNajvyssiaOsoba()
    {
        double najvyssi = osoby.get(0).getVyska();
        Osoba temp = new Osoba(osoby.get(0).getMeno(), osoby.get(0).getVyska());

        for (int i = 1; i < osoby.size(); i++)
        {
            if (osoby.get(i).getVyska() > najvyssi)
            {
                najvyssi = osoby.get(i).getVyska();
                temp.setMeno(osoby.get(i).getMeno());
                temp.setVyska(osoby.get(i).getVyska());
            }
        }
        return temp;
    }
}
