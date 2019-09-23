package mnohouholnik;

/**
 * Tests many shape "MnohoUholnik" class
 */
public class MnohoUholnikTester
{
    public static void main(String[] args)
    {
        MnohoUholnik stvorec  = new MnohoUholnik();

        stvorec.pridajVrchol(100,100);
        stvorec.pridajVrchol(100,150);
        stvorec.pridajVrchol(150,150);
        stvorec.pridajVrchol(150,100);

        double obvodStvorca = stvorec.obvod();
        System.out.println("Obvod stvorca: "+obvodStvorca);
        System.out.println("Ocakavana hodnota 7500");
        double obsahStvorca = stvorec.obsah();
        System.out.println("Obsah stvorca: "+obsahStvorca);
        System.out.println("Ocakavana hodnota 2500");

        MnohoUholnik trojuholnik =new MnohoUholnik();

        trojuholnik.pridajVrchol(100,100);
        trojuholnik.pridajVrchol(150,100);
        trojuholnik.pridajVrchol(150,150);

        double obvodTrojuholnika=trojuholnik.obvod();
        System.out.println("Obvod trojuholnika: "+obvodTrojuholnika);
        System.out.println("Ocakavana hodnota: 5000");
        double obsahTrojuholnika=trojuholnik.obsah();
        System.out.println("Obsah trojuholnika: "+obsahTrojuholnika);
        System.out.println("Ocakavana hodnota: 1250");

        MnohoUholnik osemUholnik = new MnohoUholnik();

        osemUholnik.pridajVrchol(100,100);
        osemUholnik.pridajVrchol(100,120);
        osemUholnik.pridajVrchol(120,150);
        osemUholnik.pridajVrchol(120,150);
        osemUholnik.pridajVrchol(150,170);
        osemUholnik.pridajVrchol(150,170);
        osemUholnik.pridajVrchol(170,170);
        osemUholnik.pridajVrchol(170,100);

        System.out.println("Obvod osem uholnika: "+osemUholnik.obvod());
        System.out.println("Ocakavana hodnota: 8300");
        System.out.println("Obsah osem uholnika: "+osemUholnik.obsah());
        System.out.println("Ocakavana hodnota: 3900");

    }
}
