
// This commit includes only the maxSubarraySum function. 
// The rest of the implementation and context is present in the 
// GeeksforGeeks (GFG) code editor.

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long res=arr[0];
        long maxEnding = arr[0];
        for(int i=1; i<n;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res= Math.max(res,maxEnding);
        }
        return res;
        
    }
}
