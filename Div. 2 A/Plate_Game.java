import java.util.*;
public class Plate_Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = 2 * sc.nextInt();
        if(r > Math.min(a, b))
        {
            System.out.println("Second");
        }
        else
        {
            System.out.println("First");
        }
    }   
}