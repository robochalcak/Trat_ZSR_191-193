package Okno; // package declaration

import komponent.KomponentObdl;  // importing package of other class for using it

import javax.swing.*; // important for using creating of the window

public class Okno  // class declaration
{
    public static void main(String[] args)  // main declaration
    {


        JFrame okno = new JFrame();  // window object

        okno.setSize(600, 400); // setting size width on 600 and height on 400 px

        okno.setTitle("Štyri obdĺžniky  "); // title of the window

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what will happen if I click on exit button

        okno.setLocationRelativeTo(null); // location in the centre of the screen

        KomponentObdl komp = new KomponentObdl(); // creating object with rectangle parameters and drawing parameters
        // as well

        okno.add(komp); // adding rec and draw object in to window

        okno.setVisible(true); // this means, that window will be visible or not
    }

}
