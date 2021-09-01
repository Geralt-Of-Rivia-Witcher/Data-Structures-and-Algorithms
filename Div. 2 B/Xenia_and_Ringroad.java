import java.util.Scanner;
import java.math.BigInteger;

public class Xenia_and_Ringroad
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tasks[] = new int[m];
        for(int i = 0; i < m; i++)
        {
            tasks[i] = sc.nextInt();
        }
        int currentPosition = 1;
        BigInteger time = new BigInteger("0");
        for(int task : tasks)
        {
            if(currentPosition > task)
            {
                int x = (n - currentPosition) + (task);
                time = time.add(BigInteger.valueOf(x));
                currentPosition = task;
            }
            else
            {
                int x = (task - currentPosition);
                time = time.add(BigInteger.valueOf(x));
                currentPosition = task;
            }
        }
        System.out.println(time);
        sc.close();
    }
}