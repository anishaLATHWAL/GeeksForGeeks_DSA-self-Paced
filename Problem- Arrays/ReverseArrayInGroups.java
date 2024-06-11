import java.util.ArrayList;

// This commit includes only the reverseInGroups function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

public class ReverseArrayInGroups {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i=0;i<n;i+=k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            
            while(start<end){
                int temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
    }
}
