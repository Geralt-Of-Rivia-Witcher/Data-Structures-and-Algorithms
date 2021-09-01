import java.util.*;
public class Puzzles
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList <Integer> puzzles = new ArrayList <Integer>();
        for(int i = 0; i < m; i++)
        {
            puzzles.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(puzzles);
        ArrayDeque <Integer> deque = new ArrayDeque <Integer>();
        int i = 0, min = 0;
        for(; i < n; i++)
        {
            deque.addLast(puzzles.get(i));
        }
        min = deque.peekLast() - deque.peekFirst();
        for(; i < m; i++)
        {
            deque.removeFirst();
            deque.addLast(puzzles.get(i));
            int temp = deque.peekLast() - deque.peekFirst();
            if(temp < min)
            {
                min = temp;
            }
        }
        System.out.println(min);
    }   
}