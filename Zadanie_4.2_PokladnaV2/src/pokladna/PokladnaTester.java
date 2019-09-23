package pokladna;

/**
 * Tato trieda sluzi na otestovanie vsetkych funkcii triedy pokladna
 */
public class PokladnaTester  // deklaracia triedy
{
    public static void main(String[] args) // deklaracia metody main()
    {
        Pokladna pokladna = new Pokladna();  // objekt pokladna

        System.out.println("Pokladna skenuje polozku za 20.25 eur");
        pokladna.naskenujTovar(20.25);
        System.out.println("Pokladna skenuje polozku za 10.99 eur");
        pokladna.naskenujTovar(10.99);
        System.out.println("Pokladna skenuje polozku za 5.99 eur");
        pokladna.naskenujTovar(5.99);
        System.out.println("Pokladna skenuje polozku za 34.99 eur");
        pokladna.naskenujTovar(34.99);

        System.out.println("V pokladna momentalne naskenovala " + pokladna.getPocetTovarov() + " kusov poloziek. ");
        System.out.printf("Je potrebne zaplatit : %.2f%n", pokladna.getHodnotaNaskenovanehoTovaru());
        System.out.println("Zakaznik ide platit: ");
        pokladna.prijmiHotovost(72, 0, 1, 1, 0, 0, 0);
        System.out.printf("Zakaznik zaplatil a teraz pokladna vidava spat %.2f%n", pokladna.vratVydavok());
        System.out.println("Pokladna pripravena pre dalsieho zakaznika + pocet naskenovanych tovarov resetovany na " + pokladna.getPocetTovarov());

    }
}
