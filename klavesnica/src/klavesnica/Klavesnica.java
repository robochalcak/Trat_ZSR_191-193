package klavesnica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Klavesnica
{

   private JFrame frame;
   private JTextField vstup;
   private JButton btn8;
   private JButton btn9;
   private JButton btn4;
   private JButton btn5;
   private JButton btn6;
   private JButton btn1;
   private JButton btn2;
   private JButton btn3;
   private JButton btn0;
   private JButton btnBodka;
   private JButton btnCe;
   private JTextField instrukcie;
   private JButton btnA;
   private JButton btnB;
   private JButton btnC;

   /**
    * Launch the application.
    */
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Klavesnica window = new Klavesnica();
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
   public Klavesnica()
   {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frame = new JFrame();
      frame.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 11));
      frame.setBounds(100, 100, 600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Narodna Banka Slovenska");
      vstup = new JTextField();
      vstup.setColumns(10);
      
      JButton btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      
      btn8 = new JButton("8");
      
      btn9 = new JButton("9");
      
      btn4 = new JButton("4");
      
      btn5 = new JButton("5");
      
      btn6 = new JButton("6");
      
      btn1 = new JButton("1");
      
      btn2 = new JButton("2");
      
      btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      btn0 = new JButton("0");
      
      btnBodka = new JButton(".");
      
      btnCe = new JButton("CE");
      btnCe.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      instrukcie = new JTextField();
      instrukcie.setColumns(10);
      
      btnA = new JButton("A");
      
      btnB = new JButton("B");
      
      btnC = new JButton("C");
      GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(32)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                  .addComponent(vstup)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btnBodka, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btnCe, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                           .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                           .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(instrukcie, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(btnA, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                  .addComponent(btnB, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
               .addContainerGap())
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(21)
               .addComponent(vstup, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(18)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(btn9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn7, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                           .addComponent(btn5, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                           .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn4, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(btnCe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn0, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(btnBodka, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(59)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(groupLayout.createSequentialGroup()
                           .addComponent(btnA, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(btnB, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addComponent(instrukcie, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))))
               .addContainerGap(63, Short.MAX_VALUE))
      );
      frame.getContentPane().setLayout(groupLayout);
      
      
   }

   public JTextField getTextField() {
      return vstup;
   }
}
