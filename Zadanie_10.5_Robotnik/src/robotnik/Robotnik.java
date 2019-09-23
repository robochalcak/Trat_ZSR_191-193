package robotnik;

/**
 * This abstract class is for part time worker and full time worker and hodls
 * all common variables and methods
 */
public abstract class Robotnik
{
    private String meno; // holds name
    private double hodMzda; // holds hourly pay rate
    private double mzda; // holds salary

    /**
     * Creates a new object of child class full time worker or part time worker
     * with parameters
     *
     * @param meno    name
     * @param hodMzda hourly pay rate
     */
    public Robotnik(String meno, double hodMzda)
    {
        this.meno = meno;
        this.hodMzda = hodMzda;
        this.mzda = 0;
    }

    /**
     * Sets worker name with parameter:
     *
     * @param meno name
     */
    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    /**
     * Sets hourly pay rate with parameter:
     *
     * @param hodMzda hourly pay rate
     */
    public void setHodMzda(double hodMzda)
    {
        this.hodMzda = hodMzda;
    }

    /**
     * Sets salary from child classes
     *
     * @param mzda salary
     */
    public void setMzda(double mzda)
    {
        this.mzda = mzda;
    }

    /**
     * Returns worker name
     *
     * @return name
     */
    public String getMeno()
    {
        return meno;
    }

    /**
     * Returns hourly pay rate
     *
     * @return hourly pay rate
     */
    public double getHodMzda()
    {
        return hodMzda;
    }

    /**
     * Returns salary
     *
     * @return salary
     */
    public double getMzda()
    {
        return mzda;
    }

    /**
     * This abstract method calculates salary depending if is full time worker or part time worker
     *
     * @param pocetHodin number of hours spent in work
     * @return salary
     */
    public abstract double vypocitajMzdu(int pocetHodin);
}
