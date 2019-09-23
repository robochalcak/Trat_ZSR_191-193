package simulatorHoduKockou;              // location

import javax.swing.*;                     // important for JOptionPane output
import java.util.Random;                  // important for using random generator

import static java.lang.System.exit;      //important for exit the program with successfully code 0

public class HodKockou                    // class declaration
{
    public static void main(String[] args)  // main method declaration
    {
        Random die = new Random(); // new object of die

        JOptionPane.showMessageDialog(null, die.nextInt(6) + 1);  // output, with display randomly generated number
        // from 1 to 6, each number is incremented by 1, because it start from 0 and ends with 5, but we need to
        // start from 1 and finish at 6

        exit(0);                       // successful exit of program.
    }
}
