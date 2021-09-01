import java.util.*;
public class Watching_a_movie
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int pos = 1;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            int l = sc.nextInt();
            while((pos + x) <= l)
            {
                pos += x;
            }
            int r = sc.nextInt();
            count += (r - pos + 1);
            pos = r + 1;
        }
        System.out.println(count);
        sc.close();
    }
}