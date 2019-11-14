public class Euler16 {
    public static void main (String[] args) {

        int[] singles = {0,3,3,5,4,4,3,5,5,4};
        int[] tenThroughNineteen = {3,6,6,8,8,7,7,9,8,8};
        int[] tens = {0,6,6,5,5,5,7,6,6};
        int[] hundreds = {0,13,13,15,14,14,13,15,15,14};
        int sum = 0;

        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                for(int k=0; k<10; k++)
                {
                    if (j!=1)
                        sum += singles[k];
                    if (j==1)
                        sum += tenThroughNineteen[k];
                    if (j>=2)
                        sum += tens[j-1];
                    if(i>=1)
                        sum += hundreds[i];

                    System.out.print(i + "" + j + "" + k + " ---> total val: " + sum);
                    System.out.println();
                }
            }
        }

        sum += 11;

        System.out.println("final total: " + sum);


    }
}
