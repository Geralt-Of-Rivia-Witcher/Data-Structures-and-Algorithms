import java.util.*;
public class Inna_and_Pink_Pony
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((i == n || i == 1) && (j == m || j == 1))
        {
            System.out.println("0");
            System.exit(0);
        }
        if((i - a < 1 && i + a > n) || (j + b > m && j - b < 1))
        {
            System.out.println("Poor Inna and pony!");
            System.exit(0);
        }
        sc.close();
        int x = 0, y = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        
        //first
        x = i - 1;
        y = j - 1;
        d1 = check(x, y, a, b);

        //second
        x = n - i;
        y = j - 1;
        d2 = Math.min(d1, check(x, y, a, b));
        

        //third
        x = i - 1;
        y = m - j;
        d3 = Math.min(d2, check(x, y, a, b));

        //fourth
        x = n - i;
        y = m - j;
        d4 = Math.min(d3, check(x, y, a, b));
        
        if(d4 == Integer.MAX_VALUE)
        {
            System.out.println("Poor Inna and pony!");
        }
        else
        {
            System.out.println("" + d4);
        }
    }   

    public static int check(int x, int y, int a, int b)
    {
        int aMoves = x / a;
        int bMoves = y / b;
        if(aMoves * a != x || bMoves * b != y)
        {
            return Integer.MAX_VALUE;
        }
        if(aMoves == 0)
        {
            if(bMoves % 2 == 0)
            {
                return bMoves;
            }
        }
        else if(bMoves == 0)
        {
            if(aMoves % 2 == 0)
            {
                return aMoves;
            }
        }
        if((aMoves % 2 == 0 && bMoves % 2 == 0) || (aMoves % 2 != 0 && bMoves % 2 != 0))
        {
            return Math.max(aMoves, bMoves);
        }
        return Integer.MAX_VALUE;
    }
}