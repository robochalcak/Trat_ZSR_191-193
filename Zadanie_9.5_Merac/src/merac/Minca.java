package merac;

public class Minca
{
    private String typMince;
    private double hodnota;

    public Minca()
    {
        typMince=null;
        hodnota=0;
    }

    public Minca(String typMince, double hodnota)
    {
        this.hodnota=hodnota;
        this.typMince=typMince;
    }

    public void setTypMince(String typMince)
    {
        this.typMince=typMince;
    }

    public void setHodnota(double hodnota)
    {
        this.hodnota=hodnota;
    }

    public String getTypMince()
    {
        return typMince;
    }

    public double getHodnota()
    {
        return hodnota;
    }

    public String toString()
    {
        if(hodnota<1.0)
        {
           return "Typ mince: "+ typMince+"\nHodnota: "+hodnota+" centov.";
        }
        else if(hodnota==0.01)
        {
            return "Typ mince: "+ typMince+"\nHodnota: "+hodnota+" cent.";
        }
        else
        {
            return "Typ mince: " + typMince + "\nHodnota: " + hodnota + " eur.";
        }
    }
}
