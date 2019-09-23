package _03_ukladanie_dat_do_databazy.model;

import java.io.Serializable;

public class Osoba implements Serializable
{
	private static final long serialVersionUID = -6791540213857174213L;

	private static int pocet = 1;

	private int id; // unikatny identifikator kazdej osoby
	private String meno;
	private String zamestnanie;
	private VekovaKategoria vekovaKategoria;
	private ZamestnaneckyStatus status;
	private boolean jeCudzinec;
	private String statnaPrislusnost;
	private Pohlavie pohlavie;
	
	public Osoba(String meno, String zamestnanie, VekovaKategoria vekovaKategoria, ZamestnaneckyStatus status,
			boolean jeCudzinec, String statnaPrislusnost, Pohlavie pohlavie)
	{
		super();
		this.meno = meno;
		this.zamestnanie = zamestnanie;
		this.vekovaKategoria = vekovaKategoria;
		this.status = status;
		this.jeCudzinec = jeCudzinec;
		this.statnaPrislusnost = statnaPrislusnost;
		this.pohlavie = pohlavie;
		
		this.id = pocet++;
	}

	public static int getPocet()
	{
		return pocet;
	}

	public static void setPocet(int pocet)
	{
		Osoba.pocet = pocet;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getMeno()
	{
		return meno;
	}

	public void setMeno(String meno)
	{
		this.meno = meno;
	}

	public String getZamestnanie()
	{
		return zamestnanie;
	}

	public void setZamestnanie(String zamestnanie)
	{
		this.zamestnanie = zamestnanie;
	}

	public VekovaKategoria getVekovaKategoria()
	{
		return vekovaKategoria;
	}

	public void setVekovaKategoria(VekovaKategoria vekovaKategoria)
	{
		this.vekovaKategoria = vekovaKategoria;
	}

	public ZamestnaneckyStatus getStatus()
	{
		return status;
	}

	public void setStatus(ZamestnaneckyStatus status)
	{
		this.status = status;
	}

	public boolean isJeCudzinec()
	{
		return jeCudzinec;
	}

	public void setJeCudzinec(boolean jeCudzinec)
	{
		this.jeCudzinec = jeCudzinec;
	}

	public String getStatnaPrislusnost()
	{
		return statnaPrislusnost;
	}

	public void setStatnaPrislusnost(String statnaPrislusnost)
	{
		this.statnaPrislusnost = statnaPrislusnost;
	}

	public Pohlavie getPohlavie()
	{
		return pohlavie;
	}

	public void setPohlavie(Pohlavie pohlavie)
	{
		this.pohlavie = pohlavie;
	}
}
