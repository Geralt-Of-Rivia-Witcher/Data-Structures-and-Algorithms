import java.util.*;
public class On_Segment_s_Own_Points
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[][] = new int[n][2];
        int rope[] = new int[100];
        for(int i = 0; i < n; i++)
        {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            for(int j = input[i][0]; j < input[i][1]; j++)
            {
                rope[j]++;
            }
        }
        sc.close();
        int count = 0;
        for(int j = input[0][0]; j < input[0][1]; j++)
        {
            if(rope[j] == 1)
            {
                count++;
            }
        }
        System.out.println(count);
    }   
}