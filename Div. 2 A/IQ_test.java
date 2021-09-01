import java.util.*;
public class IQ_test
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            if(x % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            list.add(x);
        }
        if(even > odd)
        {
            for(int i = 0; i < list.size(); i++)
            {
                if(list.get(i) % 2 != 0)
                {
                    System.out.println(i + 1);
                    System.exit(0);
                }
            }
        }
        else
        {
            for(int i = 0; i < list.size(); i++)
            {
                if(list.get(i) % 2 == 0)
                {
                    System.out.println(i + 1);
                    System.exit(0);
                }
            }
        }
        sc.close();
    }   
}