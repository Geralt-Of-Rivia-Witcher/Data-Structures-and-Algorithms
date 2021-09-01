import java.util.Scanner;
public class Watermelon
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w <= 2)
        {
            System.out.println("NO");
            System.exit(0);
        }
        int x = w-2;
        if(x % 2 == 0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}