public class HraciaPlochaPiskvorky // class declaration
{
    public static void main(String[] args) // main()declaration
    {
        System.out.println("+---+---+---+---+"); // printing the playing area of game tick tack toe
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
    }

    /*
    An alternative solution, with for loop, where the loop makes iteration 4 times and print the play area of tick
    tack toe
    Advantage: less code, because the loop repeats until the i reach on the last number, which is less than 4.
    We have begun from 0 and end on 3, because Java, and all programming language begin counting from 0.

    public static void main(String[] args)
    {
        for(int i = 0; i < 4;i++)
        {
            System.out.println("+---+---+---+---+");
            System.out.println("|   |   |   |   |");
        }

        System.out.println("+---+---+---+---+");
    }
    */
}
