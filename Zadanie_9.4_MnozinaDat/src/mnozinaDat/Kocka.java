package mnozinaDat;

import java.util.Random;

/**
 * This class simulates throwing with die
 */
public class Kocka implements IKocka
{
    private int cislo; // holds number with will be thrown by the die

    /**
     * Creates a new empty object
     */
    public Kocka()
    {
        this.cislo = 0;
    }

    /**
     * Provides throwing with the die and store number in "cislo" variable
     */
    @Override
    public void hod()
    {
        Random random = new Random();
        cislo = random.nextInt(6) + 1;
    }

    /**
     * Returns thrown number
     *
     * @return thrown number
     */
    @Override
    public int getCislo()
    {
        return cislo;
    }
}
