package _05_integracia_swing_a_databaza.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import _05_integracia_swing_a_databaza.gui.FormularEvent;
import _05_integracia_swing_a_databaza.model.Databaza;
import _05_integracia_swing_a_databaza.model.Osoba;
import _05_integracia_swing_a_databaza.model.Pohlavie;
import _05_integracia_swing_a_databaza.model.VekovaKategoria;
import _05_integracia_swing_a_databaza.model.ZamestnaneckyStatus;


public class Controller
{
	Databaza db = new Databaza();
	
	public List<Osoba> getOsoby() {
		return db.getOsoby();
	}
	
	public void vlozOsobu(FormularEvent event)
	{
		String meno = event.getMeno();
		String pohlavieId = event.getPohlavie();
		String statnaPrislusnost = event.getStatnaPrislusnost();
		String status = event.getStatus();
		int vekovaKategoriaId = event.getVekovaKategoria();
		String zamestnanie = event.getPoslednyZamestnavatel();
		boolean jeCudzinec = event.jeCudzinec();
		
		VekovaKategoria vekovaKategoria = null;
		
		switch(vekovaKategoriaId)
		{
			case 0:
				vekovaKategoria = VekovaKategoria.dieta;
				break;
			case 1:
				vekovaKategoria = VekovaKategoria.dospely;
				break;
			case 2:
				vekovaKategoria = VekovaKategoria.senior;
				break;
		}
		
		ZamestnaneckyStatus zamStatus;
		
		if (status.equals("zamestnany"))
		{
			zamStatus = ZamestnaneckyStatus.zamestnany;
		}
		else if (status.equals("nezamestnany"))
		{
			zamStatus = ZamestnaneckyStatus.nezamestnany;
		}
		else if (status.equals("zivnostnik"))
		{
			zamStatus = ZamestnaneckyStatus.zivnostnik;
		}
		else 
		{
			zamStatus = ZamestnaneckyStatus.iny;
			System.err.println(status);
		}
		
		Pohlavie pohlavie;
		
		if (pohlavieId.equalsIgnoreCase("muz"))
		{
			pohlavie = Pohlavie.muz;
		}
		else
		{
			pohlavie = Pohlavie.zena;
		}
		
		Osoba osoba = new Osoba(meno, zamestnanie, vekovaKategoria, zamStatus, jeCudzinec, statnaPrislusnost, pohlavie);
		db.vlozOsobu(osoba);
	}
	
	public void ulozDoSuboru(File subor) throws IOException
	{
		db.ulozDoSuboru(subor);
	}
	
	public void nacitajZoSuboru(File subor) throws IOException
	{
		db.nacitajZoSuboru(subor);
	}

	public void zmazOsobu(int riadok)
	{
		db.zmazOsobu(riadok);
	}
	
	public void uloz() throws SQLException
	{
		db.uloz();
	}
	
	public void nacitajCeluDB() throws SQLException
	{
		db.nacitajCeluDB();
	}
	
	public void vytvorSpojenieSDB() throws Exception
	{
		db.vytvorSpojenie();
	}
	
	public void ukoncSpojenieSDB()
	{
		db.zrusSpojenie();
	}
}
