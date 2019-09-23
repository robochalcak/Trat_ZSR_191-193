package zosvetlovac; // location

import java.awt.*;  // necessary for using Color object

public class ZosvetlovacDemo  // class definition
{
    public static void main(String[] args)  // main method definition
    {
        int r = 150;   // red color value
        int g = 50;    // green color value
        int b = 50;    // blue color value

        Color color = new Color(r, g, b);  // definition of new color object and passed with values above

        System.out.println("Colors before using method brighter  ");  // program output
        System.out.println("=====================================");
        System.out.println("Red:   " + color.getRed());
        System.out.println("Green: " + color.getGreen());
        System.out.println("Blue:  " + color.getBlue());

        System.out.println("=====================================");
        System.out.println("Now I am using method brighter()...");
        color = color.brighter();   // using method brighter() to brighter version of color
        System.out.println("=====================================");

        System.out.println("Done now values below...");
        System.out.println("=====================================");
        System.out.println("Red:   " + color.getRed());
        System.out.println("Green: " + color.getGreen());
        System.out.println("Blue:  " + color.getBlue());

    }
}
