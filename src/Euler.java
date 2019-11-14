public class Euler {
    public static void main (String [] args)
    {
        int sum = 0;
        int[] fib = new int[3];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        while (fib[2] < 4000000)
        {
            fib[2] = fib[1] + fib[0];
            fib[0] = fib[1];
            fib[1] = fib[2];
            if (fib[2]%2 == 0)
                sum+=fib[2];
        }

        System.out.println(sum);
    }
}
