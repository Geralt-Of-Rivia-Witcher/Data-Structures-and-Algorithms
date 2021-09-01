import java.util.*;
public class Reconnaissance_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        int diff = Integer.MAX_VALUE;
        int p = 0, q = 0;
        for(int i = 0; i < n; i++)
        {
            int temp = 0;
            if(i + 1 == n)
            {
                temp = Math.abs(list.get(i) - list.get(0));
            }
            else
            {
                temp = Math.abs(list.get(i) - list.get(i + 1));
            }
            if(temp < diff)
            {
                diff = temp;
                p = i + 1;
                if(i + 1 == n)
                {
                    q = 1;
                }
                else
                {
                    q = i + 2;
                }
            }
        }
        System.out.println(p + " " + q);
        sc.close();
    }
}