package sk.itvkurze.webinar20.gui_07;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HlavneOkno extends JFrame
{
   
   private TextovyPanel pnlText;
   private PanelNastrojov pnlPanelNastrojov;
   
   public HlavneOkno()
   {
      super("GUI_07");
      //setTitle("GUI_07");
      
      setLayout(new BorderLayout());
      
      pnlPanelNastrojov = new PanelNastrojov();
      pnlText = new TextovyPanel();
      
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
      
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
