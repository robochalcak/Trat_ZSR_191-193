package banka;

import klient.Klient;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka
{

    private ArrayList<Klient> klienti;

    public Banka()
    {
        this.klienti = new ArrayList<Klient>();
    }

    public void nacitajKlientov(String subor) throws FileNotFoundException
    {
        Scanner vstup = new Scanner(new FileReader(subor));

        while (vstup.hasNext())
        {
            int klientskeCislo = vstup.nextInt();
            int pin = vstup.nextInt();

            Klient klient = new Klient(klientskeCislo, pin);
            pridajKlienta(klient);
        }
        vstup.close();
    }

    private void pridajKlienta(Klient klient)
    {
        klienti.add(klient);
    }

    public Klient vyhladajKlienta(int klientskeCislo, int pin)
    {
        for (Klient klient : klienti)
        {
            if (klient.jeTotoznyS(klientskeCislo, pin))
            {
                return klient;
            }
        }
        return null;
    }
}
