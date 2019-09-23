package konvertorMeny;

/**
 * This class provides conversion between two different currently
 */
public class KonvertorMeny
{
    private double kurz; // exchange rate
    private double eura; // euro

    /**
     * Default constructor
     */
    public KonvertorMeny()
    {
        kurz = 0.0;
        eura = 0.0;
    }

    /**
     * Parametrics constructor
     *
     * @param kurz
     * @param eura
     */
    public KonvertorMeny(double kurz, double eura)
    {
        this.kurz = kurz;
        this.eura = eura;
    }

    /**
     * Set exchange rate
     *
     * @param kurz
     */
    public void setKurz(double kurz)
    {
        this.kurz = kurz;

    }

    /**
     * Amount of Euros
     *
     * @param eura
     */
    public void setEura(double eura)
    {
        this.eura = eura;
    }

    /**
     * Returns exchange rate
     *
     * @return
     */
    public double getKurz()
    {
        return kurz;
    }

    /**
     * Returns how much euro we would like to convert
     *
     * @return
     */
    public double getEura()
    {
        return eura;
    }

    /**
     * Returns converted into dollar or in any selected  currency
     *
     * @return
     */
    public double getDolare()
    {
        return kurz * eura;
    }
}
