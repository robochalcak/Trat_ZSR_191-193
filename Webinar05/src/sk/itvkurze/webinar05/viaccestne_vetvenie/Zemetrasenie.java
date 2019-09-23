package sk.itvkurze.webinar05.viaccestne_vetvenie;

public class Zemetrasenie
{
   private double richterovaStupnica;

   public Zemetrasenie(double richterovaStupnica)
   {
      this.richterovaStupnica = richterovaStupnica;
   }

   public String getPopis()
   {
      String popis = "";

      if (richterovaStupnica >= 8.0)
      {
         popis = "Vacsina budov sa zruti";
      }
      else if (richterovaStupnica >= 7.0)
      {
         popis = "Mnoho budov ma narusenu statitku";
      }
      else if (richterovaStupnica >= 6.0)
      {
         popis = "Mnoho budov je znacne poskodenych, niektore sa dokonca zrutia. ";
      }
      else if (richterovaStupnica >= 4.5)
      {
         popis = "Poskodene su len budovy slabej konstrukcie ";
      }
      else if (richterovaStupnica >= 3.5)
      {
         popis = "Mnoho ludi ho pociti, ziadne poskodene budov nebolo zaznamenane ";
      }
      else if (richterovaStupnica >= 0)
      {
         popis = "Vo vseobecnosti nie je rozoznatelne ludmi ";
      }
      else
      {
         popis = "Negativne cisla nie su povolene ";
      }
      return popis;
   }
}