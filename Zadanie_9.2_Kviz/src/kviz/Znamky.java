package kviz;

/**
 * This enum holds a character representation of grades and returns them like a char variable
 */
public enum Znamky
{
    A('A'),B('B'),C('C'),D('D'),E('E'),F('F'),
    M('-'),P('+');

    public  char asChar()
    {
        return asChar;
    }
    private final char asChar;

    Znamky(char asChar)
    {
        this.asChar=asChar;
    }
}
