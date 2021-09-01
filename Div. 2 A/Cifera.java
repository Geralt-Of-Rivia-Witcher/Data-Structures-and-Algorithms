import java.util.*;
public class Cifera
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int pow = 1;
        while(Math.pow(k, pow) <= l)
        {
            if(Math.pow(k, pow) == l)
            {
                System.out.println("YES");
                System.out.println(--pow);
                System.exit(0);
            }
            pow++;
        }
        System.out.println("NO");
        sc.close();
    }   
}