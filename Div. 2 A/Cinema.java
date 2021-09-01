import java.util.*;
public class Cinema
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int num[][] = new int[n][m];
        out: for(int i = 0; i < k; i++)
        {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if(num[a][b] == 0)
            {
                num[a][b]++;
                System.out.println((a + 1) + " " + (b + 1));
            }
            else
            {
                int change = 1;
                while(true)
                {
                    System.out.println("change = " + change);
                    System.out.println("a = " + a + "b = " + b);
                    if(a - change >= 0 && num[a - change][b] == 0)
                    {
                        num[a - change][b]++;
                        System.out.println((a - change + 1) + " " + (b + 1));
                        continue out;
                    }
                    else if(b - change >= 0 && num[a][b - change] == 0)
                    {
                        num[a][b - change]++;
                        System.out.println((a + 1) + " " + (b - change + 1));
                        continue out;
                    }
                    else if(b + change < m && num[a][b + change] == 0)
                    {
                        num[a][b + change]++;
                        System.out.println((a + 1) + " " + (b + change + 1));
                        continue out;
                    }
                    else if(a + change < n && num[a + change][b] == 0)
                    {
                        num[a + change][b]++;
                        System.out.println((a + change + 1) + " " + (b + 1));
                        continue out;
                    }
                    else if(a - change >= 0 && b - 1 >= 0 && num[a - change][b - 1] == 0)
                    {
                        num[a - change][b - 1]++;
                        System.out.println((a - change + 1) + " " + (b - 1 + 1));
                        continue out;
                    }
                    else if(a - change >= 0 && b + 1 < m && num[a - change][b + 1] == 0)
                    {
                        num[a - change][b + 1]++;
                        System.out.println((a - change + 1) + " " + (b + 1 + 1));
                        continue out;
                    }
                    else if(a + change < n && b - 1 >= 0 && num[a + change][b - 1] == 0)
                    {
                        num[a + change][b - 1]++;
                        System.out.println((a + change + 1) + " " + (b - 1 + 1));
                        continue out;
                    }
                    else if(a + change < n && b + 1 < m && num[a + change][b + 1] == 0)
                    {
                        num[a + change][b + change]++;
                        System.out.println((a + change + 1) + " " + (b + 1 + 1));
                        continue out;
                    }
                    change++;
                    if(change == 3)
                    {
                        System.exit(0);
                    }
                }
            }
        }
        sc.close();
    }
}