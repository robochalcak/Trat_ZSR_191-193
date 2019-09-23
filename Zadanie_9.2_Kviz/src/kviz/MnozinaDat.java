package kviz;

import java.util.ArrayList;

/**
 * This class collect all information about quizes and determines average, highest or lowest
 * score of the all quizzes
 */
public class MnozinaDat
{
    private Kviz kviz; // holds object of quiz
    private ArrayList<Kviz> kvizy; // holds all quizzes objects

    /**
     * Crates a new object without using any parameter
     */
    public MnozinaDat()
    {
        kvizy = new ArrayList<Kviz>();
    }

    /**
     * Creates a new object with using an object quiz
     *
     * @param kviz
     */
    public MnozinaDat(Kviz kviz)
    {
        this.kviz = kviz;
        kvizy = new ArrayList<Kviz>();
    }

    /**
     * Sets and add quiz into ArrayList
     *
     * @param kviz
     */
    public void setKviz(Kviz kviz)
    {
        this.kviz = kviz;
        kvizy = new ArrayList<Kviz>();
        kvizy.add(kviz);
    }

    /**
     * Returns an average from all quizzes
     *
     * @return
     */
    public double getPriemer()
    {
        double priemer = 0;

        for (int i = 0; i < kvizy.size(); i++)
        {
            priemer += kvizy.get(i).getSkore();
        }

        return priemer / (double) kvizy.size();
    }

    /**
     * Returns the lowest value or score from all quizzes
     *
     * @return
     */
    public int getNajnizsie()
    {
        int najnizsi = kvizy.get(0).getSkore();

        for (int i = 0; i < kvizy.size(); i++)
        {
            if (kvizy.get(i).getSkore() < najnizsi)
            {
                najnizsi = kvizy.get(i).getSkore();
            }
        }
        return najnizsi;
    }

    /**
     * Returns the highest score from all quizzes
     *
     * @return
     */
    public int getNajvyssie()
    {
        int najvyssi = kvizy.get(0).getSkore();
        ;

        for (int i = 0; i < kvizy.size(); i++)
        {
            if (kvizy.get(i).getSkore() > najvyssi)
            {
                najvyssi = kvizy.get(i).getSkore();
            }
        }
        return najvyssi;
    }

    /**
     * add quiz into ArrayList
     *
     * @param kviz
     */
    public void pridaj(Kviz kviz)
    {
        kvizy.add(kviz);
    }
}
