import java.util.*;
public class Nineteen 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        HashMap <Character, Integer> map = new HashMap <Character, Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        if(! map.containsKey('n') || ! map.containsKey('i') || ! map.containsKey('e') || ! map.containsKey('t'))
        {
            System.out.println("0");
            System.exit(0);
        }
        int n = map.get('n') / 3;
        int i = map.get('i');
        int e = map.get('e') / 3;
        int t = map.get('t');
        if(n > 1)
        {
            n = 1;
            map.put('n', map.get('n') - 3);
            while(map.get('n') > 1)
            {
                if(map.get('n') >= 2)
                {
                    n++;
                    map.put('n', map.get('n') - 2);
                }
            }
        }
        if(n == 1)
        {
            n = ((map.get('n') - 3) / 2);
            n++;
        }
        int count = Math.min(n, Math.min(i, Math.min(e, t)));
        System.out.println(count);
    }    
}
