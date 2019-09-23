package stvorec;

/**
 * This class tests methods of the square class
 */
public class StvorecTester  // class declaration
{
    public static void main(String[] args)  // main declaration
    {
        Stvorec stvorec = new Stvorec(2); // new object of square

        System.out.println("Plocha: " + stvorec.getPlocha());
        System.out.println("Ocakavana hodnota: 4");
        System.out.printf("Dlzka uhlopriecky:%.9f%n  ", stvorec.getUhlopriecka());
        System.out.println("Ocakavana hodnota: 2.828427125");
    }
}
