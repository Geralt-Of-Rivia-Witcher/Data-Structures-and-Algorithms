import java.util.*;
public class Cut_Ribbon
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int x, y, z, count = 0;
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 0; i <= n; i++)
        {
            x = i;
            for(int j = 0; j <= n; j++)
            {
                y = j;
                if(((x * a) + (y * b)) > n)
                {
                    continue;
                }
                else if((((x * a) + (y * b)) > n))
                {
                    z = 0;
                }
                else if((n - ((x * a) + (y * b))) % c == 0)
                {
                    z = (n - ((x * a) + (y * b))) / c;
                }
                else
                {
                    continue;
                }
                int temp = x + y + z;
                count = Math.max(count, temp);
            }
        }
        System.out.println(count);
        sc.close();
    }
}