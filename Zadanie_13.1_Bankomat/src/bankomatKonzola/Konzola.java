package bankomatKonzola;

import banka.Banka;
import bankomat.Bankomat;
import bankovyUcet.BankovyUcet;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static bankomat.Bankomat.SPORIACI;

public class Konzola
{
    public static void main(String[] args)
    {
        Bankomat bankomat;
        final String KLIENTI = "klienti.txt";

        try
        {
            Banka banka = new Banka();
            banka.nacitajKlientov(KLIENTI);
            bankomat = new Bankomat(banka);
        }
        catch (FileNotFoundException fne)
        {
            System.out.println("Chyba pri citani suboru: " + KLIENTI + ".");
            return;
        }

        Scanner vstup = new Scanner(System.in);

        while (true)
        {
            int stav = bankomat.getStav();

            if (stav == Bankomat.START)
            {
                System.out.println("Klientske cislo: ");
                int klientskeCislo = vstup.nextInt();
                bankomat.setKlientskeCislo(klientskeCislo);
            }
            else if (stav == Bankomat.PIN)
            {
                System.out.println("Zadaj PIN: ");
                int pin = vstup.nextInt();
                bankomat.nastavKlienta(pin);
            }
            else if (stav == Bankomat.UCET)
            {
                System.out.println("A=Bezny ucet, B= Sporiaci ucet, C=Koniec:");
                String volba = vstup.next();
                if (volba.equalsIgnoreCase("A"))
                {
                    bankomat.nastavTypUctu(Bankomat.UCET);
                }
                else if (volba.equalsIgnoreCase("B"))
                {
                    bankomat.nastavTypUctu(SPORIACI);
                }
                else if (volba.equalsIgnoreCase("C"))
                {
                    bankomat.reset();
                }
            }
            else if (stav == Bankomat.TRANSAKCIA)
            {
                System.out.println("Aktualny zostatok: " + bankomat.getAktualnyZostatok() + " Eur.");

                System.out.println("A=vklad. C=Krok spat: ");
                String volba = vstup.next();

                if (volba.equalsIgnoreCase("A"))
                {
                    System.out.println("Ciastka: ");
                    double ciastka = vstup.nextDouble();

                    bankomat.vloz(ciastka);
                    bankomat.nastavPredchadzajuciStav();
                }
                else if (volba.equalsIgnoreCase("B"))
                {
                    System.out.println("Ciastka: ");
                    double ciastka = vstup.nextDouble();

                    bankomat.vyber(ciastka);
                    bankomat.nastavPredchadzajuciStav();
                }
                else
                {
                    System.out.println("Nespravna volba!");
                }
            }
        }
    }
}
