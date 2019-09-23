package sk.itvkurze.webinar23.subory;

import java.io.IOException;
import java.util.Scanner;
/**
 * Program demonstruje nahodny pristup vk datam v subore.Dokazeme spristupni
 * existujuce ucty a vlozit na ne prostriedky, pripadne vytvorit nove ucty.
 * 
 * Ucty su ulozene v subore s nahodnym pristupom.
 * @author Robert Chalcak
 *
 */
public class BankaSimulator
{

   public static void main(String[] args) throws IOException
   {
      Scanner vstup = new Scanner(System.in);
      BankoveData data = new BankoveData();
      
      data.otvor("banka.dat");
      
      boolean koniec=false;
      
      try
      {
         while(!koniec)
         {
            System.out.print("Cislo uctu: ");
            int cisloUctu = vstup.nextInt();
            
            System.out.println("Ciastka na vlozenie: ");
            double ciastka = vstup.nextDouble();
            
            int pozicia=data.vyhladaj(cisloUctu);
            
            BankovyUcet ucet;
            
            if(pozicia>=0)  // ucet exituje pripis ciastku a vypis zostatok
            {
               ucet=data.precitaj(pozicia);
               ucet.vloz(ciastka);
               System.out.println("Novy zostatok: "+ucet.getAktualnyZostatok());
            }
            else  // vytvor novy ucet
            {
                 ucet = new BankovyUcet(cisloUctu, ciastka);
                 pozicia=data.velkost();
                 System.out.println("Novy ucet bol uspesne vytvoreny.");
            }
            data.zapis(pozicia,ucet);
            
            System.out.println("Zelate si ukoncit pracu s programom (A/N) ");
            String volba = vstup.next();
            
            if(volba.equalsIgnoreCase("a"))
            {
               koniec=true;
            }        
            
         }
      }finally
      {
         data.zatvor();
         vstup.close();
      }
      
      
      
   }

}
