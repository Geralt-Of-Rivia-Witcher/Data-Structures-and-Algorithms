import java.util.*;
public class Marks
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int marks[][] = new int[n][m];
        int maxMarks[] = new int[m];
        Set <Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            for(int j = 0; j < m; j++)
            {
                marks[i][j] = Character.getNumericValue(s.charAt(j));
                if(marks[i][j] > maxMarks[j])
                {
                    maxMarks[j] = marks[i][j];
                }
            }
        }
        for(int j = 0; j < m; j++)
        {
            for(int i = 0; i < n; i++)
            {
                if(maxMarks[j] == marks[i][j])
                {
                    set.add(i);
                }
            }
        }
        System.out.println(set.size());
        sc.close();
    }   
}