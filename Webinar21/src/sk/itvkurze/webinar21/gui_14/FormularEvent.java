package sk.itvkurze.webinar21.gui_14;

import java.util.EventObject;

@SuppressWarnings("serial")
public class FormularEvent extends EventObject
{
   private String meno;
   private String zamestnanie;
   private int id;
   
   public FormularEvent(Object zdrojUdalosti)
   {
      super(zdrojUdalosti);
      
   }
   
   public FormularEvent(Object zdrojUdalosti, String meno, String zamestnanie, int id)
   {
      super(zdrojUdalosti);
      this.meno=meno;
      this.zamestnanie=zamestnanie;
      this.id=id;
   }

   public String getMeno()
   {
      return meno;
   }

   public String getZamestnanie()
   {
      return zamestnanie;
   }

   public int getId()
   {
      return id;
   }
   
   
   
   

}
