import java.util.Scanner;

public class Fedor_and_New_Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String army[] = new String[m + 1];
        for(int i = 0; i <= m; i++)
        {
            army[i] = toBinary(sc.nextInt(), n);
        }
        sc.close();
        int friends = 0;
        String Fedor = army[m];
        for(int i = 0; i < army.length - 1; i++)
        {
            String person = army[i];
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(Fedor.charAt(j) != person.charAt(j))
                {
                    count++;
                }
                if(count > k)
                {
                    break;
                }
            }
            if(count <= k)
            {
                friends++;
            }
        }
        System.out.println(friends);
    }

    public static String toBinary(int n, int size)
    {
        StringBuilder sb = new StringBuilder("");
        while(n > 0)
        {
            int rem = n % 2;
            sb.append(Integer.toString(rem));
            n = n / 2;
            rem = 0;
        }
        for(int i = sb.toString().length(); i < size; i++)
        {
            sb.append("0");
        }
        return sb.toString();
    }
}