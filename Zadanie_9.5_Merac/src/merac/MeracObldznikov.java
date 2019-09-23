package merac;

public class MeracObldznikov implements IMerac
{
    @Override
    public double zmeraj(Object object)
    {
        Obdlznik obdlznik  =(Obdlznik)object;
        return obdlznik.getObvod();
    }
}


