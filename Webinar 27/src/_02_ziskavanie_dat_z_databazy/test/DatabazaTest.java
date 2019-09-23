package _02_ziskavanie_dat_z_databazy.test;

import java.sql.SQLException;

import _02_ziskavanie_dat_z_databazy.model.Databaza;
import _02_ziskavanie_dat_z_databazy.model.Osoba;
import _02_ziskavanie_dat_z_databazy.model.Pohlavie;
import _02_ziskavanie_dat_z_databazy.model.VekovaKategoria;
import _02_ziskavanie_dat_z_databazy.model.ZamestnaneckyStatus;

public class DatabazaTest
{
	public static void main(String[] args)
	{
		Databaza db = new Databaza();
		try
		{
			db.vytvorSpojenie();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		db.vlozOsobu(new Osoba("Michal Kasan", "Zuno", VekovaKategoria.dospely, ZamestnaneckyStatus.zamestnany, false, "SR", Pohlavie.muz));
		db.vlozOsobu(new Osoba("Eva Pokorna", "ESET", VekovaKategoria.senior, ZamestnaneckyStatus.zivnostnik, true, "GER", Pohlavie.zena));
		
		try
		{
			db.uloz();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		db.zrusSpojenie();
	}
}
