package tester;

import bankovyUcet.BankovyUcet;

/**
 * Trieda testuje rozsirenu funkcionalitu triedy BankovyUcet.
 */

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet sporiaciUcet = new BankovyUcet(100);
        sporiaciUcet.pripisUrok(10);

        System.out.printf("Aktualny stav: %.2f%n", sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavany vysledok: 110.00");
    }
}
