package zobrazovac;  // package location

import komponent.KomponentSmajlik;  // smile import :))

import javax.swing.*;  // import for GUI

public class ZobrazovacSmajlika  // class definition
{
    public static void main(String[] args)  // main definition
    {
        JFrame okno = new JFrame();  // object for GUI
        okno.setSize(300, 400);  // set dimension for window
        okno.setTitle("Zobrazovac smajlika");  // title for window
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default operation on close button
        KomponentSmajlik kom = new KomponentSmajlik();  // smile :) object creation
        okno.add(kom);    // adding smile to window
        okno.setVisible(true);  // visibility to true
    }
}
