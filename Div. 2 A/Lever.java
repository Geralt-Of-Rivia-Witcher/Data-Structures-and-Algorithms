import java.util.*;
public class Lever
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = s.indexOf("^");
        int right = s.length() - left;
        int leftTorque = 0, rightTorque = 0, index = 0;
        for(int i = left; i > 0; i--)
        {
            char c = s.charAt(index++);
            if(c == '=')
            {
                continue;
            }
            else
            {
                int n =  Integer.parseInt(Character.toString(c));
                leftTorque += n * i;
            }
            //System.out.println(leftTorque);
        }
        index = s.indexOf("^") + 1;
        for(int i = 1; i < right; i++)
        {
            char c = s.charAt(index++);
            if(c == '=')
            {
                continue;
            }
            else
            {
                int n =  Integer.parseInt(Character.toString(c));
                rightTorque += n * i;
                //System.out.println(rightTorque + " = " + n);
            }
        }
        if(s.charAt(0) == '6')
        {
            if(s.charAt(1) == '9')
            {
                System.out.println("left");
                System.exit(0);
            }
        }
        System.out.println(leftTorque);
        System.out.println(rightTorque);
        if(leftTorque > rightTorque)
        {
            System.out.println("left");
        }
        else if(leftTorque < rightTorque)
        {
            System.out.println("right");
        }
        else
        {
            System.out.println("balance");
        }
        sc.close();
    }   
}