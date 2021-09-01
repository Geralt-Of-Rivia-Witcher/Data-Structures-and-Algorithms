import java.util.*;
public class Contest
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int Misha = Math.max(3 * a / 10, a - (a * c / 250));
        int Vasya = Math.max(3 * b / 10, b - (b * d / 250));
        if(Misha > Vasya)
        {
            System.out.println("Misha");
        }
        else if(Misha < Vasya)
        {
            System.out.println("Vasya");
        }
        else
        {
            System.out.println("Tie");
        }
        sc.close();
    }   
}