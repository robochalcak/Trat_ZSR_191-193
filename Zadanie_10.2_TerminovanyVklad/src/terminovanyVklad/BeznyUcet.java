package terminovanyVklad;

/**
 * Trieda vytvara BeznyUcet a jeho zakladne operacie
 */
public class BeznyUcet extends BankovyUcet
{
    private double poplatky; // uchovava poplatky za vedenie uctu

    /**
     * Vytvara objekt s pouzitim parametra:
     * @param vklad  ktory je odovzdany konstruktoru nadtriedy
     */
    public BeznyUcet(double vklad)
    {
        super(vklad);
    }

    /**
     * Nastavuje poplatky za vedenie uctu s pouzitim parametra:
     * @param poplatky
     */
    public void setPoplatky(double poplatky)
    {
        this.poplatky = poplatky;
    }

    /**
     * Zauctuje poplatky a odcita od aktualneho zostatku vo forme vyberu z nadtriedy
     */
    public void zauctujPoplatky()
    {
        super.vyber(poplatky);
    }

    /**
     * Vracia sadzobnik poplatkov
     * @return poplatky
     */
    public double getPoplatky()
    {
        return poplatky;
    }
}
