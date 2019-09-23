package zaverecnyProjekt.klienti;

import java.util.ArrayList;

import zaverenyProjekt.vygenerujId.VygenerujId;

public class Klienti implements VygenerujId
{
   private ArrayList<Klient> klienti;
   
   public Klienti()
   {
      klienti = new ArrayList<Klient>();
   }
   

   @Override
   public void vygenerujId(Object obj)
   {
      Klient klient=(Klient)obj;
      String id= "KLBO";
      id+=klienti.size()+1;
      klient.setId(id);
      id="KLBO";
      
   }
   
   public void pridajKlienta(Klient klient)
   {
      vygenerujId(klient);
      klienti.add(klient);
   }
   
   public Klient vyhladajKlienta(String id)
   {
      Klient najdeny=null;
      
      for(int i = 0; i < klienti.size();i++)
      {
         if(id.equalsIgnoreCase(klienti.get(i).getId()))
         {
            najdeny=klienti.get(i);
         }
      }
      return najdeny;
   }
   
   public Klient vyhladajKlienta(String priezvisko, long rodneCislo)
   {
      Klient najdeny=null;
      
      for(int i = 0; i < klienti.size();i++)
      {
         if(priezvisko.equalsIgnoreCase(klienti.get(i).getPriezvisko())&&rodneCislo==klienti.get(i).getRodneCislo())
         {
            najdeny=klienti.get(i);
         }
      }
      return najdeny;
   }
   
   public int getIndexKlienta(String priezvisko, long rodneCislo)
   {
      int index=0;
      
      for(int i = 0; i < klienti.size();i++)
      {
         if(priezvisko.equalsIgnoreCase(klienti.get(i).getPriezvisko())&&rodneCislo==klienti.get(i).getRodneCislo())
         {
            index=i;;
         }
      }
      return index;
   }
   
   public Klient vymazKlienta(int index)
   {
      Klient naVymazanie = klienti.get(index);
      klienti.remove(index);
      return naVymazanie;
   }
   public Klient vymazKliena(String priezvisko, long rodneCislo)
   {
      Klient vymazany=null;
      for(int i = 0; i < klienti.size();i++)
      {
         if(priezvisko.equalsIgnoreCase(klienti.get(i).getPriezvisko())&&rodneCislo==klienti.get(i).getRodneCislo())
         {
            vymazany = vymazKlienta(i);
            vymazKlienta(i);
         }
      }
      return vymazany;
   }
   
   public boolean jeKlient(String priezvisko, long rodneCislo)
   {
      return vyhladajKlienta(priezvisko,rodneCislo).getPriezvisko().equalsIgnoreCase(priezvisko) && 
               vyhladajKlienta(priezvisko, rodneCislo).getRodneCislo()==rodneCislo;
   }
   
   public String toString()
   {
      String all="----------------------------------\n";
            all+="|          NAŠÍ KLIENTI          |\n";
            all+="----------------------------------\n";
            for(int i =0; i < klienti.size();i++)
            {
               all+=klienti.get(i)+"\n";
               all+="_________________________________\n";
            }
            all+="<><><><><><><><><><><><><><><><><>\n";
            
            return all;
   }
   
   
   
   
   

}
