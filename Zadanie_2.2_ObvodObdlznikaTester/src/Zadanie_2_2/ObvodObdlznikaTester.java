package Zadanie_2_2; // package location

import java.awt.*;  // necessary for using Rectangle class

public class ObvodObdlznikaTester  // Class declaration
{
    public static void main(String[] args) // method declaration
    {
        Rectangle rec = new Rectangle(0,0,100,200);  // declaration and definition of object Rectangle

        double obvod;   // declaration of circumference
        double exp=600.0;   // expected value

        obvod = (2*rec.getWidth())+(2*rec.getHeight()); // calculating of circumference by using formula 2*a + 2*b
        System.out.println("The expected value is "+ exp); // standard output of program

        System.out.println("Rectangle with height"+rec.getHeight()+",");
        System.out.println("and with width "+rec.getWidth()+" has a circumference:");
        System.out.println(obvod+".");

        if(exp == obvod)  // checking if expected result is the same like a real result after calculation
            System.out.println("The result is correct :)"); // if is this statement will be printed
        else
        {
            System.out.println("Sorry for complication"); // otherwise this.
            System.out.println("I need fix bugs :(");
        }
    }
}
