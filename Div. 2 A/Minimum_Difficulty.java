import java.util.*;
public class Minimum_Difficulty
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        ArrayList <Integer> newList;
        int finalDifficulty = Integer.MAX_VALUE;
        for(int i = 1; i < n - 1; i++)
        {
            int difficulty = Integer.MIN_VALUE;
            newList = new ArrayList<Integer>(list);
            newList.remove(i);
            for(int j = 0; j < newList.size() - 1; j++)
            {
                difficulty = Math.max(difficulty, newList.get(j + 1) - newList.get(j));
            }
            if(finalDifficulty > difficulty)
            {
                finalDifficulty = difficulty;
            }
        }
        System.out.println(finalDifficulty);
        sc.close();
    }
}