import javax.swing.JOptionPane; //necessary for using  message dialogs

public class ZobrazovacDialogu //class declaration
{
    public static void main(String[] args) // main method for running each program
    {
        String krstneMeno = JOptionPane.showInputDialog("Zadaj krstné meno: "); //declaration of string object, with
        // is initialized with showInputDialog, where user enters his or her name

        JOptionPane.showMessageDialog(null,"Ahoj, "+krstneMeno);//output with greeting
        System.exit(0); //successful exit
    }
}
