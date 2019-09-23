package kornutok;

/**
 * This class tests a KornutokZmrzliny`s methods
 */
public class KornutokZmrzlinyTester // class declaration
{
    public static void main(String[] args)  // main declaration
    {
        KornutokZmrzliny kornutok = new KornutokZmrzliny(1,5); //New object

        System.out.println("Objem kornutka: " + kornutok.getObjem()); // real value
        System.out.println("Ocakavana hodnota: 5.235987755982989");     // expected value
        System.out.println("Plocha kornutka: " + kornutok.getPovrch());
        System.out.println("Ocakavana hodnota: 16.01904224441409");
    }
}
