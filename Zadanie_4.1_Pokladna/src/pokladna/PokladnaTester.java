package pokladna;

/**
 * This class provides testing of cash register class
 */
public class PokladnaTester // class declaration
{

    public static void main(String[] args) // main method declaration
    {
        Pokladna pokladna = new Pokladna(); // new object of pokladna

        System.out.println("Skenujem tovar v hodnote 20 eur a 55 centov");
        pokladna.naskenujTovar(20.55);
        System.out.println("Prijmam 20 eur ");
        pokladna.prijmyEura(20);
        System.out.println("Prijmam 50 centorv 1ks ");
        pokladna.prijmy50Centovky(1);
        System.out.println("Prijmam 10 centov 1ks ");
        pokladna.prijmy10Centov(1);
        System.out.println("Celkova ciastka prijatej hotovosti je 20.60 eur. ");
        System.out.println("Vraciam vydavok 5 centov. ");
        System.out.printf("%.2f%n", pokladna.vratVydavok());
    }

}
