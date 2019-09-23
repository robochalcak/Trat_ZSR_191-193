package projektil;

/**
 * Tato testovacia trieda testuje triedu StrelbaProjektilu a vracia na konzolu jeho polohu a rychlost
 */
public class StrelaProjektiuluTester
{
    public static void main(String[] args) throws InterruptedException
    {
        StrelbaProjektilu strela = new StrelbaProjektilu(100); // 100 m/sekundu
        strela.posun(1); // posun strely „v case“ o sekundu

        System.out.println("Pociatocna rychlost projektilu je: " + strela.getPociatocnaRychlost());
        System.out.println("Ocakavana hodnota: 100");
        System.out.println("Rychlost projektilu po 1 sekunde vystrelu: " + strela.getRychlost());
        System.out.println("Ocakavana hodnota: " + (100 - 9.81));

        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("SIMULACIA LETU PROJEKTILU PRI 11 SEKUNDACH A VYPOCET ");
        System.out.println("JEHO POLOHY A RYCHLOSTI");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        for (int i = 1; i <= 11; i++)
        {
            strela.posun(i);
            Thread.sleep(1000);
            if (strela.getRychlost() < 0)
            {
                System.out.println("-------------------------------------------------------");
                System.out.println("To znamena,ze projektil zacina " + "klesat" + " k zemi.");
                System.out.println("Tiazove zrychlenie g=9.81 m/s^2 prekonalo energiu vystrelu");
                System.out.println("a preto projektil zacina klesat k zemi.");
                System.out.println("Pozicia projektilu: " + strela.getPozicia());
                System.out.println("Rychlost projektilu: " + strela.getRychlost() * -1 + " smer spat na zem.");
                System.out.println("-------------------------------------------------------");
            }
            else
            {
                System.out.println("Rychlost projektilu: " + strela.getRychlost());
                System.out.println("Pozicia projektilu: " + strela.getPozicia());
            }
        }

    }
}
