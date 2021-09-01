import java.util.*;
public class Twins
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, count = 0, sum1 = 0;
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
            sum += list.get(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = 0; i < n; i++)
        {
            sum -= list.get(i);
            sum1 += list.get(i);
            count++;
            if(sum1 > sum)
            {
                break;
            }
        }
        System.out.print(count);
        sc.close();
    }
}