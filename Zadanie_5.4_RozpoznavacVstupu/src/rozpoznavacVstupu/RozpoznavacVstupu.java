package rozpoznavacVstupu;

/**
 * This class determines according user`s input, if his or her answer is a positive or a negative
 */
public class RozpoznavacVstupu
{
    private String vstupPouzivatela; // holds user`s answer

    /**
     * Parametric constructor sets up a variable with argument
     *
     * @param vstupPouzivatela
     */
    public RozpoznavacVstupu(String vstupPouzivatela)
    {
        this.vstupPouzivatela = vstupPouzivatela;
    }

    /**
     * Returns true if the answer is positive, otherwise returns false
     *
     * @return
     */
    public boolean jeToKladnaOdpoved()
    {
        if (vstupPouzivatela.equalsIgnoreCase("A") || vstupPouzivatela.equalsIgnoreCase("Ano") || vstupPouzivatela.equalsIgnoreCase("Iste") || vstupPouzivatela.equalsIgnoreCase("Iste") || vstupPouzivatela.equalsIgnoreCase("Preco nie?"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns true if the answer is negative, otherwise returns false
     *
     * @return
     */
    public boolean jeToZapornaOdpoved()
    {
        if (vstupPouzivatela.equalsIgnoreCase("N") || vstupPouzivatela.equalsIgnoreCase("Nie"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
