package merac;

public class Osoba
{
    private String meno;
    private int vek;
    private double vyska;

    public Osoba()
    {

    }

    public Osoba(String meno, int vek, double vyska)
    {
        this.meno=meno;
        this.vek=vek;
        this.vyska=vyska;
    }

    public void setMeno(String meno)
    {
        this.meno=meno;
    }

    public void setVek(int vek)
    {
        this.vek=vek;
    }

    public void setVyska(double vyska)
    {
        this.vyska=vyska;
    }

    public String getMeno()
    {
        return meno;
    }

    public int getVek()
    {
        return vek;
    }

    public double getVyska()
    {
        return vyska;
    }

    public String toString()
    {
        return "Meno: "+meno+"\nVek: "+vek+"\nVyska: "+vyska;
    }
}
