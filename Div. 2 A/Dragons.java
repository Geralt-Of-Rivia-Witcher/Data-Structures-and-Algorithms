import java.util.*;
public class Dragons
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        HashMap <Integer, ArrayList <Integer>> map = new HashMap <Integer, ArrayList <Integer>>();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            if(map.containsKey(x))
            {
                ArrayList <Integer> list = new ArrayList <Integer>();
                list = map.get(x);
                list.add(sc.nextInt());
                map.put(x, list);
            }
            else
            {
                queue.add(x);
                ArrayList <Integer> list = new ArrayList <Integer>();
                list.add(sc.nextInt());
                map.put(x, list);
            }
        }
        //System.out.println(map);
        ArrayList <Integer> list;
        while(map.size() > 0)
        {
            //System.out.println(map);
            int x = queue.peek();
            list = new ArrayList <Integer> ();
            if(s > x)
            {
                list = map.get(x);
                if(list.size() == 0)
                {
                    map.remove(x);
                    queue.remove();
                }
                else
                {
                    s += list.remove(0);
                    map.put(x, list);
                }
                
            }
            else
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
        sc.close();
    }   
}