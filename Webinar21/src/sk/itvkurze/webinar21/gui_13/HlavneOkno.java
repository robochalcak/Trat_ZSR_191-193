package sk.itvkurze.webinar21.gui_13;

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
      super("GUI_13");
      //setTitle("GUI_13");
      
      setLayout(new BorderLayout());
      
      pnlPanelNastrojov = new PanelNastrojov();
      pnlText = new TextovyPanel();
      pnlFormular = new FormularPanel();
      
      pnlFormular.setFormularListener(new FormularListener()
      {
         @Override
         public void nastalaFormularEvent(FormularEvent event)
         {
            String meno = event.getMeno();
            String zamestnanie=event.getZamestnanie();
            
            pnlText.vlozText(meno+": "+ zamestnanie+"\n");
         }
         
      });
      
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
