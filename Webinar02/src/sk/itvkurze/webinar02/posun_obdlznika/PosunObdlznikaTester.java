package sk.itvkurze.webinar02.posun_obdlznika;
import java.awt.Rectangle;

public class PosunObdlznikaTester 
{
	public static void main(String[] args) 
	{
		Rectangle obdlznik;
		
		obdlznik = new Rectangle(5, 10, 20, 30); //x =5 y =10, width = 20, height = 30
		System.out.println("x-ova suradnica je " +obdlznik.x);
		System.out.println("Vyska obdlznika je " + obdlznik.height);
		
		//chceme posunut obdlznik o 30 pixelov do prava (x -ovom 30 px do prava a v ypsilone dole o 15px
		System.out.println("-------------------------------------------------------------------------");
		obdlznik.translate(30, 15);
		
		System.out.println("x-ova suradnica je " + obdlznik.x);
		System.out.println("Y-ova suradnica je " + obdlznik.y);
		System.out.println("vyska obdlznika je " + obdlznik.height);
	}
}
             