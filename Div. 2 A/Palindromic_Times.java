import java.util.*;
public class Palindromic_Times
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int hour = Integer.parseInt(s.substring(0, 2));
        int min = Integer.parseInt(s.substring(3, 5));
        do
        {
            min++;
            if(min == 60)
            {
                min = 0;
                hour++;
            }
            if(hour == 24)
            {
                hour = 0;
            }
        }
        while(hour % 10 * 10 + hour / 10 != min);
        System.out.printf("%02d:%02d", hour, min);
        sc.close();
    }
}