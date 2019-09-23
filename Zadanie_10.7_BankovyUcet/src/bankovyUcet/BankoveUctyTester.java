package bankovyUcet;

/**
 * Program testuje triedu BankovyUcet a jej podtriedy.
 */
public class BankoveUctyTester
{
    public static void main(String[] args)
    {
        SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
        BeznyUcet beznyUcet = new BeznyUcet(2.40);

        test(sporiaciUcet);
        System.out.println(sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavany zostatok: 6300.0");

        test(beznyUcet);
        System.out.println(beznyUcet.getAktualnyZostatok());
        System.out.println("Ocakavany zostatok: 5997.6");
    }

    private static void test(BankovyUcet ucet)
    {
        for (int i = 1; i <= 5; i++)
        {
            if (i % 2 == 1)
            {
                ucet.vloz(i * 1000);
            }
            else
            {
                ucet.vyber(i * 500);
            }
        }
        ucet.koniecMesiaca();
    }
}
