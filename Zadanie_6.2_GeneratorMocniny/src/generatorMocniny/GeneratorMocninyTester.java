package generatorMocniny;

import java.math.BigDecimal;

/**
 * This class tests GeneratorMocniny class
 */
public class GeneratorMocninyTester
{
    public static void main(String[] args)
    {
        GeneratorMocniny mocnina=new GeneratorMocniny();

        System.out.println(1);
        for(int i = 0; i <= 8; i++)
        {
            System.out.printf("%.0f%n",BigDecimal.valueOf(mocnina.dalsiaMocnina(10)));
        }
    }
}
