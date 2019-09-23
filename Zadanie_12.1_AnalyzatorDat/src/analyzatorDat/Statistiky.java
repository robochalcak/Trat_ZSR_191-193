package analyzatorDat;

import java.io.*;
import java.util.Scanner;

/**
 * This class provides reading from text file and determine number of lines,
 * characters and words in the text file
 */
public class Statistiky
{
    private int pocetZnakov; //holds number of characters in the file
    private int pocetSlov; // holds number of words in the file
    private int pocetRiadkov; // holds number of lines in the file

    /**
     * Creates a empty object of statistics
     */
    public Statistiky()
    {
        this.pocetRiadkov = 0;
        this.pocetSlov = 0;
        this.pocetZnakov = 0;
    }

    /**
     * This method provides reading from the file with arguments:
     *
     * @param vstupneData Scanner object, contains information about input file
     * @param nazovSuboru String holds file name for determining the number of lines
     * @throws IOException
     */
    public void citaj(Scanner vstupneData, String nazovSuboru) throws IOException
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
