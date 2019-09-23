package merac;

/**
 * Vytvara novy objekt typu obdlznik
 */
public class Obdlznik implements IMeratelny
{
    private double sirka;
    private double vyska;

    /**
     * Vytvara novy objekt s pouzitim parametrov typu
     *
     * @param sirka double
     * @param vyska double
     */
    public Obdlznik(double sirka, double vyska)
    {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    /**
     * @return sirku obdlznika
     */

    public double getSirka()
    {
        return sirka;
    }

    /**
     * @return vysku obdlznika
     */
    public double getVyska()
    {
        return vyska;
    }

    /**
     * Implementovana metoda z rozhrania vracia mieru
     *
     * @return plocha
     */
    @Override
    public double getMiera()
    {
        return sirka * vyska;  // vypocita plochu obdlznika
    }
}
