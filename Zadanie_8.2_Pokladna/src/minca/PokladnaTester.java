package minca;

public class PokladnaTester
{
    public static void main(String[] args)
    {
        final double HODNOTA_1_EURA = 1.0;
        final double HODNOTA_50_CENTOV = 0.5;
        final double HODNOTA_20_CENTOV = 0.2;
        final double HODNOTA_10_CENTOV = 0.1;
        final double HODNOTA_5_CENTOV = 0.05;
        final double HODNOTA_2_CENTOV = 0.02;
        final double HODNOTA_1_CENTU = 0.01;

        Pokladna pokladna = new Pokladna();
        pokladna.nacitajTovar(2.59);
        pokladna.nacitajTovar(6.99);

        Minca[] typyMinci = new Minca[]{new Minca(HODNOTA_1_EURA, "euro"),
                new Minca(HODNOTA_50_CENTOV, "padesiat " + "centov"),
                new Minca(HODNOTA_20_CENTOV, "dvadsat centov"),
                new Minca(HODNOTA_10_CENTOV, "desat " + "centov"),
                new Minca(HODNOTA_5_CENTOV, "pat centov"),
                new Minca(HODNOTA_2_CENTOV, "dva " + "centy"),
                new Minca(HODNOTA_1_CENTU, "jeden cent")};
        pokladna.prijmiHotovost(9,typyMinci[0]);
        pokladna.prijmiHotovost(1,typyMinci[1]);
        pokladna.prijmiHotovost(1,typyMinci[2]);

        int[] ocakavanyVydavok = {0, 0, 0, 1, 0, 1, 0};

        for (int i = 0; i < typyMinci.length; i++)
        {
            Minca m = typyMinci[i];
            int vydavok = pokladna.dajVydavok(m);
            System.out.println(m.getNazovMince() + ": " + vydavok);
            System.out.println("Ocakavana hodnota: " + ocakavanyVydavok[i]);
        }
    }
}
