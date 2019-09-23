package osoba;

/**
 * Program sluzi ako tester pre triedy Osoba, Student a instruktor.
 */
public class OsobaTester
{
    public static void main(String[] args)
    {
        Osoba osoba = new Osoba("Igor Kovac", 1988);
        Student student = new Student("Emil Horvath", 1999, "Kartografia");
        Instruktor instruktor = new Instruktor("Jan Valdner", 1969, 2500);

        System.out.println(osoba.toString());
        System.out.println("Ocakavana Hodnota: Igor Kovac, 1988");

        System.out.println(student.toString());
        System.out.println("Ocakavana hodnota: Emil Horvath, 1999, Kartografia");

        System.out.println(instruktor.toString());
        System.out.println("Ocakavana hodnota: Jan Valdner, 1969, 2500");
    }


}
