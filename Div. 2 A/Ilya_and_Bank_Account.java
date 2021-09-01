import java.util.*;
public class Ilya_and_Bank_Account
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0)
        {
            String s = Integer.toString(n);
            String s1 = s.substring(0, s.length() - 1);
            String s2 = s.substring(0, s.length() - 2) + Character.toString(s.charAt(s.length() - 1));
            n = Math.max(Integer.parseInt(s1), Integer.parseInt(s2));
        }
        System.out.println(n);
        sc.close();
    }
}