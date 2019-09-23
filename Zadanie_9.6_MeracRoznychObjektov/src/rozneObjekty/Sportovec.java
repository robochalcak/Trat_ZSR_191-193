package rozneObjekty;

public class Sportovec
{
    private String meno;
    private int tep;
    private int vek;

    public Sportovec()
    {
        meno=null;
        tep=0;
        vek = 0;
    }

    public Sportovec(String meno, int tep, int vek)
    {
        this.meno = meno;
        this.tep = tep;
        this.vek = vek;
    }

    public String getMeno()
    {
        return meno;
    }

    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    public int getTep()
    {
        return tep;
    }

    public void setTep(int tep)
    {
        this.tep = tep;
    }

    public int getVek()
    {
        return vek;
    }

    public void setVek(int vek)
    {
        this.vek = vek;
    }

    public String toString()
    {
        return "Meno: "+meno+"\nVek: "+vek+"\nTepova frekvencia: "+tep;
    }
}
