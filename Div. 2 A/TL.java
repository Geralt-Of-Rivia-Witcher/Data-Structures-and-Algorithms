import java.util.*;
public class TL
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList <Integer> correct = new ArrayList <Integer>();
        ArrayList <Integer> wrong = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            correct.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++)
        {
            wrong.add(sc.nextInt());
        }
        Collections.sort(correct);
        Collections.sort(wrong);
        int v = Math.max(correct.get(correct.size() - 1), 2 * correct.get(0));
        if(v >= wrong.get(0))
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(v);
        }
        sc.close();
    }
}