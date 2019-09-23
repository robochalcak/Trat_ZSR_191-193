package _03_ukladanie_dat_do_databazy.test;

import java.sql.SQLException;

import _03_ukladanie_dat_do_databazy.model.Databaza;
import _03_ukladanie_dat_do_databazy.model.Osoba;
import _03_ukladanie_dat_do_databazy.model.Pohlavie;
import _03_ukladanie_dat_do_databazy.model.VekovaKategoria;
import _03_ukladanie_dat_do_databazy.model.ZamestnaneckyStatus;

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
		
		db.zrusSpojenie();
	}
}
