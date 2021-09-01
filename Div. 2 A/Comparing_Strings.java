import java.util.*;
public class Comparing_Strings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length() != s2.length())
        {
            System.out.println("NO");
            System.exit(0);
        }
        Set <Character> set1 = new HashSet<Character>();
        Set <Character> set2 = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++)
        {
            set1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++)
        {
            set2.add(s2.charAt(i));
        }
        if(set1.size() != set2.size())
        {
            System.out.println("NO");
        }
        else
        {
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();
            int count = 0;
            for(int i = 0; i < s1.length(); i++)
            {
                if(c1[i] != c2[i])
                {
                    count++;
                }
            }
            if(count > 2)
            {
                System.out.println("NO");
                System.exit(0);
            }
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i = 0; i < s1.length(); i++)
            {
                if(c1[i] != c2[i])
                {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            System.out.println("YES");
        }
        sc.close();
    }
}