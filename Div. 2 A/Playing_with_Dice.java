import java.util.*;
public class Playing_with_Dice
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int win = 0, draw = 0, lose = 0;
        for(int i = 1; i <= 6; i++)
        {
            if(Math.abs(a - i) < Math.abs(b - i))
            {
                win++;
            }
            else if(Math.abs(a - i) > Math.abs(b - i))
            {
                lose++;
            }
            else
            {
                draw++;
            }
        }
        System.out.println(win + " " + draw + " " + lose);
        sc.close();
    }
}