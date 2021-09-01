import java.util.*;
public class Worms_Evolution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList <Integer> ();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        sc.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    int sum = list.get(i) + list.get(j);
                    int index = list.indexOf(sum);
                    if(index != -1 && index != i && index != j)
                    {
                        System.out.println((index + 1) + " " + (i + 1) + " " + (j + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("-1");
    }    
}