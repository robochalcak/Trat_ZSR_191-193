package merac;

public class MeracBankovychUctov implements IMerac
{
    @Override
    public double zmeraj(Object object)
    {
        BankovyUcet ucet = (BankovyUcet)object;
        return ucet.getAktualnyZostatok();
    }
}
