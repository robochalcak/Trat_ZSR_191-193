package bankovyUcet;

public class BankovyUcet
{
    private double zostatok;
    private int klientCislo;
    private int pin;

    public BankovyUcet()
    {
        zostatok=0;
        klientCislo=0;
        pin=0;
    }

    public BankovyUcet(double zostatok, int klientCislo, int pin)
    {
        this.zostatok=zostatok;
        this.klientCislo=klientCislo;
        this.pin=pin;
    }

    public double getZostatok()
    {
        return zostatok;
    }

    public void setZostatok(double zostatok)
    {
        this.zostatok = zostatok;
    }

    public int getKlientCislo()
    {
        return klientCislo;
    }

    public void setKlientCislo(int klientCislo)
    {
        this.klientCislo = klientCislo;
    }

    public int getPin()
    {
        return pin;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }

    public void vyber(double ciastka)
    {
        zostatok-=ciastka;
    }

    public void vloz(double ciastka)
    {
        zostatok+=ciastka;
    }
}
