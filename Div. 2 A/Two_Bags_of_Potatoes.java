import java.util.*;
public class Two_Bags_of_Potatoes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int flag = 0;
        for(int i = 1; i <= 100000; i++)
        {
            int x = i * k;
            if(x > y && x <= n)
            {
                System.out.print((x - y) + " ");
                flag++;
            }
            if(x > n)
            {
                break;
            }
        }
        if(flag == 0 || y == n)
        {
            System.out.println("-1");
        }
        sc.close();
    }
}