package _03_ukladanie_dat_do_databazy.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSNastrojmi extends JPanel implements ActionListener
{
	private JButton okTlacitko;
	private JButton zrusTlacitko;
	private TextListener listener;
	
	public PanelSNastrojmi() 
	{
		okTlacitko = new JButton("OK");
		okTlacitko.addActionListener(this);
		zrusTlacitko = new JButton("Zrus");
		zrusTlacitko.addActionListener(this);
		
		// 3) jednoduche ohranicenie
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(okTlacitko);
		add(zrusTlacitko);
	}

	public void setTextListener(TextListener listener)
	{
		this.listener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// potrebujeme rozlisit, na ktore tlacitko sme klikli ...
		JButton stlaceneTlacitko = (JButton) e.getSource();
		
		if (stlaceneTlacitko == okTlacitko)
		{
			if (listener != null)
			{
				listener.posliText("Klikol si na tlacitko OK.\n");
			}
		}
		else if (stlaceneTlacitko == zrusTlacitko)
		{
			if (listener != null)
			{
				listener.posliText("Klikol si na tlacitko Zrus.\n");
			}
		}
		
	}
	
	
}
