package _04_ziskavanie_dat_z_databazy_2.gui;

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
