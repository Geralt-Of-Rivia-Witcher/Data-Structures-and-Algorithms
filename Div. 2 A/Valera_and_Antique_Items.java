import java.util.*;
import java.util.Set;
public class Valera_and_Antique_Items
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        Set <Integer> set = new HashSet <Integer>();
        for(int i = 1; i <= n; i++)
        {
            int num = sc.nextInt();
            for(int j = 0; j < num; j++)
            {
                if(v > sc.nextInt())
                {
                    set.add(i);
                }
            }
        }
        System.out.println(set.size());
        ArrayList <Integer> list = new ArrayList <Integer>(set);
        Collections.sort(list);
        for(int i : list)
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}