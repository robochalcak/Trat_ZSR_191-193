package danZPrijmu;


public class DanZPrijnu
{
    private double rocnyPrijem; // rocna vyska prijmu v eurach
    private RodinnyStatus status;

    public DanZPrijnu(double rocnyPrijem, RodinnyStatus status)
    {
        this.rocnyPrijem=rocnyPrijem;
        this.status = status;
    }

    public double vypocitajDanZPrijmu()
    {
        final double NIZSI_PRIJEM_SLOBODNY_ZAMESTNANEC = 11000;
        final double STREDNY_PRIJEM_SLOBODNY_ZAMESTNANEC = 25000;
        final double NIZSI_PRIJEM_ZENATY_ZAMESTNANEC = 16000;
        final double STREDNY_PRIJEM_ZENATY_ZAMESTNANEC = 43000;
        final double NIZKA_DAN=0.15;
        final double STREDNA_DAN=0.28;
        final double VYSOKA_DAN=0.31;

        double dan = 0;

        // algoritmus na vypocet dane

        if(status==RodinnyStatus.SLOBODNY_SLOBODNA)
        {
            if(rocnyPrijem <= NIZSI_PRIJEM_SLOBODNY_ZAMESTNANEC)
            {
                dan = rocnyPrijem * NIZKA_DAN;
            }
            else if(rocnyPrijem <=STREDNY_PRIJEM_SLOBODNY_ZAMESTNANEC)
            {
                dan = rocnyPrijem * STREDNA_DAN;
            }
            else
            {
                dan = rocnyPrijem * VYSOKA_DAN;
            }
        }
        else if (status==RodinnyStatus.ZENATY_VYDATA)
        {
            if(rocnyPrijem <= NIZSI_PRIJEM_ZENATY_ZAMESTNANEC)
            {
                dan = rocnyPrijem * NIZKA_DAN;
            }
            else if(rocnyPrijem <=STREDNY_PRIJEM_ZENATY_ZAMESTNANEC)
            {
                dan = rocnyPrijem * STREDNA_DAN;
            }
            else
            {
                dan = rocnyPrijem * VYSOKA_DAN;
            }
        }
        else
        {
            dan = -1;
            System.out.println("Chybny status osoby. ");
        }

        return dan;
    }

    public double getDan()
    {
        double nizkaHranica;
        double strednaHranica;
    }

}
