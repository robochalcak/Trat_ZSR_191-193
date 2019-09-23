package sk.itvkurze.webinar14.TriedenieVyberom;

/**
 * Trieda zodpoveda za triedenie cisiel ulozenych v datovej strukture pole.
 * 
 * @author Robert Chalcak
 */
public class TriedicVyberom
{
   private int[] data;

   /**
    * Vytvara novy triedic s danym nezotriedenym polom.
    * 
    * @param nezotriedenePole
    *           pole dat na zotriedenie
    */
   public TriedicVyberom(int[] nezotriedenePole)
   {
      this.data = nezotriedenePole;
   }

   /**
    * Zotriedi pole dat selection sort
    */
   public void zotried()
   {
      // 12 8 18 4 13 -> nezotriedene pole dat
      // int[] data = new int[5];
      // data[0] = 12
      // data[1] = 8
      // data[2]=18
      // data[3] =4
      // data[4] = 13
      for (int i = 0; i < data.length; i++)
      {
         // vyhlada najmensi i-ty prvok v nezotridenej casti pola a vrati jeho
         // index
         int minIndex = najdiIndexNajmensiehoPrvkuOdIndexu(i);
         vymenPrvky(minIndex, i);
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
