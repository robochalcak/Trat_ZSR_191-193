package osoba;

/**
 * Tests object of type Person "Osoba"
 */
public class OsobaTester
{
    public static void main(String[] args)
    {
        MnozinaDat data = new MnozinaDat();

        data.pridaj(new Osoba("Igor", 183));
        data.pridaj(new Osoba("Peter", 158));
        data.pridaj(new Osoba("Monika", 175));

        double priemer = data.getPriemernaVyska();
        Osoba najvyssiaOsoba = data.getNajvyssiaOsoba();

        System.out.println("Priemerna vyska osoby: "+ priemer);
        System.out.println("Ocakavana hodnota 172");

        System.out.println("Meno najvyssiej osoby: "+ najvyssiaOsoba.getMeno());
        System.out.println("Ocakavana hodnota Igor");

    }
}
