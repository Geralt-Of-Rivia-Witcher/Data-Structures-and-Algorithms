import java.util.*;
public class Supercentral_Point
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int points[][] = new int[n][2];
        for(int i = 0; i < n; i++)
        {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            boolean first = false, second = false, third = false, fourth = false;
            int x = points[i][0];
            int y = points[i][1];
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    continue;
                }
                if(points[j][0] > x && points[j][1] == y)
                {
                    first = true;
                }
                else if(points[j][0] < x && points[j][1] == y)
                {
                    second = true;
                }
                else if(points[j][0] == x && points[j][1] < y)
                {
                    third = true;
                }
                else if(points[j][0] == x && points[j][1] > y)
                {
                    fourth = true;
                }
            }
            if(first && second && third && fourth)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }   
}