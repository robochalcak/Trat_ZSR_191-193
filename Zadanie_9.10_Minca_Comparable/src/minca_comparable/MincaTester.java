package minca_comparable;

/**
 * Program testuje pouzitie objekty triedy Minca implementujuce rozhranie Comparable.
 */
public class MincaTester
{
    public static void main(String[] args)
    {
        Minca eurovka = new Minca("Eurovka", 1.0);
        Minca dvojeurovka = new Minca("DvojEurovka", 2.0);

        int vysledokPorovnavania = eurovka.compareTo(dvojeurovka);

        if (vysledokPorovnavania < 0)
        {
            System.out.println("Hodnota eurovej minci je mensia ako hodnota dvojeurovej minci");
        }
        else if (vysledokPorovnavania > 0)
        {
            System.out.println("Hodnota eurovej minci je vacsia ako hodnota dvojeurovej minci");
        }
        else
        {
            System.out.println("Hodnota eurovej minci je rovna hodnota dvojeurovej minci");
        }
    }
}
