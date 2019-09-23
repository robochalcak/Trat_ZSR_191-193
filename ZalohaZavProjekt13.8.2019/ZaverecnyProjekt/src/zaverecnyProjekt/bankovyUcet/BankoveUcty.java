package zaverecnyProjekt.bankovyUcet;

import java.util.ArrayList;

public class BankoveUcty
{  
   private ArrayList<BeznyUcet>bezneUcty;
   private ArrayList<SporiaciUcet>sporiaceUcty;
   
   public BankoveUcty()
   {
      bezneUcty = new ArrayList<BeznyUcet>();
      sporiaceUcty = new ArrayList<SporiaciUcet>();
   }
   
   private void vygenerujId(SporiaciUcet sporiaciUcet )
   {
      String id = "spUc";
      id+=sporiaceUcty.size()+1;
      sporiaciUcet.setId(id);
      id="spUc";
   }
   
   private void vygenerujId(BeznyUcet beznyUcet)
   {
      String id = "bezUc";
      id+=bezneUcty.size()+1;
      beznyUcet.setId(id);
      id="bezUc";
   }
   
   public void pridajBeznyUcet(BeznyUcet beznyUcet)
   {
      vygenerujId(beznyUcet);
      bezneUcty.add(beznyUcet);
   }
   
   public void pridajSporiaciUcet(SporiaciUcet sporiaciUcet)
   {
      vygenerujId(sporiaciUcet);
      sporiaceUcty.add(sporiaciUcet);
   }
   
   public void urobZmenuNaUcte(BeznyUcet novyUcet,int index)
   {
      bezneUcty.set(index, novyUcet);
   }
   
   public void urobZmenuNaSporUcte(SporiaciUcet novyUcet, int index)
   {
      sporiaceUcty.set(index, novyUcet);
   }
     
   public SporiaciUcet vyhladajSporUcet(String id)
   {
      SporiaciUcet najdeny=new SporiaciUcet();
      if(jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for(int i= 0; i < sporiaceUcty.size();i++)
      {
         if(id.equalsIgnoreCase(sporiaceUcty.get(i).getId()))
         {
            najdeny=sporiaceUcty.get(i);
         }
      }
      return najdeny;
   }
   
   public BeznyUcet vyhladajBeznyUcet(int ajKlientId)
   {
      BeznyUcet najdeny = new BeznyUcet();
      if(jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for(int i = 0; i < bezneUcty.size();i++)
      {
         if(ajKlientId == bezneUcty.get(i).getRovnakeId())
         {
            najdeny = bezneUcty.get(i);
         }
      }
      return najdeny;
   }
   
   public SporiaciUcet vyhladajSporiaciUcet(int ajKlientId)
   {
      SporiaciUcet najdeny = new SporiaciUcet();
      if(jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for(int i = 0; i < bezneUcty.size();i++)
      {
         if(ajKlientId == sporiaceUcty.get(i).getRovnakeId())
         {
            najdeny = sporiaceUcty.get(i);
         }
      }
      return najdeny;
   }
   
   public int getIndexBu(int ajKlientId)
   {
      int index=-1;
      if(jePrazdnyBU())
      {
         System.out.println("Ziaden ucet!!!");
      }
      for(int i = 0; i < bezneUcty.size();i++)
      {
         if(ajKlientId==bezneUcty.get(i).getRovnakeId())
         {
            index=i;
         }
      }
      return index;
   }
   
   public int getIndexSu(int ajKlientId)
   {
      int index=-1;
      if(jePrazdnySU())
      {
         System.out.println("Ziadne ucty!!!");
      }
      for(int i = 0; i < sporiaceUcty.size();i++)
      {
         if(ajKlientId==sporiaceUcty.get(i).getRovnakeId())
         {
            index=i;
         }
      }
      return index;
   }
   
   public int getPocetBU()
   {
      return bezneUcty.size();
   }
   
   public String vratZoznamBeznychUctov()
   {
      String all = "------------------\n";
      all += "|  BEZNE ÚČTY    |\n";
      all += "------------------\n";
      
      for(int i = 0; i < bezneUcty.size();i++)
      {
         all+=bezneUcty.get(i)+"\n";
         all+="___________________\n";
      }
      all+="<><><><><>><><><><>\n";
      return all;
   }
   
   public String vratZoznamSporiacichUctov()
   {
      String all = "---------------------\n";
      all += "|  SPORIACE ÚČTY    |\n";
      all += "---------------------\n";
      
      for(int i = 0; i < sporiaceUcty.size();i++)
      {
         all+=sporiaceUcty.get(i)+"\n";
         all+="______________________\n";
      }
      all+="<><><><><>><><><><><><>\n";
      return all;
   }
   
   
   public String toString()
   {
      String all="";
      all+=vratZoznamBeznychUctov();
      all+=vratZoznamSporiacichUctov();
      return all;
      
   }
   
   public boolean jePrazdnyBU()
   {
      return bezneUcty.size()==0;
   }
   
   public boolean jePrazdnySU()
   {
      return sporiaceUcty.size()==0;
   }
   
   
   
}
