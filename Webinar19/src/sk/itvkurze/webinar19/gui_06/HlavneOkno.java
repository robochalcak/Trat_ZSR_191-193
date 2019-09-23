package sk.itvkurze.webinar19.gui_06;

import java.awt.BorderLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HlavneOkno extends JFrame
{
   
   private TextovyPanel pnlText;
   private PanelNastrojov pnlPanelNastrojov;
   
   public HlavneOkno()
   {
      super("GUI_06");
      //setTitle("GUI_06");
      
      setLayout(new BorderLayout());
      
      pnlPanelNastrojov = new PanelNastrojov();
      pnlText = new TextovyPanel();
      
      pnlPanelNastrojov.setTextovyPanel(pnlText);
      
      add(pnlPanelNastrojov, BorderLayout.NORTH);
      add(pnlText, BorderLayout.CENTER);
      
      setSize(1200,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
}
