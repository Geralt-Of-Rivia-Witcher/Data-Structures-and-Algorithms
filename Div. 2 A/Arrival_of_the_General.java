import java.util.Scanner;
public class Arrival_of_the_General
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], minIndex = 0;
        int max = arr[0], maxIndex = 0;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > max)
            {
                maxIndex = i;
                max = arr[i];
            }
            if(arr[i] <= min)
            {
                minIndex = i;
                min = arr[i];
            }
        }
        if(minIndex < maxIndex)
        {
            minIndex++;
        }
        System.out.println( maxIndex + (n - minIndex - 1) );
        sc.close();
    }   
}