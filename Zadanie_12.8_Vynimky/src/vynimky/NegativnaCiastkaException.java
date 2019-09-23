package vynimky;

public class NegativnaCiastkaException extends Exception
{
    public NegativnaCiastkaException()
    {
        super("Negatyvna suma nie je povolena.");
    }
}
