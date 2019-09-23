package sk.itvkurze.webinar21.gui_14;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormularPanel extends JPanel
{
   private JLabel lblMeno;
   private JLabel lblZamestnanie;
   private JTextField txtMeno;
   private JTextField txtZamestnanie;
   private JButton btnOK;
   private FormularListener frmListener;
   private JList<VekovaKategoria>lstVekoveKategorie;
   
   public FormularPanel()
   {
      Dimension velkost =getPreferredSize();
      
      System.out.println(velkost);
      
      velkost.width=400;
      
      setPreferredSize(velkost);
      
      //pridame jednoduche ohranicenie, tmavosivou farbou
      
      //setBorder
      
      Border vnutorny = BorderFactory.createTitledBorder("Info o osobe: ");
      Border vonkajsi = BorderFactory.createEmptyBorder(15,10,10,10);
      Border zlozeny = BorderFactory.createCompoundBorder(vonkajsi,vnutorny);;
      
      setBorder(zlozeny);
      
     // setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
      
      lblMeno = new JLabel("Meno: ");
      lblZamestnanie = new JLabel("Zamestnanie: ");
      txtMeno = new JTextField(10);
      txtZamestnanie = new JTextField(10);
      lstVekoveKategorie =new JList<VekovaKategoria>();
      
      DefaultListModel<VekovaKategoria> vekoveKategorieModel = new DefaultListModel<VekovaKategoria>();

      vekoveKategorieModel.addElement(new VekovaKategoria(0, "menej ako 18 rokov"));
      vekoveKategorieModel.addElement(new VekovaKategoria(1, "od 18 do 60 rokov"));
      vekoveKategorieModel.addElement(new VekovaKategoria(2, "viac ako 60 rokov"));
      
      lstVekoveKategorie.setModel(vekoveKategorieModel);
      lstVekoveKategorie.setPreferredSize(new Dimension(130,60));
      lstVekoveKategorie.setBorder(BorderFactory.createEtchedBorder());
      lstVekoveKategorie.setSelectedIndex(1);
      
      
      btnOK = new JButton("OK");
      btnOK.addActionListener(new ActionListener()
      {

         @Override
         public void actionPerformed(ActionEvent arg0)
         {
            String meno = txtMeno.getText();
            String zamestnanie = txtZamestnanie.getText();
            VekovaKategoria zvolenaVekovaKategoria = lstVekoveKategorie.getSelectedValue();
            
            
            FormularEvent event = new FormularEvent(this,meno, zamestnanie, zvolenaVekovaKategoria.getId());
            
            if(frmListener !=null)
            {
               frmListener.nastalaFormularEvent(event);
            }
         }
         
      });
      
      //nastavit spravcu rozvrhnutia komponent a nasledne pomocou neho pridame komponenty na panel
      
      setLayout(new GridBagLayout());
      
      GridBagConstraints gc = new GridBagConstraints();
      
      /*PRVY RIADOK */
      
      gc.weightx = 1;//pomer volneho miesta v danej bunke voci ostatnym komponentom
      gc.weighty = 0.1;
      
      gc.gridx =0; //lavy horny roh
      gc.gridy = 0; //lavy horny roh
      
      gc.insets=new Insets(0,0,0,10);
      
      gc.fill = GridBagConstraints.NONE;  // ako vyplni komponenta danu bunku 
      // vertikalne, horizontlne, obidvoma smermi, ziadnym
      
      gc.anchor = GridBagConstraints.LINE_END;
      
      add(lblMeno, gc);   // umiestnime lblMeno na stred horizontalne aj vertikalne
      
      //stale sme v 1. riadku, ale uz v 2 stlpci, nastavujeme len meniace sa parametre(atributy)
      
      gc.gridx = 1;
      
      gc.anchor = GridBagConstraints.LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(txtMeno,gc);
      
      
      
      
      
/*DRUHY RIADOK */
      
      gc.weightx = 1;//pomer volneho miesta v danej bunke voci ostatnym komponentom
      gc.weighty = 0.1;
      
      gc.gridx =0; //lavy horny roh
      gc.gridy = 1; //lavy horny roh
      
      gc.insets=new Insets(0,0,0,10);
      

      gc.anchor = GridBagConstraints.LINE_END;
      
      add(lblZamestnanie, gc);   // umiestnime lblMeno na stred horizontalne aj vertikalne
      
      //stale sme v 2. riadku, ale uz v 2 stlpci, nastavujeme len meniace sa parametre(atributy)
      
      gc.gridx = 1;
      
      gc.anchor = GridBagConstraints.LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(txtZamestnanie,gc);
      
      
/*TRETI RIADOK */
    gc.weightx = 1;
    gc.weighty = 0.2;
    
    gc.gridx = 1;
    gc.gridy=2;
    gc.anchor = GridBagConstraints.LINE_START;
    
    add(lstVekoveKategorie, gc);
     
      
      
/*STVRTY RIADOK */
      
      gc.weightx = 1;//pomer volneho miesta v danej bunke voci ostatnym komponentom
      gc.weighty = 3;
      
      gc.gridx =1; //lavy horny roh
      gc.gridy = 3; //lavy horny roh
      
      gc.insets=new Insets(0,0,0,0);
      
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      
      add(btnOK, gc);   // umiestnime lblMeno na stred horizontalne aj vertikalne
      
      //stale sme v 1. riadku, ale uz v 2 stlpci, nastavujeme len meniace sa parametre(atributy)
      
      gc.gridx = 1;
      
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(btnOK,gc);
      
      
      
      
      
      
   }

   public void setFormularListener(FormularListener formularListener)
   {
      this.frmListener = formularListener;
      
   }
}
