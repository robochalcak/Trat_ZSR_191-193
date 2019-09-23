package triedenieSlov;

import java.util.Arrays;//necessary for array sorting

/**
 * This class provides sorting of three randomly entered strings
 * it sorts from smallest usually by alphabetical order to highest
 */
public class MnozinaDat
{
    private String najmensi; // holds first string
    private String prostredny; // holds second string
    private String najvacsi; // holds third string
    private String[] sort;  // holds all entered strings

    /**
     * Parametric constructor, which initializes all necessary variables and populates array with them
     *
     * @param najmensi
     * @param prostredny
     * @param najvacsi
     */
    public MnozinaDat(String najmensi, String prostredny, String najvacsi)
    {
        this.najmensi = najmensi;
        this.prostredny = prostredny;
        this.najvacsi = najvacsi;
        sort = new String[3];
        sort[0] = najmensi;
        sort[1] = prostredny;
        sort[2] = najvacsi;
    }

    /**
     * Provides sorting the array of string, by alphabetical order
     */
    private void sort()
    {
        Arrays.sort(sort);
    }

    /**
     * Returns the smallest string, which is stored in index 0
     *
     * @return
     */
    public String getNajmensi()
    {
        sort();
        return sort[0];
    }

    /**
     * Returns a median string, stored in index 1
     *
     * @return
     */
    public String getProstredny()
    {
        sort();
        return sort[1];
    }

    /**
     * Returns the highest, last one, stored in index 2
     *
     * @return
     */
    public String getNajvacsi()
    {
        sort();
        return sort[2];
    }

}
