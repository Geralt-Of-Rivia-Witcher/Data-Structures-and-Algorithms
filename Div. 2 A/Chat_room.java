import java.util.*;
public class Chat_room
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "hello";
        int index = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == str1.charAt(index))
            {
                index++;
            }
            if(index == 5)
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.print("NO");
        sc.close();
    }   
}