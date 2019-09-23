package vstupUtils;

import java.util.Scanner;

/**
 * This class provides input validation
 */
public class VstupUtils
{
    /**
     * This method provides input validation and takes arguments:
     *
     * @param vstup        input from user
     * @param sprava       show dialog message
     * @param chyba        show error message
     * @param dolnaHranica minimum for range from
     * @param hornaHranica maximum for range to
     * @return user`s input integer.
     */
    public static int nacitajCeleCislo(Scanner vstup, String sprava, String chyba, int dolnaHranica, int hornaHranica)
    {
        System.out.println(sprava);
        int cislo = vstup.nextInt();

        while (cislo < dolnaHranica || cislo > hornaHranica)
        {
            System.out.println(chyba);
            System.out.println(sprava);
            cislo = vstup.nextInt();
        }
        return cislo;
    }
}
