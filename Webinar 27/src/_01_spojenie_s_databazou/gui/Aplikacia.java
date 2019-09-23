package _01_spojenie_s_databazou.gui;

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
