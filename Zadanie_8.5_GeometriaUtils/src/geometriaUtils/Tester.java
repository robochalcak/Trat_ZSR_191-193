package geometriaUtils;

/**
 * This class tests GeometriaUtils class
 */
public class Tester
{
    public static void main(String[] args)
    {
        System.out.printf("Objem gule s polomerom 3 m je: %.4f\n",GeometriaUtils.vypocitajObjemGule(3));
        System.out.printf("Povrch gule s polomerom 3m je: %.4f\n",GeometriaUtils.vypocitajPovrchGule(3));
        System.out.printf("Povrch valca s polomerom 3 m a s vyskou 6 m je: %.4f\n",
                GeometriaUtils.vypocitajPovrchValca(3,6));
        System.out.printf("Objem valca s polomerom 3m a s vyskou 6 m je: %.4f\n",
                GeometriaUtils.vypocitajObjemValca(3,6));
        System.out.printf("Objem rotacneho kuzela s polomerom 3 m a s vyskou 6m je %.4f\n",
                GeometriaUtils.vypocitajObjemRotacnehoKuzela(3,6));
        System.out.printf("Povrch rotacneho kuzela s polomerom 3 m a s vyskou 6 m je %.4f\n",
                GeometriaUtils.vypocitajPovrchKuzela(3,6));
    }
}
