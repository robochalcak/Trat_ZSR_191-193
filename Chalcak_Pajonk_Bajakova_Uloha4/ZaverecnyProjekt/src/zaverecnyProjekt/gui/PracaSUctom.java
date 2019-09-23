package zaverecnyProjekt.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import zaverecnyProjekt.bankovyUcet.BankoveUcty;
import zaverecnyProjekt.bankovyUcet.BankovyUcet;
import zaverecnyProjekt.klienti.Klient;

public class PracaSUctom
{

   private JFrame frame;
   private JTextField txtPrezvisko;
   private JTextField txtMeno;
   private JTextField txtKlientId;
   private JTextField txtCisloUctu;
   private JTextField txtTypUctu;
   private JTextField txtZostatok;
   private JTextField txtUrok;
   private JTextField txtRodneCislo;

   /**
    * Launch the application.
    */
   public void pracaSUctom(Klient klient, BankovyUcet ucet)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               PracaSUctom window = new PracaSUctom(klient, ucet);
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
   public PracaSUctom(Klient klient,BankovyUcet ucet)
   {      
      initialize(klient,ucet);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(Klient klient,BankovyUcet ucet)
   {
      frame = new JFrame();
      frame.setBounds(100, 100,600, 650);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Práca s klientom a s účtom ");
      JLabel lblKlient = new JLabel("                    KLIENT");
      
      JLabel lblPriezvisko = new JLabel("Priezvisko:");
      
      JLabel lblMeno = new JLabel("Krstné meno :");
      
      JLabel lblIdKlienta = new JLabel("Číslo klienta :");
      
      txtPrezvisko = new JTextField();
      txtPrezvisko.setColumns(10);
      txtPrezvisko.setText(klient.getPriezvisko());
      txtPrezvisko.setEditable(false);
      
      
      txtMeno = new JTextField();
      txtMeno.setColumns(10);
      txtMeno.setText(klient.getMeno());
      txtMeno.setEditable(false);
      
      txtKlientId = new JTextField();
      txtKlientId.setColumns(10);
      txtKlientId.setText(klient.getRovnakeId()+"");
      txtKlientId.setEditable(false);
      
      txtRodneCislo = new JTextField();
      txtRodneCislo.setColumns(10);
      txtRodneCislo.setText(klient.getRodneCislo()+"");
      txtRodneCislo.setEditable(false);
      
      JLabel lblCisloUctu = new JLabel("Číslo účtu:");
      
      txtCisloUctu = new JTextField();
      txtCisloUctu.setColumns(10);
      txtCisloUctu.setText(ucet.getRovnakeId()+"");
      txtCisloUctu.setEditable(false);
  
      
      JLabel lblTypUctu = new JLabel("Typ účtu:");
      
      txtTypUctu = new JTextField();
      txtTypUctu.setColumns(10);
      txtTypUctu.setText(ucet.getTypUctu());
      txtTypUctu.setEditable(false);
      
      JLabel lblUcet = new JLabel("ÚČET");
      
      JLabel lblAktualnyZostatok = new JLabel("Aktuálny zostatok: ");
      
      txtZostatok = new JTextField();
      txtZostatok.setColumns(10);
      txtZostatok.setText(ucet.getAktualnyZostatok()+" Eur.");
      txtZostatok.setEditable(false);
      
      JLabel lblUrokovaSadzba = new JLabel("Úroková sadzba: ");
      
      txtUrok = new JTextField();
      txtUrok.setColumns(10);
      txtUrok.setText(ucet.getUrok()+"%");
      txtUrok.setEditable(false);
      
      JLabel lblRodneCislo = new JLabel("Rodné číslo: ");
      
      
      GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(71)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addComponent(lblRodneCislo)
                     .addContainerGap())
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                           .addComponent(lblCisloUctu)
                           .addGap(79)
                           .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                              .addComponent(lblUcet)
                              .addComponent(txtCisloUctu, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                        .addGroup(groupLayout.createSequentialGroup()
                           .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                              .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                 .addComponent(lblMeno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(lblPriezvisko, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                              .addComponent(lblUrokovaSadzba)
                              .addComponent(lblAktualnyZostatok)
                              .addComponent(lblTypUctu)
                              .addComponent(lblIdKlienta))
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                              .addComponent(txtKlientId, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                              .addComponent(txtMeno, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                              .addComponent(txtTypUctu, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                              .addComponent(txtUrok, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                              .addComponent(txtZostatok, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                              .addComponent(txtPrezvisko, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                              .addComponent(txtRodneCislo, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                     .addGap(160))))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(136)
               .addComponent(lblKlient, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(286, Short.MAX_VALUE))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblKlient)
               .addGap(26)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(lblPriezvisko, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtPrezvisko, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
               .addGap(13)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblMeno, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtMeno, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
               .addGap(28)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblIdKlienta)
                  .addComponent(txtKlientId, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(33)
                     .addComponent(lblRodneCislo))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(18)
                     .addComponent(txtRodneCislo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
               .addGap(47)
               .addComponent(lblUcet)
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(txtCisloUctu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblCisloUctu))
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(txtTypUctu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblTypUctu))
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(txtZostatok, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblAktualnyZostatok))
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(txtUrok, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblUrokovaSadzba))
               .addContainerGap(33, Short.MAX_VALUE))
      );
      frame.getContentPane().setLayout(groupLayout);
      
      JMenuBar menuBar = new JMenuBar();
      frame.setJMenuBar(menuBar);
      
      JButton btnVklad = new JButton("Vklad na účet");
      btnVklad.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {

            try
            {
               BankoveUcty ucty = new BankoveUcty();
               BankovyUcet zmena = new BankovyUcet();
               zmena = ucty.vyhladajUcet(txtPrezvisko.getText());
               double vklad= Double.parseDouble(JOptionPane.showInputDialog("Aky vklad chcete uskutocnit?: "));
               
               while (vklad < 0.0)
               {
                  JOptionPane.showMessageDialog(null, "Nedostatočný  vklad. Vklad musí byť viac " + 0
                        + " Eur.");
                  vklad = Double.parseDouble(JOptionPane.showInputDialog("Aký vklad chcete uskutočniť: ")) ;;
               }

               zmena.vloz(vklad);
               zmena.pripisUrok();
               ucty.urobZmenuNaUcte(ucty.getIndexBU(txtPrezvisko.getText()), zmena);
               JOptionPane.showMessageDialog(null, "Vklad vo výške "+vklad+" Eur bol úspešné vložený na účet.");
               txtZostatok.setText(zmena.getAktualnyZostatok()+"");
               txtUrok.setText(zmena.getUrok()+"%");
            }
            catch (ClassNotFoundException e2)
            {
               e2.printStackTrace();
            }
            catch (IOException e2)
            {
               e2.printStackTrace();
            }          
         }
      });
      menuBar.add(btnVklad);
          
