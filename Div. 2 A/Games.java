import java.util.*;
public class Games
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int first[] = new int[n];
        int second[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            first[i] = sc.nextInt();
            second[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            int num = first[i];
            for(int j = 0; j < n; j++)
            {
                if(num == second[j])
                {
                    count++;
                }
            }
        }
        System.out.print(count);
        sc.close();
    }   
}