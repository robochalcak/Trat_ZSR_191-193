package karta;

/**
 * This class according abbreviation determine a description of play card
 */
public class Karta
{

    private String skratka; // holds input of abbreviation of user

    /**
     * Default constructor
     */
    public Karta()
    {
        skratka = "";
    }

    /**
     * Parametric constructor
     * @param skratka
     */
    public Karta(String skratka)
    {
        this.skratka = skratka;
    }

    /**
     * Set abbreviation
     * @param skratka
     */
    public void setSkratka(String skratka)
    {
        this.skratka = skratka;
    }

    /**
     * Return abbreviation
     * @return
     */
    public String getSkratka()
    {
        return skratka;
    }

    /**
     * Return description of play card
     * @return
     */
    public String getPopis()
    {
        char hodnota = ' ';
        char nazov = ' ';
        char[] skr = skratka.toCharArray();
        String popisKarty = "";

        hodnota = skr[0];
        nazov = skr[skr.length - 1];

        switch (hodnota)
        {
            case '1':
            {
                if (skr[1] == '0')
                {
                    popisKarty = "Desiatka ";
                }
                else
                {
                    popisKarty = "Chyba neexistuje. ";
                }
            }
            break;

            case '2':
                popisKarty = "Dvojka ";
                break;
            case '3':
                popisKarty = "Trojka ";
                break;
            case '4':
                popisKarty = "Stvorka ";
                break;
            case '5':
                popisKarty = "Patka ";
                break;
            case '6':
                popisKarty = "Sestka ";
                break;
            case '7':
                popisKarty = "Sedmicka ";
                break;
            case '8':
                popisKarty = "Osmicka ";
                break;
            case '9':
                popisKarty = "Deviatka ";
                break;
            case 'E':
            case 'e':
                popisKarty = "Eso ";
                break;

            case 'K':
            case 'k':
                popisKarty = "Kral ";
                break;
            case 'H':
            case 'h':
                popisKarty = "Hornik ";
                break;
            case 'D':
            case 'd':
                popisKarty = "Dolnik ";
                break;
            default:
                popisKarty = "Chyba neexistuje!!!\n";
        }
        nazov = skratka.charAt(skratka.length() - 1);

        switch (nazov)
        {
            case 'G':
            case 'g':
                popisKarty += ("gulova/y");
                break;
            case 'M':
            case 'm':
                popisKarty += (" makova/y");
                break;
            case 'Z':
            case 'z':
                popisKarty += (" zelena/y");
                break;
            case 'C':
            case 'c':
                popisKarty += (" cervena/y");
                break;
                default:
                    popisKarty=" Neexistuje chyba!!!";
        }
        return popisKarty;
    }


}
