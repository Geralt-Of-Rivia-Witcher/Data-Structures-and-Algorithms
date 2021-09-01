import java.util.*;
import java.io.*;
public class Shell_Game
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        char cup[] = new char[3];
        for(int i = 0; i < 3; i++)
        {
            if(i + 1 == n)
            {
                cup[i] = 'B';
            }
            else
            {
                cup[i] = 'X';
            }
        }
        for(int i = 0; i < 3; i++)
        {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            char temp = cup[a];
            cup[a] = cup[b];
            cup[b] = temp;
        }
        sc.close();
        File fileNew = new File("output.txt");
        fileNew.createNewFile();
        FileWriter fileOut = new FileWriter("output.txt");
        for(int i = 0; i < 3; i++)
        {
            if(cup[i] == 'B')
            {
                fileOut.write("" + (i + 1));
                fileOut.close();
                System.exit(0);
            }
        }
    }    
}
