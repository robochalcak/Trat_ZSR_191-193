package chrobak;

/**
 * This class is for testing class Chrobak
 */
public class SimulatorPohybuChrobaka // class declaration
{
    public static void main(String[] args) throws InterruptedException // main declaration with InterruptedException
    // for Thread.sleep funktion, with is a time when bug mov from one position to another
    {
        Chrobak chrobak = new Chrobak(10); // new object of chrobak /bug
        int ocakavana = 10;  // holds an expected position for testing methods;
        System.out.println("Chrobak teraz stoji: ");
        System.out.println(chrobak.getAktualnaPozicia());
        System.out.println("Ocakavana hodnota " + ocakavana++);
        System.out.println("==========================================");
        System.out.println("Chrobak teraz ide smer vpravo: ");
        System.out.println("___________________________________________");

        for (int i = 0; i < 10; i++)
        {
            chrobak.simulujPohyb();
            System.out.println("**************************************");
            System.out.println("Chrobak teraz lezie: ");
            System.out.println("Aktualna poloha chrobaka: " + chrobak.getAktualnaPozicia());
            System.out.println("**************************************");
            System.out.println("Ocakavana hodnota: " + ocakavana++);
            System.out.println("---------------------------------------");
            Thread.sleep(500); // the movement of the bug takes some time
        }

        System.out.println("___________________________");
        System.out.println("Chrobak meni smer do lava: "); // the bug is now changing the direction
        System.out.println("___________________________");
        ocakavana=19;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("**************************************");
            System.out.println("Chrobak teraz lezie:");
            chrobak.zmenSmer();
            System.out.println("Aktualna poloha chrobaka: " + chrobak.getAktualnaPozicia());
            System.out.println("**************************************");
            System.out.println("Ocakavana hodnota: " + ocakavana--);
            System.out.println("---------------------------------------");
            Thread.sleep(500);
        }
        System.out.println("Chrobak sa vratil spat do vychodzej polohy.");
    }
}
