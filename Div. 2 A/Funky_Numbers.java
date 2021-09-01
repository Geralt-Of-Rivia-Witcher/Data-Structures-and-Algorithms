import java.util.*;
public class Funky_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int k1 = 1; k1 < 2 * Math.sqrt(n); k1++)
        {
            int x = (2 * n) - (k1 * (k1 + 1));
            int a1 = (int)((-1 + (Math.sqrt(1 + (4 * x)))) / 2);
            if((a1 * (a1 + 1))/2 + (k1 * (k1 + 1))/2 == n && a1 != 0)
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}