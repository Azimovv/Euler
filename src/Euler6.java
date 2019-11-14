public class Euler6 {
    public static void main (String [] args)
    {
        int counter = -1;
        int farEnd = 10000000;
        for (int i=1; i<=farEnd; i++)
        {
            boolean isPrime = true;
           for (int j=2; j<i; j++)
           {
               if (i%j==0)
               {
                   isPrime = false;
                   break;
               }
           }
           if (isPrime)
               counter++;
           if (counter == 10001)
           {
               System.out.println(i);
               break;
           }
        }
    }
}
