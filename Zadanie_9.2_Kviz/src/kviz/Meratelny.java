package kviz;

/**
 * This interface defines all required method for the quiz class
 */
public interface Meratelny
{
    void setZnamka(int hodnota); // sets score by number representation of the quiz

    int getSkore(); // returns score int number representation

    String getZnamka(); // retusn grade in letter representation
}
