package terminovanyVklad;

/**
 * Trieda vytvara SporiaciUcet a operacie s nim
 */
public class SporiaciUcet extends BeznyUcet
{
    private double najnizsiZostatok;  // uchovava najnizsi zostatok po vybere a vklade
    private double urokovaSadzba; // uchovava urokovu sadzbu, ktoru pred pouzitim treba vydelit so 100

    /**
     * Vytvara novy objekt s pouzitim parametra :
     * @param urokovaSadzba
     */
    public SporiaciUcet(double urokovaSadzba)
    {
        super(0);
        this.najnizsiZostatok = 0;
        this.urokovaSadzba = urokovaSadzba;
    }

    /**
     * VKlada na bezny ucet ciastku s pouzitim parametrov:
     * @param ciastka
     * @param beznyUcet
     */
    public void vlozNaUcet(double ciastka, BeznyUcet beznyUcet)
    {
        beznyUcet.vloz(ciastka);
    }

    /**
     * Zapisuje urok podla urokovej sadzby ku zostaku
     */
    public void zapisUrok()
    {
        if (najnizsiZostatok == 0)
        {
            vloz(getAktualnyZostatok() * (urokovaSadzba / 100));
        }
        else
        {
            vloz(najnizsiZostatok * (urokovaSadzba / 100));
        }
    }

    /**
     * Vytvara vyber prostriedkov z uctu s pouzitim parametra
     * @param ciastka, ktoru treba odcitat od zostatku
     */
    public void vyber(double ciastka)
    {
        if (ciastka < 1)
        {
            System.out.println("Ciastka nemoze byt menej ako 1 euro.");
        }
        else if (ciastka > getAktualnyZostatok())
        {
            System.out.println("Nemate dostatok prostriedkov na ucte.");
        }
        else
        {
            super.vyber(ciastka);
            najnizsiZostatok = getAktualnyZostatok();
        }
    }

    /**
     * Vracia urokovu sadzbu
     * @return
     */
    public double getUrokovaSadzba()
    {
        return urokovaSadzba;
    }
}
