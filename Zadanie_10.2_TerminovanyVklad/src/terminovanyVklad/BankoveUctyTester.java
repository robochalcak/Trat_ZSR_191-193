package terminovanyVklad;
/**
 Program testuje rozne typy bankovych uctov
 */
public class BankoveUctyTester
{
    public static void main(String[] args)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(123456,0);

        SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
        BeznyUcet beznyUcet = new BeznyUcet(1000);
        TerminovanyUcet terminovanyUcet = new TerminovanyUcet(10,3);

        sporiaciUcet.vloz(10000);

        sporiaciUcet.vlozNaUcet(2000, beznyUcet);
        beznyUcet.vyber(1500);
        beznyUcet.vyber(80);

        sporiaciUcet.vlozNaUcet(1000,beznyUcet);
        beznyUcet.vyber(400);

        sporiaciUcet.vlozNaUcet(3000,terminovanyUcet);
        terminovanyUcet.vyber(400);

        sporiaciUcet.zapisUrok();
        terminovanyUcet.zapisUrok();
        beznyUcet.setPoplatky(1.5);
        beznyUcet.zauctujPoplatky();

        System.out.println("Zostatok na beznom ucte: "+beznyUcet.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 2018.5");
        System.out.println("Zostatok na sporiacom ucte: "+sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 10500");
        System.out.println("Zostatok na terminovanom ucte: "+terminovanyUcet.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 2842.4");

        TerminovanyUcet terminovanyUcet1 = new TerminovanyUcet(10,3);
        terminovanyUcet1.vloz(20000);
        System.out.println("Zostatok na terminovanom ucte: "+terminovanyUcet1.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 20000");
        terminovanyUcet1.vyber(20000);//informativne tranzakcia sa neuskutocni,pretoze ciastka s pokutou prevysuje
        // zostatok takze zostatok ostane nezmeneny a pokuta ma len informativny charakter
        System.out.println("Ocakavana hodnota infa o pokute: 800");
        System.out.println(terminovanyUcet1.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota je 20000");


        SporiaciUcet sporiaciUcet1 = new SporiaciUcet(10);
        sporiaciUcet1.vloz(10000);
        sporiaciUcet1.zapisUrok(); // aktualnyZostatok = 11000
        sporiaciUcet1.vyber(5000);
        sporiaciUcet1.vyber(3000);
        sporiaciUcet1.vloz(10000);
        sporiaciUcet1.zapisUrok(); // najnizsi zostatok bol 3000

        System.out.println("Aktualny zostatok: " + sporiaciUcet1.getAktualnyZostatok());
        System.out.println("Ocakavana hodnota: 13300.0");
    }
}
