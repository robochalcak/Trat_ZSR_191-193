package zobrazovacMena;  //location

import komponent.KomponentaMeno;  //importing another package for using displaying komponent content

import javax.swing.*;    //  import necessary package for GUI
import javax.swing.border.Border;  // import necessary package for setting the border of text field
import java.awt.*;    // import necessary package for setting color

public class ZobrazovacMena    // class declaration
{
    public static void main(String[] args)   // main method declaration
    {

        Border border = BorderFactory.createLineBorder(Color.WHITE,10);  //creating a new object border, setting
        // color and size of frame
        JFrame okno = new JFrame(); // creating a new GUI window
        JTextField text = new JTextField();  // creating a new text field with name
        text.setText("Robert Chalcak");      // setting string text for text field
        text.setForeground(new java.awt.Color(255,0,0)); //set text color to red
        text.setSize(150,20);      // set dimension for text
        text.setHorizontalAlignment(JTextField.CENTER); //alignment to center
        text.setBackground(new java.awt.Color(0,0,255));  // set text background color like rectangle color
        text.setBounds(10,10,400,205);  // sett bounds of text field
        text.setBorder(border);   //adding border object in to textField
        text.setFont(new Font("TimesRoman", Font.PLAIN,45));  // setting fond for proper displaying the name


        okno.setSize(400,205);  // setting default size of window
        okno.setTitle("Zobrazovac mena");   // setting title for window
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting close button action

        KomponentaMeno komponenta = new KomponentaMeno();  // creating a new object komponenta
        okno.add(komponenta);  // adding komponenta in to window JFrame okno
        okno.add(text);    // adding textField in to window
        okno.setSize(438,265); // setting default size of window
        okno.setVisible(true);  // setting visibility to true
    }
}


