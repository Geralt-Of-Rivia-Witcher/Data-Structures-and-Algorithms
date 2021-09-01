import java.util.*;
public class Valera_and_X
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char square[][] = new char[n][n];
        Set <Character> set = new HashSet <Character>();
        for(int i = 0; i < n; i++)
        {
            String temp = sc.next();
            for(int j = 0; j < n; j++)
            {
                square[i][j] = temp.charAt(j);
                set.add(temp.charAt(j));
            }
        }
        if(set.size() == 1)
        {
            System.out.println("NO");
            System.exit(0);
        }
        boolean first = first(square, n);
        boolean second = second(square, n);
        if(first || second)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }


    public static boolean first(char square[][], int n)
    {
        char c = square[0][0];
        char ch = square[0][1];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j || n - i == j + 1)
                {
                    if(square[i][j] == c)
                    {
                        continue;
                    }
                    return false;
                }
                else
                {
                    if(square[i][j] == ch)
                    {
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean second(char square[][], int n)
    {
        char c = square[0][1];
        if(c == square[0][0])
        {
            return false;
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if(i != j || n - i != j + 1)
                    {
                        if(square[i][j] == c)
                        {
                            continue;
                        }
                        return false;
                    }
                }
            }
            return true;
        }
    }
}