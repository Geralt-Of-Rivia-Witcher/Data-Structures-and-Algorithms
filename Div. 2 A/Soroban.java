import java.util.*;
public class Soroban
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for(int i = n.length() - 1; i >= 0; i--)
        {
            int x = Integer.parseInt(Character.toString(n.charAt(i)));
            if(x >= 5)
            {
                System.out.print("-O|");
                x -= 5;
            }
            else
            {
                System.out.print("O-|");
            }
            int count = 4;
            while(x-- > 0)
            {
                System.out.print("O");
                count--;
            }
            System.out.print("-");
            while(count-- > 0)
            {
                System.out.print("O");
            }
            System.out.println();
        }
        sc.close();
    }
}