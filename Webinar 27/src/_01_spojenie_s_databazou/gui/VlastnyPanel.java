package _01_spojenie_s_databazou.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VlastnyPanel extends JPanel
{
	private JTextArea plochaTextu;
	
	public VlastnyPanel() 
	{
		plochaTextu = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(plochaTextu), BorderLayout.CENTER);
	}
	
	public void vlozText(String text)
	{
		plochaTextu.append(text);
	}
}
