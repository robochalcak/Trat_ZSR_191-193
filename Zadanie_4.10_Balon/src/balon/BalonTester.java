package balon;

/**
 * This class tests class Balloon
 */
public class BalonTester
{
    public static void main(String[] args)
    {
        Balon balon = new Balon();

        System.out.println("Prdavam vzduch 100 m^3");
        balon.pridajVzduch(100);
        System.out.println("Polomer balona je :" + balon.getPolomer() + " m^3");
        System.out.println("Plocha balona je  :" + balon.getPlocha() + " m^3");
        System.out.println("Objem balona je : " + balon.getObjem());

        System.out.println("**************Ocakavane hodnoty***************");
        System.out.println("Polomer: 2.879412");
        System.out.println("Povrch : 104.187942");
        System.out.println("Objem 100 cm^3");

        System.out.println("**********************************************");
        System.out.println("Pridavam dalsie 100m^3");
        balon.pridajVzduch(100);
        System.out.println("Polomer balona je :" + balon.getPolomer() + " m^3");
        System.out.println("Plocha balona je  :" + balon.getPlocha() + " m^3");
        System.out.println("Objem balona je : " + balon.getObjem());

        System.out.println("**********************************************");
        System.out.println("Ocakavane hodnoty pri zdvojnasobeni objemu balona");
        System.out.println("Polomer : 3.627832");
        System.out.println("Povrch: 165.388077");
        System.out.println("Objem 200");

    }
}
