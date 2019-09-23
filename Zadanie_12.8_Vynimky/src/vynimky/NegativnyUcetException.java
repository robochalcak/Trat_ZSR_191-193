package vynimky;

public class NegativnyUcetException extends Exception
{
    public NegativnyUcetException()
    {
        super("Ucet s negativnym zostatkom nie je povoleny.");
    }
}
