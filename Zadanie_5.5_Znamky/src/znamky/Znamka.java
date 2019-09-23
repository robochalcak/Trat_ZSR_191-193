package znamky;

/**
 * This class converts a letter grade in to number representation
 */
public class Znamka
{
    private static final char[] ZNAMKY = {'A', 'B', 'C', 'D', 'E'}; // An array holds constant of letter grades in
    // upper case
    private static final char[] ZNAMKY_MALE = {'a', 'b', 'c', 'd', 'e'};//Am array holds constant of letter grades in
    // lower case
    private static final double[] HODNOTA = {4.0, 3.0, 2.0, 1.0, 0.0}; // An array holds constant of number
    // representation of grades

    private String zn; // holds user input of letter grade

    /**
     * Default constructor
     */
    public Znamka()
    {
        zn = "";
    }

    /**
     * Parametric constructor
     * @param zn
     */
    public Znamka(String zn)
    {
        this.zn = zn;
    }

    /**
     * Returns a numeric representation of letter grade each grade could contain sign + or - + add an extra point 0.3
     * and - subtracts 0.3 points
     * @return
     */
    public double getCiselnaReprezentacia()
    {
        double ciselnaReprezentancia = 0.0;
        char[] ch = zn.toCharArray();

        if (ch[0] == ZNAMKY[0] || ch[0] == ZNAMKY_MALE[0])
        {
            if (ch.length == 2)
            {
                if (ch[1] == ('-'))
                {
                    ciselnaReprezentancia = HODNOTA[0] - 0.3;
                }
                else if (ch[1] == ('+'))
                {
                    ciselnaReprezentancia = HODNOTA[0];
                }
                else
                {
                    ciselnaReprezentancia = -1;
                }
            }
            else if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[0];
            }
            else
            {
                ciselnaReprezentancia = -1;
            }
        }
        else if (ch[0] == (ZNAMKY[1]) || ch[0] == ZNAMKY_MALE[1])
        {
            if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[1];
            }
            else if (ch.length == 2)
            {
                if (ch[1] == ('+'))
                {
                    ciselnaReprezentancia = HODNOTA[1] + 0.3;
                }
                else if (ch[1] == ('-'))
                {
                    ciselnaReprezentancia = HODNOTA[1] - 0.3;
                }
                else
                {
                    ciselnaReprezentancia = -1;
                }
            }
            else
            {
                ciselnaReprezentancia = -1;
            }
        }
        else if (ch[0] == (ZNAMKY[2]) || ch[0] == ZNAMKY_MALE[2])
        {
            if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[2];
            }
            else if (ch[1] == ('+'))
            {
                ciselnaReprezentancia = HODNOTA[2] + 0.3;
            }
            else if (ch[1] == ('-'))
            {
                ciselnaReprezentancia = HODNOTA[2] - 0.3;
            }
            else
            {
                ciselnaReprezentancia = -1;
            }
        }
        else if (ch[0] == (ZNAMKY[3]) || ch[0] == ZNAMKY_MALE[3])
        {
            if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[3];
            }
            else if (ch.length == 2)
            {
                if (ch[1] == ('+'))
                {
                    ciselnaReprezentancia = HODNOTA[3] + 0.3;
                }
                else if (ch[1] == ('-'))
                {
                    ciselnaReprezentancia = HODNOTA[3] - 0.3;
                }
                else
                {
                    ciselnaReprezentancia = -1;
                }
            }
            else
            {
                ciselnaReprezentancia = -1;
            }
        }
        else if (ch[0] == (ZNAMKY[4]) || ch[0] == ZNAMKY_MALE[4])
        {
            if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[4];
            }
            else if (ch[1] == ('+'))
            {
                ciselnaReprezentancia = HODNOTA[4] + 0.3;
            }
            else if (ch[1] == ('-'))
            {
                ciselnaReprezentancia = HODNOTA[4] - 0.3;
            }
            else
            {
                ciselnaReprezentancia = -1;
            }
        }
        else if (ch[0] == (ZNAMKY[5]) || ch[0] == ZNAMKY_MALE[5])
        {
            if (ch.length == 1)
            {
                ciselnaReprezentancia = HODNOTA[5];
            }
            else if (ch[1] == ('+'))
            {
                ciselnaReprezentancia = HODNOTA[5] + 0.3;
            }
            else
                {
                    ciselnaReprezentancia=-1;
                }
        }
        if (zn.equalsIgnoreCase("E-"))
        {
            return 0.0;
        }
        else
        {
            return ciselnaReprezentancia;
        }
    }
}
