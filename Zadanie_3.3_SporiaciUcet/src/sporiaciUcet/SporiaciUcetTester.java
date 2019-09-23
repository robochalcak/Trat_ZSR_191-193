package sporiaciUcet;

/**
 * Testuje triedu SporiaciUcet.
 */
public class SporiaciUcetTester
{
    public static void main(String[] args)
    {
        SporiaciUcet sporiaciUcet = new SporiaciUcet(500, 10);

        sporiaciUcet.pripisUrok();
        sporiaciUcet.pripisUrok();
        sporiaciUcet.pripisUrok();
        sporiaciUcet.pripisUrok();
        sporiaciUcet.pripisUrok();

        System.out.printf("Aktualny zostatok je: %.2f%n", sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavany vysledok je: 805,25 ");
    }
}
