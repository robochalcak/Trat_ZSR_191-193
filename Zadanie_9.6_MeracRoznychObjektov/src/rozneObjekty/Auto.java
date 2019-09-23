package rozneObjekty;

public class Auto
{
    private String znacka;
    private int maxPovolenaRychlost;
    private  int pocetNaprav;
    private int kapacita;
    private double maxPripustnaHmotnot;

    public Auto()
    {
        znacka=null;
        maxPovolenaRychlost=0;
        pocetNaprav=0;
        kapacita=0;
        maxPripustnaHmotnot=0;
    }

    public Auto(String znacka,int maxPovolenaRychlost,int pocetNaprav,int kapacita,double maxPripustnaHmotnot)
    {
        this.znacka=znacka;
        this.maxPovolenaRychlost=maxPovolenaRychlost;
        this.pocetNaprav=pocetNaprav;
        this.kapacita=kapacita;
        this.maxPripustnaHmotnot=maxPripustnaHmotnot;
    }

    public void setZnacka(String znacka)
    {
        this.znacka=znacka;
    }

    public void setMaxPovolenaRychlost(int maxPovolenaRychlost)
    {
        this.maxPovolenaRychlost = maxPovolenaRychlost;
    }

    public void setPocetNaprav(int pocetNaprav)
    {
        this.pocetNaprav = pocetNaprav;
    }

    public void setKapacita(int kapacita)
    {
        this.kapacita = kapacita;
    }

    public void setMaxPripustnaHmotnot(double maxPripustnaHmotnot)
    {
        this.maxPripustnaHmotnot = maxPripustnaHmotnot;
    }

    public String getZnacka()
    {
        return znacka;
    }
    public int getMaxPovolenaRychlost()
    {
        return maxPovolenaRychlost;
    }

    public int getPocetNaprav()
    {
        return pocetNaprav;
    }

    public int getKapacita()
    {
        return kapacita;
    }

    public double getMaxPripustnaHmotnot()
    {
        return maxPripustnaHmotnot;
    }

    public String toString()
    {
        return "Znacka auta: "+znacka+"\nMaximalna rychlost: "+maxPovolenaRychlost+"\nPocet naprav: "+pocetNaprav+
                "\nMiest na sedenie: "+kapacita+"\nMaximalna pripustna hmotnost: "+maxPripustnaHmotnot;
    }
}
