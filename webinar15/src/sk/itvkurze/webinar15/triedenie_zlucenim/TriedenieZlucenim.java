package sk.itvkurze.webinar15.triedenie_zlucenim;

public class TriedenieZlucenim
{
   private int[]data;
   
   public TriedenieZlucenim(int[]nezotriedenePole)
   {
      this.data= nezotriedenePole;
   }
   
   public void zotried()
   {
      if(data.length <=1)
      {
         return;
      }
      
      int[] lavaCast = new int[data.length/2];
      int[] pravaCast = new int[data.length-lavaCast.length];
      
      System.arraycopy(data, 0, lavaCast, 0, lavaCast.length);
      System.arraycopy(data, lavaCast.length,pravaCast,0,pravaCast.length);
      
      TriedenieZlucenim triedicLavejCasti = new TriedenieZlucenim(lavaCast);
      TriedenieZlucenim triedicPravejCasti = new TriedenieZlucenim(pravaCast);
      
      triedicLavejCasti.zotried();
      triedicPravejCasti.zotried();
      
      zluc(lavaCast,pravaCast);
   }
   
   private void zluc(int[]lavaCast, int[]pravaCast)
   {
      int indexLavaCast = 0;
      int indexPravaCast = 0;
      
      int j = 0;
      
      while(indexLavaCast < lavaCast.length && indexPravaCast < pravaCast.length)
      {
         if(lavaCast[indexLavaCast]< pravaCast[indexPravaCast])
         {
            data[j]=lavaCast[indexLavaCast];
            indexLavaCast++;
         }
         else{
            
            data[j]=pravaCast[indexPravaCast];
            indexPravaCast ++;
         }
         j++;
      }
      System.arraycopy(lavaCast, indexLavaCast, data, j, lavaCast.length-indexLavaCast);
      System.arraycopy(pravaCast,indexPravaCast, data,j, pravaCast.length-indexPravaCast);
   }
}
