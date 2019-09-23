package mnozinaDat;

/**
 * Trieda sluzi na vytvorenie noveho bankoveho uctu a implementuje rozhrania IMeratelny a Filter
 */
public class BankovyUcet implements IMeratelny, Filter
{
    private double zostatok; // uchovava zostatok na ucte

    /**
     * Vytvara prazdny objekt bez pouzitia parametrov
     */
    public BankovyUcet()
    {

    }
    /**
     * Vytvara objekt s pouzitim parametra zostatok
     */
    public BankovyUcet(double zostatok)
    {
        this.zostatok=zostatok;
    }

    /**
     * Nastavuje zostatok s pouzitim parametra:
     * @param zostatok
     */
    public void setZostatok(double zostatok)
    {
        this.zostatok=zostatok;
    }

    /**
     * Vracia
     * @return zostatok na ucte
     */
    public double getZostatok()
    {
        return zostatok;
    }

    /**
     * Vracia zakladne info o ucte vo formatovanom vystupe
     * @return
     */
    public String toString()
    {
        return zostatok+" Eur.";
    }

    /**
     * Vracia meratelnu premennu
     * @return zostatok
     */
    @Override
    public double getMiera()
    {
        return zostatok;
    }

    /**
     * Overuje a vracia meratelnu premennu ak je podmienka viac alebo rovne 1000, opacne fracia false
     * @param objekt  parameter
     * @return false alebo true
     */
    @Override
    public boolean akceptuje(Object objekt)
    {
        return zostatok>=1000;
    }
}
