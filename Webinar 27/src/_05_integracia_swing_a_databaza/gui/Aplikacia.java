package _05_integracia_swing_a_databaza.gui;

import javax.swing.SwingUtilities;

public class Aplikacia
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new HlavneOkno();
			}
		});
	}
}
