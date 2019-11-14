public class Euler2 {
    public static void main (String[] args)
    {
        long limit = (long)(Math.sqrt(600851475143L));
        for (long i=1; i<=limit; i++)
        {
            if(600851475143L%i == 0)
            {
                System.out.println(i);
                if(i != 600851475143L/i)
                    System.out.println("--> " + 600851475143L/i);
            }
        }
    }
}
