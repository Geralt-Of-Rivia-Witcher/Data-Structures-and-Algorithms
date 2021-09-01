import java.util.*;
public class Colorful_Stones
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int index = 0;
        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if(s.charAt(index) == c)
            {
                index++;
            }
        }
        System.out.println(++index);
        sc.close();
    }
}   
