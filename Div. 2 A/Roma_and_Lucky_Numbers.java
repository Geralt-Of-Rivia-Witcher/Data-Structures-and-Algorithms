import java.util.*;
public class Roma_and_Lucky_Numbers
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        for(int i = 0; i < n; i++)
        {
            int temp = list.get(i);
            int count = 0;
            while(temp > 0)
            {
                int x = temp % 10;
                if(x == 4 || x == 7)
                {
                    count++;
                }
                temp = temp / 10;
            }
            if(count <= k)
            {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}