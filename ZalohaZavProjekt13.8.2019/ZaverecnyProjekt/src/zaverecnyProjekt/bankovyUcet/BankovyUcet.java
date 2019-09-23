package zaverecnyProjekt.bankovyUcet;

public class BankovyUcet
{
   private String id;
   private int rovnakeId;
   private double aktualnyZostatok;
   private String typUctu;
   static final double PREVYSUJUCI_VKLAD = 10000;
   static final double BEZNY_UROK = 0.02;
   static final double VIP_UROK = 0.05;
   static final double POPLATOK_ZA_VYBER = 3.5;
   static final double POPLATOK_ZA_VKLAD = 1.0;
   
   
   
   public BankovyUcet (double pociatocnyZostatok)
   {
      aktualnyZostatok=pociatocnyZostatok;
      this.typUctu=null;
   }
   
   public BankovyUcet()
   {
      this.aktualnyZostatok=0;
      this.typUctu=null;
   }
   
   public void setRovnakeId(int rovnakeId)
   {
      this.rovnakeId=rovnakeId;
   }
   
   public int getRovnakeId()
   {
      return rovnakeId;
   }

   public void vloz(double ciastka) 
   {
      aktualnyZostatok = aktualnyZostatok+ciastka-POPLATOK_ZA_VKLAD;
   }
   
   public void vyber(double ciastka) 
   {
      aktualnyZostatok = aktualnyZostatok-(ciastka+POPLATOK_ZA_VYBER);
   }
   
   public double getAktualnyZostatok() 
   {
      return aktualnyZostatok;
   }
   
   public void pripisUrok()
   {
      if(aktualnyZostatok>=PREVYSUJUCI_VKLAD)
      {
         aktualnyZostatok=aktualnyZostatok+(aktualnyZostatok*VIP_UROK);
         
      }
      else
         {
            aktualnyZostatok=aktualnyZostatok+(aktualnyZostatok*BEZNY_UROK);
         }
   }
   
   public void setId(String id)
   {
      this.id=id;
   }
   
   public String getId()
   {
      return id;
   }
   
   public void setTypUctu(String typUctu)
   {
      this.typUctu=typUctu;
   }
   
   public String getTypUctu()
   {
      return typUctu;
   }
   
   public String toString ()
   {
      return aktualnyZostatok + "Aktualny zostatok";
   }
}
