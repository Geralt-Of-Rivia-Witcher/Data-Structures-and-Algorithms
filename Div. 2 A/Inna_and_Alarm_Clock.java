import java.util.*;
public class Inna_and_Alarm_Clock
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> horizontal = new ArrayList <Integer>();
        ArrayList <Integer> vertical = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(! vertical.contains(x))
            {
                vertical.add(x);
            }
            if(! horizontal.contains(y))
            {
                horizontal.add(y);
            }
        }
        sc.close();
        System.out.println(Math.min(horizontal.size(), vertical.size()));
    }
}