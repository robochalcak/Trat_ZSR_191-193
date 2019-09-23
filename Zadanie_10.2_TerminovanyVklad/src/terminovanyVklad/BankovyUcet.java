package terminovanyVklad;

/**
 * This class is a bank account and provides basic functionality, necessary for operation with bank account
 */
public class BankovyUcet
{
    private int cisloUctu;
    private double pociatocnyZostatok;
    /**
     * Creates a bank account
     */
    public BankovyUcet()
    {
        cisloUctu=0;
        pociatocnyZostatok=0;
    }
    /**
     * Creates a bank account with ballance and bank account number
     *
     * @param cisloUctu
     * @param pociatocnyZostatok
     */
    public BankovyUcet(int cisloUctu, double pociatocnyZostatok)
    {
        this.cisloUctu = cisloUctu;
        this.pociatocnyZostatok = pociatocnyZostatok;
    }

    /**
     * Creates a new object with using parameter
     * @param vklad  payIn
     */
    public BankovyUcet(double vklad)
    {
        this.pociatocnyZostatok=vklad;
    }

    /**
     * Returns bank account number
     *
     * @return
     */
    public int getCisloUctu()
    {
        return cisloUctu;
    }

    /**
     * Pay in with user`s specified amount of money
     *
     * @param ciastka
     */
    public void vloz(double ciastka)
    {
        if (ciastka > 0.0)
        {
            pociatocnyZostatok += ciastka;
        }
        else
        {
            System.out.println("Suma nemoze byt zaporne cislo!!!");
        }
    }

    /**
     * Withdraws money from bank account
     *
     * @param ciastka
     */
    public void vyber(double ciastka)
    {
        if (ciastka > 0 && ciastka <= pociatocnyZostatok)
        {
            pociatocnyZostatok -= ciastka;
        }
        else
        {
            System.out.println("Ciastka nemoze byt zaporne cislo alebo vacsia ako stav na ucte!!!");
        }
    }

    /**
     * Returns current balance
     *
     * @return
     */
    public double getAktualnyZostatok()
    {
        return pociatocnyZostatok;
    }
}
