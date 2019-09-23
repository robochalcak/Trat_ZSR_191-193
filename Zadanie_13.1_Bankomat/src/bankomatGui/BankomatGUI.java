package bankomatGui;

import banka.Banka;
import bankomat.Bankomat;
import klavesnica.Klavesnica;

public class BankomatGUI
{
    public static void main(String[] args)
    {
        Banka banka = new Banka();
        Bankomat bankomat = new Bankomat(banka);
        Klavesnica klavesnica = new Klavesnica();
        bankomat.reset();

        klavesnica.spustKlavesnicu();



        int klientskeCislo = Integer.parseInt(klavesnica.getTextField().getText());
        bankomat.setKlientskeCislo(klientskeCislo);

        klavesnica.setInstrukcie("Zadaj PIN: \nA = OK");

        int pin = Integer.parseInt(klavesnica.getTextField().getText());

        bankomat.nastavKlienta(pin);



    }

}
