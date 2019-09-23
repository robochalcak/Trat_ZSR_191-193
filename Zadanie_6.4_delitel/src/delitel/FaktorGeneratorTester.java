package delitel;

/**
 * This class tests FaktorGenerator class
 */
public class FaktorGeneratorTester
{
    public static void main(String[] args)
    {
        FaktorGenerator generator = new FaktorGenerator(2 * 2 * 2 * 3 * 5);

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: true");
        System.out.println(generator.dalsiFaktor());
        System.out.println("Ocakavana hodnota: 2");

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: true");
        System.out.println(generator.dalsiFaktor());
        System.out.println("Ocakavana hodnota: 2");

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: true");
        System.out.println(generator.dalsiFaktor());
        System.out.println("Ocakavana hodnota: 2");

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: true");
        System.out.println(generator.dalsiFaktor());
        System.out.println("Ocakavana hodnota: 3");

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: true");
        System.out.println(generator.dalsiFaktor());
        System.out.println("Ocakavana hodnota: 5");

        System.out.println(generator.existujeDalsiFaktor());
        System.out.println("Ocakavana hodnota: false");
    }
}
