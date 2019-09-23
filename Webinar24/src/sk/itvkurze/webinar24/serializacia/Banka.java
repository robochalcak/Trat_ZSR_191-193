package sk.itvkurze.webinar24.serializacia;

import java.io.Serializable;
import java.util.ArrayList;

public class Banka implements Serializable
{
   private static final long serialVersionUID = 3668355150782121525L;
   private ArrayList<BankovyUcet>ucty;
   
   public Banka()
   {
      this.ucty = new ArrayList<BankovyUcet>();
   }
   
   
   public void pridaj(BankovyUcet ucet)
   {
      ucty.add(ucet);
   }

   public BankovyUcet vyhladaj(int cisloUctu)
   {
      for(BankovyUcet ucet : ucty)
      {
         if(ucet.getCisloUctu()==cisloUctu)
         {
            return ucet;
         }
      }
      return null;
   }
}
