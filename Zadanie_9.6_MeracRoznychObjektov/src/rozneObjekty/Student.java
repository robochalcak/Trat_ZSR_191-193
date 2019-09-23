package rozneObjekty;

public class Student
{
    private String meno;
    private int vek;
    private double priemerZnamok;

    public Student()
    {
        this.meno = null;
        int vek=0;
        double priemerZnamok=0;
    }

    public Student(String meno, int vek, double priemerZnamok)
    {
        this.meno = meno;
        this.vek = vek;
        this.priemerZnamok = priemerZnamok;
    }

    public String getMeno()
    {
        return meno;
    }

    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    public int getVek()
    {
        return vek;
    }

    public void setVek(int vek)
    {
        this.vek = vek;
    }

    public double getPriemerZnamok()
    {
        return priemerZnamok;
    }

    public void setPriemerZnamok(double priemerZnamok)
    {
        this.priemerZnamok = priemerZnamok;
    }

    public String toString()
    {
        return "Student:\n"+"Meno: "+meno+"\nVek: "+vek+"\nPriemer znamok: "+priemerZnamok;
    }
}
