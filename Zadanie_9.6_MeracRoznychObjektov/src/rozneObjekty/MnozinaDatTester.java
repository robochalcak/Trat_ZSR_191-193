package rozneObjekty;

/**
 * Tato trieda testuje merace roznych objektov a triedu mnozina dat s objektami a zobrazuje na konzolu rozne
 * statisticke cinnitele
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        IMerac meracObdlznikovObsah = new MeracObdlznikovObsah();
        MnozinaDat obdlznikyObsah = new MnozinaDat(meracObdlznikovObsah);

        obdlznikyObsah.pridaj(new Obdlznik(10, 10));
        obdlznikyObsah.pridaj(new Obdlznik(20, 20));
        obdlznikyObsah.pridaj(new Obdlznik(30, 30));

        System.out.println("==============================================");
        System.out.println("Meranie obsahu obdlznikov a jeho porovnavanie ");
        System.out.println("Primerny obsah obdlznika je: " + obdlznikyObsah.gePriemer());
        System.out.println("Ocakavana hodnota: 466.6666");
        System.out.println("Obdlznik s najvyssim obsahom je: " + obdlznikyObsah.getMaximum());
        System.out.println("Ocakavana hodnota: obdlznik so stranami 30x30");
        System.out.println("Obdlznik s najmensim obsahom je: " + obdlznikyObsah.getMinimum());
        System.out.println("Ocakavana hodnota: obdlznik so stranami 10x10");

        IMerac meracObdlznikovObvod = new MeracObdlznikovObvod();
        MnozinaDat obdlznikyObvod = new MnozinaDat(meracObdlznikovObvod);

        obdlznikyObvod.pridaj(new Obdlznik(10, 10));
        obdlznikyObvod.pridaj(new Obdlznik(20, 20));
        obdlznikyObvod.pridaj(new Obdlznik(30, 30));

        System.out.println("==============================================");
        System.out.println("Meranie obvodu obdlznikov a jeho porovnavanie ");
        System.out.println("Priemerny obvod obdlznikov je: " + obdlznikyObvod.gePriemer());
        System.out.println("Ocakavana hodnota je: 80.0");
        System.out.println("Obdlznik s najvacsim obvodom : " + obdlznikyObvod.getMaximum());
        System.out.println("Ocakavana hodnota obvodu je: 120");
        System.out.println("Obdlznik s najmensim obvodom : " + obdlznikyObvod.getMinimum());
        System.out.println("Ocakavana hodnota obvodu je: 40");
        System.out.println("==============================================");

        IMerac meracRychlostiAuta = new MeracRychlostiAuta();
        MnozinaDat rychlostAuta = new MnozinaDat(meracRychlostiAuta);

        rychlostAuta.pridaj(new Auto("BMW", 250, 4, 5, 4500.25));
        rychlostAuta.pridaj(new Auto("Audi", 260, 5, 5, 4652));
        rychlostAuta.pridaj(new Auto("Porsche", 350, 5, 2, 4700));

        System.out.println("==============================================");
        System.out.println("Meranie rychlosti auta a jej porovnavanie");
        System.out.println("==============================================");
        System.out.println("Primer maximalnej povolenej rychlosti je: " + rychlostAuta.gePriemer());
        System.out.println("Ocakavana hodnota: 286.66");
        System.out.println("Auto s najvyssiou povolenou rychlostou: ");
        System.out.println(rychlostAuta.getMaximum());
        System.out.println("Ocakavana hodnota auto s povolenou rychlostiou 350");
        System.out.println("Auto s najnizsiou povolenou rychlostou: ");
        System.out.println(rychlostAuta.getMinimum());
        System.out.println("Ocakavana hodnota auto s povolenou rychlostou 250");

        System.out.println("==============================================");
        System.out.println("Meranie rychlosti auta a jej porovnavanie");
        System.out.println("==============================================");
        System.out.println("Primer maximalnej povolenej rychlosti je: " + rychlostAuta.gePriemer());
        System.out.println("Ocakavana hodnota: 286.66");
        System.out.println("Auto s najvyssiou povolenou rychlostou: ");
        System.out.println(rychlostAuta.getMaximum());
        System.out.println("Ocakavana hodnota auto s povolenou rychlostiou 350");
        System.out.println("Auto s najnizsiou povolenou rychlostou: ");
        System.out.println(rychlostAuta.getMinimum());
        System.out.println("Ocakavana hodnota auto s povolenou rychlostou 250");

        IMerac meracNapravAuta = new MeracPoctuNapravAuta();
        MnozinaDat napravyAuta = new MnozinaDat(meracNapravAuta);

        napravyAuta.pridaj(new Auto("BMW", 250, 4, 5, 4500.25));
        napravyAuta.pridaj(new Auto("Audi", 260, 5, 4, 4652));
        napravyAuta.pridaj(new Auto("Porsche", 350, 5, 2, 4700));

        System.out.println("==============================================");
        System.out.println("Meranie poctu naprav auta a jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Primer poctu naprav auta je: " + napravyAuta.gePriemer());
        System.out.println("Ocakavana hodnota: 4.66");
        System.out.println("Auto s najvacsim poctom naprav : ");
        System.out.println(napravyAuta.getMaximum());
        System.out.println("Ocakavana hodnota auto s poctom naprav 5");
        System.out.println("Auto s najmensim poctom naprav : ");
        System.out.println(rychlostAuta.getMinimum());
        System.out.println("Ocakavana hodnota auto s povolenou rychlostou 4");

        IMerac meracKapacityAuta = new MeracKapacityAuta();
        MnozinaDat kapacitaAuta = new MnozinaDat(meracKapacityAuta);

        kapacitaAuta.pridaj(new Auto("BMW", 250, 4, 5, 4500.25));
        kapacitaAuta.pridaj(new Auto("Audi", 260, 5, 4, 4652));
        kapacitaAuta.pridaj(new Auto("Porsche", 350, 5, 2, 4700));

        System.out.println("==============================================");
        System.out.println("Meranie poctu miest na sedenie a jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Primer poctu miest na sedenie u aut je: " + kapacitaAuta.gePriemer());
        System.out.println("Ocakavana hodnota: 3.66");
        System.out.println("Auto s najvacsim poctom miest na sedenie : ");
        System.out.println(kapacitaAuta.getMaximum());
        System.out.println("Ocakavana hodnota auto s poctom miest na sedenie 5");
        System.out.println("Auto s najmensim poctom miest na sedenie : ");
        System.out.println(kapacitaAuta.getMinimum());
        System.out.println("Ocakavana hodnota auto s najmensim poctom miest na sedenie 2");


        IMerac meracVekuStudenta = new MeracVekuStudenta();
        MnozinaDat vekStudentov = new MnozinaDat(meracVekuStudenta);

        vekStudentov.pridaj(new Student("Janko", 28, 2.8));
        vekStudentov.pridaj(new Student("Marienka", 29, 1.5));
        vekStudentov.pridaj(new Student("Palko", 30, 2.0));

        System.out.println("==============================================");
        System.out.println("Meranie veku studentov a jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Primer veku studentov je : " + vekStudentov.gePriemer());
        System.out.println("Ocakavana hodnota: 29");
        System.out.println("Najstarsi student je : ");
        System.out.println(vekStudentov.getMaximum());
        System.out.println("Ocakavana hodnota: Student, ktory ma  30 rokov.");
        System.out.println("Najmladsi student : ");
        System.out.println(vekStudentov.getMinimum());
        System.out.println("Ocakavana hodnota student, ktory ma 28 rokov.");

        IMerac meracPriemeruZnamok = new MeracPriemeruZnamokStudenta();
        MnozinaDat priemerZnamok = new MnozinaDat(meracPriemeruZnamok);

        priemerZnamok.pridaj(new Student("Janko", 28, 2.8));
        priemerZnamok.pridaj(new Student("Marienka", 29, 1.5));
        priemerZnamok.pridaj(new Student("Palko", 30, 2.0));

        System.out.println("==============================================");
        System.out.println("Meranie priemeru znamok studentov a jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Priemer znamiek j : " + priemerZnamok.gePriemer());
        System.out.println("Ocakavana hodnota: 2.1");
        System.out.println("Najhorsie (Najvyssie) znamky ma student: ");
        System.out.println(priemerZnamok.getMaximum());
        System.out.println("Ocakavana hodnota: Student, ktory ma priemer 2.8");
        System.out.println("Najlepsie (Najnizsie) znamky ma student: ");
        System.out.println(priemerZnamok.getMinimum());
        System.out.println("Ocakavana hodnota student, ktory ma priemer 1.5.");

        IMerac meracTepuSportovca = new MeracTepuSportovca();
        MnozinaDat tepSportovca = new MnozinaDat(meracTepuSportovca);

        tepSportovca.pridaj(new Sportovec("Sagan", 125, 32));
        tepSportovca.pridaj(new Sportovec("Palfy", 135, 22));
        tepSportovca.pridaj(new Sportovec("Fialova", 124, 25));

        System.out.println("==============================================");
        System.out.println("Meranie tepu sportovcov jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Priemer tepu je : " + tepSportovca.gePriemer());
        System.out.println("Ocakavana hodnota: 128");
        System.out.println("Najvyssi tep ma sportovec: ");
        System.out.println(tepSportovca.getMaximum());
        System.out.println("Ocakavana hodnota: Sportovec s tepom 135");
        System.out.println("Najnizsi tep ma sportovec: ");
        System.out.println(tepSportovca.getMinimum());
        System.out.println("Ocakavana hodnota Sportovec s tepom 124.");


        IMerac meracVekuSportovca = new MeracVekuSportovca();
        MnozinaDat vekSportovca = new MnozinaDat(meracVekuSportovca);

        vekSportovca.pridaj(new Sportovec("Sagan", 125, 32));
        vekSportovca.pridaj(new Sportovec("Palfy", 135, 22));
        vekSportovca.pridaj(new Sportovec("Fialova", 124, 25));

        System.out.println("==============================================");
        System.out.println("Meranie veku sportovcov jeho porovnavanie");
        System.out.println("==============================================");
        System.out.println("Priemer veku je : " + vekSportovca.gePriemer());
        System.out.println("Ocakavana hodnota: 26.33");
        System.out.println("Najstarsi sportovec: ");
        System.out.println(vekSportovca.getMaximum());
        System.out.println("Ocakavana hodnota: Sportovec s vekom 32 rokov");
        System.out.println("Najmladsi sportovec: ");
        System.out.println(vekSportovca.getMinimum());
        System.out.println("Ocakavana hodnota Sportovec s vekom 22.");

    }
}
