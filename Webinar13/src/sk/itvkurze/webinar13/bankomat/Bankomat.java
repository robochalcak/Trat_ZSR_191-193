package sk.itvkurze.webinar13.bankomat;

public class Bankomat
{
   
   
   public static final int START = 1;
   public static final int PIN = 2;
   public static final int UCET = 3;
   public static final int TRANSAKCIA = 4;
   public static final int BEZNY = 1;
   public static final int SPORIACI=2;
   
   private Banka banka;
   private int klientskeCislo;
   private int stav;
   private BankovyUcet aktualnyUcet;
   private Klient aktualnyKlient;
   private int pin;

   public Bankomat(Banka banka)
   {
      this.banka=banka;
      reset();
   }

   public int getStav()
   {
      return stav;
   }
   
   public void setKlientskeCislo(int klientskeCislo)
   {
     assert stav == START;
     this.klientskeCislo=klientskeCislo;
     stav=PIN;
   }

   public void nastavKlienta(int pin)
   {
     assert stav == PIN;
     this.aktualnyKlient = banka.vyhladajKlienta(klientskeCislo,pin);
     
     if(aktualnyKlient==null)
     {
        stav = START;
     }
     else
     {
        stav=UCET;
     }
      
   }

   public void nastavTypUctu(int typUctu)
   {
      assert stav==UCET||stav==TRANSAKCIA;
      
      if(typUctu==BEZNY)
      {
         this.aktualnyUcet=aktualnyKlient.getBeznyUcet();
      }
      else
      {
         this.aktualnyUcet=aktualnyKlient.getSporiaciUcet();
      }
      stav = TRANSAKCIA;
   }

   public void reset()
   {
      this.klientskeCislo=-1;
      this.aktualnyUcet=null;
      this.stav=START;
   }

   public double getAktualnyZostatok()
   {
      assert stav==TRANSAKCIA;
      return this.aktualnyUcet.getAktualnyZostatok();
   }

   public void vloz(double ciastka)
   {
      assert stav==TRANSAKCIA;
      this.aktualnyUcet.vloz(ciastka);
      
   }

   public void nastavPredchadzajuciStav()
   {
      if(stav==TRANSAKCIA)
      {
         stav=UCET;
      }
      else if(stav==UCET)
      {
         stav = PIN;
      }
      else if(stav == PIN)
      {
         stav = START;
      }
      
   }

   public void vyber(double ciastka)
   {
     assert stav == TRANSAKCIA;
     this.aktualnyUcet.vyber(ciastka);  
   }
}
