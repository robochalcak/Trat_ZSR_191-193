package penazenka;

/**
 * Trieda testuje triedu Penazenka.
 */
public class PenazenkaTester
{
    public static void main(String[] args)
    {
        Penazenka a = new Penazenka();
        a.pridajMincu("Eurovka");
        a.pridajMincu("Dvojeurovka");

        Penazenka b = new Penazenka();
        b.pridajMincu("Dvojeurovka");
        b.pridajMincu("Eurovka");

        System.out.println(a.jeObsahovoTotoznaS(b));
        System.out.println("Ocakavana hodnota: true");

        Penazenka c = new Penazenka();
        c.pridajMincu("Centovka");
        c.pridajMincu("Dvojcentovka");
        c.pridajMincu("Centovka");

        Penazenka d = new Penazenka();
        d.pridajMincu("Centovka");
        d.pridajMincu("Dvojcentovka");
        d.pridajMincu("Patcentovka");

        System.out.println(c.jeObsahovoTotoznaS(d));
        System.out.println("Ocakavana hodnota: false");
    }
}
