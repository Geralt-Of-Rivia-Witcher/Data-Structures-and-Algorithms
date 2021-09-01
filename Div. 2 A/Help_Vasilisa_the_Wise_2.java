import java.util.*;
public class Help_Vasilisa_the_Wise_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        Set <Integer> set = new HashSet<Integer>();
        for(int a = 1; a <= 40; a++)
        {
            for(int b = 1; b <= 40; b++)
            {
                if(a + b == r1)
                {
                    int c = c1 - a;
                    int d = d1 - a;
                    if(c + d == r2 && b + d == c2 && b + c == d2)
                    {
                        set.add(a);
                        set.add(b);
                        set.add(c);
                        set.add(d);
                        if(set.size() == 4)
                        {
                            System.out.println(a + " " + b);
                            System.out.println(c + " " + d);
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("-1");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("-1");
        sc.close();
    }   
}