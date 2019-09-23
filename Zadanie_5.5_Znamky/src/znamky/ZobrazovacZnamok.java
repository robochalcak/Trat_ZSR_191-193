package znamky;

import java.util.Scanner;
/**
 Trieda zobrazi ciselnu hodnotu znamky prisluchajucu k pismenkovej reprezentacii, ktoru program nacital od pouzivatela.
 */
public class ZobrazovacZnamok
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj pismenkovu reprezentaciu znamky: ");
        String vstupPouzivatela = vstup.nextLine();
        Znamka znamka = new Znamka(vstupPouzivatela);

        double cislaHodnotaZnamky = znamka.getCiselnaReprezentacia();

        System.out.println("Ciselna reprezentacia znamky: "+cislaHodnotaZnamky);

        vstup.close();
    }
}
