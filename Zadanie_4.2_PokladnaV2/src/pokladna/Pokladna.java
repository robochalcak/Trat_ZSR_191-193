package pokladna;

/**
 * Pokladna dokaze vypocitat vydavok na zakladne prijatej hotovosti a naskenovanych tovarov. Uchovava si aj celkovy pocet naskenovanych (predanych) tovarov.
 */
public class Pokladna
{
    public static final double HODNOTA_EUROVEJ_MINCE = 1.0;       //uchovava hodnotu vsetkych aktceptovanych euro minci
    public static final double HODNOTA_50_CENTOVEJ_MINCE = 0.50;
    public static final double HODNOTA_20_CENTOVEJ_MINCE = 0.20;
    public static final double HODNOTA_10_CENTOVEJ_MINCE = 0.10;
    public static final double HODNOTA_5_CENTOVEJ_MINCE = 0.05;
    public static final double HODNOTA_2_CENTOVEJ_MINCE = 0.02;
    public static final double HODNOTA_1_CENTOVEJ_MINCE = 0.01;

    private double celkovaPrijataHotovost;     // uchovava platbu zakaznika
    private double cenaNaskenovanychTovarov;    // uchovava celkovu hodnotu naskenovaneho tovaru

    private int pocetNaskenovanychTovarov;      // uchovava pocet naskenovanych poloziek

    /**
     * Vytvara novu pokladnu s nulovou pociatocnou hotovostou.
     */
    public Pokladna()
    {
        celkovaPrijataHotovost = 0;
        cenaNaskenovanychTovarov = 0;
        pocetNaskenovanychTovarov = 0;
    }

    /**
     * Skenuje tovar, t.j. nacita jeho cenu.
     *
     * @param cenaTovaru cena tovaru
     */
    public void naskenujTovar(double cenaTovaru)
    {
        cenaNaskenovanychTovarov += cenaTovaru;
        pocetNaskenovanychTovarov++;
    }

    /**
     * Vracia kolko ma zaplatit zakaznik
     * @return
     */
    public double getHodnotaNaskenovanehoTovaru()
    {
        return cenaNaskenovanychTovarov;
    }
    /**
     * Prijma hotovost od zakaznika.
     *
     * @param pocetEuroviek    pocet eurovych minci
     * @param pocet50Centoviek pocet 50-centovych minci
     * @param pocet20Centoviek pocet 20-centovych minci
     * @param pocet10Centoviek pocet 10-centovych minci
     * @param pocet5Centoviek  pocet 5-centovych minci
     * @param pocet2Centoviek  pocet 2-centovych minci
     * @param pocetCentoviek   pocet centovych minci
     */
    public void prijmiHotovost(int pocetEuroviek,
                               int pocet50Centoviek, int pocet20Centoviek,
                               int pocet10Centoviek, int pocet5Centoviek,
                               int pocet2Centoviek, int pocetCentoviek)
    {
        celkovaPrijataHotovost += (pocetEuroviek * HODNOTA_EUROVEJ_MINCE) +
                (pocet50Centoviek * HODNOTA_50_CENTOVEJ_MINCE) +
                (pocet20Centoviek * HODNOTA_20_CENTOVEJ_MINCE) +
                (pocet10Centoviek * HODNOTA_20_CENTOVEJ_MINCE) +
                (pocet5Centoviek * HODNOTA_5_CENTOVEJ_MINCE) +
                (pocet2Centoviek * HODNOTA_2_CENTOVEJ_MINCE) +
                (pocetCentoviek * HODNOTA_1_CENTOVEJ_MINCE);
    }

    /**
     * Vracia vydavok zakaznikovi a resetuje pocetNaskenovanychTovarov na 0
     *
     * @return
     */
    public double vratVydavok()
    {
        pocetNaskenovanychTovarov = 0;
        return celkovaPrijataHotovost - cenaNaskenovanychTovarov;
    }

    /**
     * Zobrazuje aktualny pocet tovarov
     *
     * @return
     */
    public int getPocetTovarov()
    {
        return pocetNaskenovanychTovarov;
    }
}
