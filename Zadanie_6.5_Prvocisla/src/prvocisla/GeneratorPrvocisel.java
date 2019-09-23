package prvocisla;

/**
 * This class generates prime numbers according user`s input, or according calling method "dalsiePrvocislo()"
 */
public class GeneratorPrvocisel
{
    private int hornaHranica; // holds user`s input
    private int prvocislo;    // holds prime number variable

    /**
     * Default constructor sets up "horna hranica"-user`s input and prime number sets up by 1
     */
    public GeneratorPrvocisel()
    {
        hornaHranica = 0;
        prvocislo = 1;
    }

    /**
     * Parametric constructor to does the some thing like default, but "horna hranica" sets up by user`s input
     *
     * @param hornaHranica
     */
    public GeneratorPrvocisel(int hornaHranica)
    {
        this.hornaHranica = hornaHranica;
        prvocislo = 1;
    }

    /**
     * Return all prime numbers, which contains user`s input like 20 contais 2,3,5,7,11,13,17,19 and etc.
     *
     * @param hornaHranica
     */
    public void vypisPrvocislaDo(int hornaHranica)
    {
        for (int i = 2; i < hornaHranica; i++)
        {
            if (jePrvocislo(i))
            {
                System.out.println(i);
            }
        }
    }

    /**
     * Returns prime numbers according calling the method in main method
     *
     * @return
     */
    public int dalsiePrvocislo()
    {
        prvocislo++;

        if (jePrvocislo(prvocislo))
        {
            return prvocislo;
        }
        else
        {
            while (!jePrvocislo(prvocislo))
                prvocislo++;
        }

        return prvocislo;
    }

    /**
     * private method provides that number is prime number, if so it returns true, otherwise returns false
     *
     * @param prvocislo
     * @return
     */
    private boolean jePrvocislo(int prvocislo)
    {
        for (int i = 2; i < prvocislo; i++)
        {
            if (prvocislo % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
