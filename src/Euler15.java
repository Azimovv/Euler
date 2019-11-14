import java.math.BigInteger;

public class Euler15 {
    public static void main (String[] args)
    {
        BigInteger bigNum = BigInteger.valueOf(2);
        bigNum = bigNum.pow(1000);
        int sum = 0;
        String bigNumString = bigNum.toString();

        for(int i=0; i<bigNumString.length(); i++)
            sum += Character.getNumericValue(bigNumString.charAt(i));

        System.out.println(sum);
    }
}
