
import java.util.*;

public class IfArrayIsSorted {
    
    static boolean isSorted(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    } 

    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(isSorted(arr, n));
        
        scanner.close();
    } 
}


