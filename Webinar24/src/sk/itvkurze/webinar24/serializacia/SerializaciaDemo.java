package sk.itvkurze.webinar24.serializacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Program demonstruje serializaciu objektu typu  Banka.
 * Ak subor  so serializovanimi objektm extuje, nasledne sa nacita
 * loadne v opacnom pripade sa program sa spusti s novym objektom typu Banka.
 * Nasledne sa do baky pridaju bankove ucty, a opat sa tento objekt zoserializuje, t.j. uloyzi
 * sa na disk ako postupnost bajtov. 
 * @author Robert Chalcak
 *
 */
public class SerializaciaDemo
{

   public static void main(String[] args) throws IOException, ClassNotFoundException
   {
       Banka banka;
       
       File subor = new File("banka.dat");
       
       if(subor.exists())
       {
          FileInputStream fis = new FileInputStream(subor);
          ObjectInputStream vstup = new ObjectInputStream(fis);
          banka=(Banka) vstup.readObject();
          vstup.close();
          
       }
       else
       {
          banka = new Banka();
          banka.pridaj(new BankovyUcet(1001,10000));
          banka.pridaj(new BankovyUcet(1002,500));
          banka.pridaj(new BankovyUcet(1003,600));
       }
       
       //vlozime nejake peniaze na ucty v banke
       BankovyUcet ucet = banka.vyhladaj(1001);
       ucet.vloz(100);
       System.out.println(ucet.getCisloUctu()+": "+ucet.getAktualnyZostatok());
       ucet.vloz(200);
       System.out.println(ucet.getCisloUctu()+": "+ucet.getAktualnyZostatok());
       
       //ulozit stav objektov banka, ako postupnost bajtov do suboru banka.dat, deserializujem objekt typu banka
       
       FileOutputStream fos = new FileOutputStream(subor);
       ObjectOutputStream zapis = new ObjectOutputStream(fos);
       zapis.writeObject(banka);
       zapis.close();
   }

}
