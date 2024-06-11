
// This commit includes only the checkRotatedAndSorted function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

public class CheckIfArrayIsSortedAndRotated {
    
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int count = 0;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        
        return count <= 1 ;
        
    }
}
