package mesiac;

import java.util.Scanner;

/**
 * Program zobrazi pocet dni v ramci daneho mesiaca.
 */
public class KalendarnyMesiacTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj poradove cislo mesiaca (1-12): ");

        int indexMesiaca = vstup.nextInt();
        Mesiac mesiac = new Mesiac(indexMesiaca);
        int pocetDni = mesiac.getPocetDni();
        System.out.println("Mesiac ma " + pocetDni);

        vstup.close();
    }
}
