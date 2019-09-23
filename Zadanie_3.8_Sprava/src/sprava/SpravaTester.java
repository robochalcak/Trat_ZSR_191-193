package sprava;

/**
 * This class provides testing the Sprava class
 */
public class SpravaTester  // class declaration
{
    public static void main(String[] args)  // main method declaration
    {
        String prijemca;  // declaration necessary parts of message
        String odosielatel;
        String riadok1;
        String riadok2;
        String riadok3;

        prijemca = "Peter";   // definition of necessary parts of message
        odosielatel = "Nada";
        riadok1 = "s poľutovaním ti musím oznámiť, že sa rozchádzame.";
        riadok2 = "Želám ti v živote len to najlepšie.";
        riadok3 = "\nS úctou,";

        Sprava sprava = new Sprava(prijemca, odosielatel);  // new object of message
        sprava.pridajRiadok(riadok1);   // the next three lines are adding a line in to body of message
        sprava.pridajRiadok(riadok2);
        sprava.pridajRiadok(riadok3);
        System.out.println("***********************************");
        System.out.println(sprava.getText());   // output
        System.out.println("***********************************");

    }
}
