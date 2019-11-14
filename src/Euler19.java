import java.math.BigInteger;

public class Euler19 {
    public static void main (String[] args)
    {
        BigInteger factorial=BigInteger.valueOf(1);
        long sum = 0;

        for(int i=100; i>0; i--)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.print(i + "*");
        }
        System.out.println("\n100! = " + factorial);

        String bigNum = factorial.toString();

        for(int i=0; i<bigNum.length(); i++)
            sum += Character.getNumericValue(bigNum.charAt(i));

        System.out.println("Sum of all digits = " + sum);
    }
}
