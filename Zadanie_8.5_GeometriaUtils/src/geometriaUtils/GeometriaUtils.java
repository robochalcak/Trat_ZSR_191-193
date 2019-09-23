package geometriaUtils;

/**
 * This class provides calculation of surface and volume of sphere, cylinder and cone
 */
public class GeometriaUtils
{
    /**
     * Calculates volume of the sphere
     *
     * @param r radius
     * @return volume
     */
    public static double vypocitajObjemGule(double r)
    {
        return ((4.0 / 3.0) * Math.PI) * Math.pow(r, 3);
    }

    /**
     * Calculates a surface of the sphere
     *
     * @param r radius
     * @return surface
     */
    public static double vypocitajPovrchGule(double r)
    {
        return (4.0 * Math.PI) * Math.pow(r, 2);
    }

    /**
     * Calculates volume of the cylinder
     *
     * @param r radius
     * @param v hight
     * @return volume
     */
    public static double vypocitajObjemValca(double r, double v)
    {
        return Math.PI * (Math.pow(r, 2) * v);
    }

    /**
     * Calculates surface of the cylinder
     *
     * @param r radius
     * @param v high
     * @return volume
     */
    public static double vypocitajPovrchValca(double r, double v)
    {
        double p = Math.pow((Math.PI * r), 2);
        double q = 2 * (Math.PI * r * v);

        return 2.0 * p + q;
    }

    /**
     * Calculates volume of the cone
     *
     * @param r radius
     * @param v high
     * @return volume
     */
    public static double vypocitajObjemRotacnehoKuzela(double r, double v)
    {
        return (1.0 / 3.0) * Math.pow((Math.PI * r), 2) * v;
    }

    /**
     * Calculates surface of the cone
     *
     * @param r radius
     * @param v high
     * @return surface
     */
    public static double vypocitajPovrchKuzela(double r, double v)
    {
        double sp = Math.pow((Math.PI * r), 2);
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(v, 2));
        double spl = Math.PI * r * s;

        return sp + spl;
    }


}
