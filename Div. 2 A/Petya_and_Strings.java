import java.util.*;
public class Petya_and_Strings
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        for(int i = 0; i < s1.length(); i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 == c2)
            {
                continue;
            }
            else
            {
                if(c1 < c2)
                {
                    System.out.print("-1");
                    System.exit(0);
                }
                else
                {
                    System.out.print("1");
                    System.exit(0);
                }
            }
        }
        System.out.print("0");
        sc.close();
    }   
}