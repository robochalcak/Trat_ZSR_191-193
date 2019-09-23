package penazenka;

/**
 * Trieda testuje triedu Penazenka.
 */
public class PenazenkaTester
{
    public static void main(String[] args)
    {
        Penazenka penazenka = new Penazenka();
        penazenka.pridajMincu("Centovka");
        penazenka.pridajMincu("Eurovka");
        penazenka.pridajMincu("Dvojeurovka");

        Penazenka penazenka2 = new Penazenka();
        penazenka2.pridajMincu("Dvadsatcentovka");
        penazenka2.pridajMincu("Patcentovka");
        penazenka2.pridajMincu("Dvojeurovka");

        penazenka.doplnZInejPenazenky(penazenka2);

        System.out.println(penazenka.toString());
        System.out.println("Ocakavana hodnota: Penazenka[Centovka, Eurovka, Dvojeurovka, Dvadsatcentovka, Patcentovka, Dvojeurovka");
        System.out.println(penazenka2.toString());
        System.out.println("Ocakavana hodnota: Penazenka[]");
    }
}
