package kopirovacSuborov;

import java.io.*;
import java.util.Scanner;
/**
 Program kopiruje obsah jedneho suboru do ineho suboru.
 */
public class KopirovacSuborov
{
    public static void main(String[] args) throws IOException
    {
        if(args.length!=2)
        {
            System.out.println("Pouzitie: KopirovacSuborov data.txt zaloha_data.txt");
        }

        String nazovVstupnySubor=args[0];
        String naxovZaloznySubor=args[1];
        String riadok="";


        FileReader reader = new FileReader(args[0]);
        Scanner vstup =new Scanner(reader);
        PrintWriter writer = new PrintWriter(args[1]);
        while(vstup.hasNextLine())
        {
            riadok=vstup.nextLine();
            writer.println(riadok);
        }

        System.out.println("Subor bol uspesne zalohovany!");
        vstup.close();
        reader.close();
        writer.close();
    }
}
