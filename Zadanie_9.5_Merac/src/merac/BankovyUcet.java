package merac;

public class BankovyUcet
{
    private double aktualnyZostatok;
    private int id;

    public BankovyUcet()
    {
        aktualnyZostatok = 0;
        id = 0;
    }

    public BankovyUcet(double aktualnyZostatok, int id)
    {

        this.aktualnyZostatok = aktualnyZostatok;
        this.id = id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public void vlozCiastku(double ciastka)
    {
        if (ciastka > 0)
        {
            aktualnyZostatok += ciastka;
        }
        else
        {
            return;
        }
    }

    public void vyberCiastku(double ciastka)
    {
        if (ciastka < aktualnyZostatok || ciastka > 0)
        {
            aktualnyZostatok -= ciastka;
        }
        else
        {
            return;
        }
    }

    public double getAktualnyZostatok(){
        return aktualnyZostatok;
    }

    public String toString()
    {
        return "ID: "+id+"\nAktualny zostatok: "+aktualnyZostatok+" Eur.";
    }
}

