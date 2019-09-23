package zobrazovacElipsy;   // package location

import komponentElipsa.KomponentaElipsa;   // necessary for drawing an oval

import javax.swing.*; // necessary for GUI

public class ZobrazovacElipsy  // class definition
{
    public static void main(String[] args)  // main method definition
    {
        JFrame okno = new JFrame();    // new JFrame object okno

        okno.setSize(300, 400);  // setting window`s size
        okno.setTitle("Zobrazovac elipsy");   // setting window`s title

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // setting close operation on close button

        KomponentaElipsa komponenta = new KomponentaElipsa();  // creating a new object with drawing shape
        okno.add(komponenta);   // adding created object with shape

        okno.setVisible(true);   // setting visibility of the window

    }
}
