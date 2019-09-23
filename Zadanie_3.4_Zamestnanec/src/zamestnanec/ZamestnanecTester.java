package zamestnanec;
/**
 Testovacia trieda pre triedu Zamestnanec.
 */
public class ZamestnanecTester
{
    public static void main(String[] args)
    {
        Zamestnanec pista = new Zamestnanec("Stefan Novak",800);
        pista.navysPlat(10);

        System.out.printf("Plat: %.2f%n",pista.getPlat());
        System.out.println("Ocakavany vysledok: 880.00");
    }
}
