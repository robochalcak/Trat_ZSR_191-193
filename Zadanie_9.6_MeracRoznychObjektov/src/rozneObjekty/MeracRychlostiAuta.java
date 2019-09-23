package rozneObjekty;

public class MeracRychlostiAuta implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Auto auto = (Auto)objekt;
        return auto.getMaxPovolenaRychlost();
    }
}
