import java.util.*;
public class Parallelepiped
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        Collections.sort(list);
        for(int a = 1; a < 1000000; a++)
        {
            for(int b = 1; b < 1000000; b++)
            {
                if(a * b == list.get(0))
                {
                    int c = (list.get(0) + list.get(1) + list.get(2) - (a * b)) / (a + b);
                    if(a * b == list.get(0) && b * c == list.get(1) && a * c == list.get(2))
                    {
                        System.out.println(4*a + 4*b + 4*c);
                        System.exit(0);
                    }
                }
            }
        }
        sc.close();
    }   
}