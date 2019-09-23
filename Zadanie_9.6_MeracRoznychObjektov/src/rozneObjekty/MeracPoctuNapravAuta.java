package rozneObjekty;

public class MeracPoctuNapravAuta implements IMerac
{

    @Override
    public double zmeraj(Object objekt)
    {
        Auto auto =(Auto)objekt;
        return auto.getPocetNaprav();
    }
}
