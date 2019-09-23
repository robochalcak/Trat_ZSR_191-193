package frane;  // location

import rectangles.Rectangles; // necessary for using Rectangles class with definition of rectangles

import javax.swing.*; // necessary for using JFrame

public class Frame  // class definition
{
    public static void main(String[] args) // definition main method
    {
        Rectangles recs = new Rectangles(); // new object Rectangles

        JFrame frame = new JFrame();  // new JFrame object

        frame.setSize(600, 600);  // setting dimension of window

        frame.setTitle("Prienik dvoch obdlznikov"); // window title

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // action, by clicking on closing button

        frame.add(recs);  // adding an object to draw it on the window

        frame.setVisible(true); // the window must be visible
    }

}
