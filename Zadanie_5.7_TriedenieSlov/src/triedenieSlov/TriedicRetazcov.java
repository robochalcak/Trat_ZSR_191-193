package triedenieSlov;

import java.util.Scanner;

/**
 * Program zotriedi tri retazce.
 */
public class TriedicRetazcov
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj tri retazce: ");
        String retazec1 = vstup.nextLine();
        String retazec2 = vstup.nextLine();
        String retazec3 = vstup.nextLine();

        MnozinaDat retazce = new MnozinaDat(retazec1, retazec2, retazec3);

        System.out.println("Zotriedene slova su: ");
        System.out.println(retazce.getNajmensi());
        System.out.println(retazce.getProstredny());
        System.out.println(retazce.getNajvacsi());

        vstup.close();
    }
}
