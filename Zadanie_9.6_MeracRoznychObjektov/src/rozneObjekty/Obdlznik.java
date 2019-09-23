package rozneObjekty;

public class Obdlznik
{
    private double dlzka;
    private double vyska;

    public Obdlznik()
    {
        dlzka = 0;
        vyska = 0;
    }

    public Obdlznik(double dlzka, double vyska)
    {
        this.vyska = vyska;
        this.dlzka = dlzka;
    }

    public void setDlzka(double dlzka)
    {
        this.dlzka = dlzka;
    }

    public void setVyska(double vyska)
    {
        this.vyska = vyska;
    }

    public double getDlzka()
    {
        return dlzka;
    }

    public double getVyska()
    {
        return vyska;
    }

    public double getObvod()
    {
        return 2 * (vyska + dlzka);
    }

    public double getObsah()
    {
        return vyska * dlzka;
    }

    public String toString()
    {
        return "Obdlznik:\n" + "Vyska: " + vyska + "\nDlzka: " + dlzka + "\nObvod: " + getObvod() + "\nObsah: " + getObsah();
    }
}
