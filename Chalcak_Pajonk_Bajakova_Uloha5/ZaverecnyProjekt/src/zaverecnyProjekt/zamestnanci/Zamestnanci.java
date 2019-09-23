package zaverecnyProjekt.zamestnanci;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import zaverecnyProjekt.vygenerujId.VygenerujId;

/**
 * Trieda sluzi na uchovavanie zoznamu vsetkych zamestnancov
 * 
 * @author Robert Chalcak Tomas Pajonk a Zuzana Bajakova
 */
public class Zamestnanci implements VygenerujId, Serializable
{

   /**
    * 
    */
   private static final long serialVersionUID = -5761722622411517961L;
   private ArrayList<Object> zamestnanci; // uchovava zoznam vsetkych                                               // zamestnancov
   private ZamestnanciAdapter zapisovac;

   /**
    * Vytvara novy prazdny objekt zamestnanci
    */
   public Zamestnanci() throws FileNotFoundException, ClassNotFoundException,
         IOException
   {
      zamestnanci = new ArrayList<Object>();
      this.zapisovac = new ZamestnanciAdapter();
      zapisovac.nacitaj(zamestnanci);
   }

   /**
    * Pomocna metoda, ktora vygeneruje unikatne ID pre kazdeho zamestnanca
    * 
    * @param obj
    */
   @Override
   public void vygenerujId(Object obj) throws FileNotFoundException, ClassNotFoundException, IOException
   {
      Zamestnanec zamestnanec = (Zamestnanec) obj;
      String id = "BO";
      id += zamestnanci.size() + 1;
      zamestnanec.setId(id);
      vynulujId(id);
   }

   /**
    * Pomocna metoda, ktora vynuluje id po pridani zamestnanca do zoznamu
    * parameter:
    * 
    * @param id
    *           vygenerovaneho zamestnanca po volani tejto metody je id
    *           pripravene pre pridane noveho zamestnanca
    */
   private void vynulujId(String id)
   {
      id = "BO";
   }

   /**
    * Prida zamestnanca do zoznamu a prideli mu pomocou pomocnej metody
    * vynulId(String id) id cislo parameter je typu Zamestnanec
    * 
    * @param obj
    */
   public void pridajZamestnanca(Object obj) throws IOException,
         ClassNotFoundException
   {
      Zamestnanec zamestnanec = (Zamestnanec) obj;
      zapisovac.nacitaj(zamestnanci);
      vygenerujId(zamestnanec);
      zamestnanci.add(zamestnanec);
      zapisovac.zapis(zamestnanci);
   }

   /**
    * Vyhlada a vrati objekt typu zamestnanec podla id
    * 
    * @param id
    *           id zamestnanca
    * @return objekt typu zamestnanca s jeho info opacne vrati prazdny objekt
    */
   public Object vyhladajZamestnanca(String id) throws ClassNotFoundException, IOException
   {
      Object najdeny = new Zamestnanec();
      zapisovac.nacitaj(zamestnanci);
      for (int i = 0; i < zamestnanci.size(); i++)
      {
         if (id.equalsIgnoreCase(((Zamestnanec) zamestnanci.get(i)).getId()))
         {
            najdeny = (Zamestnanec) zamestnanci.get(i);
         }
      }
      return najdeny;
   }
   
   public Object vyhladajZamestnanca(String id, String meno) throws ClassNotFoundException, IOException
   {
      Object najdeny = new Zamestnanec();
      zapisovac.nacitaj(zamestnanci);
      for (int i = 0; i < zamestnanci.size(); i++)
      {
         if((id.equals(((Zamestnanec) zamestnanci.get(i)).getId())&& meno.equals(((Zamestnanec) zamestnanci.get(i)).getMeno())))
         {
            najdeny = (Zamestnanec)zamestnanci.get(i);
         }     
      }
      return najdeny;
   }

   /**
    * Overi, ci zadane id patri zamestnancovi alebo nie
    * 
    * @param id
    *           zamestnanca
    * @return true ak je id najdene opacne false
    * @throws IOException 
    * @throws ClassNotFoundException 
    */
   public boolean jeZamestnanec(String id) throws ClassNotFoundException, IOException
   {
      return ((Zamestnanec) vyhladajZamestnanca(id)).getId() != null;
   }
   /**
    * Vracia pocet zamestnancov 
    * @return
    */
   public int getPocetZamestnancov() throws ClassNotFoundException, IOException
   {
      zapisovac.nacitaj(zamestnanci);
      return zamestnanci.size();
   }
   /**
    * Vracia vo formatovanom vystupe vsetkych zamestnancov s ich informaciami
    * 
    * @return formatovany zoznam zamestnancov
    */
   public String vratZosnamZamestnancov()
   {      
      return toString();
   }

   /**
    * Vracia formatovany vystup.
    */
   public String toString()
   {
      try
      {
         zapisovac.nacitaj(zamestnanci);
      }
      catch (FileNotFoundException e)
      {        
         e.printStackTrace();
      }
      catch (ClassNotFoundException e)
      {         
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      String all = "------------------\n";
      all += "|  ZAMESTNACI    |\n";
      all += "------------------\n";
      for (int i = 0; i < zamestnanci.size(); i++)
      {
         all += zamestnanci.get(i) + "\n";
         all += "___________________\n";
      }
      all += "<><><><><>><><><><>\n";

      return all;
   }
   
   public ArrayList<Object>vratListZamestnancov() throws ClassNotFoundException, IOException
   {
      
      return zamestnanci;
   }   
}
