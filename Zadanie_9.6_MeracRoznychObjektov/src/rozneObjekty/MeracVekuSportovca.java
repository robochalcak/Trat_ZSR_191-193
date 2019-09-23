package rozneObjekty;

public class MeracVekuSportovca implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Sportovec sportovec = (Sportovec)objekt;
        return sportovec.getVek();
    }
}
