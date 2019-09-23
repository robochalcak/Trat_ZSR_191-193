package penazenka;

import java.util.ArrayList;

/**
 Penazenka pozostava z kolekcie minci.
 */
public class Penazenka
{
    private ArrayList<String> mince;
    /**
     Vytvara prazdnu penazenku.
     */
    public Penazenka()
    {
        mince = new ArrayList<String>();
    }
    /**
     Prida mincu do penazenky.
     @param nazovMince nazov mince
     */
    public void pridajMincu(String nazovMince)
    {
        mince.add(nazovMince);
    }
    /**
     Vrati retazcovu reprezentaciu stavu penazenky.
     @return retazcovu reprezentaciu stavu penazenky vo formate:
     "Penazenka[nazovMince1, nazovMince2, nazovMince3, ...]"
     */
    public String toString()
    {
        String all = "[";

        for (int i = 0; i < mince.size() - 1; i++)
        {
            all += mince.get(i) + ", ";
        }

        all += mince.get(mince.size() - 1) + "]";

        return all;
    }
    /**
     Rozhodne, ci su penazenky obsahovo rovnake.
     @param inaPenazenka ina penazenka
     @return true ak su penazenky obsahovo rovnake, false v opacnom
     pripade
     */
    public boolean jeObsahovoTotoznaS(Penazenka inaPenazenka)
    {
        boolean status = false;

        if (mince.size() != inaPenazenka.mince.size())
        {
            status = false;
        }
        else
        {

            for (int i = 0; i < mince.size(); i++)
            {
                if (mince.get(i).equalsIgnoreCase(inaPenazenka.mince.get(i)))
                {
                    status = true;
                }
                else
                {
                    status = false;
                }

            }
        }
        return status;
    }
}
