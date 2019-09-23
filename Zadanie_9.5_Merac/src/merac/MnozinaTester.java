package merac;

/**
 * Program demonstruje pouzivanie roznych typov meracov v triede mnozina dat.
 */
public class MnozinaTester
{
    public static void main(String[] args)
    {
        IMerac meracObdlznikov = new MeracObldznikov();

        MnozinaDat obdlzniky = new MnozinaDat(meracObdlznikov);

        obdlzniky.pridaj(new Obdlznik(10, 10));
        obdlzniky.pridaj(new Obdlznik(20, 20));
        obdlzniky.pridaj(new Obdlznik(30, 30));

        System.out.println("Priemerny obvod obdlznika: " + obdlzniky.getPriemer());
        System.out.println("Ocakavana hodnota: 80");

        Obdlznik minObdlznik = (Obdlznik) obdlzniky.getMinimum();
        System.out.println("Obdlznik s najmensim obvodom je: " + minObdlznik.getObvod());
        System.out.println("Ocakavana hodnota: 40");

        Obdlznik maxObdlznik = (Obdlznik) obdlzniky.getMaximum();
        System.out.println("Obdlznik s najvacsim obvodom je: " + maxObdlznik.getObvod());
        System.out.println("Ocakavana hodnota: 120");

        // TODO: 1) vytvorit merac bankovych uctov
        //              2) vytvorit mnozinu dat a odovzdat jej dany merac
        //              3) pridat minimalne 3 bankove ucty do mnoziny
        //              4) vypocitat minimum, maximum a priemer pre mnozinu dat
        //              5) vypisat ziskane a ocakavane hodnoty na standardny vystup


        IMerac meracBankovychUctov = new MeracBankovychUctov();
        MnozinaDat bankoveUcty = new MnozinaDat(meracBankovychUctov);

        bankoveUcty.pridaj(new BankovyUcet(2580.0, 123));
        bankoveUcty.pridaj(new BankovyUcet(1258, 124));
        bankoveUcty.pridaj(new BankovyUcet(3251, 125));

        System.out.printf("Priemerny zostatok na ucte je: %.2f", bankoveUcty.getPriemer(), " eur\n");
        System.out.println("Ocakavana hodnota: 2363 eur");

        BankovyUcet maxUcet = (BankovyUcet) bankoveUcty.getMaximum();

        System.out.println("Ucet s najvyssim zostatkom je: " + bankoveUcty.getMaximum());
        System.out.println("Ocakavana hodnota: " + 3251 + " eur.");

        BankovyUcet minUcet = (BankovyUcet) bankoveUcty.getMinimum();

        System.out.println("Ucet s najnizsim zostatkom je: " + bankoveUcty.getMinimum());
        System.out.println("Ocakavana hodnota: " + 1258 + " eur.");

        //              6) vytvorit merac minci
        //              7) vytvorit mnozinu dat a odovzdat jej dany merac
        //              8) pridat minimalne 3 mince do mnoziny
        //              9) vypocitat minimum, maximum a priemer pre mnozinu dat
        //            10) vypisat ziskane a ocakavane hodnoty na standardny vystup

        IMerac meracMinci = new MeracMinci();
        MnozinaDat mince = new MnozinaDat(meracMinci);

        mince.pridaj(new Minca("DVA EURA", 2.0));
        mince.pridaj(new Minca("JEDNO EURO", 1.0));
        mince.pridaj(new Minca("PATDESIAT CENTOV", 0.50));

        System.out.printf("Priemerna hodnota minci je: %.2f%n", mince.getPriemer());
        System.out.println("Ocakavana hodnota je : 1.17 centov ");
        Minca minMinca = (Minca) mince.getMinimum();

        System.out.println("Minca s najnizsiou hodnotou je : " + mince.getMinimum());
        System.out.println("Ocakavana hodnota 0.50 eur. ");

        Minca maxMinca = (Minca) mince.getMaximum();

        System.out.println("Minca s najvyssiou hodnotou je : " + mince.getMaximum());
        System.out.println("Ocakavana hodnota je 2.0 eur.");

        //            11) vytvorit merac pre lubovolnu vami vytvorenu triedu (Osoba, Student, Auto, Cokolvek)
        //            12) vytvorit mnozinu dat a odovzdat jej dany merac
        //            13) pridat minimalne 3 objekty vasej triedy do mnoziny
        //            14) vypocitat minimum, maximum a priemer pre mnozinu dat
        //            15) vypisat ziskane a ocakavane hodnoty na standardny vystup

        IMerac meracOsob = new MeracOsob();
        MnozinaDat osoby = new MnozinaDat(meracOsob);

        osoby.pridaj(new Osoba("Janko", 28, 185));
        osoby.pridaj(new Osoba("Palko", 32, 175));
        osoby.pridaj(new Osoba("Zuzka", 26, 165));

        System.out.println("Priemerna vyska osob je: " + osoby.getPriemer() + " cm.");
        System.out.println("Ocakavana hodnota je: 175 cm.");

        Osoba najvyssia = (Osoba) osoby.getMaximum();

        System.out.println("Najvyssia osoba je: " + osoby.getMaximum());
        System.out.println("Ocakavana hodnota: 185 cm");

        Osoba najnizsia = (Osoba) osoby.getMinimum();

        System.out.println("Najnizsia osoba je: " + osoby.getMinimum());
        System.out.println("Ocakavana hodnota je 165");

    }
}
