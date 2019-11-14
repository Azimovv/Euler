public class Euler4 {
    public static void main (String[] args)
    {
        int farEnd=20;
        boolean smallest = true;
        boolean noRemainder;
        while (smallest)
        {
            farEnd++;
            noRemainder = true;
            for (int i=2; i<=20; i++)
            {
                if (farEnd%i!=0)
                {
                    noRemainder = false;
                    break;
                }
            }
            if (noRemainder)
                smallest = false;
        }
        System.out.println(farEnd);
    }
}
