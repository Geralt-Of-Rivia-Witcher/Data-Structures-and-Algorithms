import java.util.*;
public class Guess_a_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int min = -2000000000;
        int max = 2000000000;
        for(int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            char c = s.charAt(s.length() - 1);
            if(c == 'Y')
            {
                int start = s.indexOf(" ");
                int end = s.indexOf(" ", start + 1);
                int n1 = Integer.valueOf(s.substring(start + 1, end));
                String s1 = s.substring(0, start);
                if(s1.equals("<"))
                {
                    max = Math.min(max, n1 - 1);
                }
                else if(s1.equals("<="))
                {
                    max = Math.min(max, n1);
                }
                else if(s1.equals(">"))
                {
                    min = Math.max(min, n1 + 1);
                }
                else if(s1.equals(">="))
                {
                    min = Math.max(min, n1);
                }
            }
            else
            {
                int start = s.indexOf(" ");
                int end = s.indexOf(" ", start + 1);
                int n1 = Integer.valueOf(s.substring(start + 1, end));
                String s1 = s.substring(0, start);
                if(s1.equals("<"))
                {
                    min = Math.max(min, n1);
                }
                else if(s1.equals("<="))
                {
                    min = Math.max(min, n1 + 1);
                }
                else if(s1.equals(">"))
                {
                    max = Math.min(max, n1);
                }
                else if(s1.equals(">="))
                {
                    max = Math.min(max, n1 - 1);
                }
            }
        }
        if(min > max)
        {
            System.out.println("Impossible");
        }
        else if(min == max)
        {
            System.out.println(min);
        }
        else
        {
            System.out.println(min + 1);
        }
        sc.close();
    }
}