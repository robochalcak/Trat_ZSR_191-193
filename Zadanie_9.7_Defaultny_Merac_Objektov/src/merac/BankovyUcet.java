package merac;

/**
 * Trieda vytvara bankovy ucet a zobrazuje jeho zostatok
 */
public class BankovyUcet implements IMeratelny
{

    private double zostatok;

    /**
     * Vytvara novy prazdny objekt bankovy ucet
     */
    public BankovyUcet()
    {

    }

    /**
     * Vytvara novy objekt bankovy ucet s pouzitim parametra
     * @param zostatok
     */
    public BankovyUcet(double zostatok)
    {
        this.zostatok=zostatok;
    }

    /**
     * Vracia aktualny zostatok
     * @return
     */
    public double getZostatok()
    {
        return zostatok;
    }

    /**
     * Vracia formatovany vystup
     * @return aktualny zostatok v EUR.
     */
    public String toString()
    {
        return  zostatok+ "Eur.";
    }

    /**
     * Implementovana metoda z rozhrania vracia mieru v zostatku na ucte
     * @return
     */
    @Override
    public double getMiera()
    {
        return zostatok;
    }
}
