import java.util.*;
public class Presents
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        for(int i = 1; i <= n; i++)
        {
            System.out.print((list.indexOf(i) + 1) + " ");
        }
        sc.close();
    }
}