      JButton btnVyber = new JButton("Vyber z účtu");
      btnVyber.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            
            try
            {
               BankoveUcty ucty = new BankoveUcty();           
               double vyber =Double.parseDouble(JOptionPane.showInputDialog("Kolko eur si prajete vybrat? "));           
               double zostatok = ucty.vyhladajUcet(txtPrezvisko.getText()).getAktualnyZostatok();
               
               while (vyber > zostatok)
               {
                  JOptionPane.showMessageDialog(null, "Na účte nie je dostatok finančných prostriedkov!");
                  
                  System.out.println("Koľko Eur si požadujete vybrať z účtu? ");
                  vyber = Double.parseDouble(JOptionPane.showInputDialog("Koľko eur si prajete vybrať? "));
               }           
               BankovyUcet zmena = ucty.vyhladajUcet(txtPrezvisko.getText());

               zmena.vyber(vyber);
               ucty.urobZmenuNaUcte(ucty.getIndexBU(txtPrezvisko.getText()), zmena); 
               JOptionPane.showMessageDialog(null, "Vyber vo výške "+vyber+" Eur bol úspešné zrealizovaný.");
               txtZostatok.setText(zmena.getAktualnyZostatok()+"");
               txtUrok.setText(zmena.getUrok()+"%");
            }
            catch (ClassNotFoundException e2)
            {
               e2.printStackTrace();
            }
            catch(IOException ex)
            {
               ex.printStackTrace();
            }                       
         }
      });
      menuBar.add(btnVyber);
      
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
      menuBar.add(btnKoniec);
   }
}
