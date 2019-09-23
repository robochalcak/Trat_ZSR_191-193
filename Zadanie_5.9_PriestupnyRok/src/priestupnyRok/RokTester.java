package priestupnyRok;

/**
 * This class tests class Rok
 */
public class RokTester
{
    public static void main(String[] args)
    {
        Rok rok = new Rok(1980);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: true");

        rok = new Rok(1900);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: false");

        rok = new Rok(2000);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: true");

        rok = new Rok(1500);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: false");

        rok = new Rok(1501);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: false");

        rok = new Rok(2020);
        System.out.println(rok.jePriestupny());
        System.out.println("Ocakavana hodnota: true");
    }
}
