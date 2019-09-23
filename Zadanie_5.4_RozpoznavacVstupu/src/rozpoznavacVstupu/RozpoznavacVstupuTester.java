package rozpoznavacVstupu;

import java.util.Scanner;

/**
 Program poziada pouzivatela o vstup a nasledne rozhodne aku spravu vypise.
 */
public class RozpoznavacVstupuTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zelate si pokracvoat dalej?");

        String vstupPouzivatela = vstup.nextLine();
        RozpoznavacVstupu rozpoznavac = new RozpoznavacVstupu(vstupPouzivatela);

        if (rozpoznavac.jeToKladnaOdpoved())
        {
            System.out.println("OK");
        }
        else if (rozpoznavac.jeToZapornaOdpoved())
        {
            System.out.println("Ukoncuje pracu s programom . . .");
        }
        else
        {
            System.out.println("Nespravny vstup");
        }
    }
}
