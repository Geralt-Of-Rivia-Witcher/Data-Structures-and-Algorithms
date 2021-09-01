import java.util.*;
public class Life_Without_Zeros
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int ans = Integer.parseInt(a) + Integer.parseInt(b);
        String c = Integer.toString(ans);
        int beginIndex = 0;
        int endIndex = a.indexOf('0');
        while(endIndex != -1)
        {
            a = a.substring(beginIndex, endIndex) + a.substring(endIndex + 1);
            endIndex = a.indexOf('0');
        }
        endIndex = b.indexOf('0');
        while(endIndex != -1)
        {
            b = b.substring(beginIndex, endIndex) + b.substring(endIndex + 1);
            endIndex = b.indexOf('0');
        }
        endIndex = c.indexOf('0');
        while(endIndex != -1)
        {
            c = c.substring(beginIndex, endIndex) + c.substring(endIndex + 1);
            endIndex = c.indexOf('0');
        }
        if(Integer.parseInt(a) + Integer.parseInt(b) == Integer.parseInt(c))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }   
}