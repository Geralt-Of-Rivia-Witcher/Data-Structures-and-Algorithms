import java.util.*;
public class Even_Odds
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if(n % 2 == 0)
        {
            if(n/2 >= m)
            { 
                System.out.println((2 * m) - 1);
            }
            else
            {
                System.out.println((2 * (m - (n/2))));   
            }
        }
        else
        {
            if(n/2 + 1 >= m)
            { 
                System.out.println((2 * m) - 1);
            }
            else
            {
                System.out.println((2 * (m - (n/2))) - 2);   
            }
        }
        sc.close();
    }
}