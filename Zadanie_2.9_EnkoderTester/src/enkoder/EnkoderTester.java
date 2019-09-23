package enkoder; // location

public class EnkoderTester  // class definition
{
    public static void main(String[] args) // method definition
    {
        String name = "Silvia";   // string name
        System.out.println("Meno pred použitím metody replace()");
        System.out.println(name);
        System.out.println("Meno po použití metody replace()");
        System.out.println(name.replace('i', '!').replace('S', '$'));
    }
}
