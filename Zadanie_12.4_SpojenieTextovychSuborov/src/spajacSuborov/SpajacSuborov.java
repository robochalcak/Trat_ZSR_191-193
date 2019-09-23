package spajacSuborov;

import java.io.*;

/**
 * Program precita obsah vsetkych suborov a nasledne tento obsah
 * zapise do vysledneho suboru.
 */
public class SpajacSuborov
{
    public static void main(String[]  args) throws IOException
    {

        if (args.length < 2)
        {
            System.out.println("Pouzitie: SpajacSuborov subor1.txt subor2.txt subor3.txt vysledny_subor.txt");
            return;
        }

        PrintWriter pw = new PrintWriter(args[args.length - 1]);

        BufferedReader[] brs = new BufferedReader[args.length - 1];
        String[] lines = new String[brs.length];


        for (int i = 0; i < brs.length; i++)
        {
            brs[i] = new BufferedReader(new FileReader(args[i]));
        }

        for (int i = 0; i < brs.length; i++)
        {
            lines[i] = brs[i].readLine();
            while (lines[i] != null)
            {
                if (lines[i] != null)
                {
                    pw.println(lines[i]);
                    lines[i] = brs[i].readLine();
                }
            }
        }
        pw.flush();
        for (int i = 0; i < brs.length; i++)
        {
            brs[i].close();
        }
        pw.close();

        System.out.println("Obsah suborov bol uspesne spojeny.");
    }
}
