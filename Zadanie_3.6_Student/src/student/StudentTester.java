package student;

/**
 * Trieda sluzi ako testovacia trieda pre triedu Student.
 */
public class StudentTester
{
    public static void main(String[] args)
    {
        Student student = new Student("Peter Novak");

        student.absovlujKviz(50);
        student.absovlujKviz(60);
        student.absovlujKviz(90);
        System.out.println("Celkovy pocet bodov u " + student.getMeno() + " je " + student.getCelkovyPocetBodov());
        System.out.print("Priemerny pocet bodov u " + student.getMeno() + " je : ");
        System.out.printf("%.2f%n", student.getPriemernyPocetBodov());
        System.out.printf("Ocakavany kontrolny vysledok priemer: %.2f%n", 66.66666666666667);
        System.out.println("Ocakavany kontrolny vysledok celkovy pocet: " + 200);
    }
}
