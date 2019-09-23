package sk.itvkurze.webinar18.vlastny_zretazeny_zoznam;

public interface ZoznamIterator<E>
{
   Object dalsi();

   boolean existujeDalsiPrvok();
   
   void pridaj(E prvok);
   
   void zmaz();
   
   void nastav(E prvok);
}
