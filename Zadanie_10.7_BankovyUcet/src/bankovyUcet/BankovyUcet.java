package bankovyUcet;

/**
 * Bankovy ucet ma zostatok, ktory moze byt zmeneny pomocou vkladov a vyberov.
 */
public abstract class BankovyUcet
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
     */
    public BankovyUcet(double pociatocnyZostatok)
    {
        this.aktualnyZostatok = pociatocnyZostatok;
    }

    /**
     * Vklada urcitu sumu penazi na ucet.
     *
     * @param ciastka
     */
    public void vloz(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    /**
     * Vybera urcitu sumu penazi z uctu.
     *
     * @param ciastka
     */
    public void vyber(double ciastka)
    {
        this.aktualnyZostatok -= ciastka;
    }

    /**
     * Vracia aktualny zostatok na bankovom ucte.
     *
     * @return aktualny zostatok
     */
    public double getAktualnyZostatok()
    {
        return this.aktualnyZostatok;
    }

    /**
     * Abstraktna metoda, ktora vykonava potrebne ukony na konci mesiaca.
     */
    public abstract void koniecMesiaca();
}
