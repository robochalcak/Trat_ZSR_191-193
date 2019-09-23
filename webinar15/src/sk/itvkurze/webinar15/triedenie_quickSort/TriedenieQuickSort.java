package sk.itvkurze.webinar15.triedenie_quickSort;

public class TriedenieQuickSort
{
   private int[]data;
   
   public TriedenieQuickSort(int[]nezotriedenePole)
   {
      this.data= nezotriedenePole;
   }
   
   public void zotried(int indexOd, int indexDo)
   {
      if(indexOd >= indexDo)
      {
         return;
      }
      
       // 1) najdi pivota
      int indexPivota = zvolPivota(indexOd, indexDo);
      
      
      // 2) zotried lavu cast
      zotried(indexOd, indexPivota);
      // 3) zotried pravu cast 
      
      zotried(indexPivota+1, indexDo);
   }

   private int zvolPivota(int indexOd, int indexDo)
   {
      int pivot = data[indexOd];
      
      int i = indexOd -1 ;
      int j = indexDo +1;
      
      while(i < j)
      {
         i++;
         while(data[i]<pivot)
         {
            i++;
         }
         j--;
         while(data[j]>pivot)
         {
            j--;
         }
         
         if(i<j)
         {
            vymenPrvky(i,j);
         }
      }
      return j;
   }

   private void vymenPrvky(int i, int j)
   {
      //vymen hodnoty premennych i a j bez toho, aby si pouzil dalsiu pomocnu premennu;
      data[i] = data[i] +data[j];
      data[j] = data[i] -data[j];
      data[i] =data[i] - data[j];  
   }
   
}
