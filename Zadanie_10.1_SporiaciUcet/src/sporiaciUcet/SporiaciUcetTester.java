package sporiaciUcet;

/**
 * Program testuje triedu SporiaciUcet.
 */
public class SporiaciUcetTester
{
    public static void main(String[] args)
    {
        SporiaciUcet sporiaciUcet = new SporiaciUcet(10);
        sporiaciUcet.vloz(10000);
        sporiaciUcet.zapisUrok(); // aktualnyZostatok = 11000
        sporiaciUcet.vyber(5000);
        sporiaciUcet.vyber(3000);
        sporiaciUcet.vloz(10000);
        sporiaciUcet.zapisUrok(); // najnizsi zostatok bol 3000

        System.out.println("Aktualny zostatok: " + sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 13300.0");

    }
}
