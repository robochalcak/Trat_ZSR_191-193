package rozneObjekty;

/**
 * Tato trieda uklada rozne objekty a vykonava statisticke operacie
 */
public class MnozinaDat
{
    private IMerac aktualnyMerac;
    private int pocetPrvkov;
    private Object maximum;
    private Object minimum;
    private double sucet;

    /**
     * Vytvara novy objekt
     * @param novyMerac
     */
    public MnozinaDat(IMerac novyMerac)
    {
        aktualnyMerac = novyMerac;
        maximum=null;
        minimum=null;
        sucet=0;
        pocetPrvkov=0;
    }

    /**
     * Pridava novy objekt do mnoziny dat
     * @param prvok
     */
    public void pridaj(Object prvok)
    {
        sucet+=aktualnyMerac.zmeraj(prvok);

        if(pocetPrvkov==0||aktualnyMerac.zmeraj(prvok)>aktualnyMerac.zmeraj(maximum))
        {
            maximum=prvok;
        }

        if(pocetPrvkov==0||aktualnyMerac.zmeraj(prvok)<aktualnyMerac.zmeraj(minimum))
        {
            minimum=prvok;
        }
        pocetPrvkov++;
    }

    /**
     * Vracia najnizsiu hodnotu zo vsetkych ulozenych objektov
     * @return
     */
    public Object getMinimum()
    {
        return minimum;
    }

    /**
     * Vracia najvyssiu hodnotu zo vsetkych ulozenych objketov
     * @return
     */
    public Object getMaximum()
    {
        return maximum;
    }

    /**
     * Vracia priemer hodnot zo vsetkych objektov.
     * @return
     */
    public double gePriemer()
    {
        return sucet/pocetPrvkov;
    }
}
