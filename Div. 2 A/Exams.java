import java.util.*;
public class Exams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int sum = 2 * n;
        if(sum < k)
        {
            if(sum + n <= k)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(n - (k - sum));
            }
        }
        else if(sum > k)
        {
            if(sum - n >= k)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(n - (sum - k));
            }
        }
        else
        {
            System.out.println(n);
        }
    }
}