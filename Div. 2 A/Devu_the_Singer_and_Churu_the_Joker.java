import java.util.*;
public class Devu_the_Singer_and_Churu_the_Joker
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int totalTime = 0, songTime = 0;
        for(int i = 0; i < n; i++)
        {
            int t = sc.nextInt();
            totalTime += t + 10;
            songTime += t;
        }
        if((totalTime - 10) > d)
        {
            System.out.println(-1);
        }
        else
        {
            if((d - songTime) % 5 == 0)
            {
                System.out.println((d - songTime) / 5);
            }
            else
            {
                songTime += ((d - songTime) % 5);
                System.out.println((d - songTime) / 5);
            }
        }
        sc.close();
    }
}