package _05_integracia_swing_a_databaza.gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import _05_integracia_swing_a_databaza.model.Osoba;

public class OsobaTabulkaModel extends AbstractTableModel
{
	private List<Osoba> db;

	private String[] nazvyStlpcov =
	{ "ID", "Meno", "Predosle Zamestnanie", "Vekova kategoria", "Zamestnanecky status", "Cudiznec?",
			"Statna prislusnost", "Pohlavie" };

	public OsobaTabulkaModel()
	{

	}

	@Override
	public String getColumnName(int stlpec)
	{
		return nazvyStlpcov[stlpec];
	}

	public void setData(List<Osoba> db)
	{
		this.db = db;
	}

	@Override
	public int getRowCount()
	{
		return db.size();
	}

	@Override
	public int getColumnCount()
	{
		return 8;
	}

	@Override
	public Object getValueAt(int riadok, int stlpec)
	{
		Osoba osoba = db.get(riadok);

		switch (stlpec)
		{
		case 0:
			return osoba.getId();
		case 1:
			return osoba.getMeno();
		case 2:
			return osoba.getZamestnanie();
		case 3:
			return osoba.getVekovaKategoria();
		case 4:
			return osoba.getStatus();
		case 5:
			return osoba.isJeCudzinec();
		case 6:
			return osoba.getStatnaPrislusnost();
		case 7:
			return osoba.getPohlavie();
		}

		return null;
	}

}
