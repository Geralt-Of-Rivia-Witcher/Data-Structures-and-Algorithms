import java.util.*;
public class Snow_Footprints
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, t = 0, flag = 0;
        sc.nextLine();
        char path[] = new char[n];
        String s1 = sc.next();
        for(int i = 0; i < n; i++)
        {
            path[i] = s1.charAt(i);
        }
        for(int i = 0; i < n; i++)
        {
            if(path[i] == 'R' && flag == 0)
            {
                s = i;
                t = i;
                flag++;
            }
            else if(path[i] == 'R' && path[i + 1] == '.')
            {
                t = i + 1;
                break;
            }
            else if(path[i] == 'R' && path[i + 1] == 'L')
            {
                t = i;
            }
            else if(path[i] == 'L' && flag == 0)
            {
                s = i;
                t = i - 1;
                flag++;
            }
            else if(path[i] == 'L' && path[i + 1] == '.')
            {
                t = i - 1;
                break;
            }
            else if(path[i] == 'L' && path[i + 1] == 'R')
            {
                t = i;
            }
        }
        System.out.println((s + 1) + " " + (t + 1));
        sc.close();
    }
}