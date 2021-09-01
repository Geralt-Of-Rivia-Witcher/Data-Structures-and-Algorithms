import java.util.*;
public class Card_Game
{
    public static void main(String[] args)
    {
        ArrayList <Character> list = new ArrayList <Character>();
        list.add('6');
        list.add('7');
        list.add('8');
        list.add('9');
        list.add('T');
        list.add('J');
        list.add('Q');
        list.add('K');
        list.add('A');
        Scanner sc = new Scanner(System.in);
        char tramp = sc.nextLine().charAt(0);
        String s = sc.nextLine();
        String first = s.substring(0, 2);
        String second = s.substring(3, 5);
        if(first.charAt(1) == second.charAt(1))
        {
            if(list.indexOf(first.charAt(0)) > list.indexOf(second.charAt(0)))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else if(first.charAt(1) == tramp)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }   
}