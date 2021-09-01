import java.util.*;
public class Line_to_Cashier
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> people = new ArrayList <Integer>();
        ArrayList <Integer> time = new ArrayList <Integer>();
        for(int i = 1; i <= n; i++)
        {
            people.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++)
        {
            int timeTaken = 0;
            for(int j = 0; j < people.get(i); j++)
            {
                timeTaken += sc.nextInt() * 5;
                timeTaken += 15;
            }
            time.add(timeTaken);
        }
        int min = Integer.MAX_VALUE;
        for(int t : time)
        {
            if(t < min)
            {
                min = t;
            }
        }
        System.out.println(min);
        sc.close();
    }   
}