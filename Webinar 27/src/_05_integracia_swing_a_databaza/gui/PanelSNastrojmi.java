package _05_integracia_swing_a_databaza.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSNastrojmi extends JPanel implements ActionListener
{
	private JButton ulozTlacitko;
	private JButton refreshTlacitko;
	private PanelSNastrojmiListener listener;
	
	public PanelSNastrojmi() 
	{
		ulozTlacitko = new JButton("Uloz");
		ulozTlacitko.addActionListener(this);
		refreshTlacitko = new JButton("Refresh");
		refreshTlacitko.addActionListener(this);
		
		// 3) jednoduche ohranicenie
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(ulozTlacitko);
		add(refreshTlacitko);
	}

	public void setPanelSNastrojmiListener(PanelSNastrojmiListener listener)
	{
		this.listener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// potrebujeme rozlisit, na ktore tlacitko sme klikli ...
		JButton stlaceneTlacitko = (JButton) e.getSource();
		
		if (stlaceneTlacitko == ulozTlacitko)
		{
			if (listener != null)
			{
				listener.nastalaUlozEvent();
			}
		}
		else if (stlaceneTlacitko == refreshTlacitko)
		{
			if (listener != null)
			{
				listener.nastalaRefreshEvent();
			}
		}
		
	}
	
	
}
