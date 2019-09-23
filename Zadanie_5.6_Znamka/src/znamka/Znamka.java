package znamka;

/**
 * This class converts numeric representation of grade to letter grade.
 */
public class Znamka
{
    private String znamka; // holds letter representation of grades
    private double cisZnamka; // holds a numeric representation of grades
    private static final double[] cisRep = {0.0, 0.3, 0.7, 0.85, 1.15, 1.7, 1.85, 2.15, 2.7, 2.85, 3.15, 3.7, 3.85, 4.0}; // holds
    // all constant values of numeric representation of grades
    private static final String[] pisZnamka = {"E", "E+", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};// holds a  possible letter representation of grades

    /**
     * Default constructor
     */
    public Znamka()
    {
        znamka = "";
        cisZnamka = 0.0;
    }

    /**
     * Parametric constructor
     *
     * @param cisZnamka
     */
    public Znamka(double cisZnamka)
    {
        this.cisZnamka = cisZnamka;
    }

    /**
     * Returns letter representation according user numeric`s representation
     *
     * @return
     */
    public String getPismenkovaReprezentacia()
    {


        if (cisZnamka >= cisRep[0] && cisZnamka < cisRep[1])
        {
            znamka = pisZnamka[0];
        }
        else if (cisZnamka >= cisRep[1] && cisZnamka <= cisRep[2])
        {
            znamka = pisZnamka[1];
        }
        else if (cisZnamka > cisRep[2] && cisZnamka < cisRep[3])
        {
            znamka = pisZnamka[2];
        }
        else if (cisZnamka >= cisRep[3] && cisZnamka < cisRep[4])
        {
            znamka = pisZnamka[3];
        }
        else if (cisZnamka >= cisRep[4] && cisZnamka < cisRep[5])
        {
            znamka = pisZnamka[4];
        }
        else if (cisZnamka >= cisRep[5] && cisZnamka < cisRep[6])
        {
            znamka = pisZnamka[5];
        }
        else if (cisZnamka >= cisRep[6] && cisZnamka < cisRep[7])
        {
            znamka = pisZnamka[6];
        }
        else if (cisZnamka >= cisRep[7] && cisZnamka < cisRep[8])
        {
            znamka = pisZnamka[7];
        }
        else if (cisZnamka >= cisRep[8] && cisZnamka < cisRep[9])
        {
            znamka = pisZnamka[8];
        }
        else if (cisZnamka >= cisRep[9] && cisZnamka < cisRep[10])
        {
            znamka = pisZnamka[9];
        }
        else if (cisZnamka >= cisRep[10] && cisZnamka <= cisRep[11])
        {
            znamka = pisZnamka[10];
        }
        else if (cisZnamka >= cisRep[11] && cisZnamka < cisRep[12])
        {
            znamka = pisZnamka[11];
        }
        else if (cisZnamka >= cisRep[12] && cisZnamka <= cisRep[13])
        {
            znamka = pisZnamka[12];
        }
        else
        {
            znamka = "Chyba!!! zadaj cislo v rozpati " + cisRep[0] + " az " + cisRep[cisRep.length - 1];
        }

        return znamka;
    }

}
