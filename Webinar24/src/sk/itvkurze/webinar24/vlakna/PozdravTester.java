package sk.itvkurze.webinar24.vlakna;

public class PozdravTester
{

   public static void main(String[] args)
   {
         //vytvorili sme 2 spustitelne ulohy
        Pozdrav pozdrav = new Pozdrav("Ahoj, amigo!");
        Pozdrav pozdrav2 = new Pozdrav("Dobry den prajem :-)");
        
        //vytvorime 2 vlakna a podhodime im ulohy na spracovanie;
        
        Thread vlakno1 = new Thread(pozdrav);
        Thread vlakno2 = new Thread(pozdrav2);
        
        vlakno1.start();
        vlakno2.start();

   }

}
