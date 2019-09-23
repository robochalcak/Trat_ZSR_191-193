package bankovyUcet;
/**
 * Bankovy ucet obsahuje zostatok na ucte, ktory moze byt zmeney vkladmi a
 * vybermi.
 */

public class BankovyUcet
{
    private double aktualnyZostatok;
    /**
     * Vytvara bankovy ucet s nulovym pociatocnym zostatkom.
     */
    public BankovyUcet()
    {
        aktualnyZostatok = 0;
    }
    /**
     * Vytvara bankovy ucet s danym pociatocnym zostatkom.
     *
     * @param pociatocnyZostatok pociatocny zostatok
     */
    public BankovyUcet(double pociatocnyZostatok)
    {
        aktualnyZostatok = pociatocnyZostatok;
    }
    /**
     * Vklada danu sumu penazi na bankovy ucet.
     *
     * @param ciastka suma penazi, ktora bude pripisana na ucet
     */
    public void vloz(double ciastka)
    {
        double novyZostatok = aktualnyZostatok + ciastka;
        aktualnyZostatok = novyZostatok;
    }
    /**
     * Vybera danu sumu penazi z bankoveho uctu.
     *
     * @param ciastka suma penazi, ktora sa z uctu vyberie
     */
    public void vyber(double ciastka)
    {
        double novyZostatok = aktualnyZostatok - ciastka;
        aktualnyZostatok = novyZostatok;
    }
    /**
     * Vracia aktualny zostatok na bankovom ucte.
     *
     * @return aktualny zostatok na bankovom ucte
     */
    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }

    /**
     * pripisuje urok, ktory je v parametry v percentualnom vyjadreni
     * nasledne ho prekonvertuje do sadzby ktora je nasobena s zostatkom a ten je pripisany k konecnemu zostatku
     * @param urokovaSadzba
     */
    public void pripisUrok(double urokovaSadzba)
    {
        double urok = aktualnyZostatok * (urokovaSadzba / 100); // urok v % je videleny 100 a potom je to vynasobene
        // so zostatkom
        aktualnyZostatok = aktualnyZostatok + urok; // vysledok je pripisany ku aktualnemu zostatku
    }
}
