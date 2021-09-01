import java.util.*;
public class Vasya_and_Digital_Root
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long d = sc.nextInt();
        if(k == 1)
        {
            System.out.println(d);
            System.exit(0);
        }
        if(d == 0)
        {
            System.out.println("No solution");
            System.exit(0);
        }
        System.out.print(d);
        for(int i = 0; i < k - 1; i++)
        {
            System.out.print("0");
        }
        sc.close();
    }
}