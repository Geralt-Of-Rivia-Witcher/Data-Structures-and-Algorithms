import java.util.*;
public class Lunch_Rush
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int joy = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++)
        {
            int f = sc.nextInt();
            int t = sc.nextInt();
            if(t > k)
            {
                f -= (t - k);
            }
            if(f > joy)
            {
                joy = f;
            }
        }
        System.out.println(joy);
        sc.close();
    }   
}