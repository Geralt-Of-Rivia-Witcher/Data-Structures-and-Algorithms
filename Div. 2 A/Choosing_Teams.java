import java.util.*;
public class Choosing_Teams
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt() + k;
            if(x <= 5)
            {
                list.add(x);
            }
        }
        System.out.println(list.size() / 3);
        sc.close();
    }   
}