package generatorMocniny;

import java.math.BigDecimal;

/**
 * This class generate power according factor entered by user
 */
public class GeneratorMocniny
{
    private int vysledok; // holds result

    /**
     * Default constructor, initializes a result
     */
    public GeneratorMocniny()
    {
        vysledok=1;
    }

    /**
     * Returns next power, according entered factor by user
     * @param faktor
     * @return
     */
    public double dalsiaMocnina(int faktor)
    {
        BigDecimal.valueOf(vysledok*=faktor);
        return vysledok;
    }
}
