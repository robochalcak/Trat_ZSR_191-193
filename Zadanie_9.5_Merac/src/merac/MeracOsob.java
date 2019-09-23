package merac;

public class MeracOsob implements IMerac
{

    @Override
    public double zmeraj(Object object)
    {
        Osoba osoba = (Osoba)object;
        return osoba.getVyska();
    }
}
