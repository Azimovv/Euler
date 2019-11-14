public class Euler9 {
    public static void main (String[] args)
    {
        boolean isPrime = true;
        long sum = 0;
        for (int i=2; i<2000000; i++)
        {
            if (i%2 == 0 || i%5 == 0)
                continue;
            isPrime = true;
            for (int j=2; j<i; j++)
            {
                if (i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
