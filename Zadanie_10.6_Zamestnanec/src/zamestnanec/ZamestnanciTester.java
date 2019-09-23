package zamestnanec;

/**
 * Program testuje triedu Zamestnanca a vsetky jej podtriedy.
 */
public class ZamestnanciTester
{
    public static void main(String[] args)
    {
        Zamestnanec zamestnanec = new Zamestnanec("Igor Kovac", 1970);
        Manazer manazer = new Manazer("Maria Novotna", "Vymahanie pohladavok", 2050);
        Veduci veduci = new Veduci("Monika Bizikova", "CEO", 2300);

        System.out.println(zamestnanec.toString());
        System.out.println("Ocakavana hodnota: Igor Kovac, 1970 Eur.");
        System.out.println(manazer.toString());
        System.out.println("Ocakavana hodnota: Maria Novotna, Vymahanie pohladavok, 2050 Eur.");
        System.out.println(veduci.toString());
        System.out.println("Ocakavana hodnota: Monika Bizikova, CEO, 2300 Eur.");
    }
}
