package words;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program startuje aplikaciu na kontrolu pravopisu v subore.
 */
public class SpustacVerifikatorPravopisu
{
    public static void main(String[] args) throws IOException
    {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj cestu k suboru words: ");
        String slovnik = vstup.nextLine();

        Scanner slovnikovyVstup = new Scanner(new FileReader(slovnik));
        VerifikatorPravopisu verifikator = new VerifikatorPravopisu(slovnikovyVstup);


        System.out.println("Subor na kontrolu pravopisu: ");
        String nazovSuboru = vstup.nextLine();

        Scanner subor = new Scanner(new FileReader(nazovSuboru));

        while (subor.hasNextLine())
        {
            String kontrolovaneSlovo = subor.nextLine();
            if (!verifikator.jeValidne(kontrolovaneSlovo))
            {
                System.out.println(kontrolovaneSlovo);

            }
            kontrolovaneSlovo = subor.nextLine();
        }

        slovnikovyVstup.close();
    }
}
