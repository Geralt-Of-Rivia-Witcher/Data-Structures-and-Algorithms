import java.util.*;
public class Next_Test
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
        sc.close();
        Collections.sort(list);
        for(int i = 1; i <= n + 1; i++)
        {
            if(! list.contains(i))
            {
                System.out.println(i);
                System.exit(0);
            }
        }
    }   
}