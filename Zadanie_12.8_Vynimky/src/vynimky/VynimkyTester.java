package vynimky;

import java.util.Scanner;

/**
 * Trieda sluzi na testovanie vlastnych vynimiek ohladom manipulacie s uctom testuje
 * ich odchytavanie ale aj hadzanie a nasledne chybove hlasenia
 */
public class VynimkyTester
{
    public static void main(String[] args) throws NegativnyUcetException, NegativnaCiastkaException, PrevysujuciException
    {
        System.out.println("Testovanie odchytavania vlastnych vynimiek");

        Scanner kb = new Scanner(System.in);
        System.out.println("Zadajte ciastku, ktoru chcete vlozit na ucet: ");
        double ciastka = kb.nextDouble();

        try
        {
            BankovyUcet ucet = new BankovyUcet(ciastka);
            System.out.println("Na ucet ste vlozili: "+ciastka+" eur.");
            System.out.println("Aktualny zostatok: "+ucet.getAktualnyZostatok()+" eur.");
        }
        catch(NegativnyUcetException nue)
        {
            System.out.println("Negativne cislo nie je povolene!");
            System.out.println("Zadajte ciastku, ktoru chcete vlozit na ucet:");
            ciastka=kb.nextDouble();
            while(ciastka<0)
            {
                System.out.println("Negativne cislo nie je povolene!");
                System.out.println("Zadajte ciastku, ktoru chcete vlozit na ucet:");
                ciastka=kb.nextDouble();
            }
            BankovyUcet ucet = new BankovyUcet(ciastka);
            System.out.println("Aktualny zostatok je: "+ucet.getAktualnyZostatok()+" eur.");
        }

        BankovyUcet ucet = new BankovyUcet();
        System.out.println("Zadajte kolko chcete vlozit na ucet: ");
        ciastka = kb.nextDouble();
        try
        {
            ucet.vloz(ciastka);
        }
        catch(NegativnaCiastkaException nce)
        {
            System.out.println("Zaporne cislo nie je povolene!!!");
            System.out.println("Zadajte kolko chcete vlozit na ucet: ");
            ciastka = kb.nextDouble();
            while(ciastka<0)
            {
                System.out.println("Zaporne cislo nie je povolene!!!");
                System.out.println("Zadajte kolko chcete vlozit na ucet: ");
                ciastka = kb.nextDouble();
            }
            ucet.vloz(ciastka);

        }
        System.out.println("Na ucet ste vlozili "+ciastka+" eur.");
        System.out.println("Vas aktualny zostatok je: "+ciastka+"eur.");
        System.out.println("Zadajte kolko chcete vybrat z uctu: ");
        ciastka=kb.nextDouble();
        try
        {
            ucet.vyber(ciastka);
        }
        catch(PrevysujuciException pe)
        {
            System.out.println("Nemate dostatok prostriedkov na ucte zadajte mensiu sumu");
            ciastka=kb.nextDouble();
            while(ciastka<0||ciastka>ucet.getAktualnyZostatok())
            {
                System.out.println("Nemate dostatok prostriedkov na ucte zadajte mensiu sumu");
                ciastka=kb.nextDouble();
            }
            ucet.vyber(ciastka);
        }
        System.out.println("Z uctu ste vybrali "+ciastka+" eur.");
        System.out.println("Aktualny zostatok je: "+ucet.getAktualnyZostatok()+"eur.");


        System.out.println("--------------------------------------------------------");
        System.out.println("Teraz budeme testovat hadzanie vynimiek, pri hodeni ");
        System.out.println("vynimky je potrebne cely program znova spustit.");

        System.out.println("Zadajte pociatocny zostatok na vklad uctu: ");
        ciastka=kb.nextDouble();
        BankovyUcet ucet2=new BankovyUcet(ciastka);

        System.out.println("Kolko chcete vlozit na ucet: ");
        ciastka=kb.nextDouble();
        ucet2.vloz(ciastka);

        System.out.println("Kolko chcete vybrat: ");
        ciastka=kb.nextDouble();

        ucet2.vyber(ciastka);

        kb.close();





    }
}
