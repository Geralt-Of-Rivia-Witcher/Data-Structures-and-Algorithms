import java.util.*;
public class Greg_Workout
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0, biceps = 0, back = 0;
        for(int i = 1; i <= n; i++)
        {
            if((i + 2) % 3 == 0)
            {
                chest += sc.nextInt();
            }
            else if((i + 1) % 3 == 0)
            {
                biceps += sc.nextInt();
            }
            else
            {
                back += sc.nextInt();
            }
        }
        if(chest > biceps && chest > back)
        {
            System.out.println("chest");
        }
        else if(biceps > chest && biceps > back)
        {
            System.out.println("biceps");
        }
        else
        {
            System.out.println("back");
        }
        sc.close();
    }   
}