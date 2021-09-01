import java.util.*;
public class Game_With_Sticks
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        if(a <= b)
        {
            count = a;
        }
        else
        {
            count = b;
        }
        if(count % 2 == 0)
        {
            System.out.print("Malvika");
        }
        else
        {
            System.out.print("Akshat");
        }
        sc.close();
    }
}