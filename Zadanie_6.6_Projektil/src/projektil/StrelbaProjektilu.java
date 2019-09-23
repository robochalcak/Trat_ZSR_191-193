package projektil;

/**
 * Trieda simuluje let projektilu vzduchom kolmo nahor.
 */
public class StrelbaProjektilu
{
    private double pociatocnaRychlost;
    private double posunStrely;
    private static double G = 9.81;
    private double deltaT;

    /**
     * Vytvara novu strelu projektilu s aktualnou pozicou 0.
     *
     * @param pociatocnaRychlost pociatocna rychlost projektilu
     */
    public StrelbaProjektilu(double pociatocnaRychlost)
    {
        this.pociatocnaRychlost = pociatocnaRychlost;
        posunStrely = 0;
    }

    /**
     * Aktualizuje polohu a rychlost projektilu po kazdom casovom useku.
     *
     * @param deltaT casovy usek
     */
    public void posun(double deltaT)
    {
        this.deltaT = deltaT;
        posunStrely += deltaT * pociatocnaRychlost;
    }

    /**
     * Vrati aktualnu rychlost projektilu.
     *
     * @return aktualna rychlost
     */
    public double getRychlost()
    {
        return pociatocnaRychlost - G * deltaT;
    }

    /**
     * Vrati aktualnu poziciu projektilu.
     *
     * @return aktualnu poziciu (vo vertikalnom smere)
     */
    public double getPozicia()
    {
        return -0.5 * G * (Math.pow(deltaT, 2)) + (pociatocnaRychlost * deltaT);
    }

    /**
     * Vrati pociatocnu rychlost vystrelu projektilu.
     *
     * @return pociatocna rychlost vo vertikalnom smere.
     */
    public double getPociatocnaRychlost()
    {
        return pociatocnaRychlost;
    }


}
