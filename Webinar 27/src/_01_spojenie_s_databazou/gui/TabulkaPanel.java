package _01_spojenie_s_databazou.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import _01_spojenie_s_databazou.model.Osoba;

public class TabulkaPanel extends JPanel
{
	private JTable tabulka;
	private OsobaTabulkaModel tabulkaModel;
	private JPopupMenu popup;
	private OsobaTabulkaListener tabulkaListener;
	
	public TabulkaPanel()
	{
		tabulkaModel = new OsobaTabulkaModel();
		tabulka = new JTable(tabulkaModel);
		popup = new JPopupMenu();
		
		JMenuItem zmazItem = new JMenuItem("Zmaz riadok");
		
		popup.add(zmazItem);
		
		tabulka.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				// prave tlacitko je BUTTON3
				if (e.getButton() == MouseEvent.BUTTON3)
				{
					int riadok = tabulka.rowAtPoint(e.getPoint());
					
					// chceme oznacit riadky od - do
					tabulka.getSelectionModel().setSelectionInterval(riadok, riadok);
					
					popup.show(tabulka, e.getX(), e.getY());
				}
			}
		});
		
		zmazItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int riadok = tabulka.getSelectedRow();
				System.out.println(riadok);
				
				if (tabulkaListener != null)
				{
					tabulkaListener.riadokZmazany(riadok);
					tabulkaModel.fireTableRowsDeleted(riadok, riadok);
				}
			}
		});
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(tabulka), BorderLayout.CENTER);
	}
	
	public void setData(List<Osoba> osoby)
	{
		tabulkaModel.setData(osoby);
	}
	
	public void refresh()
	{
		tabulkaModel.fireTableDataChanged();
	}

	public void setOsobaTabulkaListener(OsobaTabulkaListener listener)
	{
		this.tabulkaListener = listener;
	}
}
