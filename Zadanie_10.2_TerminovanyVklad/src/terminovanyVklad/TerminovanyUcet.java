package terminovanyVklad;

/**
 * Trieda sluzi na vytvorenie terminovanehoUctu a poskytuje zakladne operacie s nim
 */
public class TerminovanyUcet extends SporiaciUcet
{
    private int viazanost;   // uchovava viazanost
    private static final double DVATSATPAT = 25;  // uchovava sadzobnik pokuty (predpis)
    private static final double EURO = 1;  // informativny charakter

    /**
     * Vytvara objekt terminovanehoUctu s parametrami
     * @param urokovaSadzba
     * @param viazanost
     * zvysne operacie sa dedia z nadtried SporiaciUcet, BeznyUcet a BankovyUcet
     */
    public TerminovanyUcet(double urokovaSadzba, int viazanost)
    {
        super(urokovaSadzba);
        this.viazanost = viazanost;
    }

    /**
     * Zapise urok a znizi viazanost o 1 mesiac
     */
    public void zapisUrok()
    {
        viazanost--;
        super.zapisUrok();
    }

    /**
     * Prepisana metoda vyber(double ciastka) z dovodu, toho, ze pri poruseni viazanosti je potrebne zauctovat aj pokutu
     * @param ciastka
     */
    public void vyber(double ciastka)
    {
        double pokuta = ciastka / DVATSATPAT;
        if (viazanost <= 0)
        {
            if (ciastka < 1)
            {
                System.out.println("Ciastka nemoze byt mensia ako 1 eur.");
            }
            else if (ciastka > getAktualnyZostatok())
            {
                System.out.println("Nemate dostatok prostriedkov na ucte");
                System.out.println("Vyberana ciastka "+ciastka+" Eur.");
            }
            else
            {
                super.vyber(ciastka);
                System.out.println("Prave ste vybrali "+ ciastka+ " Eur.");
            }
        }
        else
        {
            if (ciastka + pokuta < 1)
            {
                System.out.println("Ciastka nemoze byt mensia ako 1 Eur.");
            }
            else if (ciastka + pokuta > getAktualnyZostatok())
            {
                System.out.println("Nemate dostatok prostriedkov na ucte.");
                System.out.println("Prave sa pokusate vybrat "+ ciastka+" a pokuta za");
                System.out.println("predcastny vyber: "+ pokuta);
            }
            else
            {
                super.vyber(ciastka+pokuta);
                System.out.println("Pre porusenie viazanosti vam bola nauctovana");
                System.out.println("pokuta vo vyske " + pokuta + " co cini za kazdych ");
                System.out.println(DVATSATPAT + "eur ste zaplatili: " + EURO + ".");
            }
        }
    }


}
