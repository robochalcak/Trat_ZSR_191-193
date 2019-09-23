package mesiac;

/**
 * Thi class determines how many days has each month in year
 */
public class Mesiac
{
    private int mesiac; // holds user input of the month number

    /**
     * Default constructor
     */
    public Mesiac()
    {
        mesiac = 1;
    }

    /**
     * Parametric constructor
     *
     * @param mesiac
     */
    public Mesiac(int mesiac)
    {
        this.mesiac = mesiac;
    }

    /**
     * This method sets up number of month
     *
     * @param mesiac
     */
    public void setMesiac(int mesiac)
    {
        this.mesiac = mesiac;
    }

    /**
     * Returns month number
     *
     * @return
     */
    public int getMesiac()
    {
        return mesiac;
    }

    /**
     * Returns how many days has a month specified by user`s input month number
     *
     * @return
     */
    public int getPocetDni()
    {
        int pocetDni = 0;

        switch (mesiac)
        {
            case 1:
                pocetDni = 31;
                break;
            case 2:
                pocetDni = 28;
                break;
            case 3:
                pocetDni = 31;
                break;
            case 4:
                pocetDni = 30;
                break;
            case 5:
                pocetDni = 31;
                break;
            case 6:
                pocetDni = 30;
                break;
            case 7:
                pocetDni = 31;
                break;
            case 8:
                pocetDni = 31;
                break;
            case 9:
                pocetDni = 30;
                break;
            case 10:
                pocetDni = 31;
                break;
            case 11:
                pocetDni = 30;
                break;
            case 12:
                pocetDni = 31;
                break;
            default:
                pocetDni = -1;

        }
        return pocetDni;
    }
}
