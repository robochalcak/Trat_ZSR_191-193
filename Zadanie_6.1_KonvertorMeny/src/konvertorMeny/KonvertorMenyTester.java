package konvertorMeny;

import java.util.Scanner;

/**
 * Class converts the euro to dollar
 */
public class KonvertorMenyTester
{
    public static void main(String[] args)
    {
        KonvertorMeny mena = new KonvertorMeny();
        double eura;
        double kurz;
        char k;

        do
        {
            System.out.println("Aky je aktulny kurz Eura voic dolaru? ");
            Scanner keyboard = new Scanner(System.in);
            kurz = keyboard.nextDouble();
            System.out.println("Kolko Eur si zelate zamenit? ");
            eura = keyboard.nextDouble();
            mena.setEura(eura);
            mena.setKurz(kurz);

            System.out.printf("Pocet dolarov je %.2f%n", mena.getDolare());
            System.out.println("---------------------------------------\n");
            System.out.println("Prajete si pokracovat? \'A\' pre ano a \'K\' pre koniec: ");
            k = keyboard.next().charAt(0);
            while (k != 'K' && k != 'k' && k != 'A' && k != 'a')
            {
                System.out.println("Zle zadanie!!!");
                System.out.println("Prajete si pokracovat? \'A\' pre ano a \'K\' pre koniec: ");
                k = keyboard.next().charAt(0);
            }


        } while (k != 'K' && k != 'k');

    }
}
