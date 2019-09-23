package mnozinaDat;

import java.util.ArrayList;

/**
 * Trieda sluzi na uchovavanie  dat z objektov na statisticke ucely ako primier, maximum, minimum alebo akceptovane
 * miery
 */
public class MnozinaDat
{
    private IMerac aktualnyMerac;  // uchovava meratelny objekt, ktory pouziva rozhranie IMerac
    private int pocetPrvkov;  // uchovava pocet ulozenych objektov
    private IMeratelny maximum;  // uchovava objekt s max. hodnotou
    private IMeratelny minimum;  // uchovava objekt s min. hodnotou
    private Filter filter;       // uchovava filter na triedenie objektov podla vysky hodnoty
    private double sucet;         // uchovava sucet hodnot zo vsetkych ulozenych objektov
    private ArrayList<Double> akceptovane;   // uchovava vsetky aktceptovane hodntoy objektov

    /**
     * Vytvara prazdny objekt typu MnozinaDat
     */
    public MnozinaDat()
    {
        aktualnyMerac = null;
        pocetPrvkov = 0;
        maximum = null;
        minimum = null;
        filter = null;
        sucet = 0;
        akceptovane = new ArrayList<Double>();
    }

    /**
     * Vytvara objekt typu MnozinaDat s pouzitim meratelneho objektu ako parameter
     *
     * @param novyMerac meratelny objekt
     */
    public MnozinaDat(IMerac novyMerac)
    {
        aktualnyMerac = novyMerac;
        pocetPrvkov = 0;
        minimum = null;
        maximum = null;
        filter = null;
        sucet = 0;
        akceptovane = new ArrayList<Double>();

    }

    /**
     * Sluzi na vytvorenie objektu typu MnozinaDat s pouzitim parametrov
     *
     * @param merac  na meranie
     * @param filter na filtrovanie
     */
    public MnozinaDat(IMerac merac, Filter filter)
    {
        aktualnyMerac = merac;
        this.filter = filter;
        pocetPrvkov = 0;
        minimum = null;
        maximum = null;
        sucet = 0;
        akceptovane = new ArrayList<Double>();
    }

    /**
     * Pridava meratelny objekt
     *
     * @param meratelny objekt
     */
    public void pridaj(IMeratelny meratelny)
    {

        if (pocetPrvkov == 0 || meratelny.getMiera() > maximum.getMiera())
        {

            maximum = meratelny;
        }

        if (pocetPrvkov == 0 || meratelny.getMiera() < minimum.getMiera())
        {
            minimum = meratelny;
        }

        pocetPrvkov++;
        sucet += meratelny.getMiera();
    }

    /**
     * Pridava meratelny objekt a filtrovany objekt
     *
     * @param meratelny meratelny objekt
     * @param filter    filtrovany objekt
     */
    public void pridaj(IMeratelny meratelny, Filter filter)
    {

        if ((pocetPrvkov == 0 || meratelny.getMiera() > maximum.getMiera()) && filter.akceptuje(meratelny))
        {
            maximum = meratelny;
        }

        if ((pocetPrvkov == 0 || meratelny.getMiera() < minimum.getMiera()) && filter.akceptuje(meratelny))
        {
            minimum = meratelny;
        }

        if (filter.akceptuje(meratelny))
        {
            akceptovane.add(meratelny.getMiera());
        }
        pocetPrvkov++;
        sucet += meratelny.getMiera();
    }

    /**
     * Vracia objekt s najmensiou hodnotou
     *
     * @return objekt s najmensiou hodnotou
     */
    public Object getMinimum()
    {
        return minimum;
    }

    /**
     * Vracia objekt s najvyssiou hodnotou
     *
     * @return objekt s najvyssiou hodnotou
     */
    public Object getMaximum()
    {
        return maximum;
    }

    /**
     * Vracia priemernu hodnotu so vsetkych objektov
     *
     * @return priemer hodnot zo vsetkych objektov
     */
    public double getPriemer()
    {
        return sucet / pocetPrvkov;  //vypocita priemer hodnot zo vsetkych hodnot
    }

    /**
     * Vypisuje vsetky akceptovane hodnoty objektov s pouzitim filtra
     */
    public void vypisAkceptovane()
    {
        for (int i = 0; i < akceptovane.size(); i++)
        {
            System.out.println(akceptovane.get(i) + ",");
        }
    }


}
