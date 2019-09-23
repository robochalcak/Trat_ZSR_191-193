package auto;
/**
 Trieda sluzi ako testovacia trieda pre triedu Auto.
 */
public class AutoTester
{
    public static void main(String[] args)
    {
        Auto bmw = new Auto(5);

        bmw.natankuj(60);
        System.out.println("Obsah nadrze pred jazdou:"+bmw.getObsahNadrze());
        bmw.simulujJazdu(300);
        System.out.println("Aktualny stav nadrze po jazde, v litroch je: "+bmw.getObsahNadrze());
        System.out.println("Ocakavany stav je: 45.00 litrov.");
    }
}
