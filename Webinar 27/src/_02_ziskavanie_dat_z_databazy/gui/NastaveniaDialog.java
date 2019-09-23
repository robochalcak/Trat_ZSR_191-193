package _02_ziskavanie_dat_z_databazy.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class NastaveniaDialog extends JDialog
{
	private JButton okTlacitko;
	private JButton zrusTlacitko;
	private JSpinner portSpinner;
	private SpinnerNumberModel spinnerModel;
	private JTextField prihlasovacieMeno;
	private JPasswordField heslo;

	private VlastnostiListener vlastnostiListener;

	public NastaveniaDialog(JFrame rodic)
	{
		super(rodic, "Vlastnosti", false);

		okTlacitko = new JButton("OK");
		zrusTlacitko = new JButton("Zrus");

		spinnerModel = new SpinnerNumberModel(3306, 0, 9999, 1);
		portSpinner = new JSpinner(spinnerModel);

		prihlasovacieMeno = new JTextField(10);
		heslo = new JPasswordField(10);
		heslo.setEchoChar('*');

		pridajOvladaciePrvkyDoLayoutu();

		okTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// vytvorili sme si spinner v ktorom pracujeme s celymi cislami z intervalu 0 az
				// 9999
				Integer hodnota = (Integer) portSpinner.getValue();
				// System.out.println("Hodnota spinnera: " + hodnota);

				String pouzivatelskeMeno = prihlasovacieMeno.getText();
				char[] pouzivatelskeHeslo = heslo.getPassword();

				// 1. moznost new String(pouzivatelskeHeslo)
				// 2. moznost Arrays.toString(pouzivatelskeHeslo)
				String heslo = String.copyValueOf(pouzivatelskeHeslo);
				// System.out.println(pouzivatelskeMeno + ": " + heslo);

				if (vlastnostiListener != null)
				{
					vlastnostiListener.nastavVlastnosti(pouzivatelskeMeno, heslo, hodnota);
				}

				setVisible(false);
			}
		});

		zrusTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});

		setSize(300, 250);
		setLocationRelativeTo(rodic);
	}

	private void pridajOvladaciePrvkyDoLayoutu()
	{
		JPanel panelVlastnosti = new JPanel();
		JPanel panelTlacitok = new JPanel();
		
		// chceme mat vonkajsie a vnutorne ohranicenie (vonkajsie nam len vytovri "prazdne ohranicenie")
		Border medzera = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		Border sPopisom = BorderFactory.createTitledBorder("Databazove nastavenia");
		
		
		
		// nastavime panelom ohranicenia
		// panelVlastnosti.setBorder(BorderFactory.createLineBorder(Color.black));
		panelVlastnosti.setBorder(BorderFactory.createCompoundBorder(medzera, sPopisom));
		//panelTlacitok.setBorder(BorderFactory.createLineBorder(Color.black));
		
		panelVlastnosti.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.gridy = 0;
		
		Insets odsadenieSprava = new Insets(0, 0, 0, 15);

		/* Prvy riadok */

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = odsadenieSprava;
		panelVlastnosti.add(new JLabel("Prihlasovacie meno: "), gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		panelVlastnosti.add(prihlasovacieMeno, gc);

		/* Dalsi riadok */

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = odsadenieSprava;
		panelVlastnosti.add(new JLabel("Helo: "), gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		panelVlastnosti.add(heslo, gc);

		/* Dalsi riadok */

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = odsadenieSprava;
		panelVlastnosti.add(new JLabel("Port: "), gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		panelVlastnosti.add(portSpinner, gc);
		
		// ziskame velkost z vacsieho tlacitka a mensiemu nastavime jeho velkost
		Dimension tlacitkaVelkost = zrusTlacitko.getPreferredSize();
		okTlacitko.setPreferredSize(tlacitkaVelkost);

		/* Panel s tlacitkami */
		
		// tlacitka chceme mat zarovnane vpravo
		panelTlacitok.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelTlacitok.add(okTlacitko, gc);
		panelTlacitok.add(zrusTlacitko, gc);
		
		// pridame panely do dialogu
		setLayout(new BorderLayout());
		add(panelVlastnosti, BorderLayout.CENTER);
		add(panelTlacitok, BorderLayout.SOUTH);
	}

	public void setPociatocneNastavenia(String pouzivatel, String heslo, int port)
	{
		prihlasovacieMeno.setText(pouzivatel);
		this.heslo.setText(heslo);
		this.portSpinner.setValue(port);
	}

	public void setVlastnostiListener(VlastnostiListener listener)
	{
		this.vlastnostiListener = listener;
	}
}
