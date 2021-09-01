import java.util.*;
public class Sockets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        if(m <= k)
        {
            System.out.println("0");
            System.exit(0);
        }
        int count = 0;
        while(m > k)
        {
            k--;
            if(list.size() == 0)
            {
                System.out.println("-1");
                System.exit(0);
            }
            k += list.remove(0);
            count++;
        }
        System.out.println(count);
        sc.close();
    }    
}