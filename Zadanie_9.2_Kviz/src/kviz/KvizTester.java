package kviz;

/**
 * This class test classes "Kviz"-quiz and "MnozinaDat" dataSet class
 */
public class KvizTester
{
    public static void main(String[] args)
    {
        MnozinaDat kvizy = new MnozinaDat();
        Kviz kviz1 = new Kviz(89, "B+");
        Kviz kviz2 = new Kviz(90, "A-");
        Kviz kviz3 = new Kviz(73, "c");

        kvizy.pridaj(kviz1);
        kvizy.pridaj(kviz2);
        kvizy.pridaj(kviz3);


        System.out.println("Priemerna hodnota kvizu: " + kvizy.getPriemer());
        System.out.println("Ocakavana hodnota: 84");

        System.out.println("Najvyssia hodnota kvizu: " + kvizy.getNajvyssie());
        System.out.println("Ocakavana hodnota: 90");

        System.out.println("Najvyssia znamka kvizu: " + kvizy.getNajvyssie());
        System.out.println("Znamka: " + kviz2.getPismenoZnamka());
        System.out.println("Ocakavana hodnota: A-");

        System.out.println("Najnizsia znamka kvizu: " + kvizy.getNajnizsie());
        System.out.println("Znamka: " + kviz3.getPismenoZnamka());
        System.out.println("Ocakavana hodnota: C");
    }
}
