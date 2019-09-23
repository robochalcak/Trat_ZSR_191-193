package zaverecnyProjekt.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import zaverecnyProjekt.bankovyUcet.BankoveUcty;
import zaverecnyProjekt.bankovyUcet.BankovyUcet;
import zaverecnyProjekt.hlavnaKonzola.MainMetoda;
import zaverecnyProjekt.klienti.Klient;
import zaverecnyProjekt.klienti.Klienti;
/**
 * Tato trieda sluzi na vytvorenie uctu, registraciu klienta a vkladu na ucet
 * @author Robert Chalcak
 *
 */
public class VytvorenieUctu
{

   private JFrame frame;
   private JTextField txtPriezvisko;
   private JTextField txtMeno;
   private JTextField txtRC;

   /**
    * Launch the application.
    */
   public void registruj()
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               VytvorenieUctu window = new VytvorenieUctu();
               window.frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public VytvorenieUctu()
   {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frame = new JFrame();
      frame.setBounds(100, 100, 650, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Registrácia klienta a účtu");
      JLabel lblRegistraciaNovehoKlienta = new JLabel(
            "Registrácia nového klienta");
      lblRegistraciaNovehoKlienta.setFont(new Font("Verdana", Font.BOLD, 18));

      JLabel lblPriezvisko = new JLabel("Zadajte priezvisko klienta: ");
      lblPriezvisko.setFont(new Font("Verdana", Font.BOLD, 15));

      JLabel lblMeno = new JLabel("Zadajte krstné meno klienta: ");
      lblMeno.setFont(new Font("Verdana", Font.BOLD, 15));

      JLabel lblZadajteRodneCislo = new JLabel("Zadajte rodné číslo klienta: ");
      lblZadajteRodneCislo.setFont(new Font("Verdana", Font.BOLD, 15));

      txtPriezvisko = new JTextField();
      txtPriezvisko.setColumns(10);

      txtMeno = new JTextField();
      txtMeno.setColumns(10);

      txtRC = new JTextField();
      txtRC.setColumns(10);

      JLabel lblRegistraciaUctu = new JLabel("Registrácia účtu");
      lblRegistraciaUctu.setFont(new Font("Verdana", Font.BOLD, 18));

      JLabel label = new JLabel("");

      JLabel lblTypUctu = new JLabel("Vyberte si typ účtu:  ");
      lblTypUctu.setFont(new Font("Verdana", Font.BOLD, 15));

      JComboBox cbTypUctu = new JComboBox();
      cbTypUctu.setModel(new DefaultComboBoxModel(new String[] {
            "Zvoľte typ účtu", "Bežný", "Sporiaci" }));

      JButton btnVytvoreniePociatocnehoVkladu = new JButton(
            "Vytvorenie počiatočného vkladu a uloženie do systému");
      btnVytvoreniePociatocnehoVkladu.addActionListener(new ActionListener()
      {

         @Override
         public void actionPerformed(ActionEvent e)
         {

            try
            {
               Klienti klienti = new Klienti();
               BankoveUcty ucty = new BankoveUcty();
               if(txtMeno.getText().length()==0 || txtPriezvisko.getText().length()==0 || txtRC.getText().length()==0)
               {
                  JOptionPane.showMessageDialog(null, "Polička niesmu byť prázdne. Prosím vyplnte ich.");
                  return;
               }
       
               long rc = Long.parseLong(txtRC.getText());
               Klient klient = new Klient(txtMeno.getText(), txtPriezvisko
                     .getText(), rc);

               String typUctu=(String)cbTypUctu.getSelectedItem();
               
               if(!(typUctu.equalsIgnoreCase("bežný") || typUctu
                     .equalsIgnoreCase("sporiaci")))
               {
                  JOptionPane
                        .showMessageDialog(null,
                              "Nesprávny výber!\nV ponuke máme bežný alebo sporiaci účet");
                  return;
               }

               BankovyUcet ucet = new BankovyUcet(txtPriezvisko.getText(),
                     typUctu);

               MainMetoda.vygenerujIdAjPreKlientaBU(klient, ucet);

               JOptionPane.showMessageDialog(null, klient);
               JOptionPane.showMessageDialog(null,
                     "Typ účtu:" + ucet.getTypUctu());

               klienti.pridajKlienta(klient);
               vytvorPociatocnyVklad(ucty, ucet);
               ucty.pridajUcet(ucet);
               JOptionPane.showConfirmDialog(null, "Klient: "+klient+" bol úspešne pridaný spolu s účtom "+ucet+" pridaný do systému.");
            }
            catch (FileNotFoundException fnfe)
            {
            }
            catch (IOException ex)
            {
               ex.printStackTrace();
            }
            catch (ClassNotFoundException e1)
            {
               e1.printStackTrace();
            }

         }

         private void vytvorPociatocnyVklad(BankoveUcty ucty, BankovyUcet ucet)
         {
            final double POC_VKLAD_BU = 100;
            final double POC_VKLAD_SU = 50;

            double pociatocnyVklad = Double.parseDouble(JOptionPane
                  .showInputDialog(null,
                        "Aký počiatočný vklad chcete v eur: "));
            

            if (ucet.getTypUctu().equalsIgnoreCase("sporiaci"))
            {
               while (pociatocnyVklad < POC_VKLAD_SU)
               {
                  JOptionPane.showMessageDialog(null,
                        "Nedostatočný počiatočný vklad. Počiatočný vklad musí byť minimálne "
                              + POC_VKLAD_SU + " Eur.");

                  pociatocnyVklad = Double.parseDouble(JOptionPane
                        .showInputDialog("Aký počiatočný vklad chcete v eur: "));
               }

               ucet.vloz(pociatocnyVklad);
               ucet.pripisUrok();
            }
            else if(ucet.getTypUctu().equalsIgnoreCase("bežný"))
            {
               while (pociatocnyVklad < POC_VKLAD_BU)
               {
                  JOptionPane.showMessageDialog(null,
                        "Nedostatočný počiatočný vklad. Počiatočný vklad musí byť minimálne "
                              + POC_VKLAD_BU + " Eur.");

                  pociatocnyVklad = Double.parseDouble(JOptionPane
                        .showInputDialog("Aký počiatočný vklad chcete v eur: "));
               }

               ucet.vloz(pociatocnyVklad);
               ucet.pripisUrok();
            }

         }
      });
      btnVytvoreniePociatocnehoVkladu
            .setFont(new Font("Verdana", Font.BOLD, 15));
      
      JButton btnDalsi = new JButton("Pridanie ďalšieho klienta");
      btnDalsi.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            txtMeno.setText("");
            txtPriezvisko.setText("");
            txtRC.setText("");
            cbTypUctu.setSelectedIndex(0);
            return;
            
         }
      });
      btnDalsi.setFont(new Font("Verdana", Font.BOLD, 15));
      btnDalsi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      JButton btnKoniec = new JButton("Koniec");
      btnKoniec.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            frame.setVisible(false);
            Vyhladavanie.pracaSUctom();
         }
      });
      btnKoniec.setFont(new Font("Verdana", Font.BOLD, 15));
      GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.TRAILING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(lblRegistraciaNovehoKlienta, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(21)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                           .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                              .addComponent(lblPriezvisko, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(lblMeno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                              .addComponent(txtPriezvisko, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtMeno, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(groupLayout.createSequentialGroup()
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(lblZadajteRodneCislo, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(txtRC, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))))
                  .addComponent(lblRegistraciaUctu, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
               .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(18)
               .addComponent(label)
               .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addComponent(btnDalsi, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                     .addComponent(btnKoniec, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                     .addContainerGap())
                  .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                     .addComponent(btnVytvoreniePociatocnehoVkladu, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                     .addContainerGap())
                  .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                     .addComponent(lblTypUctu, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(cbTypUctu, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                     .addGap(237))))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addComponent(lblRegistraciaNovehoKlienta)
               .addGap(33)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                  .addComponent(txtPriezvisko)
                  .addComponent(lblPriezvisko, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(lblMeno, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtMeno, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(txtRC, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblZadajteRodneCislo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
               .addGap(44)
               .addComponent(lblRegistraciaUctu, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(40)
                     .addComponent(label))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(18)
                     .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblTypUctu, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTypUctu, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))))
               .addGap(74)
               .addComponent(btnVytvoreniePociatocnehoVkladu)
               .addGap(41)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(btnDalsi, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnKoniec))
               .addContainerGap(49, Short.MAX_VALUE))
      );
      frame.getContentPane().setLayout(groupLayout);
   }
}
