import java.util.*;
public class Point_on_Spiral
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if((x == 1 && y == 0) || (x == 0 && y == 0))
        {
            System.out.println("0");
            System.exit(0);
        }
        if(x != 0 && y != 0 && x != y && x + y != 1)
        {
            if(Math.abs(x) > Math.abs(y))
            {
                y = 0;
            }
            else if(Math.abs(x) < Math.abs(y))
            {
                x = 0;
            }
            else
            {
                x = 0;
            }
        }
        if(x == 0 || y == 0)
        {
            if(x == 0 && y > 0)
            {
                System.out.println((4 * (Math.abs(y) - 1)) + 2);
            }
            else if(x < 0 && y == 0)
            {
                System.out.println((4 * (Math.abs(x) - 1)) + 3);
            }
            else if(x == 0 && y < 0)
            {
                System.out.println((4 * (Math.abs(y) - 1)) + 4);
            }
            else if(x > 0 && y == 0)
            {
                System.out.println((4 * (Math.abs(x) - 1)) + 1);
            }
        }
        else if(Math.abs(x) - Math.abs(y) == 0 || Math.abs(Math.abs(x) - Math.abs(y)) == 1)
        {
            if(x > 0 && y > 0)
            {
                System.out.println((4 * (x - 1)) + 1);
            }
            else if(x < 0 && y > 0)
            {
                System.out.println((4 * (Math.abs(x) - 1)) + 2);
            }
            else if(x < 0 && y < 0)
            {
                System.out.println((4 * (Math.abs(x) - 1)) + 3);
            }
            else if(x > 0 && y < 0)
            {
                System.out.println((4 * (Math.abs(x) - 2)) + 4);
            }
        }
    }
}