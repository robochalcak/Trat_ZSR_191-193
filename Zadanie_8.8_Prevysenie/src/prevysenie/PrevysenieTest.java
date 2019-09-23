package prevysenie;

import java.util.Scanner;

/**
 * This class provides testing of "Prevysenie" class and ask user to enter starting position, actual position
 * and camber, all variables are in meters. User can decide how many times he or she would like to get information
 * about camber, slope or plane.
 */
public class PrevysenieTest
{
    public static void main(String[] args)
    {
        char p;
        Scanner kb = new Scanner(System.in);
        Prevysenie prevysenie = new Prevysenie();

        System.out.println("Program sluzi na vypocet stupania, alebo klesania v promile.");
        System.out.println("------------------------------------------------------------");

        do
        {

            System.out.println("Zadajte zaciatok cesty v m: ");
            double x = kb.nextDouble();
            while (x < 0.0)
            {
                System.out.println("Zaciatok cesty nemoze byt zaporne cislo!!!");
                System.out.println("Zadajte zaciatok cesty v m: ");
                x = kb.nextDouble();
            }

            prevysenie.setX(x);

            System.out.println("Zadajte aktualnu poziciu v m: ");
            double y = kb.nextDouble();
            while (y < 0.0 || y < x)
            {
                System.out.println("Aktualna pozicia nemoze byt zaporne cislo, alebo mensie ako zaciatok cesty!!!");
                System.out.println("Zadajte aktualnu poziciu v m: ");
                y = kb.nextDouble();
            }

            prevysenie.setY(y);

            System.out.println("Zadajte vyskove prevysenie v m: ");
            double vyskPrev = kb.nextDouble();
            prevysenie.setVyskPrevysenie(vyskPrev);

            System.out.println(prevysenie);

            System.out.println("Chcete pokracovat: \'A\' pre ANO a \'N\' pre nie: ");
            p = kb.next().charAt(0);

            while (p != 'n' && p != 'N' && p != 'a' && p != 'A')
            {
                System.out.println("Nespravny vyber!!!");
                System.out.println("Chcete pokracovat: \'A\' pre ANO a \'N\' pre nie: ");
                p = kb.next().charAt(0);
            }

        } while (p == 'a' || p == 'A');
        kb.close();

    }
}
