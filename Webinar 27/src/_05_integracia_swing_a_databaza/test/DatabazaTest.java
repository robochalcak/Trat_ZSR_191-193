package _05_integracia_swing_a_databaza.test;

import java.sql.SQLException;

import _05_integracia_swing_a_databaza.model.Databaza;
import _05_integracia_swing_a_databaza.model.Osoba;
import _05_integracia_swing_a_databaza.model.Pohlavie;
import _05_integracia_swing_a_databaza.model.VekovaKategoria;
import _05_integracia_swing_a_databaza.model.ZamestnaneckyStatus;


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
