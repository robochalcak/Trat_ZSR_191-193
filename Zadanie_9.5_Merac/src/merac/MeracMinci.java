package merac;

public class MeracMinci implements IMerac
{
    @Override
    public double zmeraj(Object object)
    {
        Minca minca = (Minca)object;
        return minca.getHodnota();
    }
}
