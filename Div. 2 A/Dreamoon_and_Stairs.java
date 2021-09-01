import java.util.*;
public class Dreamoon_and_Stairs
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 0;
        sc.close();
        if(n % 2 == 0)
        {
            p = n/2;
        }
        else
        {
            p = (n/2) + 1;
        }
        for(int i = p; i <= n; i++)
        {
            if(i % m == 0)
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }   
}