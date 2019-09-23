package kocka;

/**
 * Program simuluje hod kockou a následne zobrazí priemernú hodnotu hodu.
 */
public class SimulatorHoduKockou
{
    public static void main(String[] args)
    {
        final int POCET_POKUSOV = 10;
        MnozinaDat hodyKockou = new MnozinaDat();

        for (int i = 1; i <= POCET_POKUSOV; i++)
        {
            Kocka kocka = new Kocka(6);
            int cislo = kocka.hod();
            hodyKockou.pridaj(cislo);
            System.out.print(cislo + " ");
        }
        System.out.println();
        System.out.println("Priemerny hod kockou: " + hodyKockou.getPriemer());

    }
}
