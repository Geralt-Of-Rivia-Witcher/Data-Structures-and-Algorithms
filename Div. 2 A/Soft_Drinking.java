import java.util.*;
public class Soft_Drinking
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int toastFromDrink = (k * l) / nl;
        int toastFromSlice = c * d;
        int toastFromSalt = p / np;
        System.out.println(Math.min(toastFromSlice, Math.min(toastFromDrink, toastFromSalt)) / n);
        sc.close();
    }   
}