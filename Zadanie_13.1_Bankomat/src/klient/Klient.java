package klient;

import bankovyUcet.BankovyUcet;
import bankovyUcet.BeznyUcet;
import bankovyUcet.SporiaciUcet;

public class Klient
{
    private BankovyUcet beznyUcet;
    private BankovyUcet sporiaciUcet;
    private int klientCislo;
    private int pin;

    public Klient(int klientCislo, int pin)
    {
        this.beznyUcet = new BeznyUcet();
        this.sporiaciUcet = new SporiaciUcet();
        this.klientCislo = klientCislo;
        this.pin = pin;
    }
    public Klient()
    {
        this.beznyUcet = null;
        this.sporiaciUcet = null;
        this.klientCislo = 0;
        this.pin = 0;
    }

    public BankovyUcet getBeznyUcet()
    {
        return beznyUcet;
    }

    public void setBeznyUcet(BankovyUcet beznyUcet)
    {
        this.beznyUcet = beznyUcet;
    }

    public BankovyUcet getSporiaciUcet()
    {
        return sporiaciUcet;
    }

    public void setSporiaciUcet(BankovyUcet sporiaciUcet)
    {
        this.sporiaciUcet = sporiaciUcet;
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

    public String toString()
    {
        return "Klientske cislo: " + klientCislo + "\nPin: " + pin + "\nSporiaci ucet: " + sporiaciUcet + "\nBezny ucet: " + beznyUcet;
    }

    public boolean jeTotoznyS(int klientskeCislo, int pin)
    {
        return (this.getKlientCislo()==klientskeCislo&&this.getPin()==pin);
    }
}
