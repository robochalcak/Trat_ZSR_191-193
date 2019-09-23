package bankovyUcet;

/**
 * This class creates a client
 */
public class Klient
{
    private int vek;  // holds an age
    private int idCislo; // holds an ID
    private String meno; // holds a name

    /**
     * Creates a new object without any parameters
     */
    public Klient()
    {

    }

    /**
     * Creates an object with using parameters:
     *
     * @param vek     for setting age
     * @param idCislo for setting id
     * @param meno    for setting name
     */
    public Klient(int vek, int idCislo, String meno)
    {
        this.vek = vek;
        this.idCislo = idCislo;
        this.meno = meno;
    }

    /**
     * Sets age with parameters:
     *
     * @param vek
     */
    public void setVek(int vek)
    {
        this.vek = vek;
    }

    /**
     * Sets id with parameters:
     *
     * @param idCislo
     */
    public void setIdCislo(int idCislo)
    {
        this.idCislo = idCislo;
    }

    /**
     * Sets name with parameters:
     *
     * @param meno
     */
    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    /**
     * @return age
     */
    public int getVek()
    {
        return vek;
    }

    /**
     * @return id
     */
    public int getIdCislo()
    {
        return idCislo;
    }

    /**
     * @return name
     */
    public String getMeno()
    {
        return meno;
    }

    /**
     * Prints out a formatted output
     *
     * @return
     */
    public String toString()
    {
        return "Meno: " + meno + "\nVek: " + vek + "\nID cislo: " + idCislo;
    }
}
