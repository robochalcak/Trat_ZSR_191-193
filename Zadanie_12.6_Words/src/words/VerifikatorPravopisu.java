package words;

import java.util.Scanner;

/**
 * Trieda verifikuje spravnost gramatiky obsahu suboru.
 */
public class VerifikatorPravopisu
{
    private Scanner vstup;

    /**
     * Vytvara novy verifikator pravopisu.
     *
     * @param vstup obsahuje scanner s nacitanym suborom words
     */
    public VerifikatorPravopisu(Scanner vstup)
    {
        this.vstup = vstup;
    }

    /**
     * Validuje ci sa dane slovo nachadza v zozname slov
     * v subore words.
     *
     * @param slovo slovo, ktore chceme verifikovat
     * @return vrati true, ak je slovo validne, v opacnom
     * pripade vrati false
     */
    public boolean jeValidne(String slovo)
    {
        return vstup.nextLine().contains(slovo);
    }
}
