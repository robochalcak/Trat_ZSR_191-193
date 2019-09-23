package nahodneCisla;

/**
 * This class provides test of "NahodneCisla" class
 */
public class NahodneCislaTester
{
    public static void main(String[] args)
    {
        NahodneCisla cisla = new NahodneCisla();
        cisla.generovanieCisiel();
        cisla.printCisla();

        System.out.println("Najvacsia hodnota: "+ cisla.getNajvacsiu());
        System.out.println("Najmensia hodnota: "+ cisla.getNajmensiu());
        System.out.println("Priemer je: "+ cisla.getPriemerna());
    }
}
