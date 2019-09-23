package rozneObjekty;

public class MeracVekuStudenta implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Student student=(Student)objekt;
        return student.getVek();
    }
}
