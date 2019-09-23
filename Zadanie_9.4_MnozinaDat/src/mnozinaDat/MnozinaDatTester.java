package mnozinaDat;

/**
 * This class provides testing for Die class and DataSet class
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        Kocka kocka = new Kocka();
        MnozinaDat data = new MnozinaDat();

        data.hodKockou(10,kocka);

        System.out.print("Zoznam cisiel:\n"+data);
        System.out.println("\n=============================");
        System.out.println("Maximalna hodnota: "+data.getMaximum());
        System.out.println("Minimalna hodnota: "+data.getMinimum());
        System.out.println("=============================");
    }
}
