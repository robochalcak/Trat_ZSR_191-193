package tovar;

/**
 * This class is for testing purposes
 */
public class TovarTester  // class declaration
{
    public static void main(String[] args) // main method declaration
    {
        Tovar tovar1 = new Tovar("Hriankovac", 19.99);  // new objects tovar1 and tovar2
        Tovar tovar2 = new Tovar("Mikrovlnka", 49.99);

        System.out.println("Tovar : " + tovar1.getNazov() + " cena: " + tovar1.getCena() + " eur");
        System.out.println("Tovar : " + tovar2.getNazov() + " cena: " + tovar2.getCena() + " eur");

        System.out.println("Znizujem cenu poloziek o 10.00 eur");
        tovar1.znizCenu(10.0);
        tovar2.znizCenu(10.0);
        System.out.println("Tovar po zlave 10.00 eur: ");
        System.out.print("Tovar : " + tovar1.getNazov());
        System.out.printf(" cena: %.2f", tovar1.getCena());
        System.out.println(" eur");
        System.out.println("Tovar : " + tovar2.getNazov() + " cena: " + tovar2.getCena() + " eur");
        System.out.println("*****************************************");
        System.out.println("Ocakavana cena: " + tovar1.getNazov() + " je " + 9.99);
        System.out.println("Ocakavana cena: " + tovar2.getNazov() + " je " + 39.99);
    }
}
