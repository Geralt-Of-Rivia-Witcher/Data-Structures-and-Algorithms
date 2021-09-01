import java.util.*;
public class Expression
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int x = a * b + c;
        if(x > max)
        {
            max = x;
        }
        x = a + b * c;
        if(x > max)
        {
            max = x;
        }
        x = (a + b) * c;
        if(x > max)
        {
            max = x;
        }
        x = a * (b + c);
        if(x > max)
        {
            max = x;
        }
        x = a + b + c;
        if(x > max)
        {
            max = x;
        }
        x = a * b * c;
        if(x > max)
        {
            max = x;
        }
        System.out.println(max);
        sc.close();
    }
}