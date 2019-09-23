package nahodneCisla;

/**
 * This class generates randomly 100 numbers in range 1 - 1000 and displays them, displays highest, smallest and
 * average value
 */
public class NahodneCisla
{
    private static final int SIZE=100; // holds size of array
    private static final int MAX=1000; // holds max value of generated number
    private static final int MIN = 0;  // holds min value of generated number
    private int[]cisla;  // holds all randomly generated numbers

    /**
     *  constructor initializes an empty array
     */
    public NahodneCisla()
    {
        cisla = new int[SIZE];
    }

    /**
     * This void method populates the array with randomly generated numbers
     */
    public void generovanieCisiel()
    {
        int range = MAX - MIN +1;
        for(int i = 0; i < cisla.length; i++)
        {
           int rand = (int)(Math.random()*range)+MIN;
            cisla[i]=rand;
        }
    }

    /**
     * This method prints all generated numbers
     */
    public void printCisla()
    {
        for(int cislo:cisla)
        {
            System.out.println(cislo);
        }
    }

    /**
     * Returns the highest value from array
     * @return
     */
    public int getNajvacsiu()
    {
        int najvacsia = cisla[0];

        for(int i = 1; i < cisla.length;i++)
        {
            if(cisla[i]> najvacsia)
            {
                najvacsia = cisla[i];
            }
        }
        return najvacsia;
    }

    /**
     * Returns the smallest number from the array
     * @return
     */
    public int getNajmensiu()
    {
        int najmensia = cisla[0];

        for(int i = 1; i < cisla.length;i++){

            if(cisla[i]<najmensia)
            {
                najmensia=cisla[i];
            }
        }
        return najmensia;
    }

    /**
     * Returns an average of the all numbers in the array
     * @return
     */
    public double getPriemerna()
    {
        double priemer=0;

        for(int i = 0; i < cisla.length;i++)
        {
            priemer+=cisla[i];
        }

        return priemer / 100.0;
    }
}
