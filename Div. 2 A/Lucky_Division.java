import java.util.*;
public class Lucky_Division
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 4; i <= n; i++)
        {
            if(checkLucky(i))
            {
                if(n % i == 0)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
        sc.close();
    }
    public static boolean checkLucky(int n)
    {
        while(n > 0)
        {
            int dig = n % 10;
            if(dig != 4 && dig != 7)
            {
                return false;
            }
            n = n/10;
        }
        return true;
    }
}