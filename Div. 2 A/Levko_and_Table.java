import java.util.*;
public class Levko_and_Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j != 1)
                {
                    System.out.print(" ");
                }
                if(i == j)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}