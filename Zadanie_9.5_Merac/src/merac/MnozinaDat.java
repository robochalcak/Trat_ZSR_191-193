package merac;

/**
 * Trieda slúži na štatistické výpočty nad jej prvkami.
 */
public class MnozinaDat
{

    private double sucet;
    private int pocetPrvkov;
    private IMerac aktualnyMerac;
    private Object maximum;
    private Object minimum;

    /**
     * Vytvara prazdnu mnozinu dat s danym meracom.
     *
     * @param novyMerac merac ktory budeme pouzivat na meranie objektov mnoziny
     */
    public MnozinaDat(IMerac novyMerac)
    {
        aktualnyMerac = novyMerac;
        maximum = null;
        minimum = null;
        sucet = 0;
        pocetPrvkov = 0;
    }

    /**
     * Pridava novy prvok do mnoziny.
     *
     * @parame prvok prvok mnoziny
     */
    public void pridaj(Object prvok)
    {
        sucet += aktualnyMerac.zmeraj(prvok);

        if (pocetPrvkov == 0 || aktualnyMerac.zmeraj(prvok) > aktualnyMerac.zmeraj(maximum))
        {
            maximum = prvok;
        }
        if (pocetPrvkov == 0 || aktualnyMerac.zmeraj(prvok) < aktualnyMerac.zmeraj(minimum))
        {
            minimum = prvok;
        }
        pocetPrvkov++;
    }

    /**
     * Vrati prvok s najvacsou nameranou hodnotou.
     *
     * @return prvok s najvacsiou nameranou hodnotou
     */
    public Object getMaximum()
    {
        return maximum;
    }

    /**
     * Vrati prvok s najmensou nameranou hodnotou.
     *
     * @return prvok s najmensou nameranou hodnotou
     */
    public Object getMinimum()
    {
        return minimum;
    }

    /**
     * Vypocita a vrati priemernu hodnotu z mnoziny prvkov.
     *
     * @return priemerna hodnota z mnoziny prvkov
     */
    public double getPriemer()
    {
        if (pocetPrvkov == 0)
        {
            return 0;
        }
        else
        {
            return sucet / (double) pocetPrvkov;
        }
    }
}
