import java.util.*;
public class String_Task
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i')
            {
                continue;
            }
            else
            {
                sb.append(".");
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }    
}
