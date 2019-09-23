package kviz;

import java.util.ArrayList;

/**
 * This class simulates all necessary requirements of quiz
 */
public class Kviz implements Meratelny
{
    private int hodnota; // holds score in numeric value
    private ArrayList<Character> znamka; // holds a char representation of grade
    private char pismeno;  // holds a character representation of grade
    private String pismenoZnamka; // holds completely representation of grade like 'A' or 'A-'

    /**
     * Creates a new object without using any parameter
     */
    public Kviz()
    {
        hodnota = 0;
        pismeno = ' ';
        znamka = new ArrayList<Character>();
    }

    /**
     * Creates a new object with using parameter
     *
     * @param hodnota number representation of grade
     */
    public Kviz(int hodnota)
    {
        this.hodnota = hodnota;
        pismeno = ' ';
        znamka = new ArrayList<Character>();
    }

    /**
     * Creates a new object with using parameters
     *
     * @param hodnota       number representation of grade
     * @param pismenoZnamka letter representation of grade
     */
    public Kviz(int hodnota, String pismenoZnamka)
    {
        this.hodnota = hodnota;
        this.pismenoZnamka = pismenoZnamka;
    }

    /**
     * Sets a letter grade manually with parameter
     *
     * @param pismenoZnamka letter representation
     */
    public void setPismenoZnamka(String pismenoZnamka)
    {
        this.pismenoZnamka = pismenoZnamka;
    }

    /**
     * Returns a letter grade manually set in method above
     *
     * @return
     */
    public String getPismenoZnamka()
    {
        return pismenoZnamka;
    }

    /**
     * Sets and determine with letter is, according the value of the grade uses number
     * representation of the grade
     *
     * @param hodnota number representation of the grade
     */
    @Override
    public void setZnamka(int hodnota)
    {
        this.hodnota = hodnota;
        if (hodnota > 91)
        {
            pismeno = Znamky.A.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 91 && hodnota > 89)
        {
            pismeno = Znamky.A.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 89 && hodnota > 81)
        {
            pismeno = Znamky.B.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 81 && hodnota > 79)
        {
            pismeno = Znamky.B.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 79 && hodnota > 71)
        {
            pismeno = Znamky.C.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 71 && hodnota > 69)
        {
            pismeno = Znamky.C.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 69 && hodnota > 61)
        {
            pismeno = Znamky.D.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 61 && hodnota > 59)
        {
            pismeno = Znamky.D.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 59 && hodnota > 50)
        {
            pismeno = Znamky.E.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota >= 50)
        {
            pismeno = Znamky.E.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else
        {
            pismeno = Znamky.F.asChar();
            znamka.add(0, pismeno);
        }
    }

    /**
     * Sets letter grade according the number score, without using any parameter
     */
    public void setZnamka()
    {
        if (hodnota > 91)
        {
            pismeno = Znamky.A.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 91 && hodnota > 89)
        {
            pismeno = Znamky.A.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 89 && hodnota > 81)
        {
            pismeno = Znamky.B.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 81 && hodnota > 79)
        {
            pismeno = Znamky.B.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 79 && hodnota > 71)
        {
            pismeno = Znamky.C.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 71 && hodnota > 69)
        {
            pismeno = Znamky.C.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 69 && hodnota > 61)
        {
            pismeno = Znamky.D.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota <= 61 && hodnota > 59)
        {
            pismeno = Znamky.D.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else if (hodnota <= 59 && hodnota > 50)
        {
            pismeno = Znamky.E.asChar();
            znamka.add(0, pismeno);
        }
        else if (hodnota >= 50)
        {
            pismeno = Znamky.E.asChar();
            znamka.add(0, pismeno);
            znamka.add(1, '-');
        }
        else
        {
            pismeno = Znamky.F.asChar();
            znamka.add(0, pismeno);
        }
    }

    /**
     * Returns number score of the grade
     *
     * @return grade
     */
    @Override
    public int getSkore()
    {
        return hodnota;
    }

    /**
     * Returns letter grade it could contain one letter or letter and sign + or -
     * depending of the score of the quiz - reason of using an ArrayList
     *
     * @return string containing letter or letter and sign
     */
    @Override
    public String getZnamka()
    {
        String all = "";
        for (int i = 0; i < znamka.size(); i++)
        {
            all += znamka.get(i);
        }
        return all;
    }
}
