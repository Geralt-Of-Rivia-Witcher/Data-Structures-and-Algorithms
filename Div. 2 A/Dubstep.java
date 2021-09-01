import java.util.*;
public class Dubstep
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");
        int check = 0;
        int index = str.indexOf("WUB");
        if(index == -1)
        {
            sb.append(str);
        }
        while(index != -1)
        {
            if(check == index)
            {
                check += 3;
                index = str.indexOf("WUB", index + 1);
                if(index == -1)
                {
                    sb.append(str.substring(check, str.length()));
                }
            }
            else
            {
                sb.append(str.substring(check, index) + " ");
                check = index + 3;
                index = str.indexOf("WUB", index + 1);
                if(index == -1)
                {
                    sb.append(str.substring(check, str.length()));
                }
            }
        }
        sc.close();
        System.out.print(sb.toString());
    }
}