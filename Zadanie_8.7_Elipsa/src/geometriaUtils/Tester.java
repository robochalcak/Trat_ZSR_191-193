package geometriaUtils;

import java.awt.geom.Ellipse2D;

public class Tester
{
    public static void main(String[] args)
    {
        Ellipse2D elipsa = new Ellipse2D.Double();

        ((Ellipse2D.Double) elipsa).width = 8.0;
        ((Ellipse2D.Double) elipsa).height = 6.0;

        System.out.println("Obvod elipsy s rozmermy 8 cm a 6 cm je: ");
        System.out.println(GeometriaUtils.vypocitajObvod((Ellipse2D.Double) elipsa));

        System.out.println("Obsah tej istej elipsy s rozmermy 8 cm a 6 cm je: ");
        System.out.println(GeometriaUtils.vypocitajPlochu((Ellipse2D.Double) elipsa));

    }
}
