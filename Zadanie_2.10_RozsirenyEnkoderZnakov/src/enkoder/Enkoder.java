package enkoder;  //package location

public class Enkoder // class declaration
{
    public static void main(String[] args)  // main method declaration
    {
        String word = "nepovedz";                       //original world
        System.out.println("Pred použitím enkodera: " );
        System.out.println(word);                       // printing original word
        System.out.println("Po použití enkodera ");
        System.out.println(word.replace('e','i')    //first is temporary replaced e with i
                .replace('o','e')                   //second is o replaced with e
                .replace('i','o'));                 //third is temporary i replaced with o
    }
}
