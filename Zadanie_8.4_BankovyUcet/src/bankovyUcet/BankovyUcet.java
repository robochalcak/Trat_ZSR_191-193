package bankovyUcet;

/**
 * This class defines "BankovyUcet" a bank account
 */
public class BankovyUcet
{
    private Klient klient; //holds object client
    private double zostatok; // holds a balance

    /**
     * Creates a new object with parameters
     *
     * @param klient   client
     * @param zostatok balance
     */
    public BankovyUcet(Klient klient, double zostatok)
    {
        this.klient = klient;
        this.zostatok = zostatok;

    }

    /**
     * Creates a new object without using any parameter
     */
    public BankovyUcet()
    {
        klient = null;
        zostatok = 0;

    }

    /**
     * Sets client with argument:
     *
     * @param klient it is an object
     */
    public void setKlient(Klient klient)
    {
        this.klient = klient;
    }

    /**
     * Sets a starting balance with using parameter:
     *
     * @param zostatok balance
     */
    public void setZostatok(double zostatok)
    {
        this.zostatok = zostatok;
    }

    /**
     * This method provides pay in money to bank account with using parameter:
     *
     * @param ciastka and validating with assert
     */
    public void vloz(double ciastka)
    {
        assert ciastka > 0 : " Vkladana ciastka nesmie byt menej ako 0 Eur!";
        zostatok += ciastka;
    }

    /**
     * This method provides vithdrawing with parameter:
     *
     * @param ciastka and validating the data with assert
     */
    public void vyber(double ciastka)
    {
        assert ciastka > 0 && ciastka <= zostatok : "Vyber nesmie byt menej ako 1 Eur a vacsi ako vklad!!";
        zostatok -= ciastka;
    }

    /**
     * Returns client info
     *
     * @return
     */
    public Klient getKlient()
    {
        return klient;
    }

    /**
     * Returns current balance
     *
     * @return
     */
    public double getZostatok()
    {
        return zostatok;
    }

    /**
     * Returns record about bank account with formatted output.
     *
     * @return
     */
    public String vypisZUctu()
    {
        String vypis = "";
        vypis += "Klient: " + klient + "\n" + "Zostatok: " + zostatok + "Eur ";
        return vypis;
    }


}
