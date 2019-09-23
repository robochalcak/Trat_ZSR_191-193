package sk.itvkurze.webinar02.grafika;

import javax.swing.JFrame;

public class ZobrazovacPrazdnehoOkna 
{

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	JFrame okno = new JFrame();
	
	okno.setSize(400,500);
	okno.setTitle("Zobrazovac prazdneho okna");
	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	okno.setLocationRelativeTo(null);
	okno.setVisible(true);
    }
}
