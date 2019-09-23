package mnozinaDat;

/**
 * Program testuje pouzitie rozhrania Merac a Filter.
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        class MeracBankovychUctov implements IMerac
        {

            @Override
            public double zmeraj(Object objekt)
            {
                BankovyUcet ucet = (BankovyUcet) objekt;
                return ucet.getZostatok();
            }
        }

        class FilterBankovychUctov implements Filter
        {

            @Override
            public boolean akceptuje(Object objekt)
            {
                BankovyUcet ucet = (BankovyUcet) objekt;
                return ucet.getZostatok() >= 1000;
            }
        }

        IMerac merac = new MeracBankovychUctov();
        Filter filter = new FilterBankovychUctov();
        MnozinaDat bankoveUcty = new MnozinaDat(merac, filter);

        bankoveUcty.pridaj(new BankovyUcet(1));
        bankoveUcty.pridaj(new BankovyUcet(100));
        bankoveUcty.pridaj(new BankovyUcet(2000));
        bankoveUcty.pridaj(new BankovyUcet(950));
        bankoveUcty.pridaj(new BankovyUcet(4000));

        System.out.println("Priemerny zostatok na ucte: " + bankoveUcty.getPriemer());
        System.out.println("Ocakavana hodnota: 3000");

        BankovyUcet ucetMax = (BankovyUcet) bankoveUcty.getMaximum();
        double zostatok = ucetMax.getZostatok();
        System.out.println("Najvyssi zostatok na ucte je: " + zostatok);
        System.out.println("Ocakavana hodnota: 4000");

        bankoveUcty.pridaj(new BankovyUcet(1), filter);
        bankoveUcty.pridaj(new BankovyUcet(100), filter);
        bankoveUcty.pridaj(new BankovyUcet(2000), filter);
        bankoveUcty.pridaj(new BankovyUcet(950), filter);
        bankoveUcty.pridaj(new BankovyUcet(4000), filter);

        System.out.println("Zoznam zostatkov prevysujucich, alebo rovnajucich sa 1000 Eur: ");
        System.out.println("Ocakavane hodnoty:  2000 a 4000 eur.");
        bankoveUcty.vypisAkceptovane();
    }
}
