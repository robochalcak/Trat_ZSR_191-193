package merac;

/**
 * Pridava lubovolne objekty a potom vracia rozne statisticke udaje s
 */
public class MnozinaDat
{
    private IMerac aktualnyMerac;
    private int pocetPrvkov;
    private IMeratelny maximum;
    private IMeratelny minimum;
    private double sucet;

    /**
     * Vytvara novy objekt s pouzitim parametra
     *
     * @param novyMerac
     */
    public MnozinaDat(IMerac novyMerac)
    {
        this.aktualnyMerac = novyMerac;
        pocetPrvkov = 0;
        minimum = null;
        maximum = null;
        sucet = 0;
    }

    /**
     * Vytvara novy objekt bez pouzitia parametra
     */
    public MnozinaDat()
    {
        aktualnyMerac = null;
        pocetPrvkov = 0;
        minimum = null;
        maximum = null;
        sucet = 0;
    }

    /**
     * Pridava novy objekt do mnoziny dat
     *
     * @param meratelny novy objekt typu interface
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
     * Vracia objekt s najnizsiou hodnotou
     *
     * @return objekt s najnizsiou hodnotou
     */
    public Object getMinimum()
    {
        return minimum;
    }

    /**
     * @return objekt s najvyssiou hodnotou
     */
    public Object getMaximum()
    {
        return maximum;
    }

    /**
     * @return priemer hodnot vsetkych objektov
     */
    public double getPriemer()
    {
        return sucet / pocetPrvkov;
    }
}
