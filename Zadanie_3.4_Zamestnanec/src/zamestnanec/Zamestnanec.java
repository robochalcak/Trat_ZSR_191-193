package zamestnanec;

/**
 * Zamestnanec ma meno a plat.
 */
public class Zamestnanec
{
    private String meno;
    private double plat;

    /**
     * Vytvara noveho zamestnanca s danym meno a platom.
     *
     * @param meno meno zamestnanca
     * @param plat plat zamestnanca
     */
    public Zamestnanec(String meno, double plat)
    {
        this.meno = meno;
        this.plat = plat;
    }

    /**
     * Vrati meno zamestnanca.
     *
     * @return vrati meno zamestnanca
     */
    public String getMeno()
    {
        return meno;
    }

    /**
     * Vrati plat zamestnanca.
     *
     * @return plat zamestnanca
     */
    public double getPlat()
    {
        return plat;
    }

    /**
     * Navysi plat zamestnanca na zaklade percentualnej miery.
     *
     * @param percentualnaMiera percentualna miera
     */
    public void navysPlat(double percentualnaMiera)
    {
        plat = plat + ((plat / 100) * percentualnaMiera);
    }
}
