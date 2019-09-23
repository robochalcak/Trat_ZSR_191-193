package motyl;

/**
 * This class tests a fly of butterfly
 */
public class MotylTest  //class declaration
{
    public static void main(String[] args) // main method declaration
    {
        Motyl motyl = new Motyl(10);  // new object of butterfly
        motyl.pohybKSvetlu(0);
        System.out.println(motyl.getAktualnaPozicia());
        System.out.println("Ocakavana hodnota: 5");
        motyl.pohybKSvetlu(10);
        System.out.println(motyl.getAktualnaPozicia());
        System.out.println("Ocakavana hodnota: 7.5");
        motyl.pohybKSvetlu(0);
        System.out.println(motyl.getAktualnaPozicia());
        System.out.println("Ocakavana hodnota: 3.75");

    }
}
