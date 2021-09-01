import java.util.*;
public class The_Child_and_Homework
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(a.length()-2);
        list.add(b.length()-2);
        list.add(c.length()-2);
        list.add(d.length()-2);
        Collections.sort(list);
        if(list.get(0) * 2 <= list.get(1) && list.get(list.size() - 1) / 2 >= list.get(list.size() - 2))
        {
            System.out.println("C");
        }
        else if(list.get(0) * 2 <= list.get(1))
        {
            if(list.get(0) == a.length() - 2)
            {
                System.out.println("A");
            }
            else if(list.get(0) == b.length() - 2)
            {
                System.out.println("B");
            }
            else if(list.get(0) == c.length() - 2)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("D");
            }
        }
        else if(list.get(list.size() - 1) / 2 >= list.get(list.size() - 2))
        {
            if(list.get(list.size() - 1) == a.length() - 2)
            {
                System.out.println("A");
            }
            else if(list.get(list.size() - 1) == b.length() - 2)
            {
                System.out.println("B");
            }
            else if(list.get(list.size() - 1) == c.length() - 2)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("D");
            }
        }
        else
        {
            System.out.println("C");
        }
        sc.close();
    }   
}