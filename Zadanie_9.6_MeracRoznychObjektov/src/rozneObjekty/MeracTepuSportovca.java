package rozneObjekty;

public class MeracTepuSportovca implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Sportovec sportovec = (Sportovec)objekt;
        return sportovec.getTep();
    }
}
