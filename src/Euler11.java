public class Euler11 {
    public static void main(String[] args)
    {
        long i=1;
        int x=2;
        boolean found = false;
        while(!found)
        {
            if (divisors(i) >500)
            {
                System.out.println(i);
                found = true;
            }
            else
            {
                i+=x;
                x++;
            }
        }
    }
    public static int divisors (long n)
    {
        int counter=0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
                counter++;
        }
        counter=counter*2;
        return counter;
    }
}
