package konvertor;

/**
 * Konvertuje lubovolny pocet metrov na rozne metricke jednotky
 */
public class Konvertor
{
    private double prevodovyFaktor;

    /**
     * Vytvara konvertor, ktory bude konvertovat hodnotu medzi dvomi jendotkami.
     *
     * @param prevodovyFaktor faktor ktory sa pouzije pri konvertovani hodnoty na zelanu jednodku miery
     */

    public Konvertor(double prevodovyFaktor)
    {
        this.prevodovyFaktor = prevodovyFaktor;
    }

    /**
     * Na zaklade faktora cielovej miery konvertuje na zelanu mieru, napriklad na pocet mil
     *
     * @param faktorCielovejMiery
     * @return
     */
    public double konvertujNa(double faktorCielovejMiery)
    {
        return (prevodovyFaktor / faktorCielovejMiery);
    }

    /**
     * Vracia spatnu konverziu.
     *
     * @param faktorPovodnejMiery
     * @return
     */
    public double konvertujZ(double faktorPovodnejMiery)
    {
        return (prevodovyFaktor / faktorPovodnejMiery);
    }
}
