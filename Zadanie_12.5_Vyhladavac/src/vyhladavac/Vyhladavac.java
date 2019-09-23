package vyhladavac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Program prehladava obsah suborov a nasledne zobrazi vsetky riadky
 * obsahujuce zadane klucove slovo.
 */
public class Vyhladavac
{
    public static void main(String[] args) throws FileNotFoundException
    {
        if (args.length < 2)
        {
            System.out.println("Priklad pouzitia: Vyhladavac slovo subor1.txt subor2.txt. . .");
            return;
        }

        String klucoveSlovo = args[0];

        for (int i = 1; i < args.length; i++)
        {
            String nazovSuboru = args[i];

            FileReader reader = new FileReader(nazovSuboru);
            Scanner vstup = new Scanner(reader);


            while (vstup.hasNextLine())
            {
                String riadok = vstup.nextLine();
                if (riadok.contains(klucoveSlovo))
                {
                    System.out.println(riadok);
                }
            }

        }


    }
}
