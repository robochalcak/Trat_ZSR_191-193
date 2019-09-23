package striedavySucet;

/**
 * Trieda vypocita tzv. striedavy sucet mnoziny dat.
 */
public class MnozinaDat
{
    private double[] data;
    private int aktualnaVelkost = 0;

    /**
     * Vytvara prazdnu mnozinu dat.
     */
    public MnozinaDat()
    {
        final int DLZKA_DAT = 100;
        data = new double[DLZKA_DAT];
        aktualnaVelkost = 0;
    }

    /**
     * Prida cislo do mnoziny dat.
     *
     * @param cislo
     */
    public void pridajPrvok(double cislo)
    {
        if (aktualnaVelkost >= data.length)
        {
            double[] novaMnozinaDat = new double[2 * data.length];

            System.arraycopy(data, 0, novaMnozinaDat, 0, data.length);
            data = novaMnozinaDat;
        }
        data[aktualnaVelkost] = cislo;
        aktualnaVelkost++;
    }

    /**
     * Vypocita tzv. striedavy sucet cisel mnoziny dat.
     *
     * @return striedavy sucet
     */
    public double vypocitajStriedavySucet()
    {

        int striedavySucet = 0;

        for (int i = 0; i < data.length - 1; i++)
        {
            if (i % 2 == 0)
            {
                striedavySucet += data[i];
            }
            else
            {
                striedavySucet -= data[i];
            }
        }
        return striedavySucet;
    }
}
