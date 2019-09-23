package _05_integracia_swing_a_databaza.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Formular extends JPanel
{
	private JLabel menoPopisok;
	private JLabel zamestnaniePopisok;
	private JLabel vekovaKategoriaPopisok;
	private JLabel zamestnanieStatusPopisok;
	private JTextField menoTextovePole;
	private JTextField zamestnanieTextovePole;
	private JButton odoslatTlacitko;
	private JList<VekovaKategoria> vekovaKategoriaLB;
	private JComboBox<String> zamestnanieStatusCB;
	private JLabel obcianstvoPopisok;
	private JCheckBox obcianstvo;
	private JLabel statnaPrislusnostPopisok;
	private JTextField statnaPrislusnost;
	private JRadioButton pohlavieMuz;
	private JRadioButton pohlavieZena;
	private ButtonGroup pohlavieButtonGroup;
	
	private FormularListener listener;
	
	public Formular()
	{
		Dimension rozmery = getPreferredSize();
		rozmery.width = 450;
		setPreferredSize(rozmery);
		
		menoPopisok = new JLabel("Meno: ");
		zamestnaniePopisok = new JLabel("Posledny zamestnavatel: ");
		vekovaKategoriaPopisok = new JLabel("Vekova kategoria: ");
		zamestnanieStatusPopisok = new JLabel("Zamestnanie - status: ");
		menoTextovePole = new JTextField(10);
		zamestnanieTextovePole = new JTextField(10);
		vekovaKategoriaLB = new JList<VekovaKategoria>();
		zamestnanieStatusCB = new JComboBox<>();
		obcianstvoPopisok = new JLabel("Cudzinec? ");
		obcianstvo = new JCheckBox();	// ak zaskrtneme, ze sme cudzines je potrebne 
		statnaPrislusnostPopisok = new JLabel("Statna prislusnost: ");
		statnaPrislusnost = new JTextField(15);             // vyplnit statnu prislusnost 
		statnaPrislusnost.setToolTipText("Vypln statnu prislusnost");
		statnaPrislusnost.setText("SR");
		
		pohlavieMuz = new JRadioButton("Muz");
		pohlavieZena = new JRadioButton("Zena");
		pohlavieButtonGroup = new ButtonGroup();
		
		// konfiguracia pohlavia
		pohlavieButtonGroup.add(pohlavieMuz);
		pohlavieButtonGroup.add(pohlavieZena);
		pohlavieMuz.setSelected(true);
		pohlavieMuz.setActionCommand("Muz");
		pohlavieZena.setActionCommand("Zena");
		
		// konfiguracia statnej prislusnosti
		statnaPrislusnostPopisok.setEnabled(false);
		statnaPrislusnost.setEnabled(false);
		
		obcianstvo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// bezne riesenie
//				if (kontrolaObcianstva.isSelected())
//				{
//					statnaPrislusnostPopisok.setEnabled(true);
//					statnaPrislusnost.setEnabled(true);
//				}
//				else
//				{
//					statnaPrislusnostPopisok.setEnabled(false);
//					statnaPrislusnost.setEnabled(false);
//				}
				// efektivnejsie riesenie
				boolean jeCudzinec = obcianstvo.isSelected();
				statnaPrislusnostPopisok.setEnabled(jeCudzinec);
				statnaPrislusnost.setEnabled(jeCudzinec);
				
				String text = jeCudzinec ? "" : "SR";
				statnaPrislusnost.setText(text);
			}
		});
		
		// konfiguracia listobxu
		DefaultListModel<VekovaKategoria> vekModel = new DefaultListModel<VekovaKategoria>();
		vekModel.addElement(new VekovaKategoria(0, "Menej ako 18"));
		vekModel.addElement(new VekovaKategoria(1, "18 az 65"));
		vekModel.addElement(new VekovaKategoria(2, "Viac ako 65"));
		
		vekovaKategoriaLB.setModel(vekModel);
		vekovaKategoriaLB.setPreferredSize(new Dimension(140, 66));
		vekovaKategoriaLB.setBorder(BorderFactory.createEtchedBorder());
		vekovaKategoriaLB.setSelectedIndex(1);
		
		// konfiguracia comboboxu
		DefaultComboBoxModel<String> zamestnanieModel = new DefaultComboBoxModel<String>();
		zamestnanieModel.addElement("zamestnany");
		zamestnanieModel.addElement("nezamestnany");
		zamestnanieModel.addElement("zivnostnik");
		
		zamestnanieStatusCB.setModel(zamestnanieModel);
		zamestnanieStatusCB.setSelectedIndex(1);
		zamestnanieStatusCB.setEditable(true);
		
		
		odoslatTlacitko = new JButton("Odoslat");
		
		// nastavenie mnemonics
		odoslatTlacitko.setMnemonic(KeyEvent.VK_O);
		menoPopisok.setDisplayedMnemonic(KeyEvent.VK_M);
		menoPopisok.setLabelFor(menoTextovePole);
		
		odoslatTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String meno = menoTextovePole.getText();
				String zamestnanie = zamestnanieTextovePole.getText();
				VekovaKategoria vekKategoria = vekovaKategoriaLB.getSelectedValue();
				String status = (String) zamestnanieStatusCB.getSelectedItem();
				boolean jeCudzinec = obcianstvo.isSelected();
				String statnaPrisl = statnaPrislusnost.getText();
				String pohlavie = pohlavieButtonGroup.getSelection().getActionCommand();
				
				System.out.println(pohlavie);
				
				if (listener != null) {
					FormularEvent event = new FormularEvent(this, meno, zamestnanie, vekKategoria.getId(), status,
							jeCudzinec, statnaPrisl, pohlavie);
					listener.nastalaFormularEvent(event);
				}
				
				// po zozbierani dat by sme chceli mat komponenty nastavene na pociatocne hodnoty
				inicializujGrafickeKomponenty();
			}
		});
		
		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Osobne udaje");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));
		
		nastavLayoutManagera();
	}
	
	private void inicializujGrafickeKomponenty()
	{
		menoTextovePole.setText("");
		zamestnanieTextovePole.setText("");
		zamestnanieStatusCB.setSelectedIndex(0);
		obcianstvo.setSelected(false);
		vekovaKategoriaLB.setSelectedIndex(1);
		statnaPrislusnost.setText("SR");
		statnaPrislusnost.setEnabled(false);
		statnaPrislusnostPopisok.setEnabled(false);
		pohlavieMuz.setSelected(true);
	}
	
	private void nastavLayoutManagera()
	{
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		// PRVY RIADOK 
		
		gc.gridy = 0;
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;
		
		gc.gridx = 0;  // 00 lavy horny roh, ak budeme zvysovat hodnotu x - pojdeme zlava doprave, y - zhora nadol
		
		gc.fill = GridBagConstraints.NONE;				// horizontalne, vertikalne, ziadne alebo oboje
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(menoPopisok, gc);
		
		gc.gridx = 1;
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(menoTextovePole, gc);
		
		// DRUHY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(zamestnaniePopisok, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(zamestnanieTextovePole, gc);
		
		// TRETI RIADOK
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(vekovaKategoriaPopisok, gc);
		
		gc.gridx = 1;

		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(vekovaKategoriaLB, gc);
		
		// STVRTY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(zamestnanieStatusPopisok, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(zamestnanieStatusCB, gc);
		
		// PIATY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(obcianstvoPopisok, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(obcianstvo, gc);
		
		// SIESTY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(statnaPrislusnostPopisok, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(statnaPrislusnost, gc);
		
		// SIEDMY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.01;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Pohlavie: "), gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(pohlavieMuz, gc);
		
		// OSMY RIADOK 
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(pohlavieZena, gc);
		
		// DEVIATY RIADOK
		
		gc.gridy++;
		
		gc.weightx = 1; 
		gc.weighty = 0.1;
		
		gc.gridx = 1;
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(odoslatTlacitko, gc);
		
	}

	public void setFormularListener(FormularListener formularListener)
	{
		this.listener = formularListener;
	}
}

/**
 * Jednoducha utility trieda
 */
class VekovaKategoria
{
	/*
	 * Udaj o kategorii, ktory budeme chciet napr. ulozit do databazy
	 */
	private int id;
	
	/*
	 * Text ktory bude zobrazeny pouzivatelovi
	 */
	private String text;
	
	public VekovaKategoria(int id, String text)
	{
		this.id = id;
		this.text = text;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}
	
	public String toString()
	{
		return text;
	}
}