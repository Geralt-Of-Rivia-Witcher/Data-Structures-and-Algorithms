import java.util.*;
public class Sleuth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().replace("?", "");
        sc.close();
        while(s.indexOf(" ") != -1)
        {
            s = s.replace(" ", "");
        }
        s = s.toLowerCase();
        char c = s.charAt(s.length() - 1);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}