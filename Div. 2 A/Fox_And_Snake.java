import java.util.*;
public class Fox_And_Snake
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0; j < m; j++)
                {
                    System.out.print("#");
                }
            }
            else
            {
                if((i + 1) % 4 == 0)
                {
                    System.out.print("#");
                    for(int j = 0; j < m - 1; j++)
                    {
                        System.out.print(".");
                    }
                }
                else
                {
                    for(int j = 0; j < m - 1; j++)
                    {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}