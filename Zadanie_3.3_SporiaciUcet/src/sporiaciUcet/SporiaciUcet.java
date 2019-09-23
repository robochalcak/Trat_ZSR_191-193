package sporiaciUcet;

/**
 * Sporiaci ucet ma zostatok, ktory moze byt zmeneny pomocou vkladov a vyberov.
 */
public class SporiaciUcet
{
    private double urokovaSadzba;
    private double aktualnyZostatok;

    /**
     * Vytvara sporiaci ucet s nulovym pociatocnym zostatkom.
     */
    public SporiaciUcet()
    {
        aktualnyZostatok = 0;
        urokovaSadzba = 0;
    }

    /**
     * Vytvara sporiaci ucet s danym pociatocnym zostatkom a urokovou sadzbou
     *
     * @param pociatocnyZostatok
     * @param urokovaSadzba
     */
    public SporiaciUcet(double pociatocnyZostatok, double novaUrokovaSadzba)
    {
        aktualnyZostatok = pociatocnyZostatok;
        urokovaSadzba = novaUrokovaSadzba;
    }

    /**
     * pripisuje urokovu sadzbu ku konecnemu stavu uctu
     */
    public void pripisUrok()
    {
        aktualnyZostatok = aktualnyZostatok + ((aktualnyZostatok / 100) * urokovaSadzba);
    }

    /**
     * Zobrazuje konecny stav uctu
     *
     * @return
     */
    double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
