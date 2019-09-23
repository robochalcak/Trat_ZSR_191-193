package striedavySucet;

/**
 * Program vypocita hodnotu striedaveho suctu.
 */
public class StriedavySucetTester
{
    public static void main(String[] args)
    {
        MnozinaDat mnozinaDat = new MnozinaDat();

        mnozinaDat.pridajPrvok(1);
        mnozinaDat.pridajPrvok(4);
        mnozinaDat.pridajPrvok(9);
        mnozinaDat.pridajPrvok(16);
        mnozinaDat.pridajPrvok(9);
        mnozinaDat.pridajPrvok(7);
        mnozinaDat.pridajPrvok(4);
        mnozinaDat.pridajPrvok(9);
        mnozinaDat.pridajPrvok(11);

        double sucet = mnozinaDat.vypocitajStriedavySucet();
        System.out.println("Striedavy sucet: " + sucet);
        System.out.println("Ocakavana hodnota: -2");
    }
}
