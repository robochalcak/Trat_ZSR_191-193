package rozneObjekty;

public class MeracObdlznikovObsah implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Obdlznik obdlznik = (Obdlznik)objekt;
        return obdlznik.getObsah();
    }
}
