package bankovyUcetTester;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet = new BankovyUcet(); // calling a default constructor to create a new account object

        ucet.vloz(2000.0);   // pay in to bank account 2000.0 eur

        ucet.vyber(1000.0);  // withdraw from bank account 1000.00 eur

        System.out.printf("Aktualny zostatok: %.2f%n ", ucet.getAktualnyZostatok()); // printing out current balance,
        // with formatting to two decimal digits.
        System.out.println("Ocakavany vysledok: 1000.00");  // expected result
    }
}
