package merac;

/**
 * Program testuje prvky mnoziny dat, ktora prvky dokaze spracovat pomocou vhodneho meraca, pripadne jednotlive prvky mozu implementovat rozhranie Meratelny a byt sprocesovane klasickym sposobom.
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        class MeracObdlznikov implements IMerac
        {
            public double zmeraj(Object objekt)
            {
                Obdlznik obdlznik = (Obdlznik) objekt;
                double plocha = obdlznik.getSirka() * obdlznik.getVyska();
                return plocha;
            }
        }

        IMerac meracObdlznikov = new MeracObdlznikov();
        MnozinaDat obdlzniky = new MnozinaDat(meracObdlznikov);

        obdlzniky.pridaj(new Obdlznik(10, 10));
        obdlzniky.pridaj(new Obdlznik(20, 20));
        obdlzniky.pridaj(new Obdlznik(30, 30));

        System.out.println("Priemerna plocha obdlznika: " + obdlzniky.getPriemer());
        System.out.println("Ocakavana hodnota: 466.66");

        Object maxObdlznik = obdlzniky.getMaximum();
        System.out.println("Obdlznik s max plochou: " + meracObdlznikov.zmeraj(maxObdlznik));
        System.out.println("Ocakavana hodnota 900");

        MnozinaDat bankoveUcty = new MnozinaDat();

        bankoveUcty.pridaj(new BankovyUcet(0));
        bankoveUcty.pridaj(new BankovyUcet(10000));
        bankoveUcty.pridaj(new BankovyUcet(2000));

        System.out.println("Priemerny zostatok na ucte: " + bankoveUcty.getPriemer());
        System.out.println("Ocakavana hodnota: 4000");

        IMeratelny maxUcet = (IMeratelny) bankoveUcty.getMaximum();
        System.out.println("Ucet s najvyssim zostatkom: " + maxUcet.getMiera());
        System.out.println("Ocakavana hodnota: 10000");
    }
}
