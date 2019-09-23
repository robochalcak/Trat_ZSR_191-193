package analyzatorSuborov;

import java.io.*;
import java.util.Scanner;

/**
 * This class provides reading from text file and determine number of lines,
 * characters and words in the text file
 */
public class StatistikySuboru
{
    private int pocetSlov;
    private int pocetZnakov;
    private int pocetRiadkov;

    /**
     * Creates a empty object of statistics
     */
    public StatistikySuboru()
    {
        this.pocetSlov = 0;
        this.pocetZnakov = 0;
        this.pocetRiadkov = 0;
    }

    /**
     * This method provides reading from the file with arguments:
     *
     * @param vstupneData Scanner object, contains information about input file
     * @param nazovSuboru String holds file name for determining the number of lines
     * @throws IOException
     */
    public void nacitaj(Scanner vstupneData, String nazovSuboru) throws IOException
    {
        FileReader fr = new FileReader(nazovSuboru);
        LineNumberReader riadky = new LineNumberReader(fr);

        while (riadky.readLine() != null)
        {
            pocetRiadkov++;
        }
        while (vstupneData.hasNextLine())
        {
            pocetSlov++;
            String slovo = vstupneData.next();
            pocetZnakov += slovo.length();
        }
    }

    /**
     * Returns number of characters
     *
     * @return
     */
    public int getPocetZnakov()
    {
        return pocetZnakov;
    }

    /**
     * Returns number of worlds
     *
     * @return
     */
    public int getPocetSlov()
    {
        return pocetSlov;
    }

    /**
     * Returns number of lines
     *
     * @return
     */
    public int getPocetRiadkov()
    {
        return pocetRiadkov;
    }
}
