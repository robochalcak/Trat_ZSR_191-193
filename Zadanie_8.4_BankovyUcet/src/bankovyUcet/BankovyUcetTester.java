package bankovyUcet;

/**
 * This class tests Bank account "BankovyUcet" class
 */

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        Klient klient = new Klient();
        klient.setMeno("Vojto");
        klient.setVek(32);
        klient.setIdCislo(12366);

        BankovyUcet ucet = new BankovyUcet();

        ucet.setKlient(klient);
        ucet.setZostatok(0);

        ucet.vloz(100);
        System.out.println(ucet.getZostatok());

        ucet.vloz(1500);

        System.out.println(ucet.getZostatok());

        ucet.vyber(350);

        System.out.println(ucet.getZostatok());

        System.out.println(ucet.vypisZUctu());

    }
}
