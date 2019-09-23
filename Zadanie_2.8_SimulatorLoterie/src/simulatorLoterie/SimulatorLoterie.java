package simulatorLoterie;                                   // location

import java.util.Random;                                    // important for random generating numbers
import java.util.Scanner;                                   // important for user`input

public class SimulatorLoterie                               //class declaration
{
    public static void main(String[] args)                  // main method declaration
    {
        int numbers[] = new int[6];                          // array for user guesses
        int lotery[] = new int[6];                          // array for lottery numbers

        for (int i = 0; i < 6; i++)                         // for loop for populating the array with user
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Zadajte číslo : " + (1 + i) + " #");
            numbers[i] = in.nextInt();
            while (numbers[i] < 1 || numbers[i] > 49)        // input validation
            {
                System.out.println("Vaše zadané číslo je mimo rozsahu 1 až 49 !!!");
                System.out.println("Zadajte číslo #" + (i + 1) + " znova : ");
                numbers[i] = in.nextInt();
            }
        }

        System.out.print("Čísla zadané typujúcim: ");     // message

        for (int i = 0; i < 6; i++)                            // for loop for printing number guesses by user
        {
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < 6; i++)                      // populating the array with random number for lottery
        {
            Random num = new Random();                      // creating a new object random
            lotery[i] = num.nextInt(49) + 1;         // populating the array with random numbers;
        }
        System.out.println();                               // new line
        System.out.print("Vyherná kombinácia čísel: ");    // message
        for (int i = 0; i < 6; i++)                         // printing out an array with random generated numbers;
        {
            System.out.print(lotery[i] + " ");
        }
    }
}
