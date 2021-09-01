import java.util.*;
public class Cheap_Travel
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = n * a;
        int amount  = 0;
        amount += (n / m) * b;
        n -= (n / m) * m;
        System.out.println(Math.min(amount + (n * a), Math.min(amount + b, x)));
        sc.close();
    }    
}
