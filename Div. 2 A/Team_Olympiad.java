import java.util.*;
public class Team_Olympiad
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap <Integer, ArrayList <Integer>> map = new HashMap <Integer, ArrayList <Integer>>();
        ArrayList <Integer> list;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            list = new ArrayList <Integer>();
            int x = sc.nextInt();
            if(map.containsKey(x))
            {
                list = map.get(x);
                list.add(i);
                map.put(x, list);
            }
            else
            {
                list.add(i);
                map.put(x, list);
            }
        }
        if(! map.containsKey(1) || ! map.containsKey(2) || ! map.containsKey(3))
        {
            System.out.println(0);
            System.exit(0);
        }
        n = Math.min(map.get(1).size(), Math.min(map.get(2).size(), map.get(3).size()));
        System.out.println(n);
        for(int i = 0; i < n; i++)
        {
            System.out.println(((map.get(1).get(i)) + 1) + " " + ((map.get(2).get(i)) + 1) + " " + ((map.get(3).get(i)) + 1));
        }
        sc.close();
    }   
}