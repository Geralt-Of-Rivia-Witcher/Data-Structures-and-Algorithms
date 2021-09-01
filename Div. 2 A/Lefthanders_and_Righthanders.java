import java.util.*;
import java.io.*;
public class Lefthanders_and_Righthanders
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char list[] = new char[n];
        for(int i = 0; i < s.length(); i++)
        {
            list[i] = s.charAt(i);
        }
        File fileNew = new File("output.txt");
        fileNew.createNewFile();
        FileWriter fileOut = new FileWriter("output.txt");
        int j = n/2;
        for(int i = 0; i < n/2; i++)
        {
            if(list[i] == 'L' && list[j] == 'R')
            {
                fileOut.write((i + 1) + " " + (j + 1) + "\n");
            }
            else
            {
                fileOut.write((j + 1) + " " + (i + 1) + "\n");
            }
            j++;
        }
        fileOut.close();
        sc.close();
    }
}