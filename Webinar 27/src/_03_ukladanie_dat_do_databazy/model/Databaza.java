package _03_ukladanie_dat_do_databazy.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Databaza
{
	private List<Osoba> osoby;
	private Connection spojenie;
	
	public Databaza()
	{
		// pouzijeme implementacu LinkedList nakolko je viac usposobena na pridavanie/mazanie 
		// dat z lubovolenho indexu
		osoby = new LinkedList<Osoba>();
	}
	
	public void vlozOsobu(Osoba osoba)
	{
		osoby.add(osoba);
	}
	
	public List<Osoba> getOsoby()
	{
		// tymto zabezpecime, zemimo tuto triedu nikto zoznam osob nedokaze zmenit
		return Collections.unmodifiableList(osoby);
	}
	
	public void vytvorSpojenie() throws Exception
	{
		if (spojenie != null)
		{
			return;
		}
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			throw new Exception("Nenasiel sa ovladac");
		}
		
		String URL = "jdbc:mysql://localhost:3306/dochadzka_db?useLegacyDatetimeCode=false&serverTimezone=UTC";
		spojenie = DriverManager.getConnection(URL, "root", "Robo1987");
		
		System.out.println("Pripojeni: " + spojenie);
	}
	
	// ulozime vsetky data z arraylistu do databazy, avsak najprv otestujeme, ci sa tam uz dana osoba nenachadza
	public void uloz() throws SQLException
	{
		String sqlTest = "select count(*) as pocet from osoby where id=?";
		
		String sqlInsert = "INSERT INTO osoby(" + 
				"id, meno, zamestnanie, vekkat, zamstat, jecudzinec, statnaprisl, pohl)" + 
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		String sqlUpdate = "UPDATE osoby " + 
				"SET meno=?, zamestnanie=?, vekkat=?::vekovakategoria, zamstat=?::zamestnaneckystatus, jecudzinec=?, statnaprisl=?, pohl=?::pohlavie " + 
				"WHERE id=?";
		
		PreparedStatement overovaciPrikaz = spojenie.prepareStatement(sqlTest);
		
		for(Osoba osoba: osoby)
		{
			int id = osoba.getId();
			String meno = osoba.getMeno();
			Pohlavie pohlavie = osoba.getPohlavie();
			String statnaPrislusnost = osoba.getStatnaPrislusnost();
			ZamestnaneckyStatus status = osoba.getStatus();
			VekovaKategoria vekovaKategoria = osoba.getVekovaKategoria();
			String zamestnanie = osoba.getZamestnanie();
			boolean jeCudzinec = osoba.isJeCudzinec();
			
			overovaciPrikaz.setInt(1, id);		// nahradime ? za realnu hodnotu v sqlTeste
			
			ResultSet vysledok = overovaciPrikaz.executeQuery();
			
			while(vysledok.next())
			{
				int pocet = vysledok.getInt(1);
				int index = 1;
				
				// osoba s danym id sa v databaze nenachadza
				if (pocet == 0)
				{
					// INSERT
					System.out.println("Vkladam do databazy osobu s ID: " + id);
					PreparedStatement insertPrikaz = spojenie.prepareStatement(sqlInsert);
					
					// meno, zamestnanie, vekkat, zamstat, jecudzinec, statnaprisl, pohl
					insertPrikaz.setInt(index++, id);
					insertPrikaz.setString(index++, meno);
					insertPrikaz.setString(index++, zamestnanie);
					insertPrikaz.setString(index++, vekovaKategoria.name());
					insertPrikaz.setString(index++, status.name());
					insertPrikaz.setBoolean(index++, jeCudzinec);
					insertPrikaz.setString(index++, statnaPrislusnost);
					insertPrikaz.setString(index++, pohlavie.name());
					
					insertPrikaz.execute();
					insertPrikaz.close();
				}
				else 
				{
					// UPDATE
					System.out.println("Udate osoby s ID: " + id);
					PreparedStatement updatePrikaz = spojenie.prepareStatement(sqlUpdate);
					
					/*
					"SET meno=?, zamestnanie=?, vekkat=?, zamstat=?, jecudzinec=?, statnaprisl=?, pohl=?" + 
					" WHERE id=?";
					*/
					index = 1;
					updatePrikaz.setString(index++, meno);
					updatePrikaz.setString(index++, zamestnanie);
					updatePrikaz.setString(index++, vekovaKategoria.name());
					updatePrikaz.setString(index++, status.name());
					updatePrikaz.setBoolean(index++, jeCudzinec);
					updatePrikaz.setString(index++, statnaPrislusnost);
					updatePrikaz.setString(index++, pohlavie.name());
					updatePrikaz.setInt(8, id);
					
					System.out.println(updatePrikaz.toString());
					
					updatePrikaz.executeUpdate();
					updatePrikaz.close();
				}
				
				// System.out.println("Pocet osob s ID " + id + " je " + pocet);
			}
		}
		
		overovaciPrikaz.close();
	}
	
	public void zrusSpojenie()
	{
		if (spojenie != null) 
		{
			try
			{
				spojenie.close();
			} 
			catch (SQLException e)
			{
				System.out.println("Nie je mozne ukoncit spojenie s databazou");
			}
		}
	}
	
	public void ulozDoSuboru(File subor) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(subor);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Osoba[] ludia = osoby.toArray(new Osoba[osoby.size()]);
		
		oos.writeObject(ludia);
		
		oos.close();
	}
	
	public void nacitajZoSuboru(File subor) throws IOException
	{
		FileInputStream fis = new FileInputStream(subor);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try
		{
			Osoba[] ludia = (Osoba[]) ois.readObject();
			
			osoby.clear();
			
			osoby.addAll(Arrays.asList(ludia));
			
		} catch (ClassNotFoundException e)
		{
			System.err.println("Chyba pri nacitavani suboru");
			e.printStackTrace();
		}
		
		ois.close();
	}

	public void zmazOsobu(int riadok)
	{
		osoby.remove(riadok);
	}
}
