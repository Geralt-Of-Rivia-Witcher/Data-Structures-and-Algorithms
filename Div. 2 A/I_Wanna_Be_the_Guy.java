import java.util.*;
public class I_Wanna_Be_the_Guy
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set <Integer> set = new HashSet<Integer>();
        for(int i = 1; i <= n; i++)
        {
            set.add(i);
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            int level = sc.nextInt();
            if(set.contains(level))
            {
                set.remove(level);
            }
        }
        m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            int level = sc.nextInt();
            if(set.contains(level))
            {
                set.remove(level);
            }
        }
        if(set.isEmpty())
        {
            System.out.println("I become the guy.");
        }
        else
        {
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }   
}