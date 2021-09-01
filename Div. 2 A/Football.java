import java.util.*;
public class Football
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> map = new HashMap <String, Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            if(map.containsKey(s))
            {
                int x = map.get(s);
                map.replace(s, x+1);
            }
            else
            {
                map.put(s, 1);
            }
        }
        int max = 0;
        String ans = "";
        for(String s : map.keySet())
        {
            if(map.get(s) > max)
            {
                max = map.get(s);
                ans = s;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}