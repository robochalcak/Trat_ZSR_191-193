package zaverecnyProjekt.zamestnanci;

import java.util.ArrayList;

import zaverenyProjekt.vygenerujId.VygenerujId;

/**
 * Trieda sluzi na uchovavanie zoznamu vsetkych zamestnancov
 * 
 * @author Robert Chalcak Tomas Pajonk a Zuzana Bajakova
 */
public class Zamestnanci implements VygenerujId
{
   private Zamestnanec zamestnanec; // uchovava objekt zamestnanca
   private ArrayList<Zamestnanec> zamestnanci; // uchovava zoznam vsetkych
                                               // zamestnancov

   /**
    * Vytvara novy prazdny objekt zamestnanci
    */
   public Zamestnanci()
   {
      this.zamestnanec = null;
      zamestnanci = new ArrayList<Zamestnanec>();
   }

   /**
    * Vytvara novy objekt s pouzitim objektu Zamestnanec
    * 
    * @param zamestnanec
    *           a prida ho do zoznamu
    */
   public Zamestnanci(Zamestnanec zamestnanec)
   {
      this.zamestnanec = zamestnanec;
      zamestnanci = new ArrayList<Zamestnanec>();
      this.pridajZamestnanca(zamestnanec);
   }

   /**
    * Pomocna metoda, ktora vygeneruje unikatne ID pre kazdeho zamestnanca
    * 
    * @param zamestnanec
    */
   @Override
   public void vygenerujId(Object obj)
   {
      Zamestnanec zamestnanec =(Zamestnanec)obj;
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
    * @param zamestnanec
    */
   public void pridajZamestnanca(Zamestnanec zamestnanec)
   {
      vygenerujId(zamestnanec);
      zamestnanci.add(zamestnanec);
   }

   /**
    * Vyhlada a vrati objekt typu zamestnanec podla id
    * 
    * @param id
    *           id zamestnanca
    * @return objekt typu zamestnanca s jeho info opacne vrati prazdny objekt
    */
   public Zamestnanec vyhladajZamestnanca(String id)
   {
      Zamestnanec najdeny = new Zamestnanec();

      for (int i = 0; i < zamestnanci.size(); i++)
      {
         if (id.equalsIgnoreCase(zamestnanci.get(i).getId()))
         {
            najdeny = zamestnanci.get(i);
            
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
    */
   public boolean jeZamestnanec(String id)
   {
      return vyhladajZamestnanca(id).getId() != null;
   }

   /**
    * Vracia vo formatovanom vystupe vsetkych zamestnancov s ich informaciami
    * 
    * @return formatovany zoznam zamestnancov
    */
   public String vratZosnamZamestnancov()
   {
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

   /**
    * Vracia formatovany vystup.
    */
   public String toString()
   {
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
}
