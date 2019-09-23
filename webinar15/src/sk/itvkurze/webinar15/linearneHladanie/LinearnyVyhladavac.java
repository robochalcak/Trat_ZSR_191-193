package sk.itvkurze.webinar15.linearneHladanie;

public class LinearnyVyhladavac
{
   private int[]data;
   
   public LinearnyVyhladavac(int[]data)
   {
      this.data=data;
   }
   
   public int vyhladaj(int hladaneCislo)
   {
      for(int i = 0; i < data.length;i++)
      {
         if(data[i]==hladaneCislo)
         {
            return i;
         }
      }
      return -1;
   }
}
