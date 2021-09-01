import java.util.*;
public class Queue_at_the_School
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char series[] = new char[n];
        String s = sc.next();
        sc.close();
        for(int i = 0; i < n; i++)
        {
            series[i] = s.charAt(i);
        }
        for(int j = 0; j < t; j++)
        {
            for(int i = 0; i < n - 1; i++)
            {
                if(series[i] == 'B' && series[i + 1] == 'G')
                {
                    series[i] = 'G';
                    series[i + 1] = 'B';
                    i++;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(series[i]);
        }
    }
}