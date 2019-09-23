package sk.itvkurze.webinar21.gui_12;

import java.util.EventObject;

@SuppressWarnings("serial")
public class FormularEvent extends EventObject
{
   private String meno;
   private String zamestnanie;
   
   public FormularEvent(Object zdrojUdalosti)
   {
      super(zdrojUdalosti);
      
   }
   
   public FormularEvent(Object zdrojUdalosti, String meno, String zamestnanie)
   {
      super(zdrojUdalosti);
      this.meno=meno;
      this.zamestnanie=zamestnanie;
   }

   public String getMeno()
   {
      return meno;
   }

   public String getZamestnanie()
   {
      return zamestnanie;
   }
   
   
   
   

}
