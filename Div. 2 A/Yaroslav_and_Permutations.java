import java.util.*;
public class Yaroslav_and_Permutations
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            if(map.containsKey(x))
            {
                map.put(x, map.get(x) + 1);
            }
            else
            {
                map.put(x, 1);
            }
        }
        int maxValue = 0;
        for(int x : map.keySet())
        {
            if(map.get(x) > maxValue)
            {
                maxValue = map.get(x);
            }
        }
        if(n % 2 == 0)
        {
            if(maxValue > n/2)
            {
                System.out.println("NO");
            }
            else    
            {
                System.out.println("YES");
            }
        }
        else
        {
            if(maxValue > (n/2 + 1))
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}