package Zadanie2_1_Obdlznik; //location in package

import javax.swing.*;
import java.awt.*; // necessary for using a Rectangle class

public class ObsahObdlznikaTester // class definition
{
    public static void main(String[] args) //main method definition for running the program
    {
        Rectangle rec =new Rectangle(0,0,500,450); // declaration and initialization of object Rectangle
        double area; // declaration of area
        area = rec.getHeight() * rec.getWidth(); // using multiplying length and width,we get an area

        //output of the program.
        System.out.println("Rectangle with height: "+rec.getHeight()+",");
        System.out.println("and with widht: "+ rec.getWidth()+" has an area ");
        System.out.println(area+". ");

    }
}
