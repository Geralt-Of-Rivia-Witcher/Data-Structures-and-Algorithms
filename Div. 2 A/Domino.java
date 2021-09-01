import java.util.*;
public class Domino
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int upperSum = 0, lowerSum = 0;
        ArrayList <Integer> upper = new ArrayList <Integer>();
        ArrayList <Integer> lower = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            upperSum += x;
            lowerSum += y;
            if(x % 2 != 0 || y % 2 != 0)
            {
                upper.add(x);
                lower.add(y);
            }
        }
        if(upperSum % 2 == 0 && lowerSum % 2 == 0)
        {
            System.out.println("0");
            System.exit(0);
        }
        for(int i = 0; i < upper.size(); i++)
        {
            int tempX = upperSum;
            int tempY = lowerSum;
            tempX = tempX - upper.get(i) + lower.get(i);
            tempY = tempY - lower.get(i) + upper.get(i);
            if(tempX % 2 == 0 && tempY % 2 == 0)
            {
                System.out.println("1");
                System.exit(0);
            }
        }
        System.out.println("-1");
        sc.close();
    }   
}