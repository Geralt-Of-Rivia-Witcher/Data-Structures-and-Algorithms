import java.util.*;
public class Giga_Tower 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long bac = a + 1, up = 1;
        while(true)
        {
            if(check(Math.abs(bac)))
            {
                break;
            }
            else
            {
                up++;
                bac++;
            }
        }
        System.out.println(up);
        sc.close();
    }   

    public static boolean check(long n)
    {
        while(n > 0)
        {
            long temp = n % 10;
            if(temp == 8)
            {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}