package itvkurze.webinar1.rozne_typy_vynimiek;

public class NespravnyFormatDat extends Exception
{

   public NespravnyFormatDat(String sprava)
   {
      super(sprava);
   }

}
