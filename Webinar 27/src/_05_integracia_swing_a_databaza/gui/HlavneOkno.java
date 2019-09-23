package _05_integracia_swing_a_databaza.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.prefs.Preferences;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import _05_integracia_swing_a_databaza.controller.Controller;

public class HlavneOkno extends JFrame
{
	private static final long serialVersionUID = -6970553267620282224L;
	private VlastnyPanel panel;
	private PanelSNastrojmi panelSNastrojmi;
	private Formular formular;
	private JFileChooser fileChooser;
	private Controller controller;
	private TabulkaPanel tabulka;
	private NastaveniaDialog nastaveniaDialog;
	private Preferences nastavenia;
	
	private static final String OSOBNE_DATA_DIR = "C:\\OSOBNE_DATA\\";

	public HlavneOkno()
	{
		super("Jednoducha Desktopova Aplikacia");

		setLayout(new BorderLayout());

		panel = new VlastnyPanel();
		panelSNastrojmi = new PanelSNastrojmi();
		formular = new Formular();
		tabulka = new TabulkaPanel();
		nastaveniaDialog = new NastaveniaDialog(this);
		nastavenia = Preferences.userRoot().node("db");
		
		tabulka.setOsobaTabulkaListener(new OsobaTabulkaListener() 
		{
			@Override
			public void riadokZmazany(int riadok)
			{
				// System.out.println("Zmazany riadok: " + riadok);
				controller.zmazOsobu(riadok);
				// tabulka.refresh();   		// nie velmi efektivny sposob, mozeme tam mat 100 000 riadkov
			}
		});
		
		nastaveniaDialog.setVlastnostiListener(new VlastnostiListener()
		{
			@Override
			public void nastavVlastnosti(String pouzivatel, String heslo, int port)
			{
				// System.out.println(pouzivatel + ": " + heslo + " - " + port);
				nastavenia.put("pouzivatel", pouzivatel);
				nastavenia.put("heslo", heslo);
				// nastavenia.put("port", String.valueOf(port));	// new Integer(port).toString()
				// lepsie riesenie je vlozit tam priamo int
				nastavenia.putInt("port", port);
			}
		});
		
		// nastavime pociatocne hodnoty
		String pouzivatel = nastavenia.get("pouzivatel", "");
		String heslo = nastavenia.get("heslo", "");
		int port = nastavenia.getInt("port", 3306);		// 3306 - defaultny port pre mysql
		
		nastaveniaDialog.setPociatocneNastavenia(pouzivatel, heslo, port);
		
		controller = new Controller();
		
		tabulka.setData(controller.getOsoby());

		setJMenuBar(vytvorMenuBar());
		
		fileChooser = new JFileChooser(OSOBNE_DATA_DIR);
		// filter na osobne data
		fileChooser.addChoosableFileFilter(new OsobneDataFilter());
		
		// filter na obrazky
		// fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Subory s obrazkami", ImageIO.getReaderFileSuffixes()));
		fileChooser.setAcceptAllFileFilterUsed(false);

		panelSNastrojmi.setPanelSNastrojmiListener(new PanelSNastrojmiListener()
		{
			@Override
			public void nastalaUlozEvent()
			{
				vytvorSpojenieSDB();
				
				try
				{
					controller.uloz();
				} catch (SQLException e)
				{
					JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne ulozit data do databazy", "Problem s dat do DB", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			@Override
			public void nastalaRefreshEvent()
			{
				vytvorSpojenieSDB();
				
				try
				{
					controller.nacitajCeluDB();
				} catch (SQLException e)
				{
					JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne nacitat data z databazy", "Problem s nacitanim dat z DB", JOptionPane.ERROR_MESSAGE);
				}
				
				tabulka.refresh();
			}
			
			public void vytvorSpojenieSDB()
			{
				try
				{
					controller.vytvorSpojenieSDB();
				} catch (Exception e)
				{
					JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne pripojit sa na databazu", "Problem s pripojenim na DB", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		formular.setFormularListener(new FormularListener()
		{
			public void nastalaFormularEvent(FormularEvent event)
			{
				controller.vlozOsobu(event);
				tabulka.refresh();
			}
		});

		// add(panel, BorderLayout.CENTER);
		add(tabulka, BorderLayout.CENTER);
		add(panelSNastrojmi, BorderLayout.NORTH);
		add(formular, BorderLayout.WEST);

		setSize(1000, 500);
		setMinimumSize(new Dimension(450, 400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JMenuBar vytvorMenuBar()
	{
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenuItem exportDataItem = new JMenuItem("Export Dat ...");
		JMenuItem importDataItem = new JMenuItem("Import Dat ...");
		JMenuItem exitItem = new JMenuItem("Exit");

		fileMenu.add(exportDataItem);
		fileMenu.add(importDataItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		// vytvorime si menu v ramci menu
		JMenu windowMenu = new JMenu("Window");
		JMenu zobrazMenu = new JMenu("Zobraz");
		JMenuItem nastaveniaMenuItem = new JMenuItem("Nastavenia...");
		JCheckBoxMenuItem zobrazFormularItem = new JCheckBoxMenuItem("Formular Osobne Data");
		zobrazFormularItem.setSelected(true);

		zobrazMenu.add(zobrazFormularItem);
		windowMenu.add(zobrazMenu);
		windowMenu.add(nastaveniaMenuItem);

		menuBar.add(fileMenu);
		menuBar.add(windowMenu);

		nastaveniaMenuItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nastaveniaDialog.setVisible(true);
			}
		});
		
		zobrazFormularItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem) e.getSource();
				formular.setVisible(menuItem.isSelected());
			}
		});

		fileMenu.setMnemonic(KeyEvent.VK_F);
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		importDataItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		exportDataItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		nastaveniaMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		
		importDataItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// potrebujeme skontrolovat, ci pouzivatel klikol na spravne tlacitko
				
				if (fileChooser.showOpenDialog(HlavneOkno.this) == JFileChooser.APPROVE_OPTION)
				{
					File vybranySubor = fileChooser.getSelectedFile();
					try
					{
						controller.nacitajZoSuboru(vybranySubor);
						tabulka.refresh();
					} catch (IOException e1)
					{
						JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne nacitat data zo suboru '" + vybranySubor + "'", "Chyba pri citani", JOptionPane.ERROR_MESSAGE);
					}
					System.out.println("Import dat: " + vybranySubor);
				}
			}
		});
		
		exportDataItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// potrebujeme skontrolovat, ci pouzivatel klikol na spravne tlacitko
				
				if (fileChooser.showSaveDialog(HlavneOkno.this) == JFileChooser.APPROVE_OPTION)
				{
					File vybranySubor = fileChooser.getSelectedFile();
					// kontrola pripony, ak pouzivatel zabudne doplnit prionu .osd, doplnime ju za neho
					vybranySubor = skontrolujPriponu(vybranySubor);
					
					try
					{
						controller.ulozDoSuboru(vybranySubor);
					} catch (IOException e1)
					{
						JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne zapisat data do suboru '" + vybranySubor + "'", "Chyba pri zapise", JOptionPane.ERROR_MESSAGE);
					}
					System.out.println("Export dat: " + fileChooser.getSelectedFile());
				}
			}

			private File skontrolujPriponu(File vybranySubor)
			{
				String nazov = vybranySubor.getAbsolutePath();
				if (! nazov.endsWith(".osd"))
				{
					nazov += ".osd";
				}
				
				return new File(nazov);
			}
		});

		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/*
				// information message, question message, warning ...
				String prihlasovacieMeno = JOptionPane.showInputDialog(HlavneOkno.this, "Zadaj svoje prihlasovacie meno",
						"Zadaj prihlasovacie meno", JOptionPane.OK_OPTION|JOptionPane.QUESTION_MESSAGE);
				
				System.out.println("Prihlasovaie meno: " + prihlasovacieMeno);
				*/
				int odpoved = JOptionPane.showConfirmDialog(HlavneOkno.this, "Skutocne chcete ukoncit program?",
						"Potvrdenie ukoncenia", JOptionPane.OK_CANCEL_OPTION);
				
				if (odpoved == JOptionPane.OK_OPTION)
				{
					System.exit(0);
				}
			}
		});

		return menuBar;
	}
}
