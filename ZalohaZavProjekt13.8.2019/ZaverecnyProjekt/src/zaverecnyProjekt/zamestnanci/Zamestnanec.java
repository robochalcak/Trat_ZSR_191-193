package zaverecnyProjekt.zamestnanci;

/**
 * Trieda je urcena na vytvorenie objektu zamestnanca
 * 
 * @author Robert Chalcak Tomas Pajonk Zuzana Bajakova
 */
public class Zamestnanec
{

   private String meno; // uchovava krstne meno zamestnanca
   private String priezvisko; // uchovava priezvisko zamestnanca
   private String id; // uchovava id zamestnanca
   private double plat; // uchovava plat zametnanca
   private boolean pracuj; // uchovava true ak zamestnanec pracuje inak false 

   /**
    * Vytvara prazdny objekt zamestnanca
    */
   public Zamestnanec()
   {
      this.meno = null;
      this.priezvisko = null;
      this.id = null;
      this.plat = 0.0;
      this.pracuj = false;
   }

   /**
    * Vytvaraobjekt zamestnanca s pouzitim parametrov:
    * 
    * @param meno
    *           krstne meno
    * @param priezvisko
    * @param id
    * @param plat
    */
   public Zamestnanec(String meno, String priezvisko, double plat)
   {
      this.meno = meno;
      this.priezvisko = priezvisko;
      this.id = null;
      this.plat = plat;
      this.pracuj = false;
   }

   /**
    * Nastavuje krstne meno zamestnanca s pouzitim parametru:
    * 
    * @param meno
    */
   public void setMeno(String meno)
   {
      this.meno = meno;
   }

   /**
    * Nastavuje priezvisko zamestnanca s pouzitim parametru
    * 
    * @param priezvisko
    */
   public void setPriezvisko(String priezvisko)
   {
      this.priezvisko = priezvisko;
   }

   /**
    * Nastavuje unikatne ID zametnanca s pouzitim parametru:
    * 
    * @param id
    */
   public void setId(String id)
   {
      this.id = id;
   }

   /**
    * Nastavuje plat zamestnanca s pouzitim parametru:
    * 
    * @param plat
    */
   public void setPlat(double plat)
   {
      this.plat = plat;
   }

   /**
    * Nastavuje pracuj na true, cize zamestnanec je aktivny
    */
   public void prihlasSa()
   {
      pracuj = true;
   }

   /**
    * Nastavuje aktivitu zamestnanca s pouzitim parametra
    * 
    * @param pracuj
    *           ked je true pracuje inak nepracuje
    */
   public void pracuj(boolean pracuj)
   {
      this.pracuj = pracuj;
   }

   /**
    * Vracia krstne meno
    * 
    * @return meno
    */
   public String getMeno()
   {
      return meno;
   }

   /**
    * Vracia priezvisko zamestnanca
    * 
    * @return priezvisko
    */
   public String getPriezvisko()
   {
      return priezvisko;
   }

   /**
    * Vracia true ak je zamestnanec v pracovnej dobe inak vracia false
    * 
    * @return true alebo false
    */
   public boolean pracuje()
   {
      return pracuj;
   }

   /**
    * Vracia ID zamestnanca
    * 
    * @return ID
    */
   public String getId()
   {
      return id;
   }

   /**
    * Vracia plat zamestnanca
    * 
    * @return
    */
   public double getPlat()
   {
      return plat;
   }

   /**
    * Vracia formatovany vystup so vsetkymi informaciami o zamesnancovi
    */
   public String toString()
   {
      return "Meno: " + meno + "\nPriezvisko: " + priezvisko + "\nID: " + id
            + "\nPlat: " + plat;
   }

}
