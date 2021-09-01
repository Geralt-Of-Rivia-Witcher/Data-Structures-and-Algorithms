import java.util.*;
public class Pashmak_and_Garden
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3  = 0, y3 = 0, x4 = 0, y4 = 0;
        boolean answer = true;
        if(x1 == x2 && y1 == y2)
        {
            answer = false;
        }
        else if(x1 == x2)
        {
            x3 = x1 + Math.abs(y2 - y1);
            y3 = y1;
            x4 = x2 + Math.abs(y2 - y1);
            y4 = y2;
        }
        else if(y1 == y2)
        {
            x3 = x1;
            y3 = y1 + Math.abs(x2 - x1);
            x4 = x2;
            y4 = y2 + Math.abs(x2 - x1);
        }
        else if(Math.abs(x2 - x1) == Math.abs(y2 - y1))
        {
            x3 = x1;
            y3 = y2;
            x4 = x2;
            y4 = y1;
        }
        else
        {
            answer = false;
        }
        if(answer)
        {
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
        else
        {
            System.out.println(-1);
        }
        sc.close();
    }
}