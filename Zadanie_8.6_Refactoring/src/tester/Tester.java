package tester;

import gula.Gula;
import rotacnyKuzel.RotacnyKuzel;
import valec.Valec;

import java.util.Scanner;

/**
 * This class ask user for choosing the geometric shape and after entering required information tests and calculates
 * surface and volume. User can choose between sphere, cylinder or cone.
 */
public class Tester
{
    public static void main(String[] args)
    {
        int volba;
        double polomer;
        double vyska;
        Scanner kb = new Scanner(System.in);

        System.out.println("Vyberte ktoreho geometrickeho utvaru chcete vypocitat objem a povrch: ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1.) Gula");
        System.out.println("2.) Valec");
        System.out.println("3.) Rotacny valec");
        System.out.println("4.) Koniec");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");

        volba = kb.nextInt();

        while (volba < 1 || volba > 4)
        {
            System.out.println("Nespravny vyber ");
            System.out.println("Vyberte cislo od 1 do 4, kde 4 je ukoncenie programu: ");
            volba = kb.nextInt();
        }
        do
        {
            switch (volba)
            {
                case 1:
                {

                    System.out.println("Zadaj polomer  gule: ");
                    polomer = kb.nextDouble();
                    Gula gula = new Gula(polomer);
                    System.out.println(gula);
                    break;
                }
                case 2:
                {
                    System.out.println("Zadaj polomer a vysku valca: ");
                    System.out.println("Polomer: ");
                    polomer = kb.nextDouble();
                    System.out.println("Vyska: ");
                    vyska = kb.nextDouble();
                    Valec valec = new Valec(polomer, vyska);
                    System.out.println(valec);
                    break;
                }
                case 3:
                {
                    System.out.println("Zadaj polomer a vysku rotacneho kuzela: ");
                    System.out.println("Polomer: ");
                    polomer = kb.nextDouble();
                    System.out.println("Vyska: ");
                    vyska = kb.nextDouble();
                    RotacnyKuzel kuzel = new RotacnyKuzel(polomer, vyska);
                    System.out.println(kuzel);
                    break;
                }
                case 4:
                    return;
            }

            System.out.println("Chcete pokracovat? (1-3 alebo 4 pre nie): ");
            volba = kb.nextInt();
            while (volba < 1 || volba > 4)
            {
                System.out.println("Nespravny vyber ");
                System.out.println("Vyberte cislo od 1 do 4, kde 4 je ukoncenie programu: ");
                volba = kb.nextInt();
            }

        } while (volba != 4);
        kb.close();
    }

}
