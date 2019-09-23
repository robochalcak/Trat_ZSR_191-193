package sprava;

/**
 * This class provides formatting and joint all necessary parts of message and also display it.
 */
public class Sprava
{
    private String od;   // holds sender
    private String do_;   // holds receiver
    private String telo;  // holds body of message

    /**
     * Constructor with parameters, with initializes them
     *
     * @param od
     * @param do_
     */
    public Sprava(String od, String do_)
    {
        this.od = od;
        this.do_ = do_;
        od.concat("\n");
        do_.concat("\n");
        telo = "";
    }

    /**
     * This method add lines in to body
     *
     * @param riadok
     */
    public void pridajRiadok(String riadok)
    {
        telo = telo.concat(riadok.concat("\n"));
    }

    /**
     * This method return formatted message
     *
     * @return
     */
    public String getText()
    {
        od = "Drahy ".concat(od).concat("\n\n").concat(telo).concat("\n").concat(do_);
        return od;
    }
}
