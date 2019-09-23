package analyzatorSuborov;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Trieda zobrazi statistiky o obsahu soboru.
 */
public class AnalyzatorSuborov
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner vstup = new Scanner(System.in);
        StatistikySuboru statistiky = new StatistikySuboru();
        System.out.print("Zadaj nazov citaneho suboru: ");
        String subor = vstup.next();
        FileReader file = new FileReader(subor);
        Scanner vstupneData = new Scanner(file);
        boolean nacitavanieUkoncene = false;


        while (!nacitavanieUkoncene)
        {
            try
            {
                statistiky.nacitaj(vstupneData, subor);
                System.out.print("Zadaj nazov citaneho suboru: ");
                subor = vstup.next();
            }
            catch (IOException ex)
            {
                System.out.println("Znaky: " + statistiky.getPocetZnakov());
                System.out.println("Slova: " + statistiky.getPocetSlov());
                System.out.println("Riadky: " + statistiky.getPocetRiadkov());
                nacitavanieUkoncene = true;
                return;
            }

        }

        vstup.close();
    }
}
