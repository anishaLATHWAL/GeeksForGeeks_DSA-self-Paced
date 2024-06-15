import java.util.Arrays;

// This commit includes only the missingNumber function. 
// The rest of the implementation and context is present in the 
// GeeksforGeeks (GFG) code editor.

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int smallest = 1;
        for(int i=0;i<size;i++){
            if(arr[i]==smallest){
                smallest++;
            }
        }
        return smallest;
    }
}
