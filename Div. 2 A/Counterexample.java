import java.util.*;
public class Counterexample
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long range = r - l + 1;
        if(range < 3 || (l % 2 == 1 && range < 4))
        {
            System.out.println("-1");
        }
        else
        {
            if(l % 2 == 0)
            {
                System.out.println(l + " " + (l + 1) + " " + (l + 2));
            }
            else
            {
                System.out.println((l + 1) + " " + (l + 2) + " " + (l + 3));
            }
        }
        sc.close();
    }
}