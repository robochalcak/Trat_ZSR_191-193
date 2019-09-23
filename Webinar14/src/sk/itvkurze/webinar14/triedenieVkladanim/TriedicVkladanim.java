package sk.itvkurze.webinar14.triedenieVkladanim;

/**
 * Trieda zodpoveda za triedenie cisiel ulozenych v datovej strukture pole.
 * 
 * @author Robert Chalcak
 */
public class TriedicVkladanim
{
   private int[] data;

   /**
    * Vytvara novy triedic s danym nezotriedenym polom.
    * 
    * @param nezotriedenePole
    *           pole dat na zotriedenie
    */
   public TriedicVkladanim(int[] nezotriedenePole)
   {
      this.data = nezotriedenePole;
   }

   /**
    * Zotriedi pole dat 
    */
   public void zotried()
   {
      int n = data.length; // velkost pola
      
      for(int i = 1; i < n; i++)
      {
         int kluc = data[i];
         int j = i-1;
         
         while(j >=0&& data[j]>kluc)
         {
            data[j+1]=data[j];
            j= j-1;
         }
         data[j+1]=kluc;
      }
   }

   /**
    * Vymeni prvky v poli data na indexoch
    * 
    * @param i
    *           index prveho prvku na vymenu
    * @param j
    *           index druheho prvku na vymenu
    */
   private void vymenPrvky(int i, int j)
   {
      int zaloha = data[i];
      data[i] = data[j];
      data[j] = zaloha;
   }

   /**
    * Vyhlada a vrati index najmensieho prvku na nezotriedenej casti pola do
    * daneho indexu i
    * 
    * @param index
    *           pociatocna pozicia vyhladavania
    * @return index (pozicia)najmensieho prvku v poli <data[index]...
    *         data[data.length-]>
    */
   private int najdiIndexNajmensiehoPrvkuOdIndexu(int index)
   {
      int indexMinPrvku = index;

      for (int i = index + 1; i < data.length; i++)
      {
         if (data[i] < data[indexMinPrvku])
         {
            indexMinPrvku = i;
         }
      }

      return indexMinPrvku;
   }
}
