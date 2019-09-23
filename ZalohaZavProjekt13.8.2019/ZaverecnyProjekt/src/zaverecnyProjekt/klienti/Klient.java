package zaverecnyProjekt.klienti;

import zaverecnyProjekt.bankovyUcet.BankovyUcet;

public class Klient
{
   private String meno ;
   private String priezvisko ;
   private long rodneCislo ; 
   private String id ;
   private int rovnakeId;
   
   private BankovyUcet beznyUcet ;
   private BankovyUcet sporiaciUcet;
   

   public Klient(String meno, String priezvisko, long rodneCislo) {
      this.meno = meno;
      this.priezvisko = priezvisko;
      this.rodneCislo = rodneCislo;
      
      this.beznyUcet = new BankovyUcet();
      this.sporiaciUcet = new BankovyUcet();
      
   }
   
   public Klient()
   {
      this.meno =null;
      this.priezvisko =null;
      this.rodneCislo = 0;
      
      this.beznyUcet = null;
      this.sporiaciUcet = null;
      
   }

   public String getMeno() {
      return meno;
   }

   public void setMeno(String meno) {
      this.meno = meno;
   }

   public String getPriezvisko() {
      return priezvisko;
   }

   public void setPriezvisko(String priezvisko) {
      this.priezvisko = priezvisko;
   }

   public long getRodneCislo() {
      return rodneCislo;
   }

   public void setRodneCislo(long rodneCislo) {
      this.rodneCislo = rodneCislo;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public BankovyUcet getBeznyUcet() {
      
      return beznyUcet;
   }

   public BankovyUcet getSporiaciUcet() {
      
      return sporiaciUcet;
   }
   
   public void setRovnakeId(int rovnakeId)
   {
      this.rovnakeId=rovnakeId;
   }
   
   public int getRovnakeId()
   {
      return rovnakeId;
   }

   public String toString()
   {
      return "Krstné meno: " + meno+"\nPriezvisko: "+priezvisko+"\nRodné číslo: "+ rodneCislo; 
   }
}
