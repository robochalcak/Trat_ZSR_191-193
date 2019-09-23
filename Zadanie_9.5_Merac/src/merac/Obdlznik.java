package merac;

public class Obdlznik
{
    private double dlzka;
    private double vyska;

    public Obdlznik(double dlzka, double vyska)
    {
        this.dlzka=dlzka;
        this.vyska=vyska;
    }

    public Obdlznik()
    {
        dlzka=0;
        vyska=0;
    }

    public void setDlzka(double dlzka)
    {
        this.dlzka=dlzka;
    }

    public void setVyska(double vyska)
    {
        this.vyska=vyska;
    }

    public double getDlzka()
    {
        return dlzka;
    }

    public double getVyska()
    {
        return vyska;
    }

    public double getPlocha()
    {
        return vyska * dlzka;
    }

    public double getObvod()
    {
        return 2*vyska + 2*dlzka;
    }

    public String toString()
    {
        return "Obdlznik: \n"+"Vyska: "+vyska+"\nDlzka: "+vyska+" \nPlocha: "+getPlocha();
    }
}
