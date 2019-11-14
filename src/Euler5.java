public class Euler5 {
    public static void main (String[] args)
    {
        int sum1 = 0;
        int temp = 0;
        int sum2 = 0;
        for (int i=1; i<=100; i++)
            sum1 += i*i;
        for (int i=1; i<=100; i++)
            temp += i;

        sum2 = temp*temp;

        System.out.println(sum2 + " - " + sum1 + " = " + (sum2-sum1));
    }
}
