package sk.itvkurze.webinar21.gui_14;

public class VekovaKategoria
{
   private int id;
   private String nazov;
   
   public VekovaKategoria(int id, String nazov)
   {
      this.id = id;
      this.nazov = nazov;
   }
   
   public int getId()
   {
      return id;
   }
   
   public String getNazov()
   {
      return nazov;
   }
   
   @Override
   public String toString()
   {
      return nazov ;
   }
   
   
   
   
}
