package konvertor;

import java.util.Scanner;

/**
 * Class contains main method, with provides conversion of user inputs in meters in to selected metrics units
 */
public class KonvertorTester
{
    public static void main(String[] args)
    {
        final double MILE_NA_KILOMETRE = 1.609;
        final double CENTIMETER = 100;
        final double STOPA = 100 / 30.480;
        final double PALEC = 100 / 2.54;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Zadaj vysku v metroch: ");
        double metre = keyboard.nextDouble();

        System.out.println("Prevod na mile: ");
        Konvertor konvertor = new Konvertor(metre * MILE_NA_KILOMETRE);
        System.out.println("Pocet kilometrov : " + konvertor.konvertujNa(1000));
        System.out.println("Pocet mil: " + konvertor.konvertujZ(1000 * MILE_NA_KILOMETRE));

        System.out.println("Prevod na centimetre: ");
        Konvertor kon = new Konvertor(metre * CENTIMETER);
        System.out.println("Pocet centimetrov: " + kon.konvertujNa(1));
        System.out.println("Pocet metrov: " + kon.konvertujZ(CENTIMETER));

        System.out.println("Prevod na Stopy: ");
        Konvertor konvertor1 = new Konvertor(metre * STOPA);
        System.out.printf("Pocet stop: %.4f%n", konvertor1.konvertujNa(1));
        System.out.println("Pocet metrov: " + konvertor1.konvertujZ(STOPA));

        System.out.println("Prevod na palce: ");
        Konvertor palec = new Konvertor(metre * PALEC);
        System.out.printf("Pocet palcov:%.4f%n ", palec.konvertujNa(1));

    }
}
