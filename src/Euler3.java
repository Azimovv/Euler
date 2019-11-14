public class Euler3 {
    public static void main (String[] args)
    {
        int k;
        String reverse;
        String forward;
        int largest = 0;
        for (int i=100; i<=999; i++)
        {
            for (int j=999; j>=100; j--)
            {
                reverse = "";
                k=i*j;
                forward = String.valueOf(k);
                for (int m=forward.length()-1; m>=0; m--)
                    reverse += forward.charAt(m);

                if (reverse.equals(forward) && Integer.parseInt(reverse) > largest)
                    largest = Integer.parseInt(reverse);
            }
        }
        System.out.println(largest);
    }
}
