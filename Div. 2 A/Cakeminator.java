import java.util.*;
public class Cakeminator
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.nextLine();
        char num[][] = new char [r][c];
        Set <Integer> row = new HashSet<Integer>();
        Set <Integer> column = new HashSet<Integer>();
        for(int i = 0; i < r; i++)
        {
            String x = sc.next();
            for(int j = 0; j < x.length(); j++)
            {
                num[i][j] = x.charAt(j);
                if(x.charAt(j) == 'S')
                {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        int count = 0;
        for(int i = 0; i < r; i++)
        {
            if(row.contains(i))
            {
                continue;
            }
            for(int j = 0; j < c; j++)
            {
                if(num[i][j] != 'S')
                {
                    count++;
                    num[i][j] = 'S';
                }
            }
        }
        for(int j = 0; j < c; j++)
        {
            if(column.contains(j))
            {
                continue;
            }
            for(int i = 0; i < r; i++)
            {
                if(num[i][j] != 'S')
                {
                    count++;
                    num[i][j] = 'S';
                }
            }
        }
        sc.close();
        System.out.println(count);
    }   
}