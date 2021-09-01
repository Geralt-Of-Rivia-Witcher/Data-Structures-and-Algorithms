//incomplete


import java.util.*;
public class Strange_Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0, d = 0, temp = 0, zero = 0;
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            if(num == 0 && a == 0)
            {
                list.add(num);
                a++;
                zero++;
                continue;
            }
            else if(num > 0 && num < 10 && b == 0)
            {
                list.add(num);
                b++;
                continue;
            }
            else if(num != 100 && num % 10 == 0 && c == 0)
            {
                list.add(num);
                c++;
                zero++;
                continue;
            }
            else if(num == 100 && d == 0)
            {
                list.add(num);
                d++;
                continue;
            }
            temp = num;
        }
        if((c == 0 && temp > 10 && zero != 0) || list.size() == 0)
        {
            list.add(temp);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int x : list)
        {
            System.out.print(x + " ");
        }
        sc.close();
    }
}