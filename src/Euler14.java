public class Euler14 {
    public static void main (String[] args)
    {
        long[] grid = new long[21];

        for (int i=0; i<grid.length; i++)
        {
            grid[i] = 1;
            System.out.print(grid[i] + " ");
        }

        System.out.println("\n");
        for (int i=0; i<grid.length-1; i++)
        {
            for(int j=0; j<grid.length-1; j++)
            {
                grid[j+1] = grid[j] + grid[j+1];
                System.out.print(grid[j] + " ");
            }
            System.out.println(grid[grid.length-1]);
            System.out.println();
        }
    }
}
