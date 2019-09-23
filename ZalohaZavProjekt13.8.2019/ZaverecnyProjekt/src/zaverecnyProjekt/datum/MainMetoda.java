package zaverecnyProjekt.datum;

public class MainMetoda
{

   public static void main(String[] args)
   {
      Datum datum = new Datum();
      
      System.out.println(datum);
      
      datum.setDen(15);
      datum.setMesiac(5);
      datum.setRok(2015);
      
      System.out.println(datum);
      
      System.out.println(datum.getNazovMesiaca());
      
      System.out.println(datum.jePrestupny());
      datum.setRok(2016);
      System.out.println(datum.jePrestupny());
      
      System.out.println(datum.dniVMesiaci());
      
      Datum datum1 = new Datum(10,1,2019);
      Datum datum2 = new Datum(15,12,2019);
      
      System.out.println(datum.jeMedzi(datum1, datum2));
      
      datum.setRok(2019);
      System.out.println(datum.jeMedzi(datum1, datum2));

   }

}
