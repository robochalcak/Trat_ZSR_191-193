package bankovyUcet;

public class BeznyUcet extends BankovyUcet
{
    public BeznyUcet(double ciastka,int klientCislo, int pin)
    {
        super(ciastka,klientCislo,pin);
    }

    public BeznyUcet()
    {
        super(0,0,0);
    }

    public String toString()
    {
        return"Typ uctu: bezny\nAktualnyZostatok: "+getZostatok()+" eur.";
    }

}
