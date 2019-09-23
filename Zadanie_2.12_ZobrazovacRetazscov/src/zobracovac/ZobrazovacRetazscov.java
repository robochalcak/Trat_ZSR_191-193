package zobracovac;   //package location

import komponent.KomponentaRetazsce;    //import displaying component

import javax.swing.*;                  // import for creating a window

public class ZobrazovacRetazscov        // class definition
{
    public static void main(String[] args)      // main method definition
    {
        JFrame okno = new JFrame();           // JFrame object

        okno.setSize(300,500);       // setting size of the window
        okno.setTitle("Zobrazovac retazscov");      // title of the window
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // close action

        KomponentaRetazsce komponent = new KomponentaRetazsce();     // creating a component for displaying on the
        // window

        okno.add(komponent); //created component is added in to window

        okno.setVisible(true);   // setting visibility to true

    }
}
