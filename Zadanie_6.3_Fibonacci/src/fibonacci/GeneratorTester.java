package fibonacci;

import java.util.Scanner;

/**
 * This class tests GeneratorFibonaccihoPostupnosti class
 */
public class GeneratorTester
{
    public static void main(String[] args)
    {
        GeneratorFibonaccihoPostupnosti fib = new GeneratorFibonaccihoPostupnosti();
        Scanner keyborard = new Scanner(System.in);

        System.out.println("Zadaj lubovolne pozitivne cislo: ");
        int cislo = keyborard.nextInt();
        fib.setCislo(cislo);

        fib.dalsieCislo();

        keyborard.close();

    }
}
