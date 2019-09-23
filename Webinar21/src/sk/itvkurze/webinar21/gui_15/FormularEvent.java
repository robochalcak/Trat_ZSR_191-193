package sk.itvkurze.webinar21.gui_15;

import java.util.EventObject;

@SuppressWarnings("serial")
public class FormularEvent extends EventObject
{
   private String meno;
   private String zamestnanie;
   private int id;
   private String status;
   
   public FormularEvent(Object zdrojUdalosti)
   {
      super(zdrojUdalosti);
      
   }
   
   public FormularEvent(Object zdrojUdalosti, String meno, String zamestnanie, int id, String statusZamestnanca)
   {
      super(zdrojUdalosti);
      this.meno=meno;
      this.zamestnanie=zamestnanie;
      this.id=id;
      this.status = statusZamestnanca;
   }

   public String getStatus()
   {
      return status;
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
