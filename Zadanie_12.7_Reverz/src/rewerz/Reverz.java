package rewerz;

import java.io.*;
import java.util.Scanner;

/**
 * This program makes reverse from each line from text file, and after it stores in another line revers.txt
 */
public class Reverz
{
    public static void main(String[] args) throws IOException
    {

        Scanner kb = new Scanner(System.in);
        System.out.println("Zadajte nazov subor pre nacitanie: ");
        String subor = kb.next();

        FileReader reader = null;
        try
        {
            reader = new FileReader(subor);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor "+subor+" sa nenasiel.");
            return;
        }

        Scanner vstup = new Scanner(reader);
        PrintWriter writer = new PrintWriter("revers.txt");

        while (vstup.hasNextLine())
        {
            String riadok = vstup.nextLine();
            char []originalny = riadok.toCharArray();
            char[] obrateny = new char[riadok.length()];

            for (int i = riadok.length() - 1; i >= 0; i--)
            {
                obrateny[i] = originalny[originalny.length - 1 - i];
            }
            for (int i = 0; i < riadok.length(); i++)
            {
                writer.print(obrateny[i]);
            }
            writer.println();

        }

        reader.close();
        writer.close();
        kb.close();

    }


}
