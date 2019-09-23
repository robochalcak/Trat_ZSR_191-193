package itvkurze.webinar16.otazka_3;

public class Tester
{

   public static void main(String[] args)
   {
      RocneObdobia jar= RocneObdobia.JAR;
      
      System.out.println("Aktualne rocne obdobie: "+jar);
      
      //je rocne obdobie jar(jar);
      
      boolean jeJar=jeRocneObdobie(jar);
      System.out.println("Je jar? "+ jeJar);
         
   }

   private static boolean jeRocneObdobie(RocneObdobia rocneObdobie)
   {  
      return rocneObdobie == RocneObdobia.JAR;
   }
}
