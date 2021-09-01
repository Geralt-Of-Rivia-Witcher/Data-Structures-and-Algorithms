import java.util.*;
public class Beautiful_Matrix
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int row = 0, column = 0;
        int arr[][] = new int[5][5];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1)
                {
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(Math.abs(2 - row) + Math.abs(2 - column));
        sc.close();
    }
}