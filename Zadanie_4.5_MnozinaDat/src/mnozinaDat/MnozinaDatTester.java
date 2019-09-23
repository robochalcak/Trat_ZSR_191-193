package mnozinaDat;

/**
 * This class provides testing of MnozinaDatTester class
 */
public class MnozinaDatTester  // class declaration
{
    public static void main(String[] args) // Main method declaration
    {
        MnozinaDat data = new MnozinaDat(); // new object of MnozinaDat

        System.out.println("Pridava cislo  1");
        data.pridajCislo(1);
        System.out.println("Pridavam cislo 5");
        data.pridajCislo(5);
        System.out.println("Pridavam cislo 10");
        data.pridajCislo(10);
        System.out.println("Pridavam cislo 15");
        data.pridajCislo(15);

        System.out.println("*********VYPOCTY******************");
        System.out.println("Priemer cisiel: "+data.getPriemer());
        System.out.println("Sucet cisiel :  "+data.getSucet());
        System.out.println("--------OCAKAVANE HODNOTY---------");
        System.out.println(" Priemer cisiel: 7.75");
        System.out.println(" Sucet cisiel:   31");
    }
}
