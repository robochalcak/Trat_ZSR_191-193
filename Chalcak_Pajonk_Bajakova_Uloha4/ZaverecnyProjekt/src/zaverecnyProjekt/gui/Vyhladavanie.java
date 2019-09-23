package zaverecnyProjekt.gui;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import zaverecnyProjekt.bankovyUcet.BankoveUcty;
import zaverecnyProjekt.bankovyUcet.BankovyUcet;
import zaverecnyProjekt.klienti.Klient;
import zaverecnyProjekt.klienti.Klienti;

import java.awt.Font;
/**
 * Trieda sluzi na vyhladavanie, nacitavanie klientov z internych suborov 
 * systemu, z externych suborov a databaz.
 * @author Robert Chalcak
 *
 */
public class Vyhladavanie
{

   private JFrame frame;
   private JTextField txtPriezvisko;
   private JTextField txtRc;

   /**
    * Launch the application.
    */
   public static void pracaSUctom()
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Vyhladavanie window = new Vyhladavanie();
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
   public Vyhladavanie()
   {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frame = new JFrame();
      frame.getContentPane().setFont(new Font("Verdana", Font.BOLD, 15));
      //frame.setBounds(100, 100, 450, 300);
      frame.setBounds(100,100,575,280);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel lblPrezvisko = new JLabel("Zadaj Priezvisko Klienta:");
      lblPrezvisko.setFont(new Font("Verdana", Font.BOLD, 13));
      
      txtPriezvisko = new JTextField();
      txtPriezvisko.setColumns(10);
      
      JLabel lblZadajRodneCislo = new JLabel("Zadaj Rodne číslo klienta:");
      lblZadajRodneCislo.setFont(new Font("Verdana", Font.BOLD, 13));
      
      txtRc = new JTextField();
      txtRc.setColumns(10);
      
      JButton btnHladaj = new JButton("Vyhľadať");
      btnHladaj.setFont(new Font("Verdana", Font.BOLD, 15));
      btnHladaj.addActionListener(new ActionListener()
      
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            String priezvisko = txtPriezvisko.getText();
            long rodneCislo = Long.parseLong(txtRc.getText());
            try
            {
               Klienti klienti =new Klienti();
               BankoveUcty ucty = new BankoveUcty();
               klienti.vyhladajKlienta(priezvisko, rodneCislo);
               if(klienti.vyhladajKlienta(priezvisko, rodneCislo).getMeno()==null)
               {
                  JOptionPane.showMessageDialog(null, "Klient nebol najdeny!");
                  return;
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "Klient bol najdeny.");
                  Klient najdeny = klienti.vyhladajKlienta(priezvisko, rodneCislo);
                  BankovyUcet ucet = ucty.vyhladajUcet(priezvisko);
                  frame.setVisible(false);
                  
                  PracaSUctom pracaSUctom = new PracaSUctom(najdeny,ucet);
                  pracaSUctom.pracaSUctom(najdeny,ucet);    
               }
            }
            catch (ClassNotFoundException | IOException e1)
            {
               e1.printStackTrace();
            }
            
            
            
         }
      });
      
      JButton btnVytvorUcet = new JButton("Vytvorenie Účtu");
      btnVytvorUcet.setFont(new Font("Verdana", Font.BOLD, 15));
      btnVytvorUcet.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            frame.setVisible(false);
            VytvorenieUctu vytvorenie = new VytvorenieUctu();
            vytvorenie.registruj();
            
         }
      });
      
      JButton btnUlozDB = new JButton("Ulož do DB");
      btnUlozDB.setFont(new Font("Verdana", Font.BOLD, 15));
      
      JButton btnNacitajDB = new JButton("Načítaj z DB");
      btnNacitajDB.setFont(new Font("Verdana", Font.BOLD, 15));
      btnNacitajDB.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      JButton btnZDisku = new JButton("Načítaj z disku");
      btnZDisku.setFont(new Font("Verdana", Font.BOLD, 15));
      btnZDisku.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      JButton btnNaDisk = new JButton("Ulož na disk");
      btnNaDisk.setFont(new Font("Verdana", Font.BOLD, 15));
      
      JButton btnNewButton = new JButton("Odhlásiť sa");
      btnNewButton.setFont(new Font("Verdana", Font.BOLD, 15));
      btnNewButton.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Teraz budete odhlásený zo systému.");
            frame.setVisible(false);
            JOptionPane.showMessageDialog(null,"Aplikácia sa ukončuje.");
            System.exit(0);
         }
        
      });
      GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addComponent(btnNacitajDB, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btnUlozDB, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btnNaDisk)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btnNewButton))
                  .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                     .addComponent(lblPrezvisko, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(txtPriezvisko, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                  .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                     .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                           .addComponent(btnHladaj, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(btnVytvorUcet, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(btnZDisku, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                           .addComponent(lblZadajRodneCislo)
                           .addGap(18)
                           .addComponent(txtRc)))
                     .addPreferredGap(ComponentPlacement.RELATED)))
               .addContainerGap(461, GroupLayout.PREFERRED_SIZE))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.TRAILING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(7)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                     .addComponent(btnNacitajDB, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                     .addComponent(btnUlozDB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnNaDisk, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                  .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblPrezvisko, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtPriezvisko, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
               .addGap(12)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(lblZadajRodneCislo)
                  .addComponent(txtRc, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(btnVytvorUcet, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                  .addComponent(btnHladaj, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnZDisku, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
               .addGap(646))
      );
      frame.getContentPane().setLayout(groupLayout);
   }
   
   
}
