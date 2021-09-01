import java.util.*;
public class Helpful_Maths
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList <Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i = i + 2)
        {
            num.add(Integer.parseInt(Character.toString(s.charAt(i))));
        }
        Collections.sort(num);
        for(int i = 0; i < num.size(); i++)
        {
            if(i == num.size()-1)
            {
                System.out.print(num.get(i));
            }
            else
            {
                System.out.print(num.get(i)+"+");
            }
        }
        sc.close();
    }
}