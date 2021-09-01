import java.util.*;
public class Fox_and_Number_Game
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        while(list.get(0) != list.get(list.size() - 1))
        {
            int last = list.size() - 2;
            while(list.get(list.size() - 1) == list.get(last))
            {
                last--;
            }
            ArrayList <Integer> second = new ArrayList <Integer>(list);
            int temp = list.get(list.size() - 1) - list.get(last);
            list.remove(list.size() - 1);
            list.add(temp);
            Collections.sort(list);
            if(second == list)
            {
                break;
            }
            
        }
        int sum = 0;
        for(int x : list)
        {
            sum += x;
        }
        System.out.println(sum);
        sc.close();
    }   
}