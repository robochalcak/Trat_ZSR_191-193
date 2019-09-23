package osoba;

/**
 * Creates a Student object, with extending super class "Osoba"-Person
 */
public class Student extends Osoba
{
    private String studijnyOdbor; // hodls study fields

    /**
     * Creates an empty object of the Student
     */
    public Student()
    {
    }

    /**
     * Creates an object with using parameters:
     *
     * @param meno          name it is set to super class
     * @param rokNarodenia  birth year set to super class
     * @param studijnyOdbor study field
     */
    public Student(String meno, int rokNarodenia, String studijnyOdbor)
    {
        super(meno, rokNarodenia);
        this.studijnyOdbor = studijnyOdbor;
    }

    /**
     * Sets study field to Student with parameter:
     *
     * @param studijnyOdbor study field
     */
    public void setStudijnyOdbor(String studijnyOdbor)
    {
        this.studijnyOdbor = studijnyOdbor;
    }

    /**
     * Returns study field
     *
     * @return study field
     */
    public String getStudijnyOdbor()
    {
        return studijnyOdbor;
    }

    /**
     * Creates and returns formatted output
     *
     * @return output about Student
     */
    public String toString()
    {
        return "Student:" + "\nMeno: " + getMeno() + "\nRok narodenia: " + getRokNarodenia() + "\nStudijny odbor: " + studijnyOdbor;
    }
}
