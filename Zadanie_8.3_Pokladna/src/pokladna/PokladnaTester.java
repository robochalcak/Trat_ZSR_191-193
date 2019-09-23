package pokladna;

public class PokladnaTester
{
    public static void main(String[] args)
    {
        final double HODNOTA_2_EURA = 2.0;
        final double HODNOTA_1_EURA = 1.0;
        final double HODNOTA_50_CENTOV = 0.5;
        final double HODNOTA_20_CENTOV = 0.2;
        final double HODNOTA_10_CENTOV = 0.1;
        final double HODNOTA_5_CENTOV = 0.05;
        final double HODNOTA_2_CENTOV = 0.02;
        final double HODNOTA_1_CENTU = 0.01;

        final double HODNOTA_5_EUR = 5.0;
        final double HODNOTA_10_EUR = 10.0;
        final double HODNOTA_20_EUR = 20.0;
        final double HODNOTA_50_EUR = 50.0;
        final double HODNOTA_100_EUR = 100.0;
        final double HODNOTA_200_EUR = 200.0;
        final double HODNOTA_500_EUR = 500.0;

        Pokladna pokladna = new Pokladna();
        pokladna.nacitajTovar(2.59);
        pokladna.nacitajTovar(6.99);
        pokladna.nacitajTovar(9.99);

        Minca[] typyMinci = new Minca[]{new Minca(HODNOTA_1_EURA, "euro"), new Minca(HODNOTA_50_CENTOV, "padesiat " + "centov"), new Minca(HODNOTA_20_CENTOV, "dvadsat centov"), new Minca(HODNOTA_10_CENTOV, "desat " + "centov"), new Minca(HODNOTA_5_CENTOV, "pat centov"), new Minca(HODNOTA_2_CENTOV, "dva " + "centy"), new Minca(HODNOTA_1_CENTU, "jeden cent"), new Minca(HODNOTA_2_EURA, "dva eura")};

        Bankovka[] typBankovky = new Bankovka[]{new Bankovka(HODNOTA_5_EUR, "pat eur"), new Bankovka(HODNOTA_10_EUR, "desat eur"), new Bankovka(HODNOTA_20_EUR, "dvadsat eur"), new Bankovka(HODNOTA_50_EUR, "padesat eur"), new Bankovka(HODNOTA_100_EUR, "sto eur"), new Bankovka(HODNOTA_200_EUR, "dvesto eur"), new Bankovka(HODNOTA_500_EUR, "patsto eur")};


        pokladna.prijmiHotovost(1, typBankovky[1]);
        pokladna.prijmiHotovost(1, typBankovky[0]);
        pokladna.prijmiHotovost(1, typyMinci[7]);
        pokladna.prijmiHotovost(2, typyMinci[0]);
        pokladna.prijmiHotovost(1, typyMinci[1]);
        pokladna.prijmiHotovost(1, typyMinci[2]);


        for (int i = 0; i < typBankovky.length; i++)
        {
            Bankovka b = typBankovky[i];
            int vydavok = pokladna.dajVydavok(b);
            System.out.println(b.getTypBankovky() + ": " + vydavok);
            System.out.println("Ocakavana hodnota: 0");
        }
        int[] ocakavanyVydavok = {0, 0, 0, 1, 0, 1, 2, 0};

        for (int i = 0; i < typyMinci.length; i++)
        {
            Minca m = typyMinci[i];
            int vydavok = pokladna.dajVydavok(m);
            System.out.println(m.getNazovMince() + ": " + vydavok);
            System.out.println("Ocakavana hodnota: " + ocakavanyVydavok[i]);
        }

    }
}
