package zaverecnyProjekt.gui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.security.auth.DestroyFailedException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import zaverecnyProjekt.zamestnanci.Zamestnanci;
import zaverecnyProjekt.zamestnanci.Zamestnanec;

public class PrihlasovacieOkno extends JFrame
{
    private JTextField txtFieldMeno;
    private JTextField txtFieldId;
    private JButton btnPrihlasenie;
    private JLabel lblMeno;
    private JLabel lblId;
    private JPanel pnlPrihlasenie;
    private JButton btnRegistracia;
    
    private Zamestnanci zamestnanci;
   
    JFrame okno = new JFrame();
   
   public PrihlasovacieOkno() throws FileNotFoundException, ClassNotFoundException, IOException
   {
      super("Vitajte v BO Aplikacii nasej banky.");
      this.zamestnanci = new Zamestnanci();
      initialize();
   }
   
   public static void zobrazPrihlasenie() throws FileNotFoundException, ClassNotFoundException, IOException
   {
      PrihlasovacieOkno okno = new PrihlasovacieOkno();
   }
   
   public void zobrazNoveOkno()
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               PrihlasovacieOkno prihlasenie = new PrihlasovacieOkno();
               prihlasenie.setVisible(true);
              
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }
   
   public void initialize()
   {
      pnlPrihlasenie = new JPanel(new GridBagLayout());
      pnlPrihlasenie.setSize(getWidth(), getHeight()/2);
      
      GridBagConstraints constrains = new GridBagConstraints();
      constrains.anchor = GridBagConstraints.WEST;
      constrains.insets = new Insets(10, 10, 10, 10);
      
      txtFieldMeno = new JTextField(20);
      txtFieldId  = new JTextField(20);
      btnPrihlasenie = new JButton("Prihlasenie");
      btnPrihlasenie.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            try
            {               
               
               if(((Zamestnanec) zamestnanci.vyhladajZamestnanca( txtFieldId.getText(),txtFieldMeno.getText())).getMeno()==null)
               {
                  JOptionPane.showMessageDialog(null, "Zle zadane meno alebo id."); 
                  txtFieldId.setText("");
                  txtFieldMeno.setText("");
               }
               else if(((Zamestnanec) zamestnanci.vyhladajZamestnanca(txtFieldId.getText(), txtFieldMeno.getText())).getMeno()!=null)
               {
                  JOptionPane.showMessageDialog(null, "Boli ste uspesne prihlaseny");
                  JOptionPane.showMessageDialog(null, "Vitajte v aplikacii pre spravu klientov banky.\n"
                        + " Momentalne Prihlaseny: \n"+zamestnanci.vyhladajZamestnanca(txtFieldId.getText()));
                  setVisible(false);
                  close();
               }
            }
            catch (FileNotFoundException e1)
            {
               JOptionPane.showMessageDialog(null, "Nebol najdeny subor zamestnanci.dat!");
               return;
            }
            catch (ClassNotFoundException e1)
            {
               e1.printStackTrace();
            }
            catch (IOException e1)
            {              
               e1.printStackTrace();
            }
            
         }
      });
      lblMeno = new JLabel("Zadajte vase meno: ");
      lblId = new JLabel("Zadajte vase ID:");
      btnRegistracia = new JButton("Registracia noveho zamestnanca");
      btnRegistracia.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            setVisible(false);
            close();
            dispose();
            
            Registracia registracia;
            try
            {
               registracia = new Registracia();
               registracia.zobrazNoveOkno();  
            }
            catch (ClassNotFoundException | IOException e1)
            {
               
               e1.printStackTrace();
            }
            
         }
      });
      constrains.gridx=0;
      constrains.gridy=0;
      pnlPrihlasenie.add(lblMeno,constrains);
      
      constrains.gridx=1;
      pnlPrihlasenie.add(txtFieldMeno,constrains);
      
      constrains.gridx=0;
      constrains.gridy=1;
      pnlPrihlasenie.add(lblId,constrains);
      
      constrains.gridx=1;
      pnlPrihlasenie.add(txtFieldId,constrains);
      
      constrains.gridx=0;
      constrains.gridy=2;
      constrains.anchor=GridBagConstraints.CENTER;
      pnlPrihlasenie.add(btnPrihlasenie,constrains);
      
      constrains.gridx=0;
      constrains.gridy=3;
      pnlPrihlasenie.add(btnRegistracia,constrains);
      
      pnlPrihlasenie.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Prihlasenie sa do systemu"));
      
      add(pnlPrihlasenie);
      pack();
      setSize(500,550);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }
   public void close()
   {
      WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
   }
   

}
