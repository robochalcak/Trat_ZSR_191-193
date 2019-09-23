package geometriaUtils;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
/**
 Testovacia trieda pre triedu GeometriaUtils.
 */
public class GeometriaUtilsTester
{
    public static void main(String[] args)
    {
        Ellipse2D.Double elipsa = new Ellipse2D.Double(0, 0, 200, 300);
        Point2D.Double bod1 = new Point2D.Double(100, 100);
        System.out.println(GeometriaUtils.nachadzaSaVoVnutri(bod1, elipsa));
        System.out.println("Ocakvana hodnota: true");
        Point2D.Double bod2 = new Point2D.Double(0, 0);
        System.out.println(GeometriaUtils.nachadzaSaNaObvode(bod2, elipsa));
        System.out.println("Ocakavana hodnota: false");
    }
}
