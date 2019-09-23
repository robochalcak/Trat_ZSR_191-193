package bankovyUcet;

public class SporiaciUcet extends BankovyUcet
{
    public SporiaciUcet(double ciastka,int klientCislo,int pin)
    {
        super(ciastka,klientCislo,pin);
    }

    public SporiaciUcet()
    {
        super(0,0,0);
    }

    public String toString()
    {
        return "Typ uctu: sporiaci\nAktualnyZostatok: "+getZostatok()+" eur.";
    }
}


