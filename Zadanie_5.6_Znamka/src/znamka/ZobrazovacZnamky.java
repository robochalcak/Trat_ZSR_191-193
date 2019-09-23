package znamka;

        import java.util.Scanner;

/**
 * Nasledovna trieda testu spravnost koverzia znamky studenta z ciselnej reprezentacie na jej pismenkovy ekvivalent.
 */
public class ZobrazovacZnamky
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj ciselnu hodnotu znamky: ");
        double ciselnaHodnota = vstup.nextDouble();

        Znamka znamka = new Znamka(ciselnaHodnota);

        System.out.println("Znamka studenta: " + znamka.getPismenkovaReprezentacia());
    }
}

