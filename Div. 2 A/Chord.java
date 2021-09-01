import java.util.*;
public class Chord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        if(distance(a, b) == 3 && distance(b, c) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(a, b) == 4 && distance(b, c) == 3)
        {
            System.out.println("major");
        }
        
        else if(distance(a, c) == 3 && distance(c, b) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(a, c) == 4 && distance(c, b) == 3)
        {
            System.out.println("major");
        }

        else if(distance(b, a) == 3 && distance(a, c) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(b, a) == 4 && distance(a, c) == 3)
        {
            System.out.println("major");
        }

        else if(distance(b, c) == 3 && distance(c, a) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(b, c) == 4 && distance(c, a) == 3)
        {
            System.out.println("major");
        }

        else if(distance(c, a) == 3 && distance(a, b) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(c, a) == 4 && distance(a, b) == 3)
        {
            System.out.println("major");
        }

        else if(distance(c, b) == 3 && distance(b, a) == 4)
        {
            System.out.println("minor");
        }
        else if(distance(c, b) == 4 && distance(b, a) == 3)
        {
            System.out.println("major");
        }
        
        else
        {
            System.out.println("strange");
        }
        sc.close();
    }

    public static int distance(String a, String b)
    {
        ArrayList <String> notes = new ArrayList <String>();
        notes.add("C");
        notes.add("C#");
        notes.add("D");
        notes.add("D#");
        notes.add("E");
        notes.add("F");
        notes.add("F#");
        notes.add("G");
        notes.add("G#");
        notes.add("A");
        notes.add("B");
        notes.add("H");
        if(notes.indexOf(a) < notes.indexOf(b))
        {
            return (notes.indexOf(b) - notes.indexOf(a));
        }
        else
        {
            return (12 - notes.indexOf(a) + notes.indexOf(b));
        }
    }
}