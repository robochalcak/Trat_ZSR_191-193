package _05_integracia_swing_a_databaza.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class OsobneDataFilter extends FileFilter
{

	@Override
	public boolean accept(File f)
	{
		String nazovSuboru = f.getName();
		
		if (f.isDirectory())
		{
			return true;
		}
		
		String priponaSuboru = PriponaSuboruUtil.getPripnaSuboru(nazovSuboru);
		
		if (priponaSuboru == null)
		{
			return false;
		}
		
		if (priponaSuboru.equals(".osd"))
		{
			return true;
		}
		
		return false;
	}

	@Override
	public String getDescription()
	{
		return "Subory s osobnymi datami (*.osd)";
	}
	
}
