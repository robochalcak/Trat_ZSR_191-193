package delitel;

/**
 * This class generates all factor of selected number (dividers)
 */
public class FaktorGenerator
{
    private int cislo; // holds user`s input
    private int index; // test division of number

    /**
     * Parametric constructor sets user`s number and set index by 2, because with 0 division is impossible and with
     * one is each number divisible
     *
     * @param cislo
     */
    public FaktorGenerator(int cislo)
    {
        this.cislo = cislo;
        index = 2;
    }

    /**
     * Returns true if the number is divisible by index, otherwise returns false
     *
     * @return
     */
    public boolean existujeDalsiFaktor()
    {
        boolean status = false;
        int num = cislo;
        int count = 2;

        if (num % count == 0)
        {
            status = true;
            num /= count;
        }
        else if (num % count != 0)
        {
            while (num % count != 0 && num == count)
            {
                count++;

                if (num == count)
                {
                    status = false;
                }
                else
                {
                    status = true;
                }
            }
            if (num % count != 0)
            {
                status = false;
            }
            else if (num == count)
            {
                status = true;
            }
            else
            {
                status = true;
                num /= count;
            }
        }
        return status;
    }

    /**
     * Returns the value of index if the number is divisible
     *
     * @return
     */
    public int dalsiFaktor()
    {
        int faktor = 0;

        if (cislo % index == 0)
        {
            cislo /= index;
            faktor = index;
        }
        else if (cislo % index != 0)
        {
            while (cislo % index != 0)
            {
                index++;
            }
            if (cislo % index == 0)
            {
                cislo /= index;
                faktor = index;
            }
        }
        return faktor;
    }
}
