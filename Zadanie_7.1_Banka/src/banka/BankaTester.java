package banka;
/**
 Program otestuje spravnost vsetkych metod v triede Banka.
 */
public class BankaTester
{
    public static void main(String[] args)
    {
        Banka banka = new Banka();

        final int UCET1_ID = 0;
        final int UCET2_ID = 1;
        final int UCET3_ID = 2;
        final int UCET4_ID = 3;

        banka.pridajUcet(UCET1_ID, 1000);
        banka.pridajUcet(UCET2_ID, 2000);
        banka.pridajUcet(UCET3_ID, 3000);
        banka.pridajUcet(UCET4_ID, 10000);

        banka.vloz(UCET1_ID, 200);
        banka.vyber(UCET2_ID, 500);
        banka.vloz(UCET3_ID, 1000);
        banka.vyber(UCET4_ID, 7000);

        System.out.print("Zostatok na ucte s ID " + UCET1_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(UCET1_ID) + " EUR.");
        System.out.println("Ocakavana hodnota: 1200");

        System.out.print("Zostatok na ucte s ID " + UCET2_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(UCET2_ID) + " EUR.");
        System.out.println("Ocakavana hodnota: 1500");

        System.out.print("Zostatok na ucte s ID " + UCET3_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(UCET3_ID) + " EUR.");
        System.out.println("Ocakavana hodnota: 4000");

        System.out.print("Zostatok na ucte s ID " + UCET4_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(UCET4_ID) + " EUR.");
        System.out.println("Ocakavana hodnota: 3000");
    }
}