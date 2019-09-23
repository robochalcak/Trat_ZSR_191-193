package auto;

/**
 * Trieda Auto predstavuje abstrakciu realneho auta, kde budeme simulovat jazdu.
 */
public class Auto
{
    private double spotrebaPaliva;
    private double obsahNadrze;

    /**
     * Vytvara nove auto s danou spotrebou paliva.
     *
     * @param spotrebaPaliva spotreba paliva
     */
    public Auto(double spotrebaPaliva)
    {
        this.spotrebaPaliva = spotrebaPaliva;
    }

    /**
     * Doplni dany pocet litrov do nadrze.
     *
     * @param pocetLitrov pocet litrov
     */
    public void natankuj(double pocetLitrov)
    {
        obsahNadrze = pocetLitrov;
    }

    /**
     * Simuluje jazdu autom.
     *
     * @param pocetKM pocet prejdenych kilometrov
     */
    public void simulujJazdu(double pocetKM)
    {
        for (int i = 1; i <= (int) pocetKM; i++) // ciklus simuluje jazdu auta a pripocitava kazdy prejdeny km
        {
            if (i % 100 == 0)                    // ak je aktualny stav km delitelny sto tak odpocita spotrebu paliva
            // z obsahu nadrze
            {
                obsahNadrze -= spotrebaPaliva;
            }
        }
    }

    /**
     * Vrati aktualny stav palivovej nadrze.
     *
     * @return aktualny stav palivovej nadrze
     */
    public double getObsahNadrze()
    {
        return obsahNadrze;
    }
}