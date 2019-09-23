package rozneObjekty;

public class MeracKapacityAuta implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Auto auto=(Auto)objekt;
        return auto.getKapacita();
    }
}
