package karta;

import java.util.Scanner;

/**
 * This class tests a class Karta
 */
public class KartaTest
{
    public static void main(String[] args)
    {
        char con;
        do
        {
            Scanner in = new Scanner(System.in);
            Karta karta = new Karta();
            System.out.println("Zadaj skrateny nazov karty: ");
            String skr = in.nextLine();
            karta.setSkratka(skr);
            System.out.println(karta.getPopis());
            System.out.println("////////////////////////////////");
            System.out.println("Chcete pokracovat \'A\' pre Ano alebo \'N\' pre nie: ");
            con = in.next().charAt(0);
            while (con != 'N' && con != 'n' && con != 'A' && con != 'a')
            {
                System.out.println("Nespravny vyber!!!");
                System.out.println("Chcete pokracovat \'A\' pre Ano alebo \'N\' pre nie: ");
                con = in.next().charAt(0);
            }

        } while (con != 'N' && con != 'n');
    }
}
