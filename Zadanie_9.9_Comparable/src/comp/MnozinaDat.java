package comp;

import java.util.ArrayList;

/**
 * Trieda sluzi na uchovavanie  dat z objektov na statisticke ucely ako primier, maximum, minimum alebo akceptovane
 * miery
 */
public class MnozinaDat
{
    private IMerac aktualnyMerac;
    private int pocetPrvkov;
    private IMeratelny maximum;
    private IMeratelny minimum;
    private IFilter filter;
    private double sucet;
    private ArrayList<Double> akceptovane;
    private int compare;
    private Comparable maximumComp;
    private Comparable minimumComp;

    /**
     * Pomocna metoda vynuluje pri tvorbe noveho objektu vsetky premenne
     */
    private void vynuluj()
    {
        maximum = null;
        minimum = null;
        aktualnyMerac = null;
        filter = null;
        pocetPrvkov = 0;
        sucet = 0;
        compare = 0;
        maximumComp = null;
        minimumComp = null;
    }

    /**
     * Vytvara prazdny objekt typu MnozinaDat
     */
    public MnozinaDat()
    {

        vynuluj();
        akceptovane = new ArrayList<Double>();

    }

    /**
     * Vytvara objekt typu MnozinaDat s pouzitim meratelneho objektu ako parameter
     *
     * @param novyMerac meratelny objekt
     */
    public MnozinaDat(IMerac novyMerac)
    {
        vynuluj();
        aktualnyMerac = novyMerac;
        akceptovane = new ArrayList<Double>();

    }

    /**
     * Sluzi na vytvorenie objektu typu MnozinaDat s pouzitim parametrov
     *
     * @param novyMerac  na meranie
     * @param novyFilter na filtrovanie
     */
    public MnozinaDat(IMerac novyMerac, IFilter novyFilter)
    {

        vynuluj();
        filter = novyFilter;
        aktualnyMerac = novyMerac;
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
    public void pridaj(IMeratelny meratelny, IFilter filter)
    {
        pridaj(meratelny);
        if (filter.akceptuje(meratelny))
        {
            akceptovane.add(meratelny.getMiera());
        }
    }

    /**
     * Pridava akykolvek objekt, ktory implementuje rozhranie Comparable
     *
     * @param prvok
     */
    public void pridaj(Comparable prvok)
    {
        if (pocetPrvkov == 0 || prvok.compareTo(maximumComp) > 0)
        {
            maximumComp = prvok;
        }
        if (pocetPrvkov == 0 || prvok.compareTo(minimumComp) < 0)
        {
            minimumComp = prvok;
        }
        if (pocetPrvkov == 0 || prvok.compareTo(maximumComp) == 0 && prvok.compareTo(minimumComp) == 0)
        {
            maximumComp = prvok;
            minimumComp = prvok;
        }
        pocetPrvkov++;
    }

    /**
     * Vracia objekt s najmensiou hodnotou
     *
     * @return objekt s najmensiou hodnotou
     */
    public Object getMinimum()
    {
        return minimumComp;
    }

    /**
     * Vracia objekt, ktory implementuje rozhranie Comparable s najnizsiou hodnotou
     *
     * @return objekt s najnizsiou hodnotou typu Comparable
     */
    public Comparable getMinimumComp()
    {
        return minimumComp;
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
     * Vracia objekt, ktory implementuje rozhranie Comparable s najvyssiou hodnotou
     *
     * @return objekt s najvyssiou hodnotou typu Comparable
     */
    public Comparable getMaximumComp()
    {
        return maximumComp;
    }

    /**
     * Vracia priemernu hodnotu so vsetkych objektov
     *
     * @return priemer hodnot zo vsetkych objektov
     */
    public double getPriemer()
    {
        return sucet / pocetPrvkov;
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
