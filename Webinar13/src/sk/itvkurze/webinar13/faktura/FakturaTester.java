package sk.itvkurze.webinar13.faktura;

public class FakturaTester
{

   public static void main(String[] args)
   {
      //potrebujeme vytvorit adresu zakaznika (casom bude poziadavka na zmenu adresy)
      
      Adresa adresaZakaznika = new Adresa("Firma XYZ", "Horna 5", "Horna Dolna");
      //vztah medyi triedami Adresa a Faktura je agreagacia (nevytvara obkjekt )
      Faktura faktura = new Faktura(adresaZakaznika);
      
      faktura.pridaj(new Produkt("Hriankovac", 30.0),3);
      faktura.pridaj(new Produkt("Toustovac", 20.0),1);
      faktura.pridaj(new Produkt("Fen", 25.0),2);
      
      System.out.println(faktura.naformatuj());
   }

}
