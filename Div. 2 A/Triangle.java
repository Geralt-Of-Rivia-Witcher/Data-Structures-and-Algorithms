import java.util.*;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if(check(x1, y1, x2, y2, x3, y3))
        {
            System.out.println("RIGHT");
        }
        else
        {
            if(check(x1 + 1, y1, x2, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1 - 1, y1, x2, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1 + 1, x2, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1 - 1, x2, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2 + 1, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2 - 1, y2, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2 + 1, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2 - 1, x3, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2, x3 + 1, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2, x3 - 1, y3))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2, x3, y3 + 1))
            {
                System.out.println("ALMOST");
            }
            else if(check(x1, y1, x2, y2, x3, y3 - 1))
            {
                System.out.println("ALMOST");
            }
            else
            {
                System.out.println("NEITHER");
            }
        }
        sc.close();
    }

    public static boolean check(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double d1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double d2 = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
        double d3 = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
        if(d1 > d2 && d1 > d3)
        {
            if(d1 == d2 + d3)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(d2 > d1 && d2 > d3)
        {
            if(d2 == d1 + d3)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(d3 > d1 && d3 > d2)
        {
            if(d3 == d1 + d2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}