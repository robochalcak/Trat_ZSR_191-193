package rozneObjekty;

public class MeracObdlznikovObvod implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Obdlznik obdlznik = (Obdlznik)objekt;
        return obdlznik.getObvod();
    }
}
