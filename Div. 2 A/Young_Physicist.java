import java.util.*;
public class Young_Physicist
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;
        for(int i = 0; i < n; i++)
        {
            sumX += sc.nextInt();
            sumY += sc.nextInt();
            sumZ += sc.nextInt();
        }
        if(sumX != 0 || sumY != 0 || sumZ != 0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
        sc.close();
    }
}