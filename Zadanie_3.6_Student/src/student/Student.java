package student;

/**
 * Trieda sluzi na simulovanie kvizov studentom.
 */
public class Student
{
    private String menoStudenta;  // meno studenta
    private int pocetBodov;        // pocet bodov akumulator
    private int pocetKvizov;        // pocet testov akumulator

    /**
     * Vytvara noveho studenta s danym menom.
     *
     * @param menoStudenta meno studenta
     */
    public Student(String menoStudenta)
    {
        this.menoStudenta = menoStudenta; // set menoStudenta k meno studenta
        pocetBodov = 0;                       // pocet bodov nastaveny na 0, hoci to java robi sama je lepsie to
        // nastavit aj tak
        pocetKvizov = 0; // tak isto ako v predchadzajucom pripade
    }

    /**
     * Vrati meno studenta.
     *
     * @return meno studenta
     */
    public String getMeno()
    {
        return menoStudenta;   // vracia meno studenta
    }

    /**
     * Simuluje absolvovanie kvizu s danym poctvom ziskanych bodov.
     *
     * @param pocet ziskanych bodov v kvize
     */
    public void absovlujKviz(int pocet)
    {
        pocetBodov += pocet;                  // pri volani metody sa stale body zvysia o hodnotu v parametry
        pocetKvizov++;                      // kolko krat je ta metoda volana jednym objektom tak je navyseny pocej o 1
    }

    /**
     * Vrati celkovy pocet ziskanych bodov z kvizov.
     *
     * @return celkovy pocet ziskanych bodov
     */
    public int getCelkovyPocetBodov()
    {
        return pocetBodov;
    }

    /**
     * Vrati priemerny pocet bodov ziskany z kvizov.
     *
     * @return priemerny pocet bodov ziskany z kvizov
     */
    public double getPriemernyPocetBodov()
    {
        return pocetBodov / (double) pocetKvizov;
    }
}
