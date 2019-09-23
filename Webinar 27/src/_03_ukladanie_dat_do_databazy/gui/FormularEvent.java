package _03_ukladanie_dat_do_databazy.gui;

import java.util.EventObject;

public class FormularEvent extends EventObject
{
	private String meno;
	private String poslednyZamestnavatel;
	private int vekovaKategoria;
	private String status;
	private boolean jeCudzinec;
	private String statnaPrislusnost;
	private String pohlavie;
	
	public FormularEvent(Object source)
	{
		super(source);
	}
	
	public FormularEvent(Object source, String meno, String poslednyZamestnavatel, int vekovaKategoria, String status,
			boolean jeCudzinec, String statnaPrislusnost, String pohlavie)
	{
		super(source);
		
		this.meno = meno;
		this.poslednyZamestnavatel = poslednyZamestnavatel;
		this.vekovaKategoria = vekovaKategoria;
		this.status = status;
		this.jeCudzinec = jeCudzinec;
		this.statnaPrislusnost = statnaPrislusnost;
		this.pohlavie = pohlavie;
	}

	public String getMeno()
	{
		return meno;
	}

	public void setMeno(String meno)
	{
		this.meno = meno;
	}

	public String getPoslednyZamestnavatel()
	{
		return poslednyZamestnavatel;
	}

	public void setPoslednyZamestnavatel(String poslednyZamestnavatel)
	{
		this.poslednyZamestnavatel = poslednyZamestnavatel;
	}
	
	public int getVekovaKategoria()
	{
		return this.vekovaKategoria;
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public boolean jeCudzinec()
	{
		return this.jeCudzinec;
	}
	
	public String getStatnaPrislusnost()
	{
		return this.statnaPrislusnost;
	}
	
	public String getPohlavie()
	{
		return this.pohlavie;
	}
}
