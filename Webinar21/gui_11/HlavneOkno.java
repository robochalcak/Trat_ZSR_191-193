package sk.itvkurze.webinar20.gui_11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HlavneOkno extends JFrame
{
   
   private TextovyPanel pnlText;
   private PanelNastrojov pnlPanelNastrojov;
   private FormularPanel pnlFormular;
   
   public HlavneOkno()
   {
      super("GUI_11");
      //setTitle("GUI_11");
      
      setLayout(new BorderLayout());
      
      pnlPanelNastrojov = new PanelNastrojov();
      pnlText = new TextovyPanel();
      pnlFormular = new FormularPanel();
      
      pnlPanelNastrojov.setRetazecListener(new RetazecListener()
      {
         
         @Override
         public void vlozText(String sprava)
         {
            pnlText.vlozText(sprava);
         }
      });
      
      add(pnlPanelNastrojov, BorderLayout.NORTH);
      add(pnlText, BorderLayout.CENTER);
      add(pnlFormular,BorderLayout.WEST);
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
