import java.util.*;
public class Bar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> drinks = new ArrayList <String>();
        drinks.add("ABSINTH");
        drinks.add("BEER");
        drinks.add("BRANDY");
        drinks.add("CHAMPAGNE");
        drinks.add("GIN");
        drinks.add("RUM");
        drinks.add("SAKE");
        drinks.add("TEQUILA");
        drinks.add("VODKA");
        drinks.add("WHISKEY");
        drinks.add("WINE");
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            try
            {
                int age = Integer.parseInt(s);
                if(age < 18)
                {
                    count++;
                }
            }
            catch (Exception e)
            {
                if(drinks.indexOf(s) != -1)
                {
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
}