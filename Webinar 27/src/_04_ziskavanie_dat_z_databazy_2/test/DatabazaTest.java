package _04_ziskavanie_dat_z_databazy_2.test;

import java.sql.SQLException;

import _04_ziskavanie_dat_z_databazy_2.model.Databaza;
import _04_ziskavanie_dat_z_databazy_2.model.Osoba;
import _04_ziskavanie_dat_z_databazy_2.model.Pohlavie;
import _04_ziskavanie_dat_z_databazy_2.model.VekovaKategoria;
import _04_ziskavanie_dat_z_databazy_2.model.ZamestnaneckyStatus;


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
		
		db.vlozOsobu(new Osoba("Michal Kasan", "Prima Banka", VekovaKategoria.dospely, ZamestnaneckyStatus.zamestnany, false, "SR", Pohlavie.muz));
		db.vlozOsobu(new Osoba("Eva Pokorna", "VUB Banka", VekovaKategoria.senior, ZamestnaneckyStatus.zivnostnik, true, "GER", Pohlavie.zena));
		
		try
		{
			db.uloz();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			db.nacitajCeluDB();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		db.zrusSpojenie();
	}
}
