import java.util.*;
public class DZY_Loves_Chessboard
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char board[][] = new char[n][m];
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            for(int j = 0; j < m; j++)
            {
                board[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(i % 2 == 0)
                {
                    if(board[i][j] == '.')
                    {
                        if(j % 2 == 0)
                        {
                            board[i][j] = 'B';
                        }
                        else
                        {
                            board[i][j] = 'W';
                        }
                    }
                }
                else
                {
                    if(board[i][j] == '.')
                    {
                        if(j % 2 == 0)
                        {
                            board[i][j] = 'W';
                        }
                        else
                        {
                            board[i][j] = 'B';
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }   
}