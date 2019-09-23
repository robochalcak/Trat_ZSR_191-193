package sk.itvkurze.webinar13.faktura;

public class Adresa
{

   private String nazov;
   private String ulica;
   private String mesto;

   public Adresa(String nazov, String ulica, String mesto)
   {
      this.nazov=nazov;
      this.ulica=ulica;
      this.mesto=mesto;
   }

   public String naformatuj()
   {
      
      return nazov + "\n"+ulica+"\n"+ mesto+ "\n";
   }

}
