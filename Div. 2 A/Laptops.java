import java.util.*;
public class Laptops
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = false;
        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < b)
            {
                ans = true;
            }
        }
        if(ans)
        {
            System.out.println("Happy Alex");
        }
        else
        {
            System.out.println("Poor Alex");
        }
        sc.close();
    }   
}