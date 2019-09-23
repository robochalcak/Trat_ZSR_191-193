package dveCisla;

import java.util.Scanner;

/**
 * This class provides testing all methods from Dvojica class
 */
public class DvojicaTester // class declaration
{
    public static void main(String[] args) // main method declaration
    {
        Scanner keyboard = new Scanner(System.in);  // new scanner object necessary for input from user
        System.out.println("Zadaj dva lubovolne cisla:  Cislo 1 :");
        double cislo1 = keyboard.nextDouble();
        System.out.println("Cislo 2 :");
        double cislo2 = keyboard.nextDouble();

        Dvojica dvojica = new Dvojica(cislo1, cislo2);
        System.out.println("*******Realne vysledky************");
        System.out.println("Sucet cisiel: " + dvojica.getSucet());
        System.out.println("Rozdiel cisiel : " + dvojica.getRozdiel());
        System.out.println("Sucin dvoch cisiel: " + dvojica.getSucin());
        System.out.println("Priemer dvoch cisiel: " + dvojica.getPriemer());
        System.out.println("Najvecsie cislo z dvojice hodnot: " + dvojica.getNajvacsieCislo());
        System.out.println("Najmensie cislo z dvojice hodnot: " + dvojica.getNajmensieCislo());
        System.out.println("Vzdialenost rozdielu cisiel: "+dvojica.getVzdialenost());

        System.out.println("******Ocakavane hodnoty***********");
        System.out.println("**V pripade zadania cisiel 2.5 a 3.4");
        System.out.println("Sucet cisiel: 5.9");
        System.out.println("Rozdiel cisiel : -0.9");
        System.out.println("Sucin dvoch cisiel: 8.5");
        System.out.println("Priemer dvoch cisiel: 2.95 ");
        System.out.println("Najvecsie cislo z dvojice hodnot: 3.4");
        System.out.println("Najmensie cislo z dvojice hodnot: 2.5");
        System.out.println("Vzdialenost, cize absolutna hodnota rozdielu je : 0.9");
    }
}
