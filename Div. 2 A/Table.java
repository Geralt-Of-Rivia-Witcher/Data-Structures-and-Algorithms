import java.util.*;
public class Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[][] = new int[n][m];
        ArrayList <Integer> rows = new ArrayList <Integer>();
        ArrayList <Integer> columns = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                num[i][j] = sc.nextInt();
                if(num[i][j] == 1)
                {
                    rows.add(i+1);
                    columns.add(j+1);
                }
            }
        }
        int count = 0;
        for(int row : rows)
        {
            if(row == 1 || row == n)
            {
                count = 2;
            }
        }
        for(int column : columns)
        {
            if(column == 1 || column == m)
            {
                count = 2;
            }
        }
        if(count == 2)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("4");
        }
        sc.close();
    }
}