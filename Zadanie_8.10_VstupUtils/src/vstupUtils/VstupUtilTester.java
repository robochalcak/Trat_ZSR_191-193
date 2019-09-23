package vstupUtils;

import java.util.Scanner;

/**
 * This class provides test for "VstupUtilTester" class.
 */
public class VstupUtilTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        int vek = VstupUtils.nacitajCeleCislo(vstup, "Prosim zadaj svoj vek", "Chybny vstup", 1, 150);
        System.out.println("Nasledujuci rok budes o rok starsi a budes mat " + (++vek) + " rokov.");

        vstup.close();
    }
}
