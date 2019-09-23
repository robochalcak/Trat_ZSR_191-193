package plechovka;

/**
 * This class provides testing of Plechovka class
 */
public class PlechovkaTester
{
    public static void main(String[] args)
    {
        Plechovka plechovka = new Plechovka(12, 3.5);

        System.out.println("Plechovka ma polomer: " + plechovka.getPolomer() + " cm");
        System.out.println("Plechovka ma vysku: " + plechovka.getVyska() + " cm");
        System.out.printf("Plechovka ma objem: %.3f", plechovka.getObjem());
        System.out.println("cm^3 ");
        System.out.printf("Plechovka ma povrch: %.3f", plechovka.getPovrch());
        System.out.println("cm^2");
    }
}
