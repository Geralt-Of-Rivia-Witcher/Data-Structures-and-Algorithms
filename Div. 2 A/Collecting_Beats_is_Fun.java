import java.util.*;
public class Collecting_Beats_is_Fun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        for(int i = 0; i < 4; i++)
        {
            String s = sc.next();
            for(int j = 0; j < 4; j++)
            {
                if(s.charAt(j) == '.')
                {
                    continue;
                }
                else
                {
                    int x = Integer.parseInt(Character.toString(s.charAt(j)));
                    if(map.containsKey(x))
                    {
                        map.put(x, map.get(x) + 1);
                    }
                    else
                    {
                        map.put(x, 1);
                    }
                }
            }
        }
        for(int n : map.keySet())
        {
            if(map.get(n) > 2 * k)
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
        sc.close();
    }
}