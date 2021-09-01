import java.util.*;
public class Way_Too_Long_Words
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
        {
            StringBuilder sb = new StringBuilder("");
            String s = sc.next();
            if(s.length() > 10)
            {
                sb.append(s.charAt(0));
                sb.append(Integer.toString(s.length()-2));
                sb.append(s.charAt(s.length()-1));
                System.out.println(sb.toString());
            }
            else
            {
                System.out.println(s);
            }
        }
        sc.close();
    } 
}