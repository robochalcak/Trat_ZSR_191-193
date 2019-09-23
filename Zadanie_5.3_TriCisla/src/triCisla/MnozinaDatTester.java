package triCisla;

import java.util.Scanner;
/**
 Trieda sluzi ako testovacie trieda pre triedu MnozinaDat.
 */
public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj tri realne cisla: ");
        double cislo1 = vstup.nextDouble();
        double cislo2 = vstup.nextDouble();
        double cislo3 = vstup.nextDouble();

        MnozinaDat data = new MnozinaDat(cislo1, cislo2, cislo3);

        System.out.println("Zotriedene cisla: ");
        System.out.println(data.getNajmensie());
        System.out.println(data.getProstredne());
        System.out.println(data.getNajvacsie());
    }
}
