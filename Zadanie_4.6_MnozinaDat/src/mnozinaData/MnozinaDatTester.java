package mnozinaData;

/**
 * This class performs testing of the MnozinaData class
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        MnozinaData data=new MnozinaData();

        data.pridajCislo(5);
        data.pridajCislo(4);
        data.pridajCislo(3);
        data.pridajCislo(1);

        System.out.println("Najmensie: "+data.getNajmensieCislo());
        System.out.println("Najvacsie: "+data.getNajvacsieCislo());
        System.out.println("Ocakavana hodnota najmensie cislo 1");
        System.out.println("Ocakavana hodnota najvacsie cislo 5");


    }
}
