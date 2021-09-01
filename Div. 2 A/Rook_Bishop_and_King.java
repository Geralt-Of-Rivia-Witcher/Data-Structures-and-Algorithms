import java.util.*;
public class Rook_Bishop_and_King
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();

        //build board
        char num[][] = new char[8][8];
        int flag = 0;
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                if(flag % 2 == 0)
                {
                    num[i][j] = 'W';
                }
                else
                {
                    num[i][j] = 'B';
                }
                flag++;
            }
            flag--;
        }
        
        //rook
        if(r1 == r2 || c1 == c2)
        {
            System.out.print("1 ");
        }
        else
        {
            System.out.print("2 ");
        }

        //bishop
        if(Math.abs(r1 - r2) == Math.abs(c1 - c2))
        {
            System.out.print("1 ");
        }
        else if(num[r1 - 1][c1 - 1] == num[r2 - 1][c2 - 1])
        {
            System.out.print("2 ");
        }
        else
        {
            System.out.print("0 ");
        }

        //king
        System.out.println(Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2)));
    }   
}