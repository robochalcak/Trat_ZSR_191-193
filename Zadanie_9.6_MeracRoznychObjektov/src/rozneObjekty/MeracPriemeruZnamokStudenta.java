package rozneObjekty;

public class MeracPriemeruZnamokStudenta implements IMerac
{
    @Override
    public double zmeraj(Object objekt)
    {
        Student student = (Student)objekt;
        return student.getPriemerZnamok();
    }
}
