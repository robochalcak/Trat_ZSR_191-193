package vynimky;

public class PrevysujuciException extends Exception
{
    public PrevysujuciException()
    {
        super("Vyssia suma ako zostatok nie je povolena");
    }
}
