package sk.itvkurze.webinar04.bigDecimal_bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PracaSvelkymiCislami
{

   public static void main(String[] args)
   {
      // riesi chyby z pretecenia rozsahu jednotlivych typov (int, long)
      BigInteger cislo1 = new BigInteger("1234567890");
      BigInteger cislo2 = new BigInteger("9876543210");
      BigInteger vysledokNasobenia = cislo1.multiply(cislo2);
      System.out.println("Vysledok nasobenia: "+ vysledokNasobenia);
      
      //riesi chyby zo zaokruhlovania
      
      BigDecimal realneCislo1 = new BigDecimal("4.35");
      BigDecimal realneCislo2 = new BigDecimal("100");
      BigDecimal vysledokNasobenia2 = realneCislo1.multiply(realneCislo2);
      System.out.println("Vysledok nasobenia: "+vysledokNasobenia2);
      System.out.println(4.35* 100);
   }

}
