package robotnik;
/**
 Program testuje triedu Robotnik a vsetky jej podtriedy.
 */
public class ZamestnanciTester
{
    public static void main(String[] args)
    {
        Robotnik brigadnik = new Brigadnik("Igor",4.5);

        Robotnik ttpckar = new TPPZamestnanec("Emil",12.5);

        System.out.println(brigadnik.vypocitajMzdu(30));
        System.out.println("Ocakavana hodnota: 157.5");

        System.out.println(ttpckar.vypocitajMzdu(30));
        System.out.println("Ocakavana hodnota 500");

        System.out.println(brigadnik.vypocitajMzdu(50));
        System.out.println("Ocakavana hodnota: 292.5");

        System.out.println(ttpckar.vypocitajMzdu(50));
        System.out.println("Ocakavana hodnota: 500");
    }
}
