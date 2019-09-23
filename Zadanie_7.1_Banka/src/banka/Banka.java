package banka;

import java.util.ArrayList;

/**
 * Banka obsahuje kolekciu/zoznam bankovych uctov.
 */
public class Banka
{
    private ArrayList<BankovyUcet> bankoveUcty;

    /**
     * Vytvara banku s prazdnym zoznamom bankovych uctov.
     */
    public Banka()
    {
        bankoveUcty = new ArrayList<BankovyUcet>();
    }

    /**
     * Prida novy bankovy ucet do zoznamu bankovych uctov.
     *
     * @param ucet novy bankovy ucet
     */
    public void pridajUcet(BankovyUcet ucet)
    {
        bankoveUcty.add(ucet);
    }

    /**
     * Vráti celkový zostatok na všetkých bankových účtoch v banke.
     *
     * @return celkový zostatok na všetkých bankových účtoch
     */
    public double getCelkovyZostatok()
    {
        double celkovyZostatok = 0;

        for (BankovyUcet ucet : bankoveUcty)
        {
            celkovyZostatok += ucet.getAktualnyZostatok();
        }
        return celkovyZostatok;
    }

    /**
     * Vrati pocet bankovych uctov, ktorych zostatok je vacsi ako
     * ciastka.
     *
     * @param ciastka
     * @return pocet bankovych uctov
     */
    public int vratPocetUctovSoZostatkomVacsimAko(double ciastka)
    {
        int pocetUctov = 0;
        for (BankovyUcet ucet : bankoveUcty)
        {
            if (ucet.getAktualnyZostatok() > ciastka)
            {
                pocetUctov++;
            }
        }
        return pocetUctov;
    }

    /**
     * Vyhlada a vrati bankovy ucet s danym cislom uctu.
     *
     * @param cisloUctu
     * @return bankovy ucet s danym cislom uctu, alebo null
     * ak sa v banke taky ucet nenachadza
     */
    public BankovyUcet najdiUcet(int cisloUctu)
    {
        for (BankovyUcet ucet : bankoveUcty)
        {
            if (ucet.getCisloUctu() == cisloUctu)
            {
                return ucet;
            }
        }
        return null;
    }

    /**
     * Vrati bankovy ucet s najvyssim zostatkom.
     *
     * @return bankovy ucet s najvyssim zostatkom alebo null, ak sa
     * v banke nenachadza ziadny ucet.
     */
    public BankovyUcet getMaximum()
    {
        if (bankoveUcty.size() == 0)
        {
            return null;
        }
        BankovyUcet maxZostatok = bankoveUcty.get(0);

        for (int i = 1; i < bankoveUcty.size(); i++)
        {
            BankovyUcet ucet = bankoveUcty.get(i);
            if (ucet.getAktualnyZostatok() > maxZostatok.getAktualnyZostatok())
            {
                maxZostatok = ucet;
            }
        }
        return maxZostatok;
    }

    /**
     * Prida novy ucet do zoznamu bankovych uctov.
     *
     * @param cisloUctu          cislo bankoveho uctu
     * @param pociatocnyZostatok pociatocny zostatok na bankovom ucte
     */
    public void pridajUcet(int cisloUctu, double pociatocnyZostatok)
    {
        BankovyUcet ucet = new BankovyUcet(cisloUctu, pociatocnyZostatok);
        bankoveUcty.add(ucet);
    }

    /**
     * Vklada urcitu sumu na konkretny bankovy ucet.
     *
     * @param cisloUctu cislo bankoveho uctu
     * @param ciastka   suma penazi, ktora sa vlozi na bankovy ucet
     */
    public void vloz(int cisloUctu, double ciastka)
    {
        for (int i = 0; i < bankoveUcty.size(); i++)
        {
            if (bankoveUcty.get(i).getCisloUctu() == cisloUctu)
            {
                bankoveUcty.get(i).vloz(ciastka);
            }

        }
    }

    /**
     * Vybera urcitu sumu z konkretneho bankoveho uctu.
     *
     * @param cisloUctu cislo bankoveho uctu
     * @param ciastka   suma penazi, ktora sa vyberie z bankoveho uctu
     */
    public void vyber(int cisloUctu, double ciastka)
    {
        for (int i = 0; i < bankoveUcty.size(); i++)
        {
            if (bankoveUcty.get(i).getCisloUctu() == cisloUctu)
            {
                bankoveUcty.get(i).vyber(ciastka);
            }

        }
    }

    /**
     * Vrati aktualny zostatok na bankovom ucte.
     *
     * @param cisloUctu cislo bankoveho uctu
     */
    public double getAktualnyZostatok(int cisloUctu)
    {
        double zostatok = 0;

        for (int i = 0; i < bankoveUcty.size(); i++)
        {
            if (bankoveUcty.get(i).getCisloUctu() == cisloUctu)
            {
                zostatok = bankoveUcty.get(i).getAktualnyZostatok();
            }
        }

        return zostatok;
    }

}
