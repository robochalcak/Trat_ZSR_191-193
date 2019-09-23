package prvocisla;

public class GeneratorPrvociselTester
{
    public static void main(String[] args)
    {
        GeneratorPrvocisel generator = new GeneratorPrvocisel();

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 2");

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 3");

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 5");

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 7");

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 11");

        for (int i = 6; i <= 9999; i++)
        {
            generator.dalsiePrvocislo();
        }

        System.out.println(generator.dalsiePrvocislo());
        System.out.println("Ocakavana hodnota: 104729"); // desattisice prvocislo

        generator.vypisPrvocislaDo(20);

    }
}
