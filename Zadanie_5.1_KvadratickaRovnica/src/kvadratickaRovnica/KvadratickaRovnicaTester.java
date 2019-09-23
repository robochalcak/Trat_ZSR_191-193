package kvadratickaRovnica;

import java.util.Scanner;

public class KvadratickaRovnicaTester
{
    public static void main(String[] args)
    {
       // int a = 2, b = 2, c = -4;
        // povedzme ze a = 2, b, = 2, c = -4
        Scanner keyboard = new Scanner(System.in);

        System.out.println("***********************************************************");
        System.out.println(" PROGRAM NA VYPOCET A NAJDENIE RIESENI KVADRATICKEJ ROVNICE");
        System.out.println("***********************************************************");
        System.out.println("Zadaj a: ");
        int a = keyboard.nextInt();
        System.out.println("Zadaj b: ");
        int b = keyboard.nextInt();
        System.out.println("Zadaj c: ");
        int c = keyboard.nextInt();


        System.out.println("Ocakavane hodnoty su v pripade zadania a = 2, b = 2 c = -4, pri inych hodnotach sa to " +
                "moze lisit.");
        KvadratickaRovnica rovnica = new KvadratickaRovnica(a, b, c);
        System.out.println("Je rovnica riesitelna? " + rovnica.jeRiesitelna());
        System.out.println("Ocakavana hodnota: true");
        System.out.println("Rovnica ma dva korene: x1 = " + rovnica.getRiesenie1() + ", x2 = " + rovnica.getRiesenie2());
        System.out.println("Ocakavana hodnota: x1 = -2, x2 = 1");
        System.out.println(rovnica.kolkoRieseni());
        // zostrojte druhu kvadaraticku rovnicu, kde koeficienty budu a = 2, b = 2, c = 4 a zobrazte informacie o riesitelnosti rovnice a jej korenoch
        keyboard.close();
    }
}